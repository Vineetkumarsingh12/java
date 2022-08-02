//final---> final keyword is use to make variable constant.
//final---> stop the inheritance.
// final---> stop overriding.
public class Final_overriding {
    public static void main(String[] args)
    {

     over1 a=new over1();
     a.getPrint();
//     a.finalVariable();
    }
}
  /*final*/ class  over {     // stop inheritance of class;
     final float pi=3.14f;

    /* final */ void  getPrint() {       // stop the override of function
         System.out.println("not overriding");

     }
 }
  class over1 extends over
  {
      void getPrint() {
          System.out.println("overrinding function");
      }

//      void finalVariable()
//      {                                        // const variable;
//          pi=9.8f;
//          System.out.println(pi);
//      }
  }

