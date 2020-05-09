public class Square extends Rectangle implements ResizeAble{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void resize(double percent) {
        double newSide = this.getSide() * (percent + 100) / 100;
        this.setSide(newSide);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide()
                + " | perimeter = " + getPerimeter()
                + " | area = " + getArea();
    }
}
