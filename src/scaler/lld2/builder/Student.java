package scaler.lld2.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String email;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.getId();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.name = builder.getName();
        // ...
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", universityName='" + universityName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    public static class Builder {
        private int id;
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String email;
        private String phoneNumber;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Student build() {        // Validations
            if (this.getAge() < 25) {
                throw new RuntimeException("Validation Failed!");
            }
            return new Student(this);
        }
    }
}
