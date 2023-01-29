package jpabook.jpashop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpashopApplication

fun main(args: Array<String>) {

    val hello = Hello()
    hello.data = "matt"
    val data = hello.data
    println("data = $data")
    runApplication<JpashopApplication>(*args)
}
