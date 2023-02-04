package abstractFactory.androidAcademy

import abstractFactory.Closet

class AndroidAcademyCloset : Closet {
    override fun hasShelves(): Boolean {
        println("AndroidAcademyCloset - hasShelves")
        return true
    }

    override fun hasLocker(): Boolean {
        println("AndroidAcademyCloset - hasLocker")
        return true
    }
}