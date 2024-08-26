package Racas

class Drow : Raca {
    override val nome: String = "Drow"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.SUBTERRANEO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CARISMA to 1
    )
}
