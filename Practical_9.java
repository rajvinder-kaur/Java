public class Practical_9 {
     void fun(int x){
        System.out.println("integer value : " + x);
     }
     void fun(float x){
        System.out.println("float value : " + x);
     }
     void fun(char x){
        System.out.println("double value : " + x);
     }
    public static void main(String args[]){
       int a =5;
       float b =  2.1f;
       long c = 1234;
       short d = 2;
       char e = 'a';
       byte f = 1;

       Practical_9 p = new Practical_9();
       p.fun(a);
       p.fun(b);
       p.fun(c);
       p.fun(d);
       p.fun(e);
       p.fun(f);
    }
}
