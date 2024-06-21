package src.main.java;

class Teacher extends person {
    private String department;

    public Teacher(String name, int age) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
