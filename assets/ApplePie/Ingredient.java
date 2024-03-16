package assets.ApplePie;

public class Ingredient {
    String item;
    double amount;
    String unit;

    public Ingredient() {
    }

    public Ingredient(String item, double amount, String unit) {
        this.item = item;
        this.amount = amount;
        this.unit = unit;
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }
}
