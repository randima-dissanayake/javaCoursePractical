import java.util.Scanner;

public class Frog{
    public int timeToDistance(int n){
        int count=n/9;
        int time =count * 8;
        if(n%9 ==0){
            time -=5;
        } else if(n%9 <= 5 ){
            time += 0;
        } else if(n%9 <= 8 ){
            time += 1;
        } else if(n%9 <= 9) {
            time += 2;
        }
        return time;
    }

    public int distanceToTime(int n){
        int count = n/8;
        int d = count * 9;
        if(n%8 ==0){
            d +=5;
        } else if(n%8 < 1 ){
            d += 5;
        } else if(n%8 < 3 ){
            d += 8;
        } else if(n%8 < 8) {
            d += 9;
        }
        return d;

    }

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to get Time enter 'd' or If you want to get Distance enter 't':");
        char type =scanner.next(). charAt(0);
		Frog a = new Frog();
        if(type =='d'){
            System.out.println("Enter your distance in meters:");
            while (!scanner.hasNextInt()) {
			      System.out.println("Input is not a number.");
			      scanner.next();
    		}
            System.out.println("Frog will get "+a.timeToDistance(scanner.nextInt())+"s to reach its destination.");
        } else if(type =='t'){
            System.out.println("Enter your time in seconds:");
            while (!scanner.hasNextInt()) {
			      System.out.println("Input is not a number.");
			      scanner.next();
    		}
            System.out.println("Frog will go "+a.distanceToTime(scanner.nextInt())+"m within that time.");
        } else {
			System.out.println("Invalid Input!");
		}

     }
}