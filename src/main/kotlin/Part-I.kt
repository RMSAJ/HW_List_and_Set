fun main(args: Array<String>) {
    val rakanFavCities= listOf("Riyadh","Madinah","Qassim").toMutableList()

    rakanFavCities.addAll(3, listOf("Makkah","Jeddah") )
    rakanFavCities[rakanFavCities.indexOf("Jeddah")]= "Abha"
    for(index in rakanFavCities ){
      var cities =   rakanFavCities[rakanFavCities.indexOf(index)]
        println("${rakanFavCities.indexOf(index)}  $cities")

    }


}