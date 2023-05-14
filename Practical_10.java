class Distance {
    public int feet, inches;
    private int m, cm;
    public final int kilo = 100;

     Distance(int f, int i) {
        m = 100;
        cm = 50;
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("feet :" + feet);
        System.out.println("inches :" + inches);
        System.out.println("meters :" + m);
        System.out.println("cm :" + cm);

    }

    void addDistance(Distance d3) {
        d3.feet = d3.feet + kilo;
        d3.inches = d3.inches + kilo;
    }

}

public class Practical_10 {
    public static void main(String[] args) {
        Distance d1 = new Distance(10, 20);
        Distance d3 = new Distance(20, 30);
        d1.display();
        d1.addDistance(d3);
        d3.display();
    }
}
