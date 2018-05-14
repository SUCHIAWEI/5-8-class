import java.util.Random;

public class test {
    public static void main(String[] args) {
         Random ran = new Random();

        int number[] = new int[6];
        int a= 0;
        for (int i=0; i<6 ;i++){
            a=ran.nextInt(49) +1;
            int j= 0;
            while (j<i){
                if (number[j]==a){
                    a=ran.nextInt(49) +1;
                    j=0;
                }
                else {
                    j++;
                }
            }
            number[i]=a;
            System.out.println(number[i]);}

}}
