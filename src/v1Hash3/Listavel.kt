package v1Hash3

interface Listavel {

    fun anexar(dado: Any?)
    fun inserir(dado: Any?, posicao: Int)
    fun atualizar(dado: Any?, posicao: Int)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun apagar(posicao: Int): Any?
    fun apagarTodos(): Array<Any?>
    fun limpar()
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
    fun tamanho(): Int
}