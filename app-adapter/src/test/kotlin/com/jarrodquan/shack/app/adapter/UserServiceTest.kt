package com.jarrodquan.shack.app.adapter

import com.jarrodquan.shack.app.port.UserService
import org.junit.Test
import kotlin.test.assertTrue

class UserServiceTest {
    private val userService: UserService = UserServiceImpl()

    @Test
    fun testRun() {
        val user = userService.findUser(1)

        assertTrue(user != null, "用户不能为Null")
    }
}