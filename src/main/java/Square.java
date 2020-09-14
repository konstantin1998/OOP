public class Square implements Figure{
    public  float edgeLength;

    Square(float a) {
        this.edgeLength = a;
    }

    public float calculateArea() {
        return edgeLength * edgeLength;
    }
}
