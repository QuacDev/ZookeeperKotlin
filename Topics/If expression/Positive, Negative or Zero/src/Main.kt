fun main() {
    val a = readln().toInt()
    println(if(a==0) "zero" else if(a>0) "positive" else "negative")
}