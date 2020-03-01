package com.camilo.mongographql.resolvers

import com.camilo.mongographql.entities.User
import com.camilo.mongographql.repositories.UserRepository
import com.expediagroup.graphql.spring.operations.Mutation
import kotlinx.coroutines.coroutineScope
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserMutation(
    private val userRepository: UserRepository
) : Mutation {

    suspend fun create(name: String) = coroutineScope {
        val user = User(id = UUID.randomUUID().toString(), name = name)
        userRepository.insert(user)
        user;
    }
}
