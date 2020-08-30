package com.example.spring_boot_kotlin_workshop.controller.impl

import com.example.spring_boot_kotlin_workshop.controller.UserApi
import com.example.spring_boot_kotlin_workshop.data.dto.UserDto
import com.example.spring_boot_kotlin_workshop.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
        @Qualifier("RealUserService") @Autowired val userService: UserService
):UserApi {
    override fun addUser(userDto: UserDto): UserDto = userService.addUser(userDto)

    override fun findById(id: Long): UserDto = userService.findById(id)
}