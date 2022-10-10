package com.blojic.backendside.controller

import com.blojic.backendside.dto.DocumentDto
import com.blojic.backendside.service.DocumentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/document/")
class DocumentController(private val documentService: DocumentService) {
    @GetMapping
    fun getDocuments(): ResponseEntity<List<DocumentDto>> {
        val documentList = documentService.findAll()
        return ResponseEntity(documentList, HttpStatus.OK)
    }
}