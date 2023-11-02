fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: ${this.name}")
        println("Age: ${this.age}")
        if(this.hobby!=null){
            print("Likes to ${this.hobby}. ")
        }else{
            print("Doesn't have a hobby. ")
        }
        if(this.referrer != null){
            print("Has a referrer named ${this.referrer.name}, who ")
            if(this.referrer.hobby!=null){
                println("likes to ${this.referrer.hobby}.")
            }else{
                println("doesn't have a hobby.\n")
            }
        }else{
            println("Doesn't have a referrer.\n")
        }
    }
}