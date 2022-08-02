public class static_variable {
    static{
        System.out.println("in static block in static_variable");  /*static is use when we want to run anything when class is loading*/
    }
    public static void main(String[]args)
    {
        Alien3 obj=new Alien3();
        Alien3 obj1=new Alien3();
        System.out.println(obj.name);
        System.out.println(obj1.name);

        System.out.println(obj.lang);
        System.out.println(obj1.lang);

        obj.lang="Java";   // if we change the value of static variable with help of any object then that value is apply for all.

        System.out.println(obj.lang);
        System.out.println(obj1.lang);


        Alien3.show();/* *****static method call without object that why we write -->public static void main(String[]
                                     args)<--- at starting. ********

*/
        System.out.println(obj.device);

    }
}

class Alien3                   // two type of class 1.static 2.non-static
{
    String name="vineet";
    int age=18;
    static String lang="c++";
    public static void show()
    {
        System.out.println("I am in show block");
    }
    static String device;
    static //
    {
       device="laptop";
       System.out.println("in static block in Alien3");     //class- first load,second initilized and third object create.
    }



}
