public class RightTriangle extends Figure {

    @Override
    protected int s(int a, int b, int h, int r) {
        return 1/2 * (a * h);
    }
}
