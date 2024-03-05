package pilha.dupla

class PilhaDupla : Empilhavel {
    private var ponteiroTopo1: Int = 0
    private var ponteiroTopo2: Int  = 0
    private var dados: Array<Any?>


    constructor(tamanho: Int) {
        ponteiroTopo1 = -1
        ponteiroTopo2 = tamanho
        dados = arrayOfNulls(tamanho)
    }

    constructor(): this(10)

    override fun empilhar1(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo1++
            dados[ponteiroTopo1] = dado
            println("Dado: ${dado}\nEmpilhado com sucesso")
            println("-------------------")
        } else {
            println("Stack is full!")
        }
    }

    override fun desempilhar1(): Any? {
        var dadoTopo: Any? = null
        if (!estaVazia1()) {
            dadoTopo = dados[ponteiroTopo1]
            ponteiroTopo1--
        } else {
            println("Stack is empty!")
        }
        return dadoTopo
    }

    override fun topo1(): Any? {
        if (!estaVazia1()) {
            return dados[ponteiroTopo1]
        } else {
            println("Stack is empty")
            return false
        }
    }

    override fun estaVazia1(): Boolean {
        return ponteiroTopo1 == -1
    }

    override fun imprimir1(): String {
        var resultado = "["
        for (i in ponteiroTopo1 downTo 0) {
            resultado += if (i == ponteiroTopo1) {
                "${dados[i]}"
            } else {
                ", ${dados[i]}"
            }
        }
        return "$resultado]"
    }

    override fun empilhar2(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo2--
            dados[ponteiroTopo2] = dado
        } else {
            println("Stack is full")
        }
    }

    override fun desempilhar2(): Any? {
        var dadoTopo: Any? = null
        if (!estaVazia2()) {
            dadoTopo = dados[ponteiroTopo2]
            ponteiroTopo2++
        } else {
            println("Stack is empty!")
        }
        return dadoTopo
    }

    override fun topo2(): Any? {
        if (!estaVazia1()) {
            return dados[ponteiroTopo2]
        } else {
            println("Stack is empty")
            return false
        }
    }

    override fun estaVazia2(): Boolean {
        return ponteiroTopo2 == dados.size - 1
    }

    override fun imprimir2(): String {
        var resultado = "["
        for (i in ponteiroTopo2..<dados.size) {
            resultado += if (i == dados.size - 1) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }

    override fun estaCheia(): Boolean {
        return ponteiroTopo1 == dados.size - 1
    }

    override fun imprimirArray(): String {
        var resultado = "["
        for (i in ponteiroTopo1 downTo 0) {
            resultado += if (i == ponteiroTopo1) {
                "${dados[i]}"
            } else {
                ", ${dados[i]}"
            }
        }

        resultado += ", "
        for (i in ponteiroTopo2..<dados.size) {
            resultado += if (i == dados.size - 1) {
                "${dados[i]}"
            } else {
                "${dados[i]}, "
            }
        }
        return "$resultado]"
    }
}