package src.main.java;

class Student extends person {
    private String course;
    private String group;

    public Student(String name, int age, String course, String group) {
        super(name, age);
        this.course = course;
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
}
