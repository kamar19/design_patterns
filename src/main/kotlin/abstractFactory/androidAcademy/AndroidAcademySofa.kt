package abstractFactory.androidAcademy

import abstractFactory.Sofa

class AndroidAcademySofa : Sofa {
    override fun hasSoftSeat() {
        println("AndroidAcademySofa - hasSoftSeat")
    }

    override fun sitOnPillow() {
        println("AndroidAcademySofa - sitOnPillow")
    }
}