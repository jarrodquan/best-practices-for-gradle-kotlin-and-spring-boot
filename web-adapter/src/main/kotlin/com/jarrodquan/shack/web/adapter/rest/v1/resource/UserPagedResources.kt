package com.jarrodquan.shack.web.adapter.rest.v1.resource

import com.jarrodquan.shack.app.domain.user.User
import org.springframework.hateoas.Link
import org.springframework.hateoas.PagedResources

/**
 * @author Jarrod Quan
 */
class UserPagedResources : PagedResources<User> {
    constructor()

    constructor(content: Collection<User>, metadata: PageMetadata, vararg links: Link) : super(content, metadata, *links)

    constructor(content: Collection<User>, metadata: PageMetadata, links: Iterable<Link>) : super(content, metadata, links)
}
