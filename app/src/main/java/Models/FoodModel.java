package Models;

public class FoodModel {
    int images1;
    String text;

    public FoodModel(String text) {
        this.text = text;
    }

    public FoodModel(int food6, String burger4) {
    }

    public int getImages1() {
        return images1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImages1(int images1) {
        this.images1 = images1;
    }

    public FoodModel(int images1) {
        this.images1 = images1;
    }
}
