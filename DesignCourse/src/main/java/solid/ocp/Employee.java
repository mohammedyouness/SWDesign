package solid.ocp;

public abstract class Employee {
    protected String id;
    protected String name;
    protected float basicSalary;

    public abstract float calcHoursBonus(float hours);
    public String statement() {
        return "Employee Id:" + this.id + ", Name: " + this.name;
    }


}
