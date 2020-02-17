package dz_2

open class Father (name: String, age: Int, sex: String) : Man(name, age, sex) {
    var hasFamily: Boolean? = null

    constructor(name: String, age: Int, sex: String, occupation: String) : this(name, age, sex) {
        this.occupation = occupation
    }

    constructor(name: String, age: Int, sex: String, occupation: String, hasFamily: Boolean) : this(name, age, sex, occupation) {
        this.hasFamily = hasFamily
    }

    override fun suy() {
        println("My name is $name . I am $age years old. My occupation is $occupation. I has $hasFamily family.")
    }
}
