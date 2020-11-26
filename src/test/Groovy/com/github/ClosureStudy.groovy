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
}
