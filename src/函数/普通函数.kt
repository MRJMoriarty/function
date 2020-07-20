package 函数

fun show(){}//最基本的函数,无参数，无返回值
fun show1():Unit{}//与第一个函数等价
fun show2(): Int{
    return 1
}//无参数，有返回值的函数，返回值为1
fun show3(id:Int):String{
    return "Hello Kotlin"
}//有参数，参数无默认值，有返回值
fun show4(id: Int = 1):String{
    return "CC"
}//有参数，参数有默认值，有返回值
//例:用函数计算n！
fun Power(n:Int):Int{
    var power = 1
    for (i in 1..n){
        power = i* Power(i - 1)//函数的递归
    }
    return power
}
fun main() {
    println(Power(3))
}