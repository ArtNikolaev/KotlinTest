package dz

class Human {
    var name: String? = null

    class Student {
        var studentId: Int? = null

        fun sayId() {
            println("My id is $studentId")
        }
    }
        inner class Teacher {
            var homeWorkId:Int? = null

            fun sayHello(){
                println("My name is $name")
            }
            fun giveHomeWork(){
                println("Homework ID is ${homeWorkId ?:14}")
            }
        }
    }
