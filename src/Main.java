import RuntimePolymorphism.*;
import innerClass.*;
import interfaceConcept.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


//this is 2 topic covered
//class Human{
//    private int age;
//    private String name;
//
//    public Human(){
//        System.out.println("In constructor---"); //default constructor
//    }
//
//    public Human(int age, String name){     //parameterised constructor
//        System.out.println("Para constructor---");
//        this.age=age;
//        this.name=name;
//    }
//}

public class Main {
    public static void main(String[] args) {
         System.out.println("Starting line!!!!");
//          add(5,5);
//        Human h1=new Human();
//        Human h2=new Human(10,"Vivek");

//        new B();  anonymous way to creating object that can be used once not evertime
//        B b1=new B(1,2);
//        b1.showing();



        //object behaviour on runtime
//        Laptop l1=new Laptop();
//        Computer c1=new Laptop();  //To achieve runtime polymorphism (dynamic method dispatch),Even though the reference type is Computer, the actual object is Laptop, so Laptop version of show() runs.
//        c1.show();


        //final keyword - when used before variable then that can not be modified
        //when used before class then that class can't be inherited by another class( stops intermittence)
        //when used before methods() then that method can't over-ridden in another class.

    //wrapper class
//        int a=1; Integer integer=4;
//        integer=a;  //auto-boxing -> primitive to object direct
//        a= integer.intValue(); //auto unboxing -> object to primitive

        //Abstract keyword
         //when we have abstract method declare that must comes under abstract clas, but vice versa is not true
        //And we can not create object for abstract class, we need to create obj of child class and there only implement parent abstract method


    //Inner class
//        Outer oj=new Outer();
//        oj.show();
//        Outer.Inner oj1=oj.new Inner(); // if inner clas is static then new Outer.Inner() used to access , but outer class can never be static.
//        oj1.drive();


        //Interface - interface to interface(extends like class to clas) and interface to class(implements)

        //Animal animal=new Animal();   //not possible we can't create interface object
//        Animal animal=new Animal()
//        {
//            public void barking() {
//                ;
//            }
//
//            @Override
//            public void shouting() {
//
//            }
       // };                                 //we can do this annonymous inner class way.

//        Animal d= new Cat();


//        Animal d= new Animal() {     // Functional interface
//            public void speak() {
//                System.out.println("speak in Animal ");
//            }
//        };

        // Lambda exp =
//        Animal d= () -> System.out.println("speak in Animal using lambda ");
////        Animal d= (i) -> System.out.println("speak in Animal using lambda "+ i);          //lambda with param
////        Animal d= (i+j) -> j+ i);           //lambda with return and when exp are there after arrow automatically becomes return type.
//        d.speak();

      //Taking input and try catch/ finally block concept
//        Scanner sc=new Scanner(System.in);        //updated way of taking input in Java.
//        int val = sc.nextInt();

//        InputStreamReader in=new InputStreamReader(System.in);   //Older way of taking i/p
//        BufferedReader br=new BufferedReader(in);
//
//        try {
//            int i = br.read() - 48 / 0;
//        }
//        catch (Exception e){
//            System.out.println("not found" + e);
//        }
//        finally {
//            br.close();
//            System.out.println("Irrespective of exception Fianlly block will execute ");
//        }

        //try with resource as per new Java update, this automatically close files like br
//        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
//            int i = br.read() - 48 / 1;
//        }
//        catch (Exception e){
//            System.out.println("handled exception here " + e);
//        }
//        finally {
//            System.out.println("Irrespective of exception Fianlly block will execute ");
//        }



        //Collection Framework and comparator concept - Comparator is to sort things on own logic .


        List<Integer> arr=new ArrayList<>();
        arr.add(35);
        arr.add(26);
        arr.add(54);
        arr.add(49);
        arr.add(10);
        System.out.println(arr);
//        Collections.sort(arr);
//        System.out.println(arr);    // inbuild sort in Collections class.

        //now with comparator interface
        Collections.sort(arr, comp);
        System.out.println(arr);

        System.out.println("Finished ----------");


    }
//    static Comparator<Integer> comp= new Comparator<Integer>() {
//        public int compare(Integer m1, Integer m2) {
//            return m1 % 10 > m2 % 10 ? 1 : -1;
//        }
//    };

    //using Lambda expression - here only one return that why no need to specify return keyword and also type of parameter m1/m2
    static Comparator<Integer> comp= ( m1, m2) -> m1 % 10 < m2 % 10 ? 1 : -1;


//this is 1 topic covered
//      public static void add(int a, int b){
//          System.out.println("adding "+ (a+b));
//      }

}
