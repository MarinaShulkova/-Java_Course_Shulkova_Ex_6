
public enum Seasons {
    SPRING ("yellow"),
    SUMMER ("green"),
    AUTUMN("orange"),
    WINTER("white");

    private String color;

    Seasons (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
