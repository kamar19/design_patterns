package abstractFactory.victorian

import abstractFactory.*

open class VictorianFurnitureFactory : Furniture {
    override fun createArmchair(): Armchair {
        return VictorianArmchair()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }

    override fun createTable(): Table {
        return VictorianTable()
    }

    override fun createСloset(): Closet {
        return VictorianСloset()
    }
}