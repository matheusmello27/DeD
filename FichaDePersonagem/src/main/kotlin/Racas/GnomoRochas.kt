package Racas

class GnomoRochas : SubRaca {
    override val nome: String = "Gnomo das rochas"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.GNOMICO)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CONSTITUICAO to 1
    )
}
