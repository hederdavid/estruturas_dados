package arvore

class ABP: Arborizavel {

    private var raiz: NoTriplo? = null
    override fun inserir(dado: Any?) {
        var novoNo = NoTriplo(dado)

        if (raiz == null) {
            raiz = novoNo
        } else {
            var noAuxiliar = raiz
            while (noAuxiliar != null) {
                if ((noAuxiliar.dado as Int) > (dado as Int)) {
                    if (noAuxiliar.esquerda != null) {
                        noAuxiliar = noAuxiliar.esquerda
                    } else {
                        noAuxiliar.esquerda = novoNo
                        novoNo.genitor = noAuxiliar
                        break
                    }
                } else {
                    if (noAuxiliar.direita != null) {
                        noAuxiliar = noAuxiliar.direita
                    } else {
                        noAuxiliar.direita = novoNo
                        novoNo.genitor = noAuxiliar
                        break
                    }
                }
            }
        }
    }

    override fun apagar(dado: Any?): Boolean {
        return false
    }

    override fun buscar(dado: Any?): NoTriplo? {
        return null
    }

    override fun existe(dado: Any?): Boolean {
        return false
    }

    override fun getRaiz(): NoTriplo? {
        return raiz
    }

    override fun limpar() {
        raiz = null
    }

    override fun imprimirPreOrdem(): String {
        return formataSaida(imprimirPreOrdemRec(raiz))
    }

    override fun imprimirEmOrdem(): String {
        return formataSaida(imprimirEmOrdemRec(raiz))
    }

    override fun imprimirPosOrdem(): String {
        return formataSaida(imprimirPosOrdemRec(raiz))
    }

    private fun imprimirPreOrdemRec(raiz: NoTriplo?): String {
        var resultado = ""
        if (raiz != null) {
            resultado = "${raiz.dado} ${imprimirPreOrdemRec(raiz.esquerda)} ${imprimirPreOrdemRec(raiz.direita)}"
        }

        return resultado
    }

    private fun imprimirEmOrdemRec(raiz: NoTriplo?): String {
        var resultado = ""
        if (raiz != null) {
            resultado = "${imprimirEmOrdemRec(raiz.esquerda)} ${raiz.dado} ${imprimirEmOrdemRec(raiz.direita)}"
        }

        return resultado
    }

    private fun imprimirPosOrdemRec(raiz: NoTriplo?): String {
        var resultado = ""
        if (raiz != null) {
            resultado = "${imprimirPosOrdemRec(raiz.esquerda)} ${imprimirPosOrdemRec(raiz.direita)} ${raiz.dado}"
        }
        return resultado
    }

    private fun formataSaida(msg: String): String {
        var resultado: String
        var mensagem = msg

        do {
            resultado = mensagem
            mensagem = mensagem.replace("  ", " ")
        } while (mensagem != resultado)
        mensagem = mensagem.trim()
        mensagem = mensagem.replace(" ", ",")
        return "[$mensagem]"
    }
}