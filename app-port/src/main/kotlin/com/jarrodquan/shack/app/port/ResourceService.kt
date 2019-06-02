package com.jarrodquan.shack.app.port

import com.jarrodquan.shack.app.domain.resource.Resource

interface ResourceService {
    fun findResource(id: String): Resource?
}