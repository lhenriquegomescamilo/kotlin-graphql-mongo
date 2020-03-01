package com.camilo.mongographql.repositories

import com.camilo.mongographql.entities.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String>
