package Racas

class Halfling : Raca {
    override val nome: String = "Halfing"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.HALFLING)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.DESTREZA to 2
    )
}
