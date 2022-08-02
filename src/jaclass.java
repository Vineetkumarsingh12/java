public class jaclass {
    public static void main(String[] args)  // String is capitial because String is class in java.
    {  Alien obj=new Alien();    //obj is reference to alien class.
        System.out.println(obj.name);// alien object is created in heap and obj reference is created in stack that
        //refer to obj
//        obj.code();
        new Alien().code();       //  anonymous objects.
    }
}
class Alien
{String name;  // these are instance variable.
   short age=18;
   public Alien()   // constructor will be called whenever is object create
   {
       name="vikas";
       age=15;
   }
   void code()
   {
       System.out.print("I am coming ");
   }
        }
