package br.com.zup.eduardo.pix.modelo


import br.com.zup.eduardo.pix.enum.TipoDeChave
import br.com.zup.eduardo.pix.enum.TipoDeConta
import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
class ChavePix(

   @Id
   @field:NotNull
   @Column(nullable = false)
   val clienteId: UUID,

   @field:NotNull
   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
   val tipo: TipoDeChave,

   @field:NotBlank
   @Column(unique = true, nullable = false)
   var chave: String,

   @field:NotNull
   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
   val tipoDeConta: TipoDeConta
)
