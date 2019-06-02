package com.jarrodquan.shack.app.domain.resource

import java.time.LocalDateTime

data class Resource(
        var id: String?,
        var category: ResourceCategory?,
        var location: String?,
        var createTime: LocalDateTime?,
        var modifyTime: LocalDateTime?,
        var existed: Boolean?
)