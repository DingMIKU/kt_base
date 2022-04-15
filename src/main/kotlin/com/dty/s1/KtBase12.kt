package com.dty.s1

// TODO 12.kotlin语言的引用类型学习
// Java语言有两种数据类型
//      第一种：基本类型：int double 等
//      第二类：引用类型 String 等

// Kotlin语言只有一种数据类型：
//      看起来都是引用类型，实际上编译器会在Java字节码中，修改成基本类型
fun main() {
    val age : Int = 99
    val pi : Float = 3.1415f
    val pi2 : Double = 3.1415
    val isOK : Boolean = true
}