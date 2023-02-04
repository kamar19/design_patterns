package strategy

class BusStrategy : Strategy {
    override fun createRoute() {
        println("Долго с кучей остановок, на автобусе")
    }

    override fun doPark() {
        println("о парковке можно не думать")
    }
}