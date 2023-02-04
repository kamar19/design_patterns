package abstractFactory.victorian

import abstractFactory.Armchair

open class VictorianArmchair : Armchair {
    override fun hasLegs() {
        println("VictorianArmchair - hasLegs")
    }

    override fun sitOn() {
        println("VictorianArmchair - sitOn")
    }
}