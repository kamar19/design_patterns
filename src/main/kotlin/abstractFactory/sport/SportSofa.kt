package abstractFactory.sport

import abstractFactory.Sofa

class SportSofa : Sofa {
    override fun hasSoftSeat(): Boolean {
        println("SportSofa - hasSoftSeat")
        return true
    }

    override fun sitOnPillow() {
        println("SportSofa - sitOnPillow")
    }
}