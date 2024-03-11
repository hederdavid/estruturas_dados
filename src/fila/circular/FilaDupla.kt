package fila.circular

class FilaDupla(tamanho: Int = 10) : DuplamenteEnfileirado {
    private var ponteiroInicio = 0
    private var ponteiroFim = -1
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    override fun enfileirarInicio(dado: Any?) {
        if (!estaCheia()) {


        }
    }

    override fun enfileirarFim(dado: Any?) {
        if (!estaCheia()) {
            if (ponteiroFim == dados.size) {
                ponteiroFim = -1
            }
            ponteiroFim++
            dados[ponteiroFim] = dado
            println("O dado: '${dado}' foi enfileirado na posição $ponteiroFim com sucesso.")
        } else {
            println("A fila se encontra cheia! Impossível enfileirar")
        }
    }

    override fun desenfileirarInicio(): Any? {
        TODO("Not yet implemented")
    }

    override fun desenfileirarFim(): Any? {
        TODO("Not yet implemented")
    }

    override fun espiarInicio(): Any? {
        TODO("Not yet implemented")
    }

    override fun espiarFim(): Any? {
        TODO("Not yet implemented")
    }

    override fun atualizarInicio(dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun atualizarFim(dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun estaCheia(): Boolean {
        return ponteiroFim < ponteiroInicio
    }

    override fun estaVazia(): Boolean {
        return ponteiroFim == -1
    }

    override fun imprimir(): String {
        TODO("Not yet implemented")
    }
}