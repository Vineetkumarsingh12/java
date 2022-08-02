public class array {
    public static void main(String args[]){
        int  [][]arr=new int [4][];
        arr[0]=new int[5];
        arr[1]=new int [4];  // this creating jacked array.
        int ar[][]={{3,8,5},{7,6,3,2},{1,2}};
        for(int i=0;i<ar.length;i++)
            for(int j=0;j<ar[i].length;j++)  // length is property of the System.
                System.out.println(ar[i][j]);
    }
}
