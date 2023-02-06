package abstractFactory.sport

import abstractFactory.Table

class SportTable : Table {
    override fun hasHighLegs():Boolean {
        println("SportTable - hasHighLegs")
        return true
    }

    override fun hasСountertop() {
        println("SportTable - hasСountertop")
    }
}