import java.util.Scanner;

public class VirtualInteriorDesignAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Interior Design Assistant!");
        System.out.println("Please select an option:");
        System.out.println("1. Get interior design ideas");
        System.out.println("2. Get recommendations for furniture and decor");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                getInteriorDesignIdeas();
                break;
            case 2:
                getFurnitureAndDecorRecommendations();
                break;
            case 3:
                System.out.println("Thank you for using the Virtual Interior Design Assistant!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
    }

    public static void getInteriorDesignIdeas() {
        // Implement code to provide interior design ideas
        System.out.println("Here are some interior design ideas:");
        System.out.println("- Modern minimalist style: Clean lines, neutral colors, and simple decor");
        System.out.println("- Scandinavian style: Light, airy spaces with cozy accents and natural materials");
        System.out.println("- Bohemian style: Eclectic and colorful, with a mix of patterns, textures, and global influences");
    }

    public static void getFurnitureAndDecorRecommendations() {
        // Implement code to recommend furniture and decor
        System.out.println("Here are some furniture and decor recommendations:");
        System.out.println("- Sofa: Comfortable and stylish, choose a color that complements your living room theme");
        System.out.println("- Coffee table: Opt for a sturdy yet aesthetically pleasing design");
        System.out.println("- Wall art: Select artwork or prints that resonate with your personal style");
    }
}
