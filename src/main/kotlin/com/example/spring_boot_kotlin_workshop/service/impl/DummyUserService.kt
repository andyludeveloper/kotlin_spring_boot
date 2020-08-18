package com.example.spring_boot_kotlin_workshop.service.impl

import com.example.spring_boot_kotlin_workshop.data.dto.UserDto
import com.example.spring_boot_kotlin_workshop.service.UserService
import org.springframework.stereotype.Service

@Service("DummyUserService")
class DummyUserService : UserService{
    override fun addUser(userDto: UserDto): UserDto = UserDto(-1, "Dummy, Service Add", 999)

    override fun findById(id: Long): UserDto = UserDto(-1, "Dummy, Service Find", 999)

}