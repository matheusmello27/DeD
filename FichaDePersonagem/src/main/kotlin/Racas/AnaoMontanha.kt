package Racas

class AnaoMontanha : SubRaca {
    override val nome: String = "Anão da montanha"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ANAO)
    override val velocidadeBase: Int = 7
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.FORCA to 2
    )
}
