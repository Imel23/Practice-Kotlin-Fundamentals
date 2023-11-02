open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(
    var isFolded: Boolean
): Phone(){
    override fun switchOn(){
        isScreenLightOn = isFolded==false
    }
    fun foldPhone(){
        this.isFolded = true
    }
    fun unfoldPhone(){
        this.isFolded = false
    }
}

fun main() {
    var foldablePhone=FoldablePhone(isFolded = false)
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfoldPhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.foldPhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

}
