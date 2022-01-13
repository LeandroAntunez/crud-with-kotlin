package com.antunez.leandro.crudwithkotlin.model

import javax.persistence.*

@Entity(name = "persona")
data class Persona(
    @Id
    val id: Long,
    @Column
    val nombre: String,
    @Column
    val apellido: String,
    @Column
    val direccion: String,
    @Column
    val telefono: String)
{

}