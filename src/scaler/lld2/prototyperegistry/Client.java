package scaler.lld2.prototyperegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);


        Student student = registry.get("nov24Batch").copy();
        student.setName("Vishal");
        student.setGender("Male");
        student.setAge(27);
        student.setStudentPsp(80);

        System.out.println(student);


        Student copiedStudent = student.copy();
        copiedStudent.setName("Bathula");
        copiedStudent.setAge(25);
        copiedStudent.setGender("Female");

        System.out.println(copiedStudent);


        Student nov24batchIntelligentStudent = registry.get("nov24batchIntelligentStudent").copy();
        nov24batchIntelligentStudent.setName("Upinta");
        nov24batchIntelligentStudent.setAge(22);

        System.out.println(nov24batchIntelligentStudent);

        Student otherCopy = nov24batchIntelligentStudent.copy();

        System.out.println(otherCopy);

    }

    private static void fillRegistry(StudentRegistry registry) {
        Student nov24batch = new Student();
        nov24batch.setAveragePspOfBatch(90);
        nov24batch.setBatch("Nov24");

        IntelligentStudent nov24batchIntelligentStudent = new IntelligentStudent();
        nov24batchIntelligentStudent.setAveragePspOfBatch(90);
        nov24batchIntelligentStudent.setBatch("Nov24");
        nov24batchIntelligentStudent.setAverageIqOfBatch(100);

        registry.register("nov24Batch", nov24batch);
        registry.register("nov24batchIntelligentStudent", nov24batchIntelligentStudent);
    }
}
