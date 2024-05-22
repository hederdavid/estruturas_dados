package heap.filaPacientesHeapMinimo

class Paciente(val nome: String, val idade: Int, val prioridade: Long) {

    private fun prioridadeOriginal(): Int {
        var prioridadeString = prioridade.toString()
        val tamanhoString = prioridadeString.length
        val digitosIniciais = prioridadeString.substring(0, tamanhoString - 14)
        return digitosIniciais.toIntOrNull() ?: 0
    }

    override fun toString(): String {
        return "Paciente(nome='$nome', idade=$idade, prioridade=$prioridade), prioridadeOriginal = ${prioridadeOriginal()}"
    }


}