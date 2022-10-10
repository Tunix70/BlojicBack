package com.blojic.backendside.dto

import java.time.LocalDateTime

data class DocumentDto(
    var id: Int,
    var name: String,
    var modified: LocalDateTime,
    var created: LocalDateTime
)