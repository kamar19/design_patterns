package abstractFactory.androidAcademy

import abstractFactory.Sofa

class AndroidAcademySofa : Sofa {
    override fun hasSoftSeat():Boolean {
        println("AndroidAcademySofa - hasSoftSeat")
        return true
    }

    override fun sitOnPillow() {
        println("AndroidAcademySofa - sitOnPillow")
    }
}