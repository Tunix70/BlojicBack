package com.blojic.backendside.service

import com.blojic.backendside.persistence.entity.Document
import com.blojic.backendside.repository.DocumentRepository
import org.springframework.stereotype.Service

@Service
class DocumentService(private val documentRepository: DocumentRepository) {
    fun findAll(): List<Document> {
        return documentRepository.findAll()
    }
}