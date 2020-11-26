package com.github

import org.junit.Test

class ClosureStudy {
    def firstClosure = {println("Hello World")} //把闭包赋值给变量，闭包使用{}，{closureParameter->statement}, closure指闭包接受的参数，多个参数用逗号隔开，statement指闭包中的代码
    def secondClosure = {a, b -> a + b}

    @Test
    void testClosure() {
        firstClosure()  //运行闭包
        println secondClosure(1, 2)
    }

    //闭包作为方法的参数
    def myFunction(name,closure) {
        closure(name)
    }

    @Test
    void testMyFunction() {
        myFunction("Dave",{name->println("my name is ${name}")})
        myFunction("Rave",{it->println("my name is ${it}")})
        myFunction("Lave",{println("my name is ${it}")})
    }

    //闭包是方法的唯一参数
    void function(closure) {
        def a = "hello"
        closure(a)
    }

    @Test
    void testFunction() {
        function({it->println(it)})
        function{it->println(it)}
    }

    @Test
    void testEach() {
        def firstList = ["zhangsan", 1, 2, 4, "lisi"]
        firstList.each {println it}

        //求和
        def secondeList = [1, 3, 5, 7, 8, 10]
        def a = 0
        secondeList.each {a = a + it}
        println(a)

        //map对象的each方法
        def myMap = ["name":"tom","age":28]
        myMap.each {key,value->println(key + "---" + value)}
    }

    @Test
    void testFind() {
        def firstList = [1, 3, 5, 8, 9]
        def result = firstList.find({it->it > 5})
        println(result)

        result = firstList.findAll({it -> it > 5})
        println result
    }
}
