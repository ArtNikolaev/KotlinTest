package dz_2

open class Mother(name: String, age: Int, sex: String) : Woman(name, age, sex) {
    var numberOfWorkingDays: Int? = null

    constructor(name: String, age: Int, sex: String, desire: String) : this(name, age, sex) {
        this.desire = desire
    }

    constructor(name: String, age: Int, sex: String, desire: String, numberOfWorkingDays:Int) : this(name, age, sex, desire) {
        this.numberOfWorkingDays = numberOfWorkingDays
    }

    override fun say() {
        println("My name is $name. I am $age years old. My desire is $desire. I work $numberOfWorkingDays days a week")
        super.say()
    }
}
