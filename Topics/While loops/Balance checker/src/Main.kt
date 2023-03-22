import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val a = scanner.nextInt();
        balance -= a;
        if(balance < 0) {
            println("Error, insufficient funds for the purchase. Your balance is ${balance+a}, but you need $a.")
        }
    }

    if(balance>=0) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}