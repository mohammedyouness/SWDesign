package solid.ocp;
// The App class here is considered as the client who uses the Employee class

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.id = "1";
        manager.name = "Mohamed";
        manager.basicSalary = 15000;
        System.out.println(manager.statement());
        System.out.println(manager.calcHoursBonus(5));

        Regular regular = new Regular();
        regular.id = "2";
        regular.name = "Ali";
        regular.basicSalary = 15000;
        System.out.println(regular.statement());
        System.out.println(regular.calcHoursBonus(5));





/*
        Employee employeeOne = new Employee();
        employeeOne.setName("Brad Travis");
        employeeOne.setId("1");
        employeeOne.setBasicSalary(15000);
        employeeOne.setEmployeeType("Regular");
        System.out.println(employeeOne.statement());
        System.out.println(employeeOne.calcHoursBonus(5, employeeOne.getEmployeeType()));
        Employee employeeTwo = new Employee();
        employeeTwo.setName("John Doe");
        employeeTwo.setId("2");
        employeeTwo.setBasicSalary(15000);
        employeeOne.setEmployeeType("Manager");
        System.out.println(employeeTwo.statement());
        System.out.println(employeeTwo.calcHoursBonus(5, employeeOne.getEmployeeType()));
*/

    }
}
