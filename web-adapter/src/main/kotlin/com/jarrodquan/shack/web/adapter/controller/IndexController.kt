package com.jarrodquan.shack.web.adapter.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {
    @GetMapping("", "/", "/index", "/home")
    fun entry(): String {
        return "index"
    }
}
