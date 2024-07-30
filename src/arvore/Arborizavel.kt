package arvore

interface Arborizavel {
    fun inserir(dado: Any?)
    fun apagar(dado: Any?): Boolean
    fun buscar(dado: Any?): NoTriplo?
    fun existe(dado: Any?): Boolean
    fun getRaiz(): NoTriplo?
    fun limpar()
    fun imprimirPreOrdem(): String
    fun imprimirEmOrdem(): String
    fun imprimirPosOrdem(): String
}