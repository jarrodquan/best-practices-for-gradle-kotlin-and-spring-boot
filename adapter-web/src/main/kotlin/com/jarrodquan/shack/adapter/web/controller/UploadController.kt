package com.jarrodquan.shack.adapter.web.controller

import com.jarrodquan.shack.adapter.web.property.ShackProperties
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile
import java.io.File

@Controller
class UploadController(
        private val shackProperties: ShackProperties
) {
    @GetMapping("/upload")
    fun enterUpload(): String {
        return "upload"
    }

    @PostMapping("/upload")
    fun upload(
            @RequestParam("file") multipartFile: MultipartFile
    ): String {
        val pathFile = File(shackProperties.uploadLocation)
        val file = File(pathFile, multipartFile.originalFilename)

        if (!pathFile.exists()) pathFile.mkdirs()
        if (!file.exists()) file.createNewFile()

        multipartFile.transferTo(file)

        return "redirect:/upload"
    }
}