package scaler.lld2.prototyperegistry;

public class IntelligentStudent extends Student {
    private int iq;
    private double averageIqOfBatch;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
        this.averageIqOfBatch = other.averageIqOfBatch;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public double getAverageIqOfBatch() {
        return averageIqOfBatch;
    }

    public void setAverageIqOfBatch(double averageIqOfBatch) {
        this.averageIqOfBatch = averageIqOfBatch;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", averageIqOfBatch=" + averageIqOfBatch +
                '}';
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
