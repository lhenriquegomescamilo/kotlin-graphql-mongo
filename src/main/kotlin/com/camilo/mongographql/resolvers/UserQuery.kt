package com.camilo.mongographql.resolvers

import com.camilo.mongographql.repositories.UserRepository
import com.expediagroup.graphql.spring.operations.Query
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Component

@Component
class UserQuery(
    private val userRepository: UserRepository
): Query {

    suspend fun users() = coroutineScope {
        val users = userRepository.findAll()
        users
    }
}
