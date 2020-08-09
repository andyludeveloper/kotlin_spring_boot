package com.example.kotlin_sprint_workshop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController{
    @GetMapping("/hello")
    fun sayHello() = "Hello Spring boot"
}