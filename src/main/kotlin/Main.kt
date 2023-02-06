import abstractFactory.androidAcademy.AndroidAcademyFurnitureFactory
import adapter.TableAdapter
import builder.Home
import singletonHeadHouse.HeadHouse
import strategy.*

fun main(args: Array<String>) {
    val args0: ActionStrategy = ActionStrategy.NEARBY_STREET

    val clienGoToTheStore: Strategy =
        when (args0) {
            ActionStrategy.CITY_CENTER -> BikeStrategy()
            ActionStrategy.ANOTHER_CITY -> CarStrategy()
            ActionStrategy.NEARBY_STREET -> WalkingStrategy()
            ActionStrategy.SIDE_OF_CITY -> BusStrategy()
            else -> {
                TaxiStrategy()
            }
        }
    clienGoToTheStore.createRoute()
    clienGoToTheStore.doPark()

    val clientFurniture = AndroidAcademyFurnitureFactory()
    val clientArmchair = clientFurniture.createArmchair()
    clientArmchair.sitOn()
    clientArmchair.hasLegs()
    val clientTable = clientFurniture.createTable()
    clientTable.hasHighLegs()
    clientTable.hasСountertop()

    val builderHome = Home.BuilderDreamHome()
    builderHome.furnishGym(5)
        .furnishKitchen(5)
        .furnishLivingRoom(3)
        .furnishWorkOffice(5)
    val home: Home = builderHome.build()
    home.isBasement = true

    Singleton.doSomething()

    val singleton2 = HeadHouse()
    singleton2.getInstance()

    // Патерн Adapter
    val armchair = TableAdapter(clientTable)
    armchair.sitOn()
    armchair.table.hasHighLegs()

}

object Singleton {
    fun doSomething() {
        println("doSomething")
    }

}