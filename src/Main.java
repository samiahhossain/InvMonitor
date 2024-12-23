import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Login as one of the following: cs, eng, oc, sci, ot, ft: ");
        String login = in.nextLine();

        KStash k = new KStash();
        Team team;
        switch (login) {
            case "cs":
                team = new CSTeam();
                break;
            case "eng":
                team = new EngTeam();
                break;
            case "oc":
                team = new OceansTeam();
                break;
            case "sci":
                team = new ScienceTeam();
                break;
            case "ot":
                team = new OutreachTeam();
                break;
            case "ft":
                FullTime ft = new FullTime();
                break;
            default:
                System.out.println("Login invalid. Try again");
                break;
        }

        System.out.println("Welcome to the inventory!");
        // ft gets to see everyones'
        System.out.println("Enter 'see' to view the current inventory.");
        //cannot be more than amount have
        System.out.println("Enter 'use' and your used item(s) to document a decrement in inventory.");
        System.out.println("Enter 'need' and your needed item(s) to check for ways to acquire the item.");
        System.out.println("Enter 'help' to see these commands again.");

        //ft
        System.out.println("Enter 'buy' and your bought item(s) to add to the inventory.");
    }
}