package MyProjectForGitHub

fun printBiography (){
    val myNema = "Eugene"
    val myAge: Byte = 27
    val City = "Mozdok"
    val Date_of_Birth = "21.12.1994"
    val Height: Float = 177.8F
    println("\tMy name $myNema. To me $myAge age. I be born $Date_of_Birth.\n" +
            "\tI resid in $City.\n" +
            "\tMy height $Height")
}
fun printLiteCalculator(){
    println("Dear friend i will help you solve simple examples\n" +
            "enter number")
    val number1  = readLine()!!.toInt()
    println("Enter another number")
    val number2 = readLine()!!.toInt()
    val sum = number1 + number2
    val subtraction = number1 - number2
    val multiplication = number1 * number2
    val difference = number1 / number2.toFloat()
    println("$number1+$number2=$sum\n" +
            "$number1-$number2=$subtraction\n" +
            "$number1*$number2=$multiplication\n" +
            "$number1/$number2=$difference")
}
fun numberComparison(){
    println("Enter two a number to compare")
    val numb1 = readLine()!!.toInt()
    val numb2 = readLine()!!.toInt()

    if (numb1==numb2){
        println("$numb1=$numb2")
    }
    else if (numb1>numb2){
        println("$numb1>$numb2")
    }
    else if (numb1<numb2){
        println("$numb1<$numb2")
    }
    else {
        println("No result")
    }
}
fun convectorTime(){
    println(
        "Введите число cекунд. Я для Вас конвертирую это числов в формат:\n" +
                "- Год\n" +
                "- Месяц\n" +
                "- Неделя\n" +
                "- День\n" +
                "- Час\n" +
                "- Минута\n" +
                "- Секунда\n"
    )
    var numb1 = readLine()!!.toLong()

    val year = numb1 / 31536000
    val modYear = numb1 % 31536000
    val month = numb1 / 2628000
    val modMonth = modYear % 2628000
    val week = modMonth / 604800
    val modWeek = modMonth % 604800
    val day = modWeek / 86400
    val modDay = modWeek % 86400
    val hour = modDay / 3600
    val modHour = hour % 3600
    val minute = modHour / 60
    val second = modHour % 60

    val yearPrint = when (year % 10) {
        1L -> when (year % 100) {
            11L -> "$year лет"
            else -> "$year год"
        }
        in 2L..4L -> when (year % 100) {
            in 12L..14L -> "$year лет"
            else -> "$year года"
        }
        else -> "$year лет"
    }
    val monthPrint = when (month % 10) {
        1L -> when (month % 100) {
            11L -> "$month месяцев"
            else -> "$month месяц"
        }
        in 2L..4L -> when (month % 100) {
            in 12L..14L -> "$month месяцев"
            else -> "$month месяца"
        }
        else -> "$month месяцев"
    }
    val weekPrint = when (week % 10) {
        1L -> when (week % 100) {
            11L -> "$week недель"
            else -> "$week неделя"
        }
        in 2L..4L -> when (week % 100) {
            in 12L..14L -> "$week недель"
            else -> "$week недели"
        }
        else -> "$week недель"
    }
    val dayPrint = when (day % 10) {
        1L -> when (day % 100) {
            11L -> "$day дней"
            else -> "$day день"
        }
        in 2L..4L -> when (day % 100) {
            in 12L..14L -> "$day дней"
            else -> "$day дня"
        }
        else -> "$day дней"
    }
    val hourPrint = when (hour % 10) {
        1L -> when (hour % 100) {
            11L -> "$hour часов"
            else -> "$hour час"
        }
        in 2L..4L -> when (hour % 100) {
            in 12L..14L -> "$hour часов"
            else -> "$hour часа"
        }
        else -> "$hour часов"
    }
    val minutePrint = when (minute % 10) {
        1L -> when (minute % 100) {
            11L -> "$minute минут"
            else -> "$minute минута"
        }
        in 2L..4L -> when (minute % 100) {
            in 12L..14L -> "$minute минут"
            else -> "$minute минуты"
        }
        else -> "$minute минут"
    }
    val secondPrint = when (second % 10) {
        1L -> when (day % 100) {
            11L -> "$second секунд"
            else -> "$second секунда"
        }
        in 2L..4L -> when (second % 100) {
            in 12L..14L -> "$second секунд"
            else -> "$second секунды"
        }
        else -> "$second секунд"
    }

    println("-$yearPrint\n" +
            "-$monthPrint\n" +
            "-$weekPrint\n" +
            "-$dayPrint\n" +
            "-$hourPrint\n" +
            "-$minutePrint\n" +
            "-$secondPrint")
}
fun cityXYZVar10Yer(){
    var xyz = 10000000
    for (xyzn in 1..10) {
        xyz += xyz * (14 - 8) / 1000
    }
    println("Начеление города через 10 лет = $xyz")
}
fun cityXYZVar10YerMinusOne(){
    var xyz = 10000000
    var b1 = 14
    var d1 = 8
    for (dn in 1..10){
        xyz += xyz * (b1-d1) / 1000 // какой ответ правильный перед if или после
        b1--
        if (b1 < 7){
            b1++
        }
        d1--
        if (d1 < 6){
            d1++
        }
    }
    println("Начеление города через 10 лет = $xyz")
}
fun bank7InTheMonth(){
    println("Enter sum money")
    var numb = readln().toFloat()
    println("Enter number of months ")
    var month = readln().toInt()
    numb += numb / 100 *7
    for (totaln in 1..month){
        numb += (numb / 100 *7)
    }
    println("Сумма вклада бдет $numb")
}
fun forNumberMultiplication() {
    for (totaln in 1..999) {
        println("Enter number")
        var numb1 = readLine()!!.toInt()
        println("Enter number")
        var numb2 = readLine()!!.toInt()
        println("Result multiplication = ${numb1 * numb2}")
        println(
            "Enter 1 to exit\n" +
                    "Enter 2 to restart"
        )
        var result = readLine()!!.toInt()
        if (result == 1) println("Goodbye")
        if (result == 2) break
    }
}
fun numberFibonacci(){
    println("Enter number Fibonacci")
    var numbf = readLine()!!.toInt()
    println("Enter number long")
    var long = readLine()!!.toInt()
    long -= 3
    print("0, 1, $numbf, ")
    numbf++
    var total = numbf
    numbf--
    for (fibn in 1..long){
        print("$total, ")
        total += numbf
        numbf = total - numbf
    }
}
fun triangleIsOne(){
    println("Enter number for triangle")
    var numbert = readLine()!!.toInt()
    var numb1 = 1
    for (n1 in 1..numbert){
        for (n2 in 1..numbert){
            print(" ")
        }
        numbert--
        var numbn1 = n1
        do {
            if (numb1 < 10){
                print("$numb1 ")
                numbn1--}
            else {
                print("$numb1")
                numbn1--
            }
        }while (numbn1>0)
        numb1++
        println()
    }
}
fun trianglePasskalya(){
    println("Enter number for triangle")
    var n = readLine()!!.toLong()
    var nDop = 1L
    var m = 1L
    var subtraction: Long
    var longn1 = n
    println("1")
    for (n1 in 1 until n) {
        for(n7 in 1 .. longn1) print(" ")
        longn1--
        print ("1 ")
        for (n6 in 1 .. n1) {
            m = n6
            nDop = n1
            subtraction = nDop - m
            for (n2 in 1 until nDop) {
                nDop *= n2
            }
            for (n3 in 1 until m) {
                m *= n3
            }
            if (subtraction == 0L) {
                subtraction = 1L
            } else {
                for (n4 in 1 until subtraction) {
                    subtraction *= n4
                }
            }
            print("${nDop / (m * subtraction)} ")
        }
        println()
    }
}
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
    println(arr)
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

