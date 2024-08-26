package Racas

class HalfingPesLeves : SubRaca {
    override val nome: String = "Halfing Pés Leves"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.HALFLING)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CARISMA to 1
    )
}
