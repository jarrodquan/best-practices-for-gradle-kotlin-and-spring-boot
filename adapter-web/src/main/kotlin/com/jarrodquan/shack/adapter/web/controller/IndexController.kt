package com.jarrodquan.shack.adapter.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {
    @GetMapping("", "/", "/index", "/home")
    fun entry(): String {
        return "index"
    }
}
