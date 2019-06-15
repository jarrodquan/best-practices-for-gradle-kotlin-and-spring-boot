package com.jarrodquan.shack.app.domain.resource

import java.time.LocalDateTime

data class Resource(
        val id: String?,
        val category: ResourceCategory?,
        val location: String?,
        val createTime: LocalDateTime?,
        val modifyTime: LocalDateTime?,
        val existed: Boolean?
)