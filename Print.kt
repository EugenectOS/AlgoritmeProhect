package MyProjectForGitHub



//fun main() {


fun printBiography (){
           while (true) {
               try {
                   println("Введите Ваше Имя")
                   val myNema = testString(readln())
                   println("Введите Ваш возраст")
                   val myAge = testAge(readln().toInt())
                   println("Введите Вашу дату рождения формата: 01.07.1990")
                   val dateOfBirth = readLine()
                   println("Введите город Ваш город")
                   val myCity = testString(readln())
                   println("Введите Ваш рост формата: 178.5")
                   val height = testLong(readln().toFloat())
                   println(
                       "\tMy name $myNema. To me $myAge age. I be born $dateOfBirth.\n" +
                               "\tI resid in $myCity.\n" +
                               "\tMy height $height")
                   break
               }catch (e: Exception){
                   println("Введен не корректный тип данных")
               }
           }
}
fun testString(str: String): String {
    val userStr = str.replaceFirstChar { it.lowercase() }
    val abc = arrayOf('а', 'б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','р','п','с','т','у','ф','х','ш','щ','ъ','ы','ь','э','ю','я')
    for (i in userStr){
        if (i !in abc) throw java.lang.Exception("Вы ввели некорректный тип данных, введите пожалуйста Имя")
    }
    return str
}
fun testAge(intAge: Int): Int{
    if (intAge !in 0..155) throw java.lang.Exception("Вы ввели некорректный тип данных, введите пожалуйста число")
    return intAge
}
fun testLong(intLong: Float): Float{
    if (intLong !in 0F..250F) throw java.lang.Exception("Вы ввели некорректный тип данных, введите пожалуйста число")
    return intLong
}