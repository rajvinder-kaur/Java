import java.util.Scanner;
class Distance{
    int feet, inches;
    void getDistance(int feet, int inches){
        this.feet=feet;
        this.inches = inches;
    }
    void showDistance(){
        System.out.println("The distance is " + feet + " feet and " + inches + " inches");
    }
}
public class Practical_7 {
    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the distance in feet");
        int x = input.nextInt();
        System.out.println("enter the distance in inches");
        int y = input.nextInt();
        Distance d = new Distance();
        d.getDistance(x,y);
        input.close();
        d.showDistance();
    }
}


