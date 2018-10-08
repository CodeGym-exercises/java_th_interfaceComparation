public  class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(3.4,"CR1");
        circles[1] = new Circle(3.3,"CR2");
        circles[2] = new Circle(3.6,"CR3");

        CircleComparator circleComparator = new CircleComparator();
        String resutl = circleComparator.compare(circles[0],circles[1]);
        System.out.println(resutl);
    }
}
