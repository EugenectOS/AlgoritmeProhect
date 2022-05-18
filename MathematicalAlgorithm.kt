package MyProjectForGitHub

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
        "¬ведите число cекунд. я дл€ ¬ас конвертирую это числов в формат:\n" +
                "- √од\n" +
                "- ћес€ц\n" +
                "- Ќедел€\n" +
                "- ƒень\n" +
                "- „ас\n" +
                "- ћинута\n" +
                "- —екунда\n"
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
            11L -> "$month мес€цев"
            else -> "$month мес€ц"
        }
        in 2L..4L -> when (month % 100) {
            in 12L..14L -> "$month мес€цев"
            else -> "$month мес€ца"
        }
        else -> "$month мес€цев"
    }
    val weekPrint = when (week % 10) {
        1L -> when (week % 100) {
            11L -> "$week недель"
            else -> "$week недел€"
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
            else -> "$day дн€"
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