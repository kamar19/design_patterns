package strategy

class CarStrategy : Strategy {
    override fun createRoute() {
        println("на авто")
    }

    override fun doPark() {
        println("о парковке можно не думать")
    }
}