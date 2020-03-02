import java.util.Scanner;

public class app {
	
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 22;
		
		float res;
		int rm;
		
		res = (float)var1 / var2;
		rm = var2 % var1;
		System.out.println(res);
		System.out.println(rm);
		
		System.out.println("Ovo je " + rm);
		calcVolume();
		
		
	}
	
	public static void calcVolume() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a radius for a circle: ");
		float rad = sc.nextFloat();
		float volume = (float)((4/3)*Math.pow(rad, 3)*Math.PI);
		System.out.println("Volume = "+ volume);
		
	}
}
