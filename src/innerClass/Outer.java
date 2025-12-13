package innerClass;
public class Outer {
    int age;
    public void show(){
        System.out.println("in outer class");
    }

    public class Inner {
        int price;
        public void drive(){
            System.out.println("inside inner class ");
        }
    }

}
