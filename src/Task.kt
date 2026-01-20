enum class Priority{
    low, medium, high
}
data class Task(
    var title: String,
    var description : String,
    var priority : Priority,
    var  isCompleted : Boolean = false,

){}
