package dz_2

class Son(name: String, age: Int, sex: String, occupation: String, hasFamily: Boolean) : Father(name, age, sex, occupation, hasFamily) {
    override fun suy() {
        println("My name is $name . I am $age years old. My occupation is $occupation. I has $hasFamily family.")

    }
}