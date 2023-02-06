package builder

import abstractFactory.Furniture
import abstractFactory.androidAcademy.AndroidAcademyFurnitureFactory
import abstractFactory.sport.SportFurnitureFactory
import abstractFactory.victorian.VictorianFurnitureFactory

class Home(
//    numberFloors: Int,
//    isBasement: Boolean,
//    numberInputs: Int,
//    numberMans: Int,
//    numberRefrigerators: Int,
//    numberComputers: Int,
//    workOfficeFurniture: Furniture,
//    kitchenFurniture: Furniture,
//    gymFurniture: Furniture,
//    livingRoom: Furniture
) {
    var numberFloors: Int = 0
    var isBasement: Boolean = false
    var numberInputs: Int = 0
    var numberMans: Int = 0
    var numberRefrigerators: Int = 0
    var numberComputers: Int = 0
    var workOfficeFurniture: Furniture? = null
    var kitchenFurniture: Furniture? = null
    var gymFurniture: Furniture? = null
    var livingRoom: Furniture? = null

    constructor(numberMans: Int, numberInputs: Int) : this() {
        this.numberMans = numberMans
        this.numberInputs = numberInputs
    }

//    init {
//        this.numberFloors = numberFloors
//        this.isBasement = isBasement
//        this.numberInputs = numberInputs
//        this.numberMans = numberMans
//        this.numberRefrigerators = numberRefrigerators
//        this.numberComputers = numberComputers
//        this.workOfficeFurniture = workOfficeFurniture
//        this.kitchenFurniture = kitchenFurniture
//        this.gymFurniture = gymFurniture
//        this.livingRoom = livingRoom
//    }


    class BuilderDreamHome() : BuilderHome {
        var myHome: Home = Home()

//        init {
//            myHome.numberMans = numberMans
//            myHome.numberInputs = numberInputs
//        }

        fun build(): Home {
            return myHome
        }

        override fun furnishGym(numberMans: Int): BuilderHome {
            when (numberMans) {
                in 1..10 -> {
                    myHome.gymFurniture = SportFurnitureFactory()
                    myHome.numberRefrigerators = 1
                }

                in 11..30 -> {
                    myHome.gymFurniture = VictorianFurnitureFactory()
                    myHome.numberComputers = 2
                }

                in 31..Int.MAX_VALUE -> {
                    myHome.gymFurniture = VictorianFurnitureFactory()
                    myHome.numberComputers = 3
                }
            }

            return this
        }

        override fun furnishKitchen(numberMans: Int): BuilderHome {
            when (numberMans) {
                in 1..3 -> {
                    myHome.numberRefrigerators = 1
                    myHome.kitchenFurniture = VictorianFurnitureFactory()
                }

                in 4..10 -> {
                    myHome.numberComputers = 2
                    myHome.kitchenFurniture = VictorianFurnitureFactory()
                }

                in 11..20 -> {
                    myHome.numberComputers = 3
                    myHome.kitchenFurniture = AndroidAcademyFurnitureFactory()
                }

                else -> {
                    myHome.numberComputers = 1
                    myHome.kitchenFurniture = AndroidAcademyFurnitureFactory()
                }
            }
            return this
        }

        override fun furnishWorkOffice(numberMans: Int): BuilderHome {
            when (numberMans) {
                in 1..3 -> {
                    myHome.numberComputers = 3
                    myHome.workOfficeFurniture = AndroidAcademyFurnitureFactory()
                }

                in 4..6 -> {
                    myHome.numberComputers = 5
                    myHome.workOfficeFurniture = VictorianFurnitureFactory()
                }

                in 6..10 -> {
                    myHome.numberComputers = 15
                    myHome.workOfficeFurniture = SportFurnitureFactory()
                }

                else -> {
                    myHome.numberComputers = 2
                    myHome.workOfficeFurniture = AndroidAcademyFurnitureFactory()
                }
            }
            return this
        }

        override fun furnishLivingRoom(numberInputs: Int): BuilderHome {
            when (numberInputs) {
                in 1..6 -> {
                    myHome.numberFloors = 1
                    myHome.isBasement = false
                    myHome.livingRoom = AndroidAcademyFurnitureFactory()
                }

                in 7..12 -> {
                    myHome.numberFloors = 2
                    myHome.isBasement = false
                    myHome.livingRoom = VictorianFurnitureFactory()
                }

                in 13..30 -> {
                    myHome.numberFloors = 3
                    myHome.isBasement = true
                    myHome.livingRoom = SportFurnitureFactory()
                }
            }
            return this
        }

    }


}