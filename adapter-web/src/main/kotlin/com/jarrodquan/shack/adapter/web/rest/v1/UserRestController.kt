package com.jarrodquan.shack.adapter.web.rest.v1

import com.jarrodquan.shack.adapter.web.rest.v1.assembler.UserResourceAssembler
import com.jarrodquan.shack.adapter.web.rest.v1.resource.UserPagedResources
import com.jarrodquan.shack.adapter.web.rest.v1.resource.UserResource
import com.jarrodquan.shack.app.domain.user.User
import org.springframework.hateoas.PagedResources
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * @author Jarrod Quan
 */
@RestController
@RequestMapping("/api/v1/users")
class UserRestController {
    @GetMapping("")
    fun entry(): HttpEntity<UserPagedResources> {
        val users = ArrayList<User>()

        users.add(
                User(
                        1L,
                        "jarrodquan@gmail.com",
                        "jarrodquan",
                        "111111",
                        null
                )
        )

        val pageMetadata = PagedResources.PageMetadata(10, 1, 100, 10)
        val resources = UserPagedResources(users, pageMetadata)

        return ResponseEntity.ok(resources)
    }

    @GetMapping("/{id}")
    fun fetchById(
            @PathVariable("id") userId: Long
    ): HttpEntity<UserResource> {
        val user = User(
                1L,
                "jarrodquan@gmail.com",
                "jarrodquan",
                "111111",
                null
        )
        val assembler = UserResourceAssembler()
        val resource = assembler.toResource(user)

        return ResponseEntity.ok(resource)
    }
}
