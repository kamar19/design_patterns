package abstractFactory.sport

import abstractFactory.Armchair

class SportArmchair : Armchair {
    override fun hasLegs() {
        println("SportArmchairt - hasLegs")
    }

    override fun sitOn() {
        println("SportArmchairt - sitOn")
    }
}