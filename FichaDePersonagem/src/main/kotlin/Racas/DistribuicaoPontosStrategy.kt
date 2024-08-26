package estrategias

import Racas.TipoHabilidade

interface DistribuicaoPontosStrategy {
    fun distribuirPontos(): MutableMap<TipoHabilidade, Int>
}
