package ordenacao.bubblesort

class BubbleSort(private val dados: Array<Int>) : Ordenavel {
    private fun trocar(i: Int, j: Int) {
        val temp = dados[i]
        dados[i] = dados[j]
        dados[j] = temp
    }

    override fun imprimir() {
        for (item in dados) {
            print("$item")
        }
    }
    override fun ordenar() {
        for (i in 0..<dados.size - 1) {
            for (j in 0..<dados.size - i - 1) {
                if (dados[j] > dados[j + 1]) {
                    trocar(j, j + 1)
                }
            }
        }
    }
}