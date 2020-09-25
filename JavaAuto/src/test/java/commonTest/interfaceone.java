package commonTest;


interface A{
    public void start();
    public void stop();

}
class B implements A{
    public void start(){
        System.out.println("111");
    }
    public void stop(){
        System.out.println("222");
    }
}
class C implements A {
    public void start(){
        System.out.println("333");
    }
    public void stop(){
        System.out.println("555");
    }
}




public class interfaceone {

    public static void  main(String[] args){
        B b = new B();
        C c = new C();
        b.start();
        b.stop();
        System.out.println(new B());
        
    }
}
