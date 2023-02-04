package strategy

class BikeStrategy : Strategy {
    override fun createRoute() {
        println("еду из Америки, на зелёном велике")
    }

    override fun doPark() {
        println("парковаться проще чем на авто, но тоже бывает нужно постараться")
    }
}