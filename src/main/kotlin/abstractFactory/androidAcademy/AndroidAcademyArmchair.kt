package abstractFactory.androidAcademy

import abstractFactory.Armchair

class AndroidAcademyArmchair : Armchair {
    override fun hasLegs(): Boolean {
        println("AndroidAcademyArmchair - hasLegs - true")
        return true
    }

    override fun sitOn() {
        println("AndroidAcademyArmchair - sitOn")
    }
}