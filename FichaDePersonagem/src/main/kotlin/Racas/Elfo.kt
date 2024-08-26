package Racas

class Elfo : Raca {
    override val nome: String = "Elfo"
    override val idiomas: Set<Idioma> = setOf(Idioma.COMUM, Idioma.ELFICO)
    override val velocidadeBase: Int = 9
    override val bonusHabilidades: Map<TipoHabilidade, Int> = mapOf(
        TipoHabilidade.DESTREZA to 2
    )
}