package abstractFactory

interface Furniture {
    fun createArmchair(): Armchair
    fun createSofa(): Sofa
    fun createTable(): Table
    fun createСloset(): Closet
}