package lista4

interface Listavel {
    fun anexar(dado: Any?)
    fun inserir(dado: Any?, posicao: Int)
    fun apagar(dado: Any?, posicao: Int): Any?
    fun apagarTodos(): Array<Any?>
    fun atualizar(dado: Any?, posicao: Int)
    fun selecionar(posicao: Int): Any?
    fun selecionarTodos(): Array<Any?>

    fun limpar()
    fun tamanho(): Int
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}