fun getCount(str: String): Int {
    var count = 0
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u');

    //Lösung 1
   /* for (char in str) {
        if (char == 'e' || char == 'a' || char == 'i' || char == 'o' || char == 'u') {
            count++;
        }
    }*/
   // return count

    // Lösung 2
   //return str.filter { c -> c=='e' || c == 'a' || c == 'i' || c == 'o' || c == 'u' }.length

    //Lösung 3
    /*for(stringChar in str){
        for(arrayChar in vowels){
            if(stringChar == arrayChar){
                count++
                break
            }
        }
    }
    return count*/

    //Lösung 4 
    return str.filter { c -> vowels.contains(c) }.length
}


