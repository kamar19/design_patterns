package abstractFactory.sport

import abstractFactory.Closet

class SportCloset : Closet {
    override fun hasShelves(): Boolean {
        println("SportCloset - hasShelves")
        return true
    }

    override fun hasLocker(): Boolean {
        println("SportCloset - hasLocker")
        return true
    }
}