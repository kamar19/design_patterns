package abstractFactory.androidAcademy

import abstractFactory.Closet

class AndroidAcademyCloset : Closet {
    override fun hasShelves() {
        println("AndroidAcademyCloset - hasShelves")
    }

    override fun hasLocker() {
        println("AndroidAcademyCloset - hasLocker")
    }
}