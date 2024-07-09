package estudosProva.heap.heapminimopaciente

class HeapMinimoPaciente(val tamanho: Int = 10) : HeapingPaciente {
    private var dados: Array<Paciente?> = arrayOfNulls(tamanho)
    private var ponteiroFim = -1
    override fun enfileirar(dado: Paciente) {
        if (!estaCheia()) {

        } else {
            println("Fila Cheia!")
        }
    }

    override fun desenfileirar(): Paciente? {
        TODO("Not yet implemented")
    }

    override fun espiar(): Paciente? {
        TODO("Not yet implemented")
    }

    override fun atualizar(dado: Paciente) {
        TODO("Not yet implemented")
    }

    override fun estaCheia(): Boolean {
        return ponteiroFim == tamanho - 1
    }

    override fun estaVazia(): Boolean {
        return ponteiroFim == -1
    }

    override fun imprimir(): String {
        var resultado = "["
        for (i in 0 .. ponteiroFim) {
            resultado += if (i == ponteiroFim) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }

    private fun indicePai(indiceFilho: Int): Int {
        return (indiceFilho - 1) / 2
    }

    private fun indiceFilhoEsquerdo(indicePai: Int): Int {
        return (indicePai * 2) + 1
    }

    private fun indiceFilhoDireito(indicePai: Int): Int {
        return (indicePai * 2) + 2
    }

    private fun ajustarAcima(indice: Int) {
        var indiceAtual = indice
        while (indiceAtual != 0) {
            val indicePai = indicePai(indiceAtual)
            if (dados[indiceAtual]!!.prioridade < dados[indicePai]!!.prioridade) {
                trocar(indiceAtual, indicePai)
                indiceAtual = indicePai
            } else {
                break
            }
        }
    }

    private fun ajustarAbaixo(pai: Int) {
        var filhoEsquerdo = indiceFilhoEsquerdo(pai)
        var filhoDireito = indiceFilhoEsquerdo(pai)
        var menor = pai

        if (filhoEsquerdo <= ponteiroFim) {
            if (dados[menor]!!.prioridade > dados[filhoEsquerdo]!!.prioridade) {
                menor = filhoEsquerdo
            }
        }

        if (filhoDireito <= ponteiroFim) {
            if (dados[menor]!!.prioridade < dados[filhoDireito]!!.prioridade) {
                menor = filhoDireito
            }
        }

        if (menor != pai) {
            trocar(pai, menor)
            ajustarAbaixo(menor)
        }
    }

    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }
}