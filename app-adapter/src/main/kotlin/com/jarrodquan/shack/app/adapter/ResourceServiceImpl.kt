package com.jarrodquan.shack.app.adapter

import com.jarrodquan.shack.app.common.Component
import com.jarrodquan.shack.app.domain.resource.Resource
import com.jarrodquan.shack.app.port.ResourceService

@Component
class ResourceServiceImpl : ResourceService {
    override fun findResource(id: String): Resource? {
        return Resource(
                id,
                null,
                null,
                null,
                null,
                null
        )
    }
}