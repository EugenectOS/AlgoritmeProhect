package MyProjectForGitHub

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
                        "\t12 - Блок программ с проверкой \"arrayOf()\" на повторение слова и на самое длинное\n" +
                        "\t 0 - Завершить программу")
            val userBlokProgram = readLine()!!.toInt()
            if (userBlokProgram == 0) break
            if (userBlokProgram == 1) printBiography()
            if (userBlokProgram == 2) {
                while (true) {
                    try {
                        println(
                            "Введите число соответствующее программе:\n" +
                                    "\t 1 - Простой калькулятор;\n" +
                                    "\t 2 - Проверка на равенство;\n" +
                                    "\t 3 - Бесконечное умножение чисел;\n" +
                                    "\t 4 - Число фибаначи\n" +
                                    "\t 0 - Выйти с блока.")
                        val userProgramM = readLine()!!.toInt()
                        if (userProgramM == 0) break
                        while (true) {
                            when (userProgramM) {
                                1 -> printLiteCalculator()
                                2 -> numberComparison()
                                3 -> forNumberMultiplication()
                                4 -> numberFibonacci()
                            }
                            println(
                                "Хотите выйти с этой программы?\n" +
                                        "Если да нажмите - 1\n" +
                                        "Если нет нажмите - 2")
                            val chiceuserProgramM = readLine()!!.toInt()
                            if (chiceuserProgramM == 1) break
                        }
                    } catch (n: NumberFormatException) {
                        println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
                    } catch (a: ArithmeticException) {
                        println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
                    }
                }
            }
            if (userBlokProgram == 3) convectorTime()
            if (userBlokProgram == 4) {
                while (true) {
                    try {
                        println(
                            "Введите число соответствующее программе:\n" +
                                    "\t 1 - Подсчет жителей города через 10 лет;\n" +
                                    "\t 2 - Подстчет жителей города через 10 лет с условием, что на 1 человек меньше рождается и умирает;\n" +
                                    "\t 0 - Выйти с блока.")
                        val userProgramXYZ = readLine()!!.toInt()
                        if (userProgramXYZ == 0) break
                        while (true) {
                            when (userProgramXYZ) {
                                1 -> cityXYZVar10Yer()
                                2 -> cityXYZVar10YerMinusOne()
                                0 -> break
                            }
                            println(
                                "Хотите выйти с этой программы?\n" +
                                        "Если да нажмите - 1\n" +
                                        "Если нет нажмите - 2")
                            val chiceuserProgramXYZ = readLine()!!.toInt()
                            if (chiceuserProgramXYZ == 1) break
                        }
                    } catch (n: NumberFormatException) {
                        println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
                    } catch (a: ArithmeticException) {
                        println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
                    }
                }
            }
            if (userBlokProgram == 5) bank7InTheMonth()
            if (userBlokProgram == 6) {
                while (true) {
                    try {
                        println(
                            "Введите число соответствующее программе:\n" +
                                    "\t 1 - Равнобедренный треугольник из 1;\n" +
                                    "\t 2 - Треугольник Паскаля;\n" +
                                    "\t 0 - Выйти с блока.")
                        val userProgramTriangle = readLine()!!.toInt()
                        if (userProgramTriangle == 0) break
                        while (true) {
                            when (userProgramTriangle) {
                                1 -> triangleIsOne()
                                2 -> trianglePasskalya()
                            }
                            println(
                                "Хотите выйти с этой программы?\n" +
                                        "Если да нажмите - 1\n" +
                                        "Если нет нажмите - 2")
                            val chiceuserProgramTriangle = readLine()!!.toInt()
                            if (chiceuserProgramTriangle == 1) break
                        }
                    } catch (n: NumberFormatException) {
                        println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
                    } catch (a: ArithmeticException) {
                        println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
                    }
                }
            }
            if (userBlokProgram == 7) {
                while (true) {
                    try {
                        println(
                            "Введите число соответствующее программе:\n" +
                                    "\t 1 - Создание нового массива из чисел не повторяющихся в других двух массивах;\n" +
                                    "\t 2 - Сортировка массива на увелиение и на уменьшене;\n" +
                                    "\t 3 - Слияние массивов;\n" +
                                    "\t 4 - Вывод 3-х самых больших чисел массива;\n" +
                                    "\t 5 - Вывод первого и последнего элемента массива;\n" +
                                    "\t 6 - Колличество символов в строке;\n" +
                                    "\t 0 - Выйти с блока.")
                        val userProgramArray = readLine()!!.toInt()
                        if (userProgramArray == 0) break
                        while (true) {
                            when (userProgramArray) {
                                1 -> newArray()
                                2 -> arraySortDescending()
                                3 -> arraSumArray()
                                4 -> sortMax3()
                                5 -> firstArrayLast()
                                6 -> amountString()
                            }
                            println(
                                "Хотите выйти с этой программы?\n" +
                                        "Если да нажмите - 1\n" +
                                        "Если нет нажмите - 2")
                            val chiceuserProgramArray = readLine()!!.toInt()
                            if (chiceuserProgramArray == 1) break
                        }
                    } catch (n: NumberFormatException) {
                        println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
                    } catch (a: ArithmeticException) {
                        println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
                    }
                }
            }
            if (userBlokProgram == 8) palindrom()
            if (userBlokProgram == 9) stringToArray()
            if (userBlokProgram == 10) arrayDel2()
            if (userBlokProgram == 11) distinctArra()
            if (userBlokProgram == 12) arrayStringLongDub()
        } catch (n: NumberFormatException) {
            println("Вы ввели не корректный тип данных. Пожалуйста введите число.")
        } catch (a: ArithmeticException) {
            println("Вы ввели не допустимое число. Введите число соответствующее блоку программ.")
        }
    }
}
