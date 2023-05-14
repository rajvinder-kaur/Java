class Dist {
    int feet, inch;

    Dist(int f, int i) {
        feet = f;
        inch = i;
        System.out.println("Parameterized constructor called");
    }

    void Display() {
        System.out.println("Feet: " + feet + " Inch: " + inch);
    }

    Dist(Dist clone) {
        feet = clone.feet;
        inch = clone.feet;
        System.out.println("Copy constructor called");
    }
}

public class Practical_8 {
    public static void main(String args[]) {
        Dist a = new Dist(2, 5);
        a.Display();
        System.out.println("*************************");
        Dist b = new Dist(a);
        b.Display();
    }
}




