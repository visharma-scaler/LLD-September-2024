package scaler.lld2.prototyperegistry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String gender;
    private String batch;
    private double averagePspOfBatch;
    private double studentPsp;

    public Student() {

    }

    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.studentPsp = other.studentPsp;
        this.gender = other.gender;
        this.averagePspOfBatch = other.averagePspOfBatch;
        this.batch = other.batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAveragePspOfBatch(double averagePspOfBatch) {
        this.averagePspOfBatch = averagePspOfBatch;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", batch='" + batch + '\'' +
                ", averagePspOfBatch=" + averagePspOfBatch +
                ", studentPsp=" + studentPsp +
                '}';
    }
}
