fun main(args: Array<String>){
    var arr1: Array<Int> = arrayOf(75, 80, 85)
    var arr2: Array<String> = arrayOf("nico", "rin", "kotori")
    var arr: Array<Int> = Array(5, {i -> i * i}) //[0, 1, 4, 9, 16] 引数を2乗して返す内包表記

    var x: Int = 0

    while(x < 3){
        println(arr2[x])
        println(arr1[x])
        x++
    }

    x = 0

    while(x < 5){
        println(arr[x])
        x++
    }


    loop@for(i in 0..5){
        println("外周1だよ！")
        for(j in 0..5){
            println("内周1だよ！")
            if(j == 2){
                break@loop //@loopによってloop@for文を終了(break)させる
            }
            println("内周2だよ！")
        }
        println("外周2だよ！")
    }
    println("ループ終了！")
}