package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Arrayss arr=new Arrayss();
        int []numbers={1,2,3,4,5,8,6,8};

//        int result=arr.LinearSearch(numbers,9);
//        if(result!=-1)
//           System.out.println("value found at index:"+result);
//       else
//           System.out.println("value not found ");

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,5)); //هذه الي استدعيناها جاهزة من java

        int result = arr.binarySearch(numbers, 5, 0, numbers.length - 1);
        if (result != -1)
            System.out.println("value found at index: " + result);
        else
            System.out.println("value not found");


        arr.shift_left_delete(numbers, 2);
        System.out.println(Arrays.toString(numbers));


//        int []numbers2=new int [10];
//        arr.input(numbers2);
//        arr.traverSal(numbers2);
//        arr.revers_traverSal(numbers2);
//        arr.update(numbers2,11,9);
//        arr.delete(numbers2,8);
//        // System.out.println(Arrays.toString(numbers));








    }

}

