package com.quanken.hellogroup

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TestHelloWorld {

    HelloWorld hw
    def name

    @Before
    void setup() {
        hw = new HelloWorld()
        name = "quanken"
    }

    @Test
    void test() {
        Assert.assertEquals("hello " + name, hw.sayHelloTo(name).toString())
    }
}