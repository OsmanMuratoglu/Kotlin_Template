fun twoOldestAges(ages: List<Int>): List<Int> {


    return listOf(ages.sorted()[ages.size - 2], ages.sorted()[ages.size - 1])

   /* return ages
        .sorted()
        .drop(ages.size - 2)

    return ages
        .sorted()
        .slice(ages.size - 2..<ages.size)

    return ages
        .sortedDescending()
        .slice(0..1)
        .reversed()*/
}

