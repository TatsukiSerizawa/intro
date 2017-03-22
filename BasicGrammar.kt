fun main(args: Array<String>){

/*    var kotori = 80  変更可の変数宣言 */
    var rin = 75
    val nico = 74 //変更不可の変数宣言

    println(nico) //nicoの値を出力

    case1("kotori") //case1関数を実行

    for(arg in args){ //コレクションに対するループ
        println(arg)
    }

    for(x in 75..85){ //75~85の繰り返し
        println(x)
        if(x in 80..83){ //xが80~83なら実行
            println("kotokotori")
        }
    }
}

fun case1(name: String){ //name = kotori
    when(name){ //条件分岐
        "rin" -> println("75") //rinではないので出力せず
        "kotori" -> println("kotori 80") //出力
        else -> println("unknown")
    }

    if(name == "nico") //条件分岐
        println("nico 74")
    else
        println("rin 75")
}
