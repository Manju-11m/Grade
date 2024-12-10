import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        byte sub1,sub2,sub3;
        byte sub4;
        byte sub5;
        byte sub6;
        float sum;
        float avg;
        float temp;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the marks of subject 1:");
        sub1=sc.nextByte();
       
        System.out.println("Enter the marks of subject 2:");
        sub2=sc.nextByte();
      
        System.out.println("Enter the marks of subject 3:");
        sub3=sc.nextByte();

        System.out.println("Enter the marks of subject 4:");
        sub4=sc.nextByte();

        System.out.println("Enter the marks of subject 5:");
        sub5=sc.nextByte();

        System.out.println("Enter the marks of subject 6:");
        sub6=sc.nextByte();
       
        sum =sub1+sub2+sub3+sub4+sub5+sub6;
        temp=sum*100;
        avg=temp/600;
        System.out.println("\nTotal marks obtained:"+sum);
        System.out.println("\nThe percentage is:"+avg);
        if(avg>=91&& avg<=100){
                System.out.println("\nGrade: A+");
        }
        if(avg>=81 && avg<=90){
            System.out.println("\nGrade: A");
        }
        if(avg>=71 && avg<=80){
            System.out.println("\nGrade: B+");
        }
        if(avg>=61 && avg<=70){
            System.out.println("\nGrade: B");
        }
        if(avg>=51 && avg<=60){
            System.out.println("\nGrade: C+");
        }
        if(avg>=41 && avg<=50){
            System.out.println("\nGrade: C");
        }
        if(avg>=33 && avg<=40){
            System.out.println("\nGrade: D");
        }
        if(avg>=0 && avg<=32){
            System.out.println("\nGrade: E");
        }
        
        
    }
    
}
