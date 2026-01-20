class Employee (){
    val fullName: String = "Max"
        get() = field
    val position: String = "Manager"
        get() = field
    var salary: Int = 0
        get() = field
        set(sl){
            if(sl < 0){
                println("Salary не может быть отрицательной!")
                field = 0
            }
            else{
                field = sl
            }
        }
    var yearsOfExperience: Int = 0
        get() = field
        set(yearsOfExperience){
            field = yearsOfExperience.coerceIn(0,50)
        }
}
fun main(){
    var worker = Employee()
    worker.fullName
    worker.position
    worker.salary = -10
    worker.yearsOfExperience = 51
    println(worker.fullName)
    println(worker.position)
    println(worker.salary)
    println(worker.yearsOfExperience)
}