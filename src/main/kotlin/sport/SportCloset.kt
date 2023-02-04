package abstractFactory.sport

import abstractFactory.Closet

class SportCloset : Closet {
    override fun hasShelves() {
        println("SportCloset - hasShelves")
    }

    override fun hasLocker() {
        println("SportCloset - hasLocker")
    }
}