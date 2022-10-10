package com.blojic.backendside.service

import com.blojic.backendside.dto.DocumentDto
import com.blojic.backendside.mapper.DocumentMapper
import com.blojic.backendside.repository.DocumentRepository
import org.springframework.stereotype.Service

@Service
class DocumentService(
    private val documentRepository: DocumentRepository,
    private val documentMapper: DocumentMapper
) {
    fun findAll(): List<DocumentDto> {
        val savedDocument = documentRepository.findAll()
        return savedDocument.map(documentMapper::documentToDocumentDto)
    }
}