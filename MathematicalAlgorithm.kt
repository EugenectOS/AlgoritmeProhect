package MyProjectForGitHub

fun printLiteCalculator(number1: Int, number2: Int, elementMath: String){
            when (elementMath) {
                "+" -> println("$number1 + $number2 = ${number1 + number2}")
                "-" -> println("$number1 - $number2 = ${number1 - number2}")
                "*" -> println("$number1 * $number2 = ${number1 * number2}")
                "/" -> println("$number1 / $number2 = ${number1 / number2}")
            }
}
fun funElemebtMath(el: String): String {
    val methematic = arrayOf('+','-','*','/')
    for (i in el) {
        if (i !in methematic) throw java.lang.Exception("¬ы ввели некорректный тип данных, введите пожалуйста »м€")
    }
    return el
}
fun numberComparison(number1: Int, number2: Int){
    when{
        number1 == number2 -> println("$number1 = $number2")
        number1 > number2 -> println("$number1 > $number2")
        number1 < number2 -> println("$number1 < $number2")
        else -> println("No result")
    }
}
fun convectorTime(number1: Long){
    val year = number1 / 31536000
    val modYear = number1 % 31536000
    val month = number1 / 2628000
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