package heap.filaPacientesHeapMaximo

interface HeapMaximo {
    fun enfileirar(dado: Paciente)
    fun desenfileirar(): Paciente?
    fun atualizar(dado: Paciente)
    fun espiar(): Paciente?

    fun estaVazia(): Boolean
    fun estaCheia(): Boolean
    fun imprimir(): String
}