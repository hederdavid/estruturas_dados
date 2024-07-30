package heap.filaPacientesHeapMinimo4

data class Paciente(var nome: String, var idade: Int, var prioridade: Long) {

    private fun prioridadeOriginal(): Int {
        var prioridadeString = prioridade.toString()
        var tamanhoPrioridade = prioridadeString.length
        var prioridade = prioridadeString.substring(0, tamanhoPrioridade - 14)
        return prioridade.toIntOrNull() ?: 0
    }

    override fun toString(): String {
        return "Paciente(nome='$nome', idade=$idade, prioridade=$prioridade, prioridadeOriginal=${prioridadeOriginal()})"
    }
}
