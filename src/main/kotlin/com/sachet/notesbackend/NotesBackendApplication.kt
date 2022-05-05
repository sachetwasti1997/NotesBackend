package com.sachet.notesbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesBackendApplication

fun main(args: Array<String>) {
    runApplication<NotesBackendApplication>(*args)
}
