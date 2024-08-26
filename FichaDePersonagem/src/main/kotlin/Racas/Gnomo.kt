package Racas

class Gnomo : Raca {
    override val nome: String = "Gnomo"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.GNOMICO)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.INTELIGENCIA to 2
    )
}
