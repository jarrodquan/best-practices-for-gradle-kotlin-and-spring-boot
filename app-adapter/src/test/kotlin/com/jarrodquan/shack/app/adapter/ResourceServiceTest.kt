package com.jarrodquan.shack.app.adapter

import com.jarrodquan.shack.app.port.ResourceService
import org.junit.Test
import kotlin.test.assertTrue

class ResourceServiceTest {
    private val resourceService: ResourceService = ResourceServiceImpl()

    @Test
    fun testRun() {
        val resource = resourceService.findResource("1")

        assertTrue(resource != null, "资源不能为Null")
    }
}