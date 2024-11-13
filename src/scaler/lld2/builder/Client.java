package scaler.lld2.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setId(1);
//        builder.setName("Vishal");
//        builder.setAge(27);
//
//        Student student = builder.build();
//        System.out.println("Student is - " + student);


        Student student = Student.getBuilder()
                .setId(1)
                .setName("Vishal")
                .setAge(27)
                .build();

        System.out.println("Student is - " + student);
    }
}

