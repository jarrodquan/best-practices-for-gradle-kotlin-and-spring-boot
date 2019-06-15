package com.jarrodquan.shack.app.domain.user

import java.time.LocalDate

data class UserDetail(
        val avatar: String?,
        val nickname: String?,
        val name: String?,
        val gender: Gender?,
        val birthday: LocalDate?,
        val region: String?,
        val address: String?
)