package kiosk3.kioskMenu;

public class Menu {
    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
