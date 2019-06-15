package com.jarrodquan.shack.app.domain.user

/**
 * @author Jarrod Quan
 */
data class User(
        val id: Long?,
        val email: String?,
        val username: String?,
        val password: String?,
        val detail: UserDetail?
)