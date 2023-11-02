class Song(    //title, artist, year published, and play count
    val title:String,
    val artist:String,
    val yearPublished:Int,
    val playCount:Int,

){
    val isPopular:Boolean = playCount >= 1000
    fun songDescription(){
        println("${this.title}, performed by ${this.artist}, was released in ${this.yearPublished}.")
        println("Is Popular: ${this.isPopular}")
    }

}

fun main() {
    val badGuy:Song=Song("Bad Guy","Billie Eilish",2019,10000)
    badGuy.songDescription()
}
