/*
fun toCamelCase2(str: String): String = str
    .split('-', '_')
    .joinToString("") { word ->
        word.replaceFirstChar {
                it.uppercase()
            }
    }
    .replaceFirstChar { str.first() }
*/

fun findMissingLetter(array: CharArray): Char {
    val startingLetter = array.first()
    val endLetter = array.last()

    val alphabet = if (startingLetter.isUpperCase()) {
        "abcdefghijklmnopqrstuvwxyz".uppercase()
    } else "abcdefghijklmnopqrstuvwxyz"

    var startRange = 0
    var endRange = 0

    for (index in alphabet.indices) {
        if (alphabet[index] == startingLetter) {
            startRange = index
        }
        if (alphabet[index] == endLetter) {
            endRange = index
        }
    }

    val cutAlphabet = alphabet.substring(startRange..<endRange + 1)

    cutAlphabet.forEach { char ->
        if (!(array.contains(char))) {
            return char
        }
    }
    return ' '
}

fun findMissingLetter2(array: CharArray): Char {
    for (i in 1..<array.size) {
        if (array[i] != array[0] + i) {
            return array[0] + i
        }
    }
    return ' '
}




