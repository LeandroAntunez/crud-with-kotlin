package com.antunez.leandro.crudwithkotlin.repository

import com.antunez.leandro.crudwithkotlin.model.Persona
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonaRepository: CrudRepository<Persona, Long> {
}