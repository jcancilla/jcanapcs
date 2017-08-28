
/**
 * @author jcancilla
 *
 */

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		name = sc.next();
		System.out.println("Hello " + name + "!");
		sc.close();
	}
}
