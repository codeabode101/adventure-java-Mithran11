/import java.util.Scanner();
import java.util.*;
import java.util.Scanner;

public class CivilizationGame {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Day 1: Starting Your Village
        System.out.print("What is your civilization's name? ");
        String name = scanner.nextLine();
        
        int food = 10;
        int wood = 10;
        
        System.out.println("Welcome, " + name + "! You start with 10 food and 10 wood.");
        
        // Day 2: Making Basic Choices
        System.out.println("\nFood: " + food + ", Wood: " + wood);
        System.out.print("What do you want to do? (1) Gather Food or (2) Gather Wood: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            food += 5;
            System.out.println("You gathered 5 food.");
        } else if (choice == 2) {
            wood += 5;
            System.out.println("You gathered 5 wood.");
        } else {
            System.out.println("Invalid choice. Nothing happened.");
        }
        
        System.out.println("Food: " + food + ", Wood: " + wood);
        
        // Day 3: Building & Expanding
        int population = 5;
        System.out.println("\nFood: " + food + ", Wood: " + wood + ", Population: " + population);
        System.out.print("What next? (1) Gather Food, (2) Gather Wood, or (3) Build a Shelter: ");
        choice = scanner.nextInt();
        
        if (choice == 1) {
            food += 5;
            System.out.println("You gathered 5 food.");
        } else if (choice == 2) {
            wood += 5;
            System.out.println("You gathered 5 wood.");
        } else if (choice == 3) {
            if (wood >= 8) {
                wood -= 8;
                population += 1;
                System.out.println("A new shelter is built! Population grows by 1.");
            } else {
                System.out.println("Not enough wood to build a shelter.");
            }
        }
        
        System.out.println("Food: " + food + ", Wood: " + wood + ", Population: " + population);
        
        // Day 4: Daily Events
        System.out.println("\nFood: " + food + ", Wood: " + wood + ", Population: " + population);
        
        if (food < population) {
            System.out.println("Not enough food! Your people are hungry.");
        } else {
            System.out.println("Everyone is well-fed today.");
        }
        
        System.out.print("What next? (1) Gather Food, (2) Gather Wood, (3) Build a Shelter, or (4) Explore Nearby: ");
        choice = scanner.nextInt();
        
        if (choice == 1) {
            food += 5;
            System.out.println("You gathered 5 food.");
        } else if (choice == 2) {
            wood += 5;
            System.out.println("You gathered 5 wood.");
        } else if (choice == 3) {
            if (wood >= 8) {
                wood -= 8;
                population += 1;
                System.out.println("A new shelter is built! Population grows by 1.");
            } else {
                System.out.println("Not enough wood to build a shelter.");
            }
        } else if (choice == 4) {
            food += 2;
            wood += 2;
            System.out.println("You explored nearby and found resources! Gained 2 food and 2 wood.");
        }
        
        System.out.println("Food: " + food + ", Wood: " + wood + ", Population: " + population);
        
        // Day 5: Facing Challenges
        System.out.println("\nFood: " + food + ", Wood: " + wood + ", Population: " + population);
        
        if (food < population) {
            System.out.println("Not enough food! Your people are hungry.");
        } else {
            System.out.println("Everyone is well-fed today.");
        }
        
        System.out.print("What next? (1) Gather Food, (2) Gather Wood, (3) Build a Shelter, (4) Explore Nearby, or (5) Defend Village: ");
        choice = scanner.nextInt();
        
        if (choice == 1) {
            food += 5;
            System.out.println("You gathered 5 food.");
        } else if (choice == 2) {
            wood += 5;
            System.out.println("You gathered 5 wood.");
        } else if (choice == 3) {
            if (wood >= 8) {
                wood -= 8;
                population += 1;
                System.out.println("A new shelter is built! Population grows by 1.");
            } else {
                System.out.println("Not enough wood to build a shelter.");
            }
        } else if (choice == 4) {
            food += 2;
            wood += 2;
            System.out.println("You explored nearby and found resources! Gained 2 food and 2 wood.");
        } else if (choice == 5) {
            if (wood >= 10) {
                wood -= 10;
                System.out.println("Village defended! You used 10 wood.");
            } else {
                System.out.println("Not enough wood to defend!");
            }
        }
        
        System.out.println("Food: " + food + ", Wood: " + wood + ", Population: " + population);
        System.out.println("Your civilization has completed 5 days! Final status:");
        System.out.println("Civilization: " + name);
        System.out.println("Food: " + food + ", Wood: " + wood + ", Population: " + population);
        
        scanner.close();
    }
}
