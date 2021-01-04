public class PartTimeEmployee extends Employee {
    private int timeWork;

    @Override
    public int getSalary() {
        return timeWork*100;
    }

    public int getTimeWork() {
        return timeWork;
    }


    public PartTimeEmployee(String fullName, int timeWork) {
        super(fullName);
        this.timeWork = timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    public PartTimeEmployee(String fullName) {
        super(fullName);
    }
}