import abstractFactory.androidAcademy.AndroidAcademyFurnitureFactory
import adapter.TableAdapter
import builder.Home
import singletonHeadHouse.HeadHouse
import strategy.*

fun main(args: Array<String>) {
    val args0 = "to_another_city"

    // Патерн Strategy
    val clienGoToTheStore: Strategy =
//       when (args[0]) {
        when (args0) {
            "to_the_city_center" -> BikeStrategy()
            "to_another_city" -> CarStrategy()
            "on_nearby_street" -> WalkingStrategy()
            "other_side_of_city" -> BusStrategy()
            null -> TaxiStrategy()
            else -> {
                TaxiStrategy()
            }
        }
    clienGoToTheStore.createRoute()
    clienGoToTheStore.doPark()

    // Патерн abstractFactory
    val clientFurniture = AndroidAcademyFurnitureFactory()
    val clientArmchair = clientFurniture.createArmchair()
    clientArmchair.sitOn()
    clientArmchair.hasLegs()
    val clientTable = clientFurniture.createTable()
    clientTable.hasHighLegs()
    clientTable.hasСountertop()

    // Патерн Builder
    val builderHome = Home.BuilderDreamHome()
    builderHome.furnishGym(5)
        .furnishKitchen(5)
        .furnishLivingRoom(3)
        .furnishWorkOffice(5)
    val home: Home = builderHome.build()
    home.isBasement = true

    // Патерн Singleton
    singleton.doSomething()

    // Патерн Singleton другой вариант
    val singleton2 = HeadHouse()
    singleton2.getInstance()

    // Патерн Adapter
    val armchair = TableAdapter(clientTable)
    armchair.sitOn()
    armchair.table.hasHighLegs()

}

object singleton {
    fun doSomething() {
        println("doSomething")
    }

}