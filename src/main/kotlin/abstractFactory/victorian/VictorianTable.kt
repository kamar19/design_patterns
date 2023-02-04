package abstractFactory.victorian

import abstractFactory.Table

class VictorianTable : Table {
    override fun hasHighLegs() {
        println("VictorianArmchair - hasHighLegs")
    }

    override fun hasСountertop() {
        println("VictorianArmchair - hasСountertop")
    }
}