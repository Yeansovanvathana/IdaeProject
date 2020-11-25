import java.util.*
fun main(a:Array<String>){
    var name : String
    var age : Int
    var scan = Scanner(System.`in`)
    println("Enter your name: ")
    name = scan.next()
    println(name)
    println("Enter your age")
    age = scan.nextInt()
    println(age)
    var old = when (age){
        in 1..15 ->
            println("you are kid")
        in 16..30 ->
            println("you are adult")
        in 30..65 ->
            println("you are old")
        else ->
            println("you are very old")

    }
    print(old)
}