package main

/*
 * Even Fibonacci numbers
 * https://projecteuler.net/problem=2
 */

fun main(args: Array<String>) {
    val fibonacci = generateSequence(1 to 1) {
        it.second to it.first + it.second
    }.map { it.first }

    val sum = fibonacci.takeWhile { it < 4000000 }
    .filter { it % 2 == 0 }
    .sum()

    println(sum)

}