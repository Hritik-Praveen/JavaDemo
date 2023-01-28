import java.util.Scanner;
public class A2Q2 {

	public static void main(String[] args) {
    
    double km, meters, feet, inch, centimetres;
	System.out.println("Enter the distance in km= ");	
	Scanner sc=new Scanner(System.in);	
	km = sc.nextInt();
	
	
	meters = km*1000;
	feet = km*3280.8399;
	inch = km*39370.0787;
	centimetres = km*100000;
	System.out.println(km+"km is " + meters+" meters");	
	System.out.println(km+"km is " + feet+" feet");	
	System.out.println(km+"km is " + inch+" inch");	
	System.out.println(km+"km is " + centimetres+" centimetres ");	
	}

}

https://github.com/Hritik-Praveen/JavaDemo.git
