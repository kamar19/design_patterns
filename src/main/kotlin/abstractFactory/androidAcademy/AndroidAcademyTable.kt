package abstractFactory.androidAcademy

import abstractFactory.Table

class AndroidAcademyTable : Table {
    override fun hasHighLegs() {
        println("AndroidAcademySofaTable - hasHighLegs")
    }

    override fun hasСountertop() {
        println("AndroidAcademySofaTable - hasСountertop")
    }
}