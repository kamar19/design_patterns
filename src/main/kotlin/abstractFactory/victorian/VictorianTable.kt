package abstractFactory.victorian

import abstractFactory.Table

class VictorianTable : Table {
    override fun hasHighLegs():Boolean {
        println("VictorianArmchair - hasHighLegs")
        return true
    }

    override fun hasСountertop() {
        println("VictorianArmchair - hasСountertop")
    }
}