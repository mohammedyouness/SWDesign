package solid.ocp;

public class Regular extends Employee{
    @Override
    public float calcHoursBonus(float hours) {
        return ((basicSalary/30) / 8) * hours;
    }
}
