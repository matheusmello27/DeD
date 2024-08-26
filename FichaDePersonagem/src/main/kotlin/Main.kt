import Racas.*
import estrategias.DistribuicaoPontosStrategy
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Deseja escolher uma raça ou uma sub-raça? (Digite 'raça' ou 'sub-raça'):")
    val escolhaTipo = scanner.nextLine().trim().lowercase()

    var racaEscolhida: Raca? = null
    var subRacaEscolhida: SubRaca? = null

    when (escolhaTipo) {
        "raça" -> {
            println("Escolha a raça:")
            val racas = listOf(
                Drow(), Elfo(), Gnomo(), Halfling(), Humano(), Tiefling(), Draconato(), Anao()
            )
            racas.forEachIndexed { index, raca -> println("${index + 1}. ${raca.nome}") }
            val escolhaRaca = scanner.nextLine().trim()

            val indexRaca = escolhaRaca.toIntOrNull()?.minus(1)
            racaEscolhida = if (indexRaca != null && indexRaca in racas.indices) {
                racas[indexRaca]
            } else {
                println("Raça inválida.")
                return
            }
        }

        "sub-raça" -> {
            println("Escolha a sub-raça:")
            val subRacas = listOf(
                ElfoAlto(), ElfoFloresta(), AnaoColina(), AnaoMontanha(), GnomoFloresta(),
                GnomoRochas(), HalfingPesLeves(), HalfingRobusto(), MeioElfo(), MeioOrc()
            )
            subRacas.forEachIndexed { index, subRaca -> println("${index + 1}. ${subRaca.nome}") }
            val escolhaSubRaca = scanner.nextLine().trim()

            val indexSubRaca = escolhaSubRaca.toIntOrNull()?.minus(1)
            subRacaEscolhida = if (indexSubRaca != null && indexSubRaca in subRacas.indices) {
                subRacas[indexSubRaca]
            } else {
                println("Sub-raça inválida.")
                return
            }
        }

        else -> {
            println("Escolha inválida. Digite 'raça' ou 'sub-raça'.")
            return
        }
    }

    if (subRacaEscolhida != null && racaEscolhida != null) {
        println("Você não pode escolher uma raça e uma sub-raça ao mesmo tempo. Escolha apenas um.")
        return
    }

    println("Informe o nome do personagem:")
    val nome = scanner.nextLine().trim()

    println("Informe a descrição do personagem:")
    val descricao = scanner.nextLine().trim()

    val distribuicaoStrategy: DistribuicaoPontosStrategy = DistribuicaoPersonalizadaStrategy()
    val habilidades = distribuicaoStrategy.distribuirPontos()

    val personagem = Personagem(nome, descricao, racaEscolhida, subRacaEscolhida, habilidades)

    // calculo pontos de vida 10+MOD
    val valorConstituicao = habilidades[TipoHabilidade.CONSTITUICAO] ?: 8
    val modificadorConstituicao = ModificadoresHabilidade.tabelaModificador[valorConstituicao] ?: 0
    val pontosVida = 10 + modificadorConstituicao

    println(personagem)
    println("PV           : $pontosVida")
}
