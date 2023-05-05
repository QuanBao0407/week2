package shape;

public abstract class Shape {
    protected abstract double getArea();
    protected abstract double getPerimeter();
    protected  String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
public String toString(){
        return "màu :"+getColor()+"  balalalsd  :"+isFilled();
}
}
