package heap.filaPacientesHeapMinimo3

import javax.crypto.spec.PSource

class HeapMinimoPaciente(val tamanho: Int = 10): HeapingPaciente {

    var dados: Array<Paciente?> = arrayOfNulls(tamanho)
    var ponteiroFim = -1

    override fun enfileirar(dado: Paciente) {
        if (!estaCheia()) {
            ponteiroFim++
            dados[ponteiroFim] = dado
            ajustarAcima(ponteiroFim)

        } else {
            println("Fila Cheia!")
        }
    }

    override fun desenfileirar(dado: Paciente): Paciente? {
        var pacienteDesenfileirado: Paciente? = null
        if (!estaVazia()) {
            pacienteDesenfileirado = dados[0]
            dados[0] = dados[ponteiroFim]
            ponteiroFim--
            ajustarAbaixo(0)
        } else {
            println("Fila Vazia!")
        }
        return pacienteDesenfileirado
    }

    override fun atualizar(dado: Paciente) {
        if (!estaVazia()) {
            dados[0] = dado
            ajustarAbaixo(0)
        } else {
            println("Fila Vazia!")
        }
    }

    override fun espiar(dado: Paciente?): Paciente? {
        var dadoEspiado: Paciente? = null
        if (!estaVazia()) {
            dadoEspiado = dados[0]
        } else {
            println("Fila Vazia!")
        }
        return dadoEspiado
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

    private fun ajustarAcima(indice: Int) {
        var indiceAtual = indice
        while (indiceAtual != 0) {
            var indicePai = pai(indiceAtual)
            if (dados[indicePai]!!.prioridade > dados[indiceAtual]!!.prioridade) {
                trocar(indiceAtual, indicePai)
                indiceAtual = indicePai
            } else {
                break
            }
        }
    }

    private fun ajustarAbaixo(pai: Int) {
        var filhoEsquerdo = indiceFilhoEsquerdo(pai)
        var filhoDireito = indiceFilhoDireito(pai)
        var menor = pai

        if (filhoEsquerdo <= ponteiroFim) {
            if (dados[menor]!!.prioridade > dados[filhoEsquerdo]!!.prioridade) {
                menor = filhoEsquerdo
            }
        }

        if (filhoDireito <= ponteiroFim) {
            if (dados[menor]!!.prioridade > dados[filhoDireito]!!.prioridade) {
                menor = filhoDireito
            }
        }

        if (menor != pai) {
            trocar(pai, menor)
            ajustarAbaixo(menor)
        }
    }

    private fun indiceFilhoEsquerdo(pai: Int): Int {
        return (pai * 2) + 1
    }

    private fun indiceFilhoDireito(pai: Int): Int {
        return (pai * 2) + 2
    }

    private fun pai(filho: Int): Int {
        return (filho - 1) / 2
    }

    private fun trocar(i: Int, j: Int) {
        var temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }
}