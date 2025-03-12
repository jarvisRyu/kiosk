package kiosk2;

public class FoodMenu {
    private final String foodName;
    private final int foodPrice;
    private final String foodExplanation;

    //생성자
    public FoodMenu(String foodName, int foodPrice, String foodExplanation) {

        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodExplanation = foodExplanation;
    }
    @Override
    public String toString() {
        return "메뉴 :"+foodName+" , 금 액 : "+foodPrice+"원"+" 『"+foodExplanation+"』";
    }

    public String getFoodName() {
        return this.foodName;
    }

    public int getFoodPrice() {
        return this.foodPrice;
    }

    public String getFoodExplanation(){
        return this.foodExplanation;
    }

}




