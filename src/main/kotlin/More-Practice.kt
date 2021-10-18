import java.io.File
import kotlin.math.max

fun main() {
val listOfNumbers = File("Data/listOfNumbers.txt").readText().split("\n")


    println(listOfNumbers.maxOf { it })

}