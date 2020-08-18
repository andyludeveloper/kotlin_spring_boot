package com.example.spring_boot_kotlin_workshop.service

import com.example.spring_boot_kotlin_workshop.data.dto.UserDto

interface UserService {

    fun addUser(userDto: UserDto):UserDto

    fun findById(id: Long): UserDto
}