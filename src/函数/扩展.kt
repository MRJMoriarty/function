package 函数

/*
* 在已有的类上添加属性
* 可以使用继承、组合等方法
* 现在介绍用扩展的方法添加参数
* 由于扩展属性没有backing field 扩展属性不能存值和初始化
* */
class Student{
    var result = "null"
    val name = "CC"
    companion object{

    }//存在伴生对象可以添加静态变量
}

fun Student.work(){
    println("${name}学习")
}//给Student类添加方法

val Student.score:Int
    get(){
        return 100
    }//添加val型参数，需要提供get方法
var Student.Id:Int
    get() = 1
    set(value) {
       result = "${name}的Id为${Id},成绩为${score}"
    }//添加var型参数，需要提供get和set方法

fun Student.Companion.info(){
    println("这是添加的静态函数")
}//添加静态函数
val Student.Companion.http:String
    get(){
        return "www.baidu.com"
    }//添加静态的val变量

fun main() {
    val student = Student()
    student.Id = 1//必须要初始化才能调用set
    student.work()
    println(student.result)
    Student.http.also { println(it) }
    Student.info()
}


