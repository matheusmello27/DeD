package Racas

class Humano : Raca {
    override val nome: String = "Humano"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.FORCA to 1,
        TipoHabilidade.DESTREZA to 1,
        TipoHabilidade.CONSTITUICAO to 1,
        TipoHabilidade.INTELIGENCIA to 1,
        TipoHabilidade.SABEDORIA to 1,
        TipoHabilidade.CARISMA to 1
    )
}
