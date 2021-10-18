fun main() {
    var listOfInteger = listOf(1,2,3,4,5 ).toMutableList()
    listOfInteger[2]= 12
    listOfInteger.removeIf { it ==12 }
    println(listOfInteger)

}