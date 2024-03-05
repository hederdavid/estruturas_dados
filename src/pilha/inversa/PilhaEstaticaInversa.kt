package pilha.inversa

class PilhaEstaticaInversa : Empilhavel {
    private var ponteiroTopo: Int
    private var dados: Array<Any?>
    constructor(tamanho: Int) {
        dados = arrayOfNulls(tamanho)
        ponteiroTopo = tamanho
    }

    constructor() : this(10)

    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo--
            dados[ponteiroTopo] = dado

        } else {
            println("Stack is full!")
        }
    }

    override fun desempilhar(): Any? {
        var dadoTopo: Any? = null
        if (!estaVazia()) {
            dadoTopo = dados[ponteiroTopo]
            ponteiroTopo++
        } else {
            println("Stack is empty!")
        }
        return dadoTopo
    }

    override fun topo(): Any? {
        if (!estaVazia()) {
            return dados[ponteiroTopo]
        } else {
            return "Stack is empty!"

        }

    }

    override fun estaVazia(): Boolean {
        return ponteiroTopo == dados.size -1
    }

    override fun estaCheia(): Boolean {
        return ponteiroTopo == 0
    }

    override fun imprimir(): String {
        var resultado: String = "["
        for (i in ponteiroTopo .. dados.size - 1)
            if (i == dados.size - 1) {
                resultado += "${dados[i]}"
            } else {
                resultado += "${dados[i]}, "
            }
        return "$resultado]"
    }
}