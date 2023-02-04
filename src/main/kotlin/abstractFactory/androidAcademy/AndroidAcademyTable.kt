package abstractFactory.androidAcademy

import abstractFactory.Table

class AndroidAcademyTable : Table {
    override fun hasHighLegs(): Boolean {
        println("AndroidAcademySofaTable - hasHighLegs")
        return true
    }

    override fun hasСountertop() {
        println("AndroidAcademySofaTable - hasСountertop")
    }
}