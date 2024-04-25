fun duplicateCount(text: String): Int {
    //Lösung 1
    var count = 0;
    var text2 = text.lowercase()

    text.forEachIndexed { i, c ->
        text2 = text2.drop(i + 1)
        for (char in text2) {
            if (c == char && char != ' ') {
                text2 = text2.replace(char, ' ')
                count++
                break
            }
        }
    }

    return count

    //Lösung 2
    /* return text
            .lowercase()
            .groupingBy { it }.eachCount()
            .count { it.value > 1 }*/


}