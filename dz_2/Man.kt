package dz_2

open class Man(override var name: String, override var age: Int, override var sex: String) : Human {

    var occupation : String? = null

    override fun say() {
    }

    override fun eat() {
    }

    override fun work() {
    }
}
