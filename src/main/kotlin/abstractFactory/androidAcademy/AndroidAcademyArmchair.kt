package abstractFactory.androidAcademy

import abstractFactory.Armchair

class AndroidAcademyArmchair : Armchair {
    override fun hasLegs() {
        println("AndroidAcademyArmchair - hasLegs")
    }

    override fun sitOn() {
        println("AndroidAcademyArmchair - sitOn")
    }
}