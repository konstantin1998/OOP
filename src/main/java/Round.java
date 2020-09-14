public class Round implements Figure{
    public float radius;

    Round(float radius) {
        this.radius = radius;
    }

    public float calculateArea() {
        return (float)Math.PI * radius * radius;
    }
}
