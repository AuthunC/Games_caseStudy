package com.game;

import java.util.List;
import java.util.Scanner;

public class DigitalComProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		GameService gs = new GameService();
		boolean isAuthenticated = false;
		
		boolean value = false;
		while(!value) {
			System.out.println("Main Menu - Choices:");
            System.out.println("1) RegisterUser");
            System.out.println("2) ViewGames");
            System.out.println("3) SearchByAuthor");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter your id: ");
				String userId = sc.nextLine();
				System.out.println("Enter Password: ");
				String pass = sc.next();
				u.addUser(userId, pass);
				break;
			}
			case 2: {
				List<Game> viewAll = gs.viewAll();
				viewAll.forEach(c->System.out.println(c));
				break;
			}
			case 3: {
				System.out.println("Enter author name: ");
				String a = sc.nextLine();
				String a1 = gs.authorSearch(a);
				System.out.println(a1);
				break;
			}
			case 4: {
				value = true;
                break;
			}
			default:
				throw new IllegalArgumentException("Invalid choice");
			}
		}
	}
}
