package lista.dinamica

interface Listavel {
    fun anexar(dado: Any?)
    fun inserir(dado: Any?, posicao: Int)
    fun atualizar(dado: Any?, posicao: Int)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun apagar(posicao: Int): Any?

    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}