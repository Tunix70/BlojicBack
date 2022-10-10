package com.blojic.backendside.repository

import com.blojic.backendside.persistence.entity.Document
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DocumentRepository : JpaRepository<Document, Int>