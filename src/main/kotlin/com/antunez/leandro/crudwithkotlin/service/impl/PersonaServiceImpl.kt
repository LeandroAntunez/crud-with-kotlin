package com.antunez.leandro.crudwithkotlin.service.impl

import com.antunez.leandro.crudwithkotlin.commons.GenericServiceImpl
import com.antunez.leandro.crudwithkotlin.model.Persona
import com.antunez.leandro.crudwithkotlin.repository.PersonaRepository
import com.antunez.leandro.crudwithkotlin.service.api.PersonaServiceAPI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PersonaServiceImpl : GenericServiceImpl<Persona, Long>(), PersonaServiceAPI {

    @Autowired
    lateinit var personaRepository: PersonaRepository

    override fun dao(): CrudRepository<Persona, Long> {
        return personaRepository
    }

}