public class calculator {
    public static void main(String[]args)
    {
        int num1=4,num2=3;
//        int result=calAdd.add(num1,num2);  // Does not need to object to class because static function.
//        System.out.println(result);
        calDiv p=new calDiv();

        System.out.println(p.add(num1,num2));
        System.out.println(p.mul(num1,num2));
        System.out.println(p.div(num1,num2));
    }
//    public static int add(int n1,int n2)
//    {                                           // this not need to object to call.
//        return n1+n2;
//    }
}
class calAdd{
//    public static int add(int n1,int n2)
//    {
//        return n1+n2;
//    }

    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class calMul extends calAdd
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
}
class calDiv extends calMul
{
    public float div(int n1,int n2)
    {
        return n1/n2;
    }
}