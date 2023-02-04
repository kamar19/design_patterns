package builder

interface BuilderHome {

    fun furnishGym(numberMans:Int):BuilderHome
    fun furnishKitchen(numberMans:Int):BuilderHome
    fun furnishWorkOffice(numberMans:Int):BuilderHome
    fun furnishLivingRoom(numberInputs:Int):BuilderHome

}