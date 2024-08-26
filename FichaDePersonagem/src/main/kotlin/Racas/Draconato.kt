package Racas

class Draconato : Raca {
    override val nome: String = "Draconato"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.DRACONICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.FORCA to 2,
        TipoHabilidade.CARISMA to 1
    )
}
