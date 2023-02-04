package abstractFactory.sport

import abstractFactory.Table

class SportTable : Table {
    override fun hasHighLegs() {
        println("SportTable - hasHighLegs")
    }

    override fun hasСountertop() {
        println("SportTable - hasСountertop")
    }
}