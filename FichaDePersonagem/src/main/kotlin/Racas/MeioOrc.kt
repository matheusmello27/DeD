package Racas

class MeioOrc : SubRaca {
    override val nome: String = "Meio Orc"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ORC)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.FORCA to 2,
        TipoHabilidade.CONSTITUICAO to 1
    )
}
