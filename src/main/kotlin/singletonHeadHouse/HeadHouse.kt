package singletonHeadHouse

open class HeadHouse() {
    private var instance: HeadHouse? = null

    fun getInstance(): HeadHouse {
        if (instance == null) {
            instance = HeadHouse()
        }
        return instance as HeadHouse
    }
}