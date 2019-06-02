package com.jarrodquan.shack.app.common

@Target(AnnotationTarget.CLASS)
annotation class Component(
        val value: String = ""
)