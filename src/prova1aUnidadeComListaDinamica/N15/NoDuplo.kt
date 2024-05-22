package prova1aUnidadeComListaDinamica.N15

data class NoDuplo(var dado: Any? = null) {
    var anterior: NoDuplo? = null
    var proximo: NoDuplo? = null
}