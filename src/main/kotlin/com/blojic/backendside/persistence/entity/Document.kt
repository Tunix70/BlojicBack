package com.blojic.backendside.persistence.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "tdocument")
open class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    open var id: Int? = null
    open var name: String? = null
    open var modified: LocalDateTime? = null
    open var created: LocalDateTime? = null
}