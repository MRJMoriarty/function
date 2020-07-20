package 函数

/*
* Companion Object伴生对象
* 等效于java的静态变量
* */

fun main(){
    loaddata.url.also { println(it) }//调用静态变量
    loaddata.loadimage()//调用静态函数
    loaddata1.loadimage()//调用静态类里面的静态函数
    loaddata1.saveimage()
}

class loaddata{
    companion object{
        var url = "www.baidu.com"//静态变量
        fun loadimage(){
            println("加载图片")
        }
    }
}
//如果一个类里面的参数全部是静态的，可以定义为Object类
object loaddata1{
    fun loadimage(){
        println("加载图片")
    }
    fun saveimage(){
        println("保存图片")
    }
}