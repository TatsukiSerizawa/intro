fun main(args: Array<String>){

    /* SchoolIdolのインスタンスとしてkotoriオブジェクト作成(クラスはSchoolIdolという概念，インスタンスはSchoolIdol個人個人) */
    var kotori = SchoolIdol("kotori", SchoolIdol.Profile("パンケーキ", 83, 60, 85))
    
    kotori.sing() //クラス内sing関数実行
    kotori.dance() //クラス内dance関数実行
    println(kotori.profile.favorite) //クラス内Profileクラスのfavoriteを出力

    /* インスタンスとしてrinオブジェクト作成 */
    var rin = SchoolIdol("rin", "Otonokizaka High.", SchoolIdol.Profile("アメ", 78, 59, 80))
}

/* SchoolIdolクラス */
class SchoolIdol(name: String, profile: Profile){
    var name: String
    var school: String
    var profile: Profile

    /* クラスの初期化を行うプライマリコンストラクタ */
    init{
        this.name = name
        this.school = ""
        this.profile = profile
    }

    /* クラスの初期化を行うセカンダリコンストラクタ(initに当てはまらなければこっち) */
    constructor(name: String, school: String, profile:Profile) : this(name, profile){
        this.school = school
    }

    fun sing(){
        println("${this.name} singing!! Hoo!!")
    }

    fun dance(){
        println("${this.name} dancing!! Yahoo!!")
    }

    class Profile(favorite: String, b: Int, w: Int, h: Int){
        var favorite: String = favorite
        var threeSize: Array<Int> = arrayOf(b, w, h)
    }
}