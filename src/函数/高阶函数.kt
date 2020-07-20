package 函数

/*
* 一、函数对象函数的参数为另一个函数
* */
fun load(name:String,function:(Int)->String){
    val id = 1
    function(id).also { println(it) }
}
//这个函数的第二个参数为一个函数
//函数参数的参数为Int，返回值为String
//这样还是有局限性，因为函数参数只能是Int->String

fun data():String{
    println("加载数据")
    return "加载数据成功"
}
fun info():String{
    println("加载信息")
    return "加载信息成功"
}

var dt  = ::data
var ifo = ::info//函数对象

/*
* 二、lambda表达式
* 就是匿名函数
* Lambda表达式 匿名函数
* 注意如果函数有返回值 不能使用return 默认返回最后一行的内容
* 函数使用括号括起来{
* 函数的参数 -> 返回值类型
* 函数体body
* */

var funA = { id:Int -> String
    println("加载主页")
    "加载主页成功"
}//lambada表达式

fun main() {
     dt().also { println(it) }//dt与函数data等价
    ::info.invoke().also { println(it) }//通过函数对象调用函数
    load("CC", funA)//调用load
    load("Moriarty"){ id:Int -> String
        "$id 的信息加载成功"
    }//高阶函数的声明，最后一个参数是函数 则表达式可以放到括号外面
}

