package com.jarrodquan.shack.app.adapter

import com.jarrodquan.shack.app.common.Component
import com.jarrodquan.shack.app.domain.user.User
import com.jarrodquan.shack.app.port.UserService

@Component
class UserServiceImpl : UserService {
    override fun findUser(id: Long): User? {
        return User(
                id,
                null,
                null,
                null,
                null
        )
    }
}