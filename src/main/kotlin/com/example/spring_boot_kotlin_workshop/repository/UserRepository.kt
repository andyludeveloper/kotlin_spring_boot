package com.example.spring_boot_kotlin_workshop.repository

import com.example.spring_boot_kotlin_workshop.data.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}