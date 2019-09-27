import java.util.Scanner;

public class Find_Max_Array {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        while (size > 20){
            System.out.println("Size should not exceed 20");
            size++;
        }
        array = new int [size];
        int i = 0;
        while (i < size){
            System.out.print("Enter Element " + (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0 ; j < array.length ; j++){
            System.out.println(array[j] + "\t");
        }
        int max = 0;
        int index = 0;
        for (int j = 0 ; j < array.length ; j++){
            if (array[j] > max){
                max = array[j];
                index = j;
            }
        }
        System.out.println("The largest property value in the list is: \n"  + max + " at position \t" + index);
    }
}
