package dz_2

class Main

fun main() {
    val father = Father("Dima", 50, "Man", "Cook", true)
    val mother = Mother("Rita", 45, "Woman", "fly into space", 3)
    val son = Son("Poll", 20, "Man", "Driver", false)
    val daughter = Daughter("Kate", 22, "Woman", "Family", 5)
    
    father.say()
    mother.say()
    son.say()
    daughter.say()

    val catalog = ArrayList<Human>()
    catalog.add(father)
    catalog.add(mother)
    catalog.add(son)
    catalog.add(daughter)
    catalog.sortBy{
      it.age
    }
    catalog.reverse()
        catalog.forEach {
            print(it.name + " - " + it.age + ", ")
        }
}
