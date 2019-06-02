package com.jarrodquan.shack.web.adapter.rest.v1.resource

import org.springframework.hateoas.ResourceSupport
import java.time.LocalDate

/**
 * @author Jarrod Quan
 */
data class UserResource(
        val username: String?,
        val birthday: LocalDate?,
        val address: String?
) : ResourceSupport()
