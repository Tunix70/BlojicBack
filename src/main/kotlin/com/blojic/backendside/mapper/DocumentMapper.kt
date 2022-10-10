package com.blojic.backendside.mapper

import com.blojic.backendside.dto.DocumentDto
import com.blojic.backendside.persistence.entity.Document
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface DocumentMapper {
    fun documentToDocumentDto(document: Document): DocumentDto

}