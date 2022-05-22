package MyProjectForGitHub

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
    while (true) {
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