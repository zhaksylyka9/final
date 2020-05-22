import java.awt.*;

public class OrderMenu extends Container {
    private String alcohol;
    private String snack;

    public OrderMenu() {
    }

    public OrderMenu(String alcohol, String snack) {
        this.alcohol = alcohol;
        this.snack = snack;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }
    public String toString(){return alcohol + " + " + snack;}
}
