public class encapulation {
    public static void main(String[]args)
    {
        Alien2 obj=new Alien2();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
class Alien2
{
    private String name;
    private int age;
    private int salary;
    Alien2()
    {
        name="vineet";
        age=18;
        salary=5000;
    }
     public String getName()
    {
        return name;
    }
    public int  getAge()
    {
        return age;
    }
    public int getSalary()
    {
        return salary;
    }

}
