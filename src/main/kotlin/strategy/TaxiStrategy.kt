package strategy

class TaxiStrategy:Strategy {
    override fun createRoute() {
        println("еду на такси с максимальным комфортом")
    }

    override fun doPark() {
        println("парковаться проще чем на авто, но тоже бывает нужно постараться")
    }
}