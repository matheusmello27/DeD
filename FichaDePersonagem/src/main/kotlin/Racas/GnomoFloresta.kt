package Racas

class GnomoFloresta : SubRaca {
    override val nome: String = "Gnomo da floresta"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.GNOMICO)
    override val velocidadeBase: Int = 6
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.DESTREZA to 1
    )
}
