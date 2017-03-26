fun main(args: Array<String>){
    hello({msg: String -> println(msg)}) //ラムダ式
    yahhello(fun(a: String, b: String): String = a + b) //無名関数

    /* クロージャー */
    var sum: Int = 0
    arrayOf(1, 2, 3, 4, 5).filter {it < 3}. forEach {sum = sum + it}
    print(sum)
}

/* ラムダ式 */
fun hello(greet: (String) -> Unit){
    greet("ちゅんちゅん")
    greet("にゃ")
    greet("にっこにっこにー")
}

/* 無名関数 */
fun yahhello(pair: (String, String) -> String){
    println(pair("ほの", "にこ"))
    println(pair("まき", "りん"))
}