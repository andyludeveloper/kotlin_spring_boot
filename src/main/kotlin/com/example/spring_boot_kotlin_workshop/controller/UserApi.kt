package com.example.spring_boot_kotlin_workshop.controller

import com.example.spring_boot_kotlin_workshop.data.dto.UserDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

interface UserApi {

    @PostMapping("/user")
    fun addUser(@RequestBody userDto: UserDto): UserDto

    @GetMapping("/user")
    fun findById(@RequestParam id: Long): UserDto
}