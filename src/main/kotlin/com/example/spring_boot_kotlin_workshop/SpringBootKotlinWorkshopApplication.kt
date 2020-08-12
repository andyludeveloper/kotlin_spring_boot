package com.example.spring_boot_kotlin_workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinWorkshopApplication

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinWorkshopApplication>(*args)
}
