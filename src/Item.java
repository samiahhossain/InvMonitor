public class Item {
    private String name;
    private int quantityHave;
    private int lowAmount;
    private double unitPrice;

    public Item(String name, int quantityHave, int lowAmount, double unitPrice) {
        this.name = name;
        this.quantityHave = quantityHave;
        this.lowAmount = lowAmount;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantityHave() {
        return quantityHave;
    }

    public void setQuantityHave(int quantityHave) {
        this.quantityHave = quantityHave;
    }

    public int getLowAmount() {
        return lowAmount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean haveEnough() {
        return quantityHave > lowAmount;
    }
}
