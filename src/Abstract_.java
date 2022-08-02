//TODO:abstraction
abstract class Computer{
    public abstract void code();
    public abstract void playVideo();
    public void compute()
    {
        System.out.println("computing");
    }
}
class Laptop extends Computer{
    public void code() {
        System.out.println("writing code on laptop");
    }
    public void playVideo()
    {
        System.out.println("playing video");
    }
    void cop()
    {
        System.out.println("cop");
    }
}
class Mobile extends Computer
{
    public void code() {
        System.out.println("writing code on mobile");
    }
    public void playVideo()
    {
        System.out.println("playing mobile video");
    }
    void mobile()
    {
        System.out.println("I am in mobile block");
    }
}
public class Abstract_
{
    public static void main(String[] agrs)
    {

        Computer com=new Laptop();
        employee emp=new employee();
        emp.build(com);
        Mobile mob=new Mobile();
        emp.build(mob);
    }
}
class employee
{
    public void build(Computer obj)
    {obj.code();
obj.compute();
//obj.cop();  // TODO: these give error because this is not define in abstract class.
//obj.mobile();
    }
}


