# fibonacci-kotlin

[![Build Status](https://travis-ci.org/xaoc-303/fibonacci-kotlin.svg?branch=master)](https://travis-ci.org/xaoc-303/fibonacci-kotlin)

## recursive if-else

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.3.50 | [Kotlin](Fibo.kt) (compiled) | 0,00541852 | 0,03712514 | 0,39989920 | 4,41861456 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## optimization

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.3.50 | [Kotlin](Fibo.kt) (compiled) | 0,00000191 | 0,00000203 | 0,00000217 | 0,00000233 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## run

```
kotlinc Fibo.kt -include-runtime -d Fibo.jar
time java -jar Fibo.jar f1 30
time java -jar Fibo.jar f2 30
```
