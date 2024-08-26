package Racas

class HalfingRobusto : SubRaca {
    override val nome: String = "Halfing Robusto"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.HALFLING)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CONSTITUICAO to 1
    )
}
