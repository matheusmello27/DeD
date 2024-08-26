import Racas.CustosHabilidade
import Racas.TipoHabilidade
import estrategias.DistribuicaoPontosStrategy
import java.util.Scanner

class DistribuicaoPersonalizadaStrategy : DistribuicaoPontosStrategy {
    private val scanner = Scanner(System.`in`)
    private val pontosDisponiveis = 27

    override fun distribuirPontos(): MutableMap<TipoHabilidade, Int> {
        val habilidades = mutableMapOf<TipoHabilidade, Int>()
        var pontosDistribuidos = 0

        while (pontosDistribuidos != pontosDisponiveis) {
            habilidades.clear()
            pontosDistribuidos = 0

            TipoHabilidade.values().forEach { habilidade ->
                println("Digite o valor para ${habilidade.name} (8 a 15):")
                var valorHabilidade: Int?
                do {
                    valorHabilidade = scanner.nextLine().trim().toIntOrNull()
                    if (valorHabilidade == null || valorHabilidade !in 8..15) {
                        println("Valor inválido. Digite um valor entre 8 e 15:")
                    }
                } while (valorHabilidade == null || valorHabilidade !in 8..15)
                habilidades[habilidade] = valorHabilidade
                pontosDistribuidos += CustosHabilidade.tabelaCusto[valorHabilidade] ?: 0
            }

            if (pontosDistribuidos != pontosDisponiveis) {
                println("A soma dos pontos distribuídos deve ser exatamente $pontosDisponiveis pontos. Total atual: $pontosDistribuidos pontos.")
                println("Por favor, redistribua os pontos.")
            }
        }
        return habilidades
    }
}
