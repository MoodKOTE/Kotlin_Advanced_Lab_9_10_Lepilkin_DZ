abstract class Department {
    abstract var departmentName: String
    abstract fun  printDepartmentGoal()
}

class DevelopmentDepartment : Department(){
    override var departmentName: String = "Разработка"
    override fun printDepartmentGoal() {
        println("Пишет чистый код")
    }

}
class TestingDepartment : Department(){
    override var departmentName: String = "Тестирование"
    override fun printDepartmentGoal() {
        println("Находит все баги")
    }
}
fun main() {
    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()

    println("${devDepartment.departmentName}:")
    devDepartment.printDepartmentGoal()

    println("${testDepartment.departmentName}:")
    testDepartment.printDepartmentGoal()
}