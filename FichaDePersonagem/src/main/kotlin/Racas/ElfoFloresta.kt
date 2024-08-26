package Racas

class ElfoFloresta : SubRaca {
    override val nome: String = "Elfo da floresta"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ELFICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.SABEDORIA to 1
    )
}
