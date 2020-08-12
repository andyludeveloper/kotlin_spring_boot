package com.example.spring_boot_kotlin_workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSprintWorkshopApplication

fun main(args: Array<String>) {
    runApplication<KotlinSprintWorkshopApplication>(*args)
}
