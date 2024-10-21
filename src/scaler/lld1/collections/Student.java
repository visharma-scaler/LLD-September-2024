package scaler.lld1.collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private double psp;

    public Student(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                '}';
    }


    @Override
    public int compareTo(Student other) {

//        // other ... current
//
//        if (this.age > other.age) {
//            return 1;
//        }
//
//        // current ... other
//
//        if (this.age < other.age) {
//            return -1;
//        }
//
//        // stable comparision
//        return 0;

        return this.age - other.age;
    }
}
