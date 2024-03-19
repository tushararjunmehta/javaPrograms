class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 3.14 * radius * radius * height + 2 * Math.PI * radius;

    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}
 class Demo{
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println(c.getRadius());
       int h= c.getHeight();
        System.out.println(h);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

    }
}






