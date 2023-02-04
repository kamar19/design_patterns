package abstractFactory.victorian

import abstractFactory.Sofa

class VictorianSofa : Sofa {
    override fun hasSoftSeat() {
        println("VictorianSofa - hasSoftSeat")
    }

    override fun sitOnPillow() {
        println("VictorianSofa - sitOnPillow")
    }
}