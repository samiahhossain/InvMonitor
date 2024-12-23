import java.util.ArrayList;

public class KStash {
    // store items
    private ArrayList<Item> items;

    public KStash() {
        items = new ArrayList<>();
        fill();
    }

    private void fill() {
        items.add(new Item("scissors", 50, 35, 2));
        items.add(new Item("pencil", 500, 100, 0.5));
        items.add(new Item("blank paper 500 pack", 20, 6, 8));
        items.add(new Item("tape", 15, 5, 3));
        items.add(new Item("graph paper 100 pack", 5, 1, 7));
        items.add(new Item("sticker pack", 5, 2, 10));
        items.add(new Item("eraser", 40, 15, 2));
    }

    public boolean inKCheck(String item) {
        for (Item singleItem : items) {
            if (singleItem.getName().equals(item)) {
                if (!singleItem.haveEnough()) {
                    System.out.println("Be aware that this item is running low.");
                }
                return true;
            }
        }
        return false;
    }

    // should adding and using take in a list of items or individual items?
    // give to team
    public void giveToTeam(Team team, Item item, int quantity) {
        team.add(item, quantity);
    }
}
