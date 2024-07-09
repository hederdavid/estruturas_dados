package estudosProva.heap.heapminimopaciente

interface HeapingPaciente {
    fun enfileirar(dado: Paciente)
    fun desenfileirar(): Paciente?
    fun espiar(): Paciente?
    fun atualizar(dado: Paciente)

    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}