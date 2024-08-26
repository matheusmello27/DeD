package Racas

class AnaoColina : SubRaca {
    override val nome: String = "Anão da colina"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ANAO)
    override val velocidadeBase: Int = 7
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.SABEDORIA to 1
    )
}
