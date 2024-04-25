fun rgb(r: Int, g: Int, b: Int): String {
    return (decimalToHexa(r)) + (decimalToHexa(g)) + (decimalToHexa(b))
}

fun decimalToHexa(num: Int): String {
    val value = when {
        num > 255 -> 255
        num < 0 -> 0
        else -> {
            num
        }
    }

    return Integer.toHexString(value).uppercase().padStart(2, '0').takeLast(2)
}

@OptIn(ExperimentalStdlibApi::class)
fun decimalToHexa2(num: Int): String {
    val value = when {
        num > 255 -> 255
        num < 0 -> 0
        else -> {
            num
        }
    }
    return value.toHexString().uppercase().takeLast(2)
}
