import java.util.ArrayList;

public abstract class Team {
    // add
    public void add(Item item, int amountAdding) {
        item.setQuantityHave(item.getQuantityHave() + amountAdding);
    }
    // use
    public void use(Item item, int amountUsed) {
        if (amountUsed > item.getQuantityHave()) {
            System.out.println("There is not enough of " + item.getName() + "to use that much. Consider using less or buying more.");
        }
        item.setQuantityHave(item.getQuantityHave() - amountUsed);
    }
    // move to another team
    public void move(Item item, Team team) {

    }

    // display what have
    public String toString() {

    }

    // display what need (what to buy vs take from K)
    public void need(Item item) {

    }

    // put in K
    public void putInK(Item item) {

    }

    // budget breakdown (spent vs plan)?
    public void showBudget() {

    }

    // running low assessment
    public void showLow() {
        
    }
}
