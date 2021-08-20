package br.com.zup.eduardo.pix.repository

import br.com.zup.eduardo.pix.modelo.ChavePix
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

interface ChavePixRepository : JpaRepository<ChavePix, UUID> {

    fun existsByChave(chave: String?): Boolean

    fun findByChave(chave: String): Optional<ChavePix>

    fun findByIdAndClienteId(id: UUID, clienteId: UUID): Optional<ChavePix>

    fun findAllByClienteId(clienteId: UUID): List<ChavePix>
}