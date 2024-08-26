package Racas

class Anao : Raca {
    override val nome: String = "Anão"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ANAO)
    override val velocidadeBase: Int = 7
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CONSTITUICAO to 2
    )
}