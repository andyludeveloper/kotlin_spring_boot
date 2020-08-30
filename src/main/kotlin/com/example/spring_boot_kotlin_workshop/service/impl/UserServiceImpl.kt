package com.example.spring_boot_kotlin_workshop.service.impl

import com.example.spring_boot_kotlin_workshop.data.dto.UserDto
import com.example.spring_boot_kotlin_workshop.data.entity.User
import com.example.spring_boot_kotlin_workshop.repository.UserRepository
import com.example.spring_boot_kotlin_workshop.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service("RealUserService")
class UserServiceImpl(@Autowired val userRepository: UserRepository):UserService {
    override fun addUser(userDto: UserDto): UserDto =
        User(null,
            userDto.name.split(",")[0].trim(),
            userDto.name.split(",")[1].trim(),
            userDto.age
        ).run {
            val save = userRepository.save(this)
            UserDto(save.id!!, "${save.firstName}, ${save.lastName}", save.age)
        }

    override fun findById(id: Long): UserDto =
        userRepository.findById(id).map {
            UserDto(it.id!!, it.firstName + ", "+it.lastName, it.age)
        }.orElseThrow{
            RuntimeException()
        }
}