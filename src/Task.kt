enum class Priority{
    low, medium, high
}
data class Task(
    var title: String,
    var description : String,
    var priority : Priority,
    var  isCompleted : Boolean = false,

){}
fun main(){
    val task1 = Task("Carry papers", "Carry papers for Boss", Priority.high, true)
    val task2 = Task("Carry papers", "Carry papers for Boss", Priority.high, true)
    val task3 = Task("Make a cup of coffee", "Make a cup of for yourself", Priority.low,)
    println(task1)
    println("${task1 == task2}")
    println("${task2.hashCode()}")
    val task4 = task1.copy(priority = Priority.medium)
    println(task4)
}