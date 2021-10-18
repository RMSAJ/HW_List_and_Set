val kosaList = mutableListOf("Eli","Mordoc","Sophie")
val lastName = mutableListOf("IronFoot","Frensworth","Baggins")
val somList = mutableListOf("kosa","bsbosa","mlfof")
val uniqueKosa = mutableSetOf<String>()
fun main() {
    /* val listOfNumbers = File("Data/listOfNumbers.txt").readText().split("\n")
    //  println(listOfNumbers.maxOf { it })
/*
al sightings = mutableListOf<String>()
    sightings.add("kosa")
    sightings.add("shemam")
    sightings.add("geh")
    sightings.add("caroto")
    println("number of food found  ${sightings.size}")
    if( sightings.contains("kosa")) { println("I ate the Kosa") }
    if (sightings.contains("geh")){ println("I ate the geh")}
    println("Third Food ${sightings[2]}")
 */
    /* val stringList = mutableListOf<String>()
     val birds = mutableSetOf<String>()
     birds.add("emu")
     birds.add("magpie")
     birds.add("galah")
     birds.add("emu")
     println(birds)*/
    val nameToAge = mutableMapOf<String,Int>()
    nameToAge.put("Harry", 15)
    nameToAge.put("Hassan",19)
    nameToAge.put("Reem",22)
    println(nameToAge)
    println("========================")
    println("Hassan age is ${nameToAge["Reem"]}")
    println(nameToAge.keys)
    println("=======================")
    for(name in nameToAge.keys ){
        val age = nameToAge[name]
        println("$name is $age years old..")
    }*/

    repeat(10){
        val first = kosaList.random()
        val last = lastName.random()
        val name = "$first $last"
        uniqueKosa += name

    }

    println(uniqueKosa)
    var orderCount = 0
    while ( orderCount <= 9){
        placeOrder(
            uniqueKosa.random(),
            somList.random()
        )
        orderCount++
    }
}

fun placeOrder (kosaList:String,carotList:String){

}

