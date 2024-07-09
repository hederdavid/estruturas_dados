package lista2

interface Listavel {
    fun anexar(dado: Any?)
    fun inserir(dado: Any?, posicao: Int)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun atualizar(dado: Any?, posicao: Int)
    fun apagar(posicao: Int): Any?
    fun apagarTodos(): Array<Any?>
    fun limpar()
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun tamanho(): Int
    fun imprimir(): String
}