package Lesson_3;

public class EmployeeArray {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employeeArray = new Employee[5];

        // Заполняем массив объектами
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Manager", "ppetrov@mailbox.com", "891234567", 40000, 45);
        employeeArray[2] = new Employee("Sidorov Sidr", "Developer", "ssidr@mailbox.com", "890987654", 50000, 35);
        employeeArray[3] = new Employee("Smirnov Smir", "Designer", "ssmir@mailbox.com", "896543210", 35000, 50);
        employeeArray[4] = new Employee("Fedorov Fedor", "QA Engineer", "ffedor@mailbox.com", "899876543", 45000, 42);

        // Выводим информацию о сотрудниках старше 40 лет
        System.out.println("Employees older than 40:");
        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                employee.displayInfo();
            }
        }
    }
}
