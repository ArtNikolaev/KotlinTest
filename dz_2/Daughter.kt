package dz_2

class Daughter(name: String, age: Int, sex: String, desire: String, numberOfWorkingDays: Int) : Mother(name, age, sex, desire, numberOfWorkingDays) {
    override fun suy() {
        println("My name is $name . I am $age years old. My desire is $desire. I work $numberOfWorkingDays days a week")

    }
}