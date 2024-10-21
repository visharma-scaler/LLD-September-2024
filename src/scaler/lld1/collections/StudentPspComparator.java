package scaler.lld1.collections;

import java.util.Comparator;

public class StudentPspComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getPsp() > o2.getPsp()) {
            return -1;
        }

        if (o1.getPsp() < o2.getPsp()) {
            return 1;
        }

        return 0;
    }

}
