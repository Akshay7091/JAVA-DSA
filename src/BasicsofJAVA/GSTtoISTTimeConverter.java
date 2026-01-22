package BasicsofJAVA;

import java.util.Scanner;

public class GSTtoISTTimeConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt(),hour= sc.nextInt(),minutes= sc.nextInt();
        hour+=5;minutes+=30;
        if(hour>=24){
            day++;
            hour-=24;
        }
        if(minutes>=60){
            hour++;
            minutes-=60;
        }
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minutes);
    }
}
