package Racas

data class Personagem(
    val nome: String,
    val descricao: String,
    val raca: Raca?,
    val subRaca: SubRaca?,
    val habilidades: MutableMap<TipoHabilidade, Int>
) {
    private val habilidadesBase: Map<TipoHabilidade, Int> = TipoHabilidade.values().associateWith { 8 }

    init {
        aplicarBonificacoes()
    }

    private fun aplicarBonificacoes() {
        // sub raca bonus
        subRaca?.let { subRaca ->
            for ((habilidade, bonus) in subRaca.bonusHabilidades) {
                habilidades[habilidade] = (habilidades[habilidade] ?: habilidadesBase[habilidade] ?: 8) + bonus
            }
        }

        // raça bonus
        raca?.let { raca ->
            for ((habilidade, bonus) in raca.bonusHabilidades) {
                habilidades[habilidade] = (habilidades[habilidade] ?: habilidadesBase[habilidade] ?: 8) + bonus
            }
        }
    }

    fun calcularModificadorHabilidade(habilidade: TipoHabilidade): Int {
        val valor = habilidades[habilidade] ?: 8
        return ModificadoresHabilidade.tabelaModificador[valor] ?: 0
    }

    override fun toString(): String {
        val maxHabilidadeLength = TipoHabilidade.values().maxOf { it.name.replace('_', ' ').uppercase().length }

        // formarta cada habilidade
        val habilidadesFormatadas = habilidades.map { (tipo, valor) ->
            val modificador = calcularModificadorHabilidade(tipo)
            val tipoFormatado = tipo.name.replace('_', ' ').uppercase()
            val espacos = " ".repeat(maxHabilidadeLength - tipoFormatado.length)
            "$tipoFormatado$espacos: $valor (+$modificador Mod)"
        }.joinToString("\n")

        val racaDescricao = raca?.nome ?: "nenhuma"
        val subRacaDescricao = subRaca?.nome ?: "nenhuma"

        return """
            Personagem criado com sucesso!
            Nome: $nome
            Descrição: $descricao
            Raça: $racaDescricao
            Sub-Raça: $subRacaDescricao
            
            Habilidades:
            $habilidadesFormatadas
        """.trimIndent() // metodo para formartar
    }
}
