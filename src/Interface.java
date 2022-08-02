
interface Portable
{
    void carry();  //  * In interface we can declare function without using abstract keyword.
//*  in interface we only declare method .
}
abstract class A{
    public  abstract void cod();
    void print()
    {
        System.out.print("Hello");      //In abstract block we can declare as well as define.
    }

}
class B extends A implements  Portable{
    public void cod()
    {
        System.out.println("I am in com");
    }
    public void carry(){
       System.out.println("I am in carry");
    }
}
class emp
{
    void get(A obj)
    {
        obj.cod();
    }
}
public class Interface {
    public static void main(String[] args)
    {
        A e=new B();
        emp e1=new emp();
        e1.get(e);
    }
}