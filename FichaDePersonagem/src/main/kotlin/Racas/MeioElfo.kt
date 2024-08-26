package Racas

class MeioElfo : SubRaca {
    override val nome: String = "Meio Elfo"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ELFICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.CARISMA to 2
    )
}
