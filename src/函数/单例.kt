package 函数

/*
* 单例设计模式就是整个程序有且仅有一个实例
* 该类负责创建自己的对象，同时确保只有一个对象被创建
* 同java相同，单例设计模式分为饿汉式和懒汉式
* 单例设计模式最主要是私有化构造方法
* */
fun main() {
    Person1.getinstance().show()
    Person2.getinstance.show()
}
//饿汉式
class Person private constructor(){
    companion object{
        val instance = Person()
    }
}
//懒汉式的两种方法
class Person1 private constructor(){
    companion object{
        var instance : Person1? = null
        fun getinstance():Person1{
            if (instance == null){
                synchronized(this){
                    instance = Person1()
                }
            }
            return instance!!
        }
    }
    fun show(){
        println("用懒汉式1调用函数成功")
    }
}

class Person2 private constructor(){
    companion object{
        val getinstance : Person2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            Person2()
        }
    }
    fun show(){
        println("用懒汉式2调用函数成功")
    }
}

