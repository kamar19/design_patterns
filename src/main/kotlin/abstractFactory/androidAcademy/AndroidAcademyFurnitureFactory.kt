package abstractFactory.androidAcademy

import abstractFactory.*

class AndroidAcademyFurnitureFactory : Furniture {
    override fun createArmchair(): Armchair {
        return AndroidAcademyArmchair()
    }

    override fun createSofa(): Sofa {
        return AndroidAcademySofa()
    }

    override fun createTable(): Table {
        return AndroidAcademyTable()
    }

    override fun createСloset(): Closet {
        return AndroidAcademyCloset()
    }
}