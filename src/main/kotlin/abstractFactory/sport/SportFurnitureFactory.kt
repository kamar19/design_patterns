package abstractFactory.sport

import abstractFactory.*

class SportFurnitureFactory : Furniture {
    override fun createArmchair(): Armchair {
        return SportArmchair()
    }

    override fun createSofa(): Sofa {
        return SportSofa()
    }

    override fun createTable(): Table {
        return SportTable()
    }

    override fun createСloset(): Closet {
        return SportCloset()
    }
}