import java.util.Scanner;

public class Main {
    private static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
    printArray(sortedInteger(getNumbers(5)));
    }
    public static int[] getNumbers(int Number){
        System.out.println("Enter Numbers");
        int[] list= new int[Number];
        for(int i=0; i<list.length;i++){
            list[i]= scan.nextInt();
        }
        return list;
    }
     public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
     }

     public static int[] sortedInteger(int[] array){
        int[]sorted=new int[array.length];
         for(int i=0; i<array.length; i++)  {
             sorted[i]=array[i];
         }
         boolean flag=true;
         int temp;
        while (flag){
            flag=false;
            for(int i=0; i<sorted.length-1; i++){
                if(sorted[i]< sorted[i+1]){
                    temp= sorted[i];
                    sorted[i]= sorted[i+1];
                    sorted[i+1]=temp;
                    flag= true;
                }
            }
        }
        return sorted;
     }

}
