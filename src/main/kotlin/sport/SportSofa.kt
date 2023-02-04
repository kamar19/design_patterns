package abstractFactory.sport

import abstractFactory.Sofa

class SportSofa : Sofa {
    override fun hasSoftSeat() {
        println("SportSofa - hasSoftSeat")
    }

    override fun sitOnPillow() {
        println("SportSofa - sitOnPillow")
    }
}