package com.blojic.backendside.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ping")
class PingController {
    @GetMapping
    fun getStatus(): ResponseEntity<String> {
        return ResponseEntity("Application is runnig", HttpStatus.OK)
    }
}