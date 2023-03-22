fun main() {
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()

    println((isWeekend && cups>=15 && cups <= 25) || (!isWeekend && cups>=10 && cups <= 20))
}