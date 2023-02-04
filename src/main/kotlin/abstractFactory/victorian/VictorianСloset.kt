package abstractFactory.victorian

import abstractFactory.Closet

class VictorianСloset : Closet {
    override fun hasShelves() {
        println("VictorianСloset - hasShelves")
    }

    override fun hasLocker() {
        println("VictorianСloset - hasLocker")
    }
}
