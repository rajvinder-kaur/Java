

class Practical_12 extends Thread{
    public void run(){
        System.out.println("inside run method");
    }
    public static void main(String[] args){
        Practical_12 t1 = new Practical_12(); 
        Practical_12 t2 = new Practical_12(); 
        Practical_12 t3 = new Practical_12(); 
        System.out.println("t1 priority:"+ t1.getPriority());
        System.out.println("t2 priority:" +t2.getPriority());
        System.out.println("t3 priority:" +t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println("t1 priority:"+ t1.getPriority());
        System.out.println("t2 priority:" +t2.getPriority());
        System.out.println("t3 priority:"+ t3.getPriority());
        System.out.println("current thread"+Thread.currentThread().getName());
        System.out.println("Main thread"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("main priority:"+Thread.currentThread().getPriority());
    }
}

