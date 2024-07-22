package ordenacao.bubblesort.mergesort

fun mergeSort(array: IntArray): IntArray {
    if (array.size <= 1) {
        return array
    }

    // Dividir o array em duas metades
    val middle = array.size / 2
    val left = array.sliceArray(0 until middle)
    val right = array.sliceArray(middle until array.size)

    // Ordenar cada metade
    val sortedLeft = mergeSort(left)
    val sortedRight = mergeSort(right)

    // Conquistar: Combinar as duas metades ordenadas
    return merge(sortedLeft, sortedRight)
}

fun merge(left: IntArray, right: IntArray): IntArray {
    var leftIndex = 0
    var rightIndex = 0
    val mergedArray = IntArray(left.size + right.size)
    var mergeIndex = 0

    // Combinar os arrays ordenados
    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] <= right[rightIndex]) {
            mergedArray[mergeIndex] = left[leftIndex]
            leftIndex++
        } else {
            mergedArray[mergeIndex] = right[rightIndex]
            rightIndex++
        }
        mergeIndex++
    }

    // Adicionar qualquer elemento restante da metade esquerda
    while (leftIndex < left.size) {
        mergedArray[mergeIndex] = left[leftIndex]
        leftIndex++
        mergeIndex++
    }

    // Adicionar qualquer elemento restante da metade direita
    while (rightIndex < right.size) {
        mergedArray[mergeIndex] = right[rightIndex]
        rightIndex++
        mergeIndex++
    }

    return mergedArray
}

// Função principal para testar o Merge Sort
fun main() {
    val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
    val sortedArray = mergeSort(array)
    println("Array ordenado: ${sortedArray.joinToString(", ")}")
}
