package controller;



/**
 * @author chengjinging
 * @date 2020/8/24 上午11:46
 */
public class temp2 {
    boolean cc;

    public static void main(String[] args) {

        int [] arr=new int []{3,6,4,88,1,99};
        int temp;

//        for (int i=0 ; i<arr.length-1 ; i++){
//
//            for (int j=arr.length-1;j>i; j-- ){
//                if(arr[j]> arr[j-1]){
//                    temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                    System.out.println("ss");
//                }
//            }
//        }

//        int tem;
//        for (int i=0;i < arr.length;i++){
//            for (int j=0;j<arr.length-1-i;j++){
//                if (arr[j+1]<arr[j]){
//                    tem=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=tem;
//                }
//            }
//        }

        int t;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]< arr[j]){
                    t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }

        }

        byte aa= (byte) 129;
        int b=aa;
        byte cc= (byte) b;
        System.out.println("aa"+ aa);
        System.out.println("bb"+ b);
        System.out.println("cc"+ cc);




    }

    public void ge(){
        System.out.println("cc"+cc);


    }


}
