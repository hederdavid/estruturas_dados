package heap.filaPacientesHeapMinimo2

data class Paciente(var nome: String, var idade: Int, var prioridade: Long) {
    override fun toString(): String {
        return "Paciente(nome='$nome', idade=$idade, prioridade=$prioridade)"
    }

    private fun prioridadeOriginal(): Int {
        var prioridadeString = prioridade.toString()
        var tamanhoString = prioridadeString.length
        var digitoInicial = prioridadeString.substring(0, tamanhoString - 15)
        return digitoInicial.toIntOrNull() ?: 0
    }
}
