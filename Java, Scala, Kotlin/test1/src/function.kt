fun main(a:Array<String>) {
    var a:Int = 0 //4 Bytes
    var b:Float = a.toFloat()  // 4 Bytes
    var c:Double = a.toDouble()
    var d:String = a.toString()
    var e:Char = a.toChar()

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    var f:Float = 3.14f

    a = f.toInt()
    c = f.toDouble()
    d = f.toString()
    e = f.toChar()

    var str = "1234"
    a = str.toInt()
    b = str.toFloat()
    c = str.toDouble()
    var ch = str.toCharArray()

    println(a)
    println(b)
    println(c)
    println(e)
}
