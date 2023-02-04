package abstractFactory.victorian

import abstractFactory.Closet

class VictorianСloset : Closet {
    override fun hasShelves():Boolean {
        println("VictorianСloset - hasShelves")
        return true
    }

    override fun hasLocker():Boolean {
        println("VictorianСloset - hasLocker")
        return true
    }
}
