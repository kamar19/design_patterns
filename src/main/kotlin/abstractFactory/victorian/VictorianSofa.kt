package abstractFactory.victorian

import abstractFactory.Sofa

class VictorianSofa : Sofa {
    override fun hasSoftSeat(): Boolean {
        println("VictorianSofa - hasSoftSeat")
        return true
    }

    override fun sitOnPillow() {
        println("VictorianSofa - sitOnPillow")
    }
}