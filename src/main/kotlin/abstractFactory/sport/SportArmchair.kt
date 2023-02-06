package abstractFactory.sport

import abstractFactory.Armchair

class SportArmchair : Armchair {
    override fun hasLegs(): Boolean {
        println("SportArmchairt - hasLegs - true")
        return true
    }

    override fun sitOn() {
        println("SportArmchairt - sitOn")
    }
}