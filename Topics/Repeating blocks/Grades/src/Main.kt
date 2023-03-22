fun main() {
    // put your code here
    val n = readln().toInt()

    var D = 0
    var C = 0
    var B = 0
    var A = 0

    repeat(n) {
        val t = readln().toInt()
        when (t) {
            2 -> ++D
            3 -> ++C
            4 -> ++B
            5 -> ++A
        }
    }

    print("$D $C $B $A")
}