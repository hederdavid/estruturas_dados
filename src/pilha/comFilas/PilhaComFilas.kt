package pilha.comFilas

class PilhaComFilas(tamanho: Int = 10) : Empilhavel {
    private var fila1: Enfileiravel = FilaCircular(tamanho)
    private var fila2: Enfileiravel = FilaCircular(tamanho)
    override fun empilhar(dado: Any?) {
        //dado = 5
        // fila1 = 4, 3, 2, 1
        if (!estaCheia()) {
            while (!fila1.estaVazia()) {
                fila2.enfileirar(fila1.desenfileirar()) // fila2 = 4, 3, 2, 1 | fila1 = vazia
            }
            fila1.enfileirar(dado) //ex: dado = 5 então fila1 = 5
            while (!fila2.estaVazia()) {
                fila1.enfileirar(fila2.desenfileirar()) //fila2 = 4, 3, 2, 1 -> (fila1 = 5, 4, 3, 2, 1)
            }
        }
    }

    override fun desempilhar(): Any? {
        return fila1.desenfileirar()
    }

    override fun atualizar(dado: Any?) {
        fila1.atualizar(dado)
    }

    override fun espiar(): Any? {
        return fila1.espiar()
    }

    override fun estaCheia(): Boolean {
        return fila1.estaCheia()
    }

    override fun estaVazia(): Boolean {
        return fila1.estaVazia()
    }

    override fun imprimir(): String {
        return fila1.imprimir()
    }

}