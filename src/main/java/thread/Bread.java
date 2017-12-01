package thread;

public class Bread {

    private int size;

    private double id;

    public Bread(double id){

        this.id = id;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "id=" + id +
                '}';
    }
}
