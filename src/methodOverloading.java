public class methodOverloading {
    public static void main(String[] args)
    {
       Alien1 obj = new Alien1();
       System.out.println(obj.name);
       System.out.println(obj.age);
    }
}
class Alien1
{
    String name;
    int  age;
    Alien1()
    {
        name="vineet";
        age=18;
    }
    Alien1(String nme,int  ag)
    {
       name=nme;
       age=ag;
    }
}