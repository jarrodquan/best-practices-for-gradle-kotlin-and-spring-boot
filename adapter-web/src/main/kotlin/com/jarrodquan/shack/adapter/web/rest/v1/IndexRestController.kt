package com.jarrodquan.shack.adapter.web.rest.v1

import org.springframework.hateoas.Resource
import org.springframework.hateoas.mvc.ControllerLinkBuilder
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jarrod Quan
 */
@RestController
@RequestMapping("/api/v1")
class IndexRestController {
    @GetMapping("", "/", "/index", "/home")
    fun entry(): HttpEntity<Resource<String>> {
        val selfLink = ControllerLinkBuilder.linkTo(IndexRestController::class.java).withSelfRel()
        val resource = Resource("Welcome.", selfLink)

        return ResponseEntity.ok(resource)
    }
}