fun main() {
    while (true) {
        try {
            println(
                " Введите число соответствующее блоку программ:\n" +
                        "\t 1 - Блок программ с функцией \"print();\"\n" +
                        "\t 2 - Блок программ с матиматическими уравнениями;\n" +
                        "\t 3 - Блок программ с конветором времени;\n" +
                        "\t 4 - Блок программ с подсчета жителей через 10 лет\n" +
                        "\t 5 - Блок пронрамм с посчетом банквских процентов;\n" +
                        "\t 6 - Блок программ с равнобедренными треугольниками;\n" +
                        "\t 7 - Блок программ с \"arrayOf()\"\n" +
                        "\t 8 - Блок программ с проверкой слов на палиндром;\n" +
                        "\t 9 - Блок программ с конвертацией \"string\" в \"arraOf()\"\n" +
                        "\t10 - Блок программ с выводом \"arrayOf()\" четных элементов с условием до 237;\n" +
                        "\t11 - Блок программ с проверкой на уникальность числа в \"arraOf()\"\n" +
                        "\t12 - Блок программ с проверкой \"arrayOf()\" на повторение слова и на самое длинное\n")
            val userBlokProgram = readLine()!!.toInt()
            if (userBlokProgram == 1) printBiography()
            if (userBlokProgram == 2) {
                println(
                    "Введите число соответствующее программе:\n" +
                            "\t 1 - Простой калькулятор;\n" +
                            "\t 2 - Проверка на равенство;\n" +
                            "\t 3 - Бесконечное умножение чисел;\n" +
                            "\t 4 - Число фибаначи\n" +
                            "\t 0 - Выйти с блока."
                )
                val userProgramM = readLine()!!.toInt()
                while (true) {
                    when (userProgramM) {
                        1 -> printLiteCalculator()
                        2 -> numberComparison()
                        3 -> forNumberMultiplication()
                        4 -> numberFibonacci()
                        0 -> break
                    }
                    println(
                        "Хотите выйти с этого блока?\n" +
                                "Если да нажмите - 1\n" +
                                "Если нет нажмите - 2"
                    )
                    val chiceuserProgramM = readLine()!!.toInt()
                    if (chiceuserProgramM == 1) break
                }
            }
            if (userBlokProgram == 3) convectorTime()
            if (userBlokProgram == 4) {
                println(
                    "Введите число соответствующее программе:\n" +
                            "\t 1 - Подсчет жителей города через 10 лет;\n" +
                            "\t 2 - Подстчет жителей города через 10 лет с условием, что на 1 человек меньше рождается и умирает;\n" +
                            "\t 0 - Выйти с блока."
                )
                val userProgramXYZ = readLine()!!.toInt()
                while (true) {
                    when (userProgramXYZ) {
                        1 -> cityXYZVar10Yer()
                        2 -> cityXYZVar10YerMinusOne()
                        0 -> break
                    }
                    println(
                        "Хотите выйти с этого блока?\n" +
                                "Если да нажмите - 1\n" +
                                "Если нет нажмите - 2"
                    )
                    val chiceuserProgramXYZ = readLine()!!.toInt()
                    if (chiceuserProgramXYZ == 1) break
                }
            }
            if (userBlokProgram == 5) bank7InTheMonth()
            if (userBlokProgram == 6) {
                println(
                    "Введите число соответствующее программе:\n" +
                            "\t 1 - Равнобедренный треугольник из 1;\n" +
                            "\t 2 - Треугольник Паскаля;\n" +
                            "\t 0 - Выйти с блока."
                )
                val userProgramTriangle = readLine()!!.toInt()
                while (true) {
                    when (userProgramTriangle) {
                        1 -> triangleIsOne()
                        2 -> trianglePasskalya()
                        0 -> break
                    }
                    println(
                        "Хотите выйти с этого блока?\n" +
                                "Если да нажмите - 1\n" +
                                "Если нет нажмите - 2"
                    )
                    val chiceuserProgramTriangle = readLine()!!.toInt()
                    if (chiceuserProgramTriangle == 1) break
                }
            }
            if (userBlokProgram == 7) {
                println(
                    "Введите число соответствующее программе:\n" +
                            "\t 1 - Создание нового массива из чисел не повторяющихся в других двух массивах;\n" +
                            "\t 2 - Сортировка массива на увелиение и на уменьшене;\n" +
                            "\t 3 - Слияние массивов;\n" +
                            "\t 4 - Вывод 3-х самых больших чисел массива;\n" +
                            "\t 5 - Вывод первого и последнего элемента массива;\n" +
                            "\t 6 - Колличество символов в строке;\n" +
                            "\t 0 - Выйти с блока."
                )
                val userProgramArray = readLine()!!.toInt()
                while (true) {
                    when (userProgramArray) {
                        1 -> newArray()
                        2 -> arraySortDescending()
                        3 -> arraSumArray()
                        4 -> sortMax3()
                        5 -> firstArrayLast()
                        6 -> amountString()
                        0 -> break
                    }
                    println(
                        "Хотите выйти с этого блока?\n" +
                                "Если да нажмите - 1\n" +
                                "Если нет нажмите - 2"
                    )
                    val chiceuserProgramArray = readLine()!!.toInt()
                    if (chiceuserProgramArray == 1) break
                }
            }
            if (userBlokProgram == 8) palindrom()
            if (userBlokProgram == 9) stringToArray()
            if (userBlokProgram == 10) arrayDel2()
            if (userBlokProgram == 11) distinctArra()
            if (userBlokProgram == 12) arrayStringLongDub()

            println("Хотите выйти из программы?\n" +
                    "Если да нажмите - Y\n" +
                    "Если нет нажмите - N")
            val chiceuserProgramBlok = readLine()
            if (chiceuserProgramBlok == "Y") break
        } catch (n: NumberFormatException) {
            println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
            n.printStackTrace()
        } catch (a: ArithmeticException) {
            println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
            a.printStackTrace()
        }
    }
}
