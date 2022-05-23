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
        if (i !in methematic) throw java.lang.Exception("�� ����� ������������ ��� ������, ������� ���������� ���")
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
            11L -> "$year ���"
            else -> "$year ���"
        }
        in 2L..4L -> when (year % 100) {
            in 12L..14L -> "$year ���"
            else -> "$year ����"
        }
        else -> "$year ���"
    }
    val monthPrint = when (month % 10) {
        1L -> when (month % 100) {
            11L -> "$month �������"
            else -> "$month �����"
        }
        in 2L..4L -> when (month % 100) {
            in 12L..14L -> "$month �������"
            else -> "$month ������"
        }
        else -> "$month �������"
    }
    val weekPrint = when (week % 10) {
        1L -> when (week % 100) {
            11L -> "$week ������"
            else -> "$week ������"
        }
        in 2L..4L -> when (week % 100) {
            in 12L..14L -> "$week ������"
            else -> "$week ������"
        }
        else -> "$week ������"
    }
    val dayPrint = when (day % 10) {
        1L -> when (day % 100) {
            11L -> "$day ����"
            else -> "$day ����"
        }
        in 2L..4L -> when (day % 100) {
            in 12L..14L -> "$day ����"
            else -> "$day ���"
        }
        else -> "$day ����"
    }
    val hourPrint = when (hour % 10) {
        1L -> when (hour % 100) {
            11L -> "$hour �����"
            else -> "$hour ���"
        }
        in 2L..4L -> when (hour % 100) {
            in 12L..14L -> "$hour �����"
            else -> "$hour ����"
        }
        else -> "$hour �����"
    }
    val minutePrint = when (minute % 10) {
        1L -> when (minute % 100) {
            11L -> "$minute �����"
            else -> "$minute ������"
        }
        in 2L..4L -> when (minute % 100) {
            in 12L..14L -> "$minute �����"
            else -> "$minute ������"
        }
        else -> "$minute �����"
    }
    val secondPrint = when (second % 10) {
        1L -> when (day % 100) {
            11L -> "$second ������"
            else -> "$second �������"
        }
        in 2L..4L -> when (second % 100) {
            in 12L..14L -> "$second ������"
            else -> "$second �������"
        }
        else -> "$second ������"
    }

    println("-$yearPrint\n" +
            "-$monthPrint\n" +
            "-$weekPrint\n" +
            "-$dayPrint\n" +
            "-$hourPrint\n" +
            "-$minutePrint\n" +
            "-$secondPrint")
}