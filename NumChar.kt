fun main(args: Array<String>){
    var a: Int = 252
    var b: Int = 52

    println(a)
    println(b)
    println(a+b)

    var c: Double = b.toDouble() //bをDouble型に変えてcに代入

    println(a/c)

    var kotori: String = "kotori"
    var rin: String = "rin"

    for(x in kotori){
        println(x)
    }
    println(rin)

    var name1: String = "南ことり"
    var name2: String = "星空凛"
    var name3: String = "ことりん"
    var number: Int = 2

    println("${name1}と${name2}、${number}人合わせて${name3}です！") //${}で変数内容を出力
}
