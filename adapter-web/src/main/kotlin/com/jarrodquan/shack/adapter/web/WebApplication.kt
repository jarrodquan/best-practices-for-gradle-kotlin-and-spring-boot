package com.jarrodquan.shack.adapter.web

import com.jarrodquan.shack.app.common.Component
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScan.Filter
import org.springframework.context.annotation.FilterType

@ComponentScan(
        basePackages = [
            "com.jarrodquan.shack.app.adapter",
            "com.jarrodquan.shack.adapter.repo.mysql",
            "com.jarrodquan.shack.adapter.web"
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