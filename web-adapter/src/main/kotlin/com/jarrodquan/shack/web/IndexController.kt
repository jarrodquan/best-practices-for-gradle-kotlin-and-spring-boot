package com.jarrodquan.shack.web

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {
    @GetMapping
    fun entry(): ResponseEntity<Any> {
        return ResponseEntity.ok("Hello world")
    }
}