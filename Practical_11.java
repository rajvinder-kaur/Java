public class Practical_11 {
    static void display(String... values) {
        System.out.println("--------------display method invoked--------------");
        for (String s : values) {
            // loop iterates the array named values
            // and iterator s.
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        display();// zero argument 
        display("hello");//one argument
        display("my", "name", "is", "ace");// four arguments
    }
}



