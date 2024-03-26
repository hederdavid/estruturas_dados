package estudosProva.fila.comPilhas

class FilaComPilhas : Enfileiravel {
    private val pilha1: Empilhavel = PilhaEstatica()
    private val pilha2: Empilhavel = PilhaEstatica()
    override fun enfileirar(dado: Any?) {
        if (!estaCheia()) {
            while (!pilha1.estaVazia()) {
                pilha2.empilhar(pilha1.desempilhar())
            }

            pilha1.empilhar(dado)

            while (!pilha2.estaVazia()) {
                pilha1.empilhar(pilha2.desempilhar())
            }

        } else {
            println("Fila Cheia!")
        }
    }

    override fun desenfileirar(): Any? {
        return pilha1.desempilhar()
    }

    override fun atualizar(dado: Any?) {
        pilha1.atualizar(dado)
    }

    override fun espiar(): Any? {
        return pilha1.espiar()
    }

    override fun estaCheia(): Boolean {
        return pilha1.estaCheia()
    }

    override fun estaVazia(): Boolean {
        return pilha1.estaVazia()
    }

    override fun imprimir(): String {
        return pilha1.imprimir()
    }
}