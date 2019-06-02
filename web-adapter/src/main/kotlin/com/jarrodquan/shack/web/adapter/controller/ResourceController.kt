package com.jarrodquan.shack.web.adapter.controller

import com.jarrodquan.shack.app.domain.resource.Resource
import com.jarrodquan.shack.app.port.ResourceService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ResourceController(
        private val resourceService: ResourceService
) {
    @GetMapping("/resource/{id}")
    @ResponseBody
    fun fetchResource(
            @PathVariable("id") id: String
    ): ResponseEntity<Resource> {
        val resource = resourceService.findResource(id)

        return ResponseEntity(resource, HttpStatus.OK)
    }
}