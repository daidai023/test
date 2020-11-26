package com.github

import org.junit.Test

class TryDemo {
    def add(a, b, c = 1) {  //方法的参数可以不指定数据类型，参数可以指定默认值
        a + b + c           //无return关键字，代码结尾处无需添加
    }

    @Test
    void testAdd() {
        println add(2,2)
        def c = add 1,1,3   //调用方法时，方法的（）可以取消
        println c
    }

    @Test
    void testGstring() {
        def c = 100
        println("c value is ${c}")
        int[] array = [1, 2, 3]
        array.each() {it -> println("""c value is ${it}""")}
    }

    @Test
    void testIf() {
        def c = 0
        int[] myArray = []
        def myString = ""

        if (!c) {
            println("c is 0")
        }

        if (!myArray) {
            println("myArray is 空值数组")
        }

        if (!myString) {
            println("myString is 空值字符串")
        }
    }

    @Test
    void testEqual() {
        def a = [1, 2, 3]
        def b = [1, 2, 3]
        def c = a

        if (a == b) {
            println("a's value equal to b")
        }

        if (a.is(b)) {
            println("a is b")
        } else {println("a is not b")}

        if (a.is(c)) {
            println("a is c")
        }
    }


}
