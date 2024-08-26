package Racas

class ElfoAlto : SubRaca {
    override val nome: String = "Alto elfo"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ELFICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.INTELIGENCIA to 1
    )
}
