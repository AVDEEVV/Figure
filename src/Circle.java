public class Circle extends Figure {

    @Override
    protected int s(int a, int b, int h, int r) {

        return (int) 3.14 * (r * r);
    }
}
