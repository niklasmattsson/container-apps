package com.example.containerapps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ContainerAppsApplication

fun main(args: Array<String>) {
	runApplication<ContainerAppsApplication>(*args)
}
