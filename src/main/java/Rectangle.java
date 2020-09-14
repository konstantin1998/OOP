public class Rectangle implements Figure{
    public float width;
    public float heigth;

    Rectangle(float a, float b) {
        this.width = a;
        this.heigth = b;
    }

    public float calculateArea() {
        return width * heigth;
    }
}
