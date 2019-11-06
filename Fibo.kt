import kotlin.system.measureNanoTime

fun main(args: Array < String >) {
    val f: String = args[0].toString()
    val n: Int = args[1].toInt()

    println(start(f, n))
}

fun start(f: String, n: Int): Long {
    return when (f) {
        "f1" -> measure(::f1, n)
        "f2" -> measure(::f2, n)
        else -> 0
    }
}

fun measure(callback: (arg1: Int) -> Long, n: Int): Long {
    var result: Long = 0
    val duration = measureNanoTime {
        result = callback(n)
    }

    println("%.8f".format(duration.toDouble() / 1000000000))

    return result
}

fun f1(n: Int): Long {
    if (n == 0) {
        return 0
    }

    if (n == 1) {
        return 1
    }

    return f1(n-1) + f1(n-2)
}

fun f2(n: Int): Long {
    var a: Long = 0
    var b: Long = 1

    for (i in 2..n) {
        val next = a + b
        a = b
        b = next
    }

    return b
}
