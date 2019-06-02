package com.jarrodquan.shack.web.adapter.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "shack")
data class ShackProperties(
        var uploadLocation: String = ""
)