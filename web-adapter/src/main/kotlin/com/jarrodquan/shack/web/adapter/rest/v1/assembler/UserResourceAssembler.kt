package com.jarrodquan.shack.web.adapter.rest.v1.assembler

import com.jarrodquan.shack.app.domain.user.User
import com.jarrodquan.shack.web.adapter.rest.v1.IndexRestController
import com.jarrodquan.shack.web.adapter.rest.v1.UserRestController
import com.jarrodquan.shack.web.adapter.rest.v1.resource.UserResource
import org.springframework.hateoas.Link
import org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo
import org.springframework.hateoas.mvc.ResourceAssemblerSupport

class UserResourceAssembler : ResourceAssemblerSupport<User, UserResource>(IndexRestController::class.java, UserResource::class.java) {
    override fun toResource(entity: User): UserResource {
        val resource = UserResource(
                entity.username,
                entity.detail?.birthday,
                entity.detail?.address
        )
        var link: Link? = null

        try {
            link = linkTo(UserRestController::class.java.getMethod("fetchById", Long::class.java), entity.id).withSelfRel()
        } catch (e: NoSuchMethodException) {
            e.printStackTrace()
        }

        resource.add(link)

        return resource
    }
}
