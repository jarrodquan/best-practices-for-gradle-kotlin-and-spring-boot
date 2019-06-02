package com.jarrodquan.shack.web.adapter

import com.jarrodquan.shack.app.common.Component
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScan.Filter
import org.springframework.context.annotation.FilterType

@ComponentScan(
        basePackages = [
            "com.jarrodquan.shack.app.adapter",
            "com.jarrodquan.shack.web"
        ],
        includeFilters = [
            Filter(type = FilterType.ANNOTATION, classes = [Component::class])
        ]
)
@SpringBootApplication
class WebApplication

fun main(args: Array<String>) {
    runApplication<WebApplication>(*args)
}