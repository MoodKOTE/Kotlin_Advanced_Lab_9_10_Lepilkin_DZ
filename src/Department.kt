import DevelopmentDepartment.TestingDepartment

abstract class Department {
    abstract var departmentName: String
    abstract fun  printDepartmentGoal()
}

class DevelopmentDepartment : Department(), ReportGenerator {
    override var departmentName: String = "Разработка"
    override fun printDepartmentGoal() {
        println("Пишет чистый код")
    }

    override fun generateReport(): String {
        return """
        Отдел: $departmentName
        Цель: Разработка качественного программного обеспечения
        Основная задача: Писать чистый и эффективный код
        """

    }

    class TestingDepartment : Department() {
        override var departmentName: String = "Тестирование"
        override fun printDepartmentGoal() {
            println("Находит все баги")
        }

    }
}
fun main() {
    val devDepartment = DevelopmentDepartment()
    val employee = Employee()
    val testDepartment = TestingDepartment()
    val reportList: List<ReportGenerator> = listOf(employee, devDepartment)

    println("${devDepartment.departmentName}:")
    devDepartment.printDepartmentGoal()
    println(devDepartment.generateReport())

    println("${testDepartment.departmentName}:")
    testDepartment.printDepartmentGoal()

    println("Список содержит ${reportList.size} объекта(ов):\n")

    reportList.forEachIndexed { index, reportGenerator ->
        println("Элемент ${index + 1}:")
        println(reportGenerator.generateReport())
    }
}