public class A {

    public A(){
//        super();   //by default this is present if we add or not
        System.out.println("in default constructor A");
    }
    public A(int x,int y){
        System.out.println("in param constructor A");
    }

    public void show(){
        System.out.println("show method of class A");
    }

}
 class B extends A {

    public B(){
//        super();   //by default this is present if we add or not

        System.out.println("in default constructor B");
    }
    public B(int p,int q){
//        super(p,q);  // changed from calling default const of parent class to the once I want to call
//        this();        // when we want to default const for same class
        System.out.println("in param constructor B");
    }

    public void showing(){
        System.out.println("show method of class B");
    }

}


