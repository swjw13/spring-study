package com.example.springstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringBootApiServer {

    @GetMapping("/")
    fun hello(): String {
        return "Hello, World!"
    }

    @GetMapping("/api/data")
    fun getData(): Data {
        return Data("value1", "value2", "value3")
    }

    data class Data(val key1: String, val key2: String, val key3: String)
}

fun main(args: Array<String>) {
    runApplication<SpringBootApiServer>(*args)
}