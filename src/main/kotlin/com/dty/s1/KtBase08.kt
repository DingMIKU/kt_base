package com.dty.s1

 // TODO 08.Kotlin语言的只读变量
 fun main() {

     //var 默认提示：变量从未被修改，因此可以使用 'val' 声明 val ==== 不可改变的（只读）
     val info : String = "MhyInfo"
     //info = "AA"
     println(info)
    /*
    只读   变量名 类型   值
    val   age : Int = 99
     */
     val   age : Int = 99
     println(age)
 }