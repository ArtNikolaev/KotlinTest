package homework.dz.dz_3

class Main {}
    fun main() {
        println(calc(a = 10, b = 3))
        max(2,2,3)
        println(studentRating(95))
        println(envelopes(4,6,7,8))
        println(sumEvenNum())
        println(factorial(5))
        println(decBin(45))
    }

    fun calc(a: Int, b: Int) : Int {
        return if(a%2 == 0) a*b else a + b
        }

    fun max (a: Int, b: Int, c: Int) {
        val max1 = a+b+c
        val max2 = a*b*c
        println(max1)
        println(max2)
    }

    fun studentRating(lore: Int): String {
        return when(lore){
            in 0..19 -> "F"
            in 20..39 -> "E"
            in 40..59 -> "D"
            in 60..74 -> "C"
            in 75..89 -> "B"
            in 90..100 -> "A"
            else -> "Error!"
        }
    }

    fun envelopes(a: Int, b: Int, c: Int, d: Int) :Boolean {
        return when{
            maxOf(a, b) < maxOf(c,d) -> minOf(a, b) < minOf(c,d)
            maxOf(a, b) > maxOf(c,d) -> minOf(a, b) > minOf(c,d)
            else -> false
        }
    }

    fun sumEvenNum (): Int {
        var kol = 0
        var sum = 0
        for(n in 2..99 step 2) {
            kol ++
            sum += n
        }
        println(kol)
        return sum
    }

    fun factorial (a: Int) : Double {
        var result = 1.0
        for (i in 1..a) {
            result *= i
        }
        return result
    }

fun decBin(a: Int) : String {
    val union = StringBuilder()
    var dec = a
    while (dec > 0) {
        val bin = dec % 2
        dec /= 2
        union.insert(0, bin)
    }
    return union.toString()
}


