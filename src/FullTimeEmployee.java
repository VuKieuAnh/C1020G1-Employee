public class FullTimeEmployee extends Employee {
    private int bonus;
    private int fine;
    private int fixSalary;


    @Override
    public int getSalary() {
        return (fixSalary + bonus - fine);
    }

    public FullTimeEmployee(String name) {
        super(name);
    }

    public FullTimeEmployee(String fullName, int bonus, int fine, int fixSalary) {
        super(fullName);
        this.bonus = bonus;
        this.fine = fine;
        this.fixSalary = fixSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
    }
}