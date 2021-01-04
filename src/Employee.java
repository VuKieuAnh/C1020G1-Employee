public abstract class Employee implements Comparable {
    private String fullName;
    private String code;
    private String phone;
    private String email;
    private int age;

    public abstract int getSalary();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return fullName;
    }

    public Employee(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int compareTo(Object o) {
        Employee a = (Employee) o;
        return (this.getSalary() > a.getSalary()? 1: (this.getSalary() <a.getSalary())?-1:0);
    }
}