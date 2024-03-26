package estudosProva.pilha.comFila

class PilhaComFilas : Empilhavel {
    private val fila1 : Enfileiravel = FilaCircular()
    private val fila2 : Enfileiravel = FilaCircular()
    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            while(!fila1.estaVazia()) {
                fila2.enfileirar(fila1.desenfileirar())
            }

            fila1.enfileirar(dado)

            while(!fila2.estaVazia()) {
                fila1.enfileirar(fila2.desenfileirar())
            }
        } else {
            println("Pilha Cheia!")
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