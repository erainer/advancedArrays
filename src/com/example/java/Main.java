package com.example.java;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//stores the inventory as a string
		String[][] pizzaPlace = new String[2][5];
		//stores the inventory as an integer so you can update values
		Integer[][] newArr = new Integer[2][5];

		//initialize array
		pizzaPlace[0][0] = "Dough";
		pizzaPlace[1][0] = "10";
		pizzaPlace[0][1] = "Sauce";
		pizzaPlace[1][1] = "18";
		pizzaPlace[0][2] = "Cheese";
		pizzaPlace[1][2] = "25";
		pizzaPlace[0][3] = "Pepperoni";
		pizzaPlace[1][3] = "50";
		pizzaPlace[0][4] = "Beef";
		pizzaPlace[1][4] = "8";
		Scanner scanner = new Scanner(System.in);     //to get input from user
		int input = 0;
		do {
			//display the inventory and its updated values
			System.out.println("The inventory consists of:");    //ask the user for input
			System.out.println("1.Dough: " + pizzaPlace[1][0] + "\n2.Sauce: " + pizzaPlace[1][1] +
					"\n3.Cheese: " + pizzaPlace[1][2] + "\n4.Pepperoni: " + pizzaPlace[1][3] +
					"\n5.Beef: " + pizzaPlace[1][4] + "\n6.Exit");
			//get the users input
			System.out.println("Choose the item you need: ");
			input = scanner.nextInt();
			System.out.println("How many bags you need? ");
			int take = scanner.nextInt();
			System.out.println("How many bags are you putting back? ");
			int putBack = scanner.nextInt();
			//switch through the user input
			switch(input) {
				case 1:
					//convert pizza array into integer to change value
					//conitnue for each case
					newArr[1][0] = Integer.parseInt(pizzaPlace[1][0]);
					//check to see if you have enough in inventory for user to take
					//continue for each case
					if (take > newArr[1][0]) {
						System.out.println("You dont have that much in stock");
					} else {
						newArr[1][0] = newArr[1][0] - take;
						pizzaPlace[1][0] = newArr[1][0].toString();
					}
					//update the value the user wants to put back
					if(putBack < 0){
						System.out.println("You can't put back a negative number");
					} else{
						newArr[1][0] = newArr[1][0] + putBack;
						pizzaPlace[1][0] = newArr[1][0].toString();
					}
					break;
				case 2:
					newArr[1][1] = Integer.parseInt(pizzaPlace[1][1]);
					if (take > newArr[1][1]) {
						System.out.println("You dont have that much in stock");
					} else {
						newArr[1][1] = newArr[1][1] - take;
						pizzaPlace[1][1] = newArr[1][1].toString();
					}
					if(putBack < 0){
						System.out.println("You can't put back a negative number");
					} else{
						newArr[1][1] = newArr[1][1] + putBack;
						pizzaPlace[1][1] = newArr[1][1].toString();
					}
					break;
				case 3:
					newArr[1][2] = Integer.parseInt(pizzaPlace[1][2]);
					if (take > newArr[1][2]) {
						System.out.println("You dont have that much in stock");
					} else {
						newArr[1][2] = newArr[1][2] - take;
						pizzaPlace[1][2] = newArr[1][2].toString();
					}
					if(putBack < 0){
						System.out.println("You can't put back a negative number");
					} else{
						newArr[1][2] = newArr[1][2] + putBack;
						pizzaPlace[1][2] = newArr[1][2].toString();
					}
					break;
				case 4:
					newArr[1][3] = Integer.parseInt(pizzaPlace[1][3]);
					if (take > newArr[1][3]) {
						System.out.println("You dont have that much in stock");
					} else {
						newArr[1][3] = newArr[1][3] - take;
						pizzaPlace[1][3] = newArr[1][3].toString();
					}
					if(putBack < 0){
						System.out.println("You can't put back a negative number");
					} else{
						newArr[1][3] = newArr[1][3] + putBack;
						pizzaPlace[1][3] = newArr[1][3].toString();
					}
					break;
				case 5:
					newArr[1][4] = Integer.parseInt(pizzaPlace[1][4]);
					if (take > newArr[1][4]) {
						System.out.println("You dont have that much in stock");
					} else {
						newArr[1][4] = newArr[1][4] - take;
						pizzaPlace[1][4] = newArr[1][4].toString();
					}
					if(putBack < 0){
						System.out.println("You can't put back a negative number");
					} else{
						newArr[1][4] = newArr[1][4] + putBack;
						pizzaPlace[1][4] = newArr[1][4].toString();
					}
					break;
				case 6:
					//lets the user terminate the program
					System.exit(0);
					break;
				default:
			}
			//determines if the user wants to exit
		}while(input != 6);

	}

}
