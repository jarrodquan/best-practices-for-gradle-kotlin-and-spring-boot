package com.jarrodquan.shack.app.domain.user

import java.time.LocalDate

data class UserDetail(
        var avatar: String?,
        var nickname: String?,
        var name: String?,
        var gender: Gender?,
        var birthday: LocalDate?,
        var region: String?,
        var address: String?
)