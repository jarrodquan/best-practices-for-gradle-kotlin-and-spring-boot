package com.jarrodquan.shack.web

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class IndexController {
    @GetMapping
    fun entry(request: HttpServletRequest): ResponseEntity<Any> {
        val name = request.getParameter("name")

        return ResponseEntity.ok("Hello, $name")
    }
}