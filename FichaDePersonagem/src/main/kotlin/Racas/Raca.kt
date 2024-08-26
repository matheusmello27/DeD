package Racas

interface Raca {
    val nome: String
    val idiomas: Set<Idioma>
    val velocidadeBase: Int
    val bonusHabilidades: Map<TipoHabilidade, Int>
}