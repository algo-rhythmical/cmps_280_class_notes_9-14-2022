public class Weird {
    private int a;

    Weird (int a) {

        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }
    }
}
