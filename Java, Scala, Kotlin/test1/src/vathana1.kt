import java.util.*

fun main(a:Array<String>) {
    var age:Int
    var scan = Scanner(System.`in`)
    println("Enter age: ")
    age = scan.nextInt()

    var old = when (age) {
        in 1..15 ->
            "you are kid"

        in 15..20 ->
            "you are teen"

        in 20..30 ->
            "you are man"

        else ->
            "you are old"

    }
    println(old)
}
