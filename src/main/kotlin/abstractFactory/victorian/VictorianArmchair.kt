package abstractFactory.victorian

import abstractFactory.Armchair

open class VictorianArmchair : Armchair {
    override fun hasLegs():Boolean {
        println("VictorianArmchair - hasLegs - true")
        return true
    }

    override fun sitOn() {
        println("VictorianArmchair - sitOn")
    }
}