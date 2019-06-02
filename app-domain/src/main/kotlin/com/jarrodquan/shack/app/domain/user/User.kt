package com.jarrodquan.shack.app.domain.user

/**
 * @author Jarrod Quan
 */
data class User(
        var id: Long?,
        var email: String?,
        var username: String?,
        var password: String?,
        var detail: UserDetail?
)