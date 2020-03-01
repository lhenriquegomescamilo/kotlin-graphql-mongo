package com.camilo.mongographql.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User(
    @Id
    var id: String? = null,
    val name: String
)
