package Pertemuan2

fun main () {
    val namaDepan: String = "Mutiara"
    val namaBelakang = "Shinta"
    val usia = "18" // val gabisa diubah, kalo var bisa diubah

    //Nullable Type
    val text: String? = "Mutiara"
    var textLength = text?.length
    println(textLength)
    //null itu kosong, beda sama nol

    //Char
    //++ buat nambahin value, -- buat ngurangin value
    var vocal = 'A'
    println("vocal = $vocal")

    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["Jakarta"])

    val anyList = mutableListOf('A', "Kotlin", 3, true, User())

    anyList.add('D')
    anyList.add(0,12)
    anyList[4]=false
    anyList.removeAt(5)

    println("MutableList = $anyList")


    println("Halo nama saya $namaDepan $namaBelakang, usia saya $usia") // $ merupakan String template (fitur kotlin)
}

fun User(){

}