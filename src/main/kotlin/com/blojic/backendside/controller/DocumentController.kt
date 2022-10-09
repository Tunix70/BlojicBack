package com.blojic.backendside.controller

import com.blojic.backendside.persistence.entity.Document
import com.blojic.backendside.service.DocumenService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/document/")
class DocumentController(private val documentService: DocumenService) {
    @GetMapping
    fun getDocuments(): ResponseEntity<List<Document>> {
        val documentList = documentService.findAll()
        return ResponseEntity(documentList, HttpStatus.OK)
    }
}