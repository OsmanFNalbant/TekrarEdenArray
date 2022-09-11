import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {10, 20, 20, 10, 10, 20, 5, 20,15,15,54,45,89,98,89,98};
        Arrays.sort(array);

        for(int i=0; i<array.length; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if(i==0 && array[i+1]==array[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", array[i], count));
            }
            if(i==0 && array[i+1]!=array[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", array[i], count));
            }
            if(i!=0 && array[i-1]!=array[i])
            {
                System.out.println(String.format("%d 'den %d tane var.", array[i], count));
            }
        }
        sc.close();
    }
}