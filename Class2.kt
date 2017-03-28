fun main(args: Array<String>){
    var kotori = SchoolIdol("kotori", "Otonokizaka High.", Idol.Profile("パンケーキ", 83, 60, 85))
    kotori.sing()
    kotori.dance()
    kotori.study()

    println(kotori.profile.favorite)
    println(kotori.school)
}

/* 継承元クラスにはopenをつける */
open class Idol(name: String, profile: Profile){
    var name: String = name
    var profile: Profile = profile

    fun sing(){
        println("${this.name} singing!!")
    }

    fun dance(){
        println("${this.name} dancing!!")
    }

    class Profile(favorite: String, b: Int, w:Int, h: Int){
        var favorite: String = favorite
        var threeSize: Array<Int> = arrayOf(b, w, h)
    }
}

/* Idolクラスを継承してSchoolIdolクラスを作成 */
class SchoolIdol(name: String, school: String, profile: Idol.Profile) : Idol(name, profile){
    var school: String = school

    fun study(){
        println("${this.name} studying...")
    }
}