package hash2

interface Listavel {
    fun anexar(dado: Any?)
    fun inserir(dado: Any?, posicao: Int)
    fun apagar(posicao: Int): Any?
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>
    fun atualizar(dado: Any?, posicao: Int)
    fun apagarTodos(): Array<Any?>
    fun limpar()
    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
    fun tamanho(): Int

}