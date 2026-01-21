class Employee : ReportGenerator {
    val fullName: String = "Max"
        get() = field
    val position: String = "Manager"
        get() = field
    var salary: Int = 0
        get() = field
        set(sl) {
            if (sl < 0) {
                println("Salary не может быть отрицательной!")
                field = 0
            } else {
                field = sl
            }
        }
    var yearsOfExperience: Int = 0
        get() = field
        set(yearsOfExperience) {
            field = yearsOfExperience.coerceIn(0, 50)
        }

    var currentTask: Task? = null

    fun assignTask(newTask: Task) {
        if (currentTask != null && currentTask?.isCompleted == false) {
            println("Сотрудник уже занят задачей '${currentTask?.title}'")
        } else {
            currentTask = newTask
            println("Задача '${newTask.title}' назначена сотруднику $fullName")
        }
    }

    override fun generateReport(): String {
        return """
        ФИО: $fullName
        Должность: $position
        Зарплата: $salary
        Опыт работы: $yearsOfExperience лет
        """
    }
}
fun main(){
    var worker = Employee()
//    worker.fullName
//    worker.position
//    worker.salary = 10
//    worker.yearsOfExperience = 51
//    println(worker.fullName)
//    println(worker.position)
//    println(worker.salary)
//    println(worker.yearsOfExperience)
//    println(worker.generateReport())

    val devDepartment = DevelopmentDepartment()
    val task1 = Task(
        title = "Разработать новый модуль",
        description = "Создать модуль для обработки данных",
        priority = Priority.high,
        isCompleted = false
    )
    val task2 = Task(
        title = "Исправить баги в интерфейсе",
        description = "Исправить ошибки в пользовательском интерфейсе",
        priority = Priority.medium,
        isCompleted = false
    )
    println("1. Назначаем первую задачу:")
    worker.assignTask(task1)
    println()
    println("2. Пытаемся назначить вторую задачу (сотрудник занят):")
    worker.assignTask(task2)
    println()
    println("3. Завершаем текущую задачу...")
    task1.isCompleted = true
    println()
    println("4. Пытаемся назначить вторую задачу снова:")
    worker.assignTask(task2)
    println()
    println("=== Сводный отчет ===")
    println("Отдел:")
    println(devDepartment.generateReport())
    println()
    println("Сотрудник:")
    println(worker.generateReport())
}