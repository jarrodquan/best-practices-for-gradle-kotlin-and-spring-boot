package com.jarrodquan.shack.app.port

import com.jarrodquan.shack.app.domain.user.User

interface UserService {
    fun findUser(id: Long): User?
}