public class Trapezoid extends Figure {

    @Override
    protected int s(int a, int b, int h, int r) {
        return (1/2 * (a + b) * h);
    }
}
