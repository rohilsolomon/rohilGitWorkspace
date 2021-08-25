package tester;

import java.util.Scanner;

import pojos.Apple;
import pojos.Fruits;
import pojos.Mango;
import pojos.Orange;

public class TestFruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter capacity of Fruit basket...");
		Fruits[] f = new Fruits[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			System.out.println("--Add Fruits to your basket-- \n1.Apple \n2.Mango \n3.Orange \n4.Display all basket Contents \n0.EXIT");
			switch(sc.nextInt())
			{
			case 1: //adding apple to basket
				if(counter < f.length) {
					f[counter++] = new Apple("Apple");
					System.out.println("Apple added to basket");
				}else {
					System.out.println("ERROR!!! Basket full");
				}
				break;
				
			case 2: //adding mango to basket
				if(counter < f.length) {
					f[counter++] = new Mango("Mango");
					System.out.println("Mango added to basket");
				}else {
					System.out.println("ERROR!!! Basket full");
				}
				break;
				
			case 3: //adding orange to basket
				if(counter < f.length) {
					f[counter++] = new Orange("Orange");
					System.out.println("Orange added to basket");
				}else {
					System.out.println("ERROR!!! Basket full");
				}
				break;
			case 4: //displaying all basket contents
				System.out.println("---Basket Contents---\n");
				for(Fruits f1 : f) {
					if(f1 != null) {
						System.out.println(f1);
					}
				}
				break;
				
			case 0: exit = true;
			System.out.println("EXITED");
			break;
			}
		}
		sc.close();
	}

}
