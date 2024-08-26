package Racas

class Tiefling : Raca {
    override val nome: String = "Tiefling"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.DRACONICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.INTELIGENCIA to 1,
        TipoHabilidade.CARISMA to 2
    )
}
