package MyProjectForGitHub

fun newArray(){
        println("a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)\n" +
                "b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)")
        val a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
        val b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
        var result = intArrayOf()
        for (n in b){
            if (n in a){
                result += n // добавление данных в массив
            }
        }
        for (numbResuln in result) print("$numbResuln ")
        println()
}
fun arraySortDescending(){
    println("a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)\n" +
            "b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)")
    val a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    val b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
//    sort() // сортировка по возврастанию
//    .sortDescending() // сортировка по убыванию
    for ((indexN,n) in a.withIndex()){ // сортировка на уменьшение
        for((indexN1,n1) in a.withIndex()){
            if(n < n1){
                val dop = a[indexN]
                a[indexN] = a[indexN1]
                a[indexN1] = dop
            }
        }
    }
    for(n in a) print("$n ")
    println()
    for ((indexN,n) in b.withIndex()){ // сортировка на увелиние
        for((indexN1,n1) in b.withIndex()){
            if(n > n1){
                val dop = b[indexN]
                b[indexN] = b[indexN1]
                b[indexN1] = dop
            }
        }
    }
    for(n in b) print("$n ")
    println()
}
fun arraSumArray(){
    println("a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)\n" +
            "b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)")
    val a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    val b = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val c = a + b // слияние массивов
    for (n in c ) print("$n ")
    println()
}
fun sortMax3(){
    println("myDict = arrayOf(500, 5874, 560, 400, 5874, 20)")
    val myDict = arrayOf(500, 5874, 560, 400, 5874, 20)
    for ((indexI, i) in myDict.withIndex()){
        for ((indexJ, j) in myDict.withIndex()){
            if(i > j){
                var dop = myDict[indexI]
                myDict[indexI] = myDict[indexJ]
                myDict[indexJ] = dop
            }
        }
    }
    for ((index, i) in myDict.withIndex()){
        if (index < 3)
            print("$i ")
    }
    println()
}
fun palindrom(){
    println("шорош")
    val palindrom = "шорош"
    var arrayPalindrom = charArrayOf()
    for (i in palindrom){
        arrayPalindrom += i
    }
    var revPalindrom = charArrayOf()
    for (i in palindrom){
        revPalindrom += i
    }
    var n = revPalindrom.size-1
    for(i in arrayPalindrom){
        revPalindrom[n] = i
        n--
    }
    println(arrayPalindrom.contentEquals(revPalindrom))
}
fun stringToArray(){
    val enterUserInt = readLine()
    val arr = enterUserInt?.split(",") //преобразует строку в массив с уточнением, чем будет разделяться
    if (arr != null) {
        arr.forEach(){i -> print("$i ")}
    }
}
fun firstArrayLast(){
    val a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    //.first()) // вывод значение первого индекса
    //.last()) вывод значения последего индекса
    println("${a[0]}")
    val n = a.size-1
    println("${a[n]}")
}
fun arrayDel2(){
    println("a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 237, 250, 367)")
    val a = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 237, 250, 367)
    for(numb in a) {
        var delnumb = numb / 2
        if (numb == (delnumb * 2))
            print("$numb ")
        if (numb == 237) break
    }
    println()
}
fun amountString(){
    println("Hello my friends")
    val str = "Hello my friends"
    print(str.length) // количество символов в строке
}
fun distinctArra(){
    println("numbers = arrayOf(1, 1, 2, 5, 255, 255, 455 ,3 ,8 ,2 ,7)")
    val numbers = arrayOf(1, 1, 2, 5, 255, 255, 455 ,3 ,8 ,2 ,7)
//    val unick = numbers.distinct().sorted() // проверка на уникальность элементов, сортровка на возрастание
    var unickNumbers = intArrayOf()
    for(i in numbers){
        for (j in numbers){
            if (i in unickNumbers) break
            if(i == j){
                unickNumbers += i
                break
            }
        }
    }
    unickNumbers.forEach { i -> print("$i ") }
    println()
}
fun arrayStringLongDub(){
    println("Введите текст:")
    val userTextString = convertToStringArray(readLine()!!.toCharArray().toTypedArray())
    var lot1: Int
    var lotOften = 0
    var wordOften = ""
    var wordLanger = ""
    for ((indexI, i) in userTextString.withIndex()){
        lot1 = 0
        for (j in userTextString){
            if (i == j) lot1++
            if (lot1 > lotOften){
                lotOften = lot1
                wordOften = i
            }
            if (wordLanger.toCharArray().size < i.toCharArray().size) wordLanger = i
        }
    }
    println("Повторяющееся слово: $wordOften \n" +
            "Самое длинное слово: $wordLanger")
}
fun convertToStringArray (userText: Array<Char>): Array<String> {
    var void = 1
    for (i in userText) {
        if (i == ' ') void++
    }
    var indexString = 0
    val textString = Array(void){""}
    for (i in userText.indices){
        if (userText[i] == ' '){
            indexString++
            continue
        }
        if ((userText[i] == ',') || (userText[i] == '!') || (userText[i] == '.') || (userText[i] == ':') || (userText[i] == ';') || (userText[i] == '?'))
            continue
        textString[indexString] += userText[i].toString()
    }
    return textString
}