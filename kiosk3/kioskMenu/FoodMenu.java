package kiosk3.kioskMenu;

public class FoodMenu extends Menu {

    private final String foodExplanation;
    //생성자

    public FoodMenu(String foodName, int foodPrice, String foodExplanation) {
        super(foodName,foodPrice);
        this.foodExplanation = foodExplanation;
    }

    @Override
    public String toString() {
        return String.format("메뉴: %-6s | 금액:%5d원 | %-30s", super.getName(), super.getPrice(), foodExplanation);
    }

}




