package strategy

class WalkingStrategy : Strategy {
    override fun createRoute() {
        println("Долго-долго по дорожке")
    }

    override fun doPark() {
        println("запарковаться можно везде, главное что бы была чистая поверхность для 5-й точки")
    }
}