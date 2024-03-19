class Constructors1 {
    private int radius;
    private int height;

    public Constructors1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
class Demo2{
    public static void main(String[] args) {
        Constructors1 c= new Constructors1(10,20);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());

    }
}




