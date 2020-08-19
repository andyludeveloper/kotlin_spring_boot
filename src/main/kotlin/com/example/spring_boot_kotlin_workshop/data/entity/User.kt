package com.example.spring_boot_kotlin_workshop.data.entity

import javax.persistence.*

@Entity
@Table
data class User (

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long?,

        @Column
        val firstName:String,

        @Column
        val lastName:String,

        @Column
        val age: Int
)