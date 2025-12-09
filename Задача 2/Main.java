public class Main{
    public static void main(String[] args) {
        treug treug1=new treug(2.1);
        System.out.printf("Периметр треугольника: %.2f\n",treug1.getP());
        System.out.printf("Площадь треугольника: %.2f\n",treug1.getS());
        krug krug1=new krug(4);
        System.out.printf("Периметр круга: %.2f\n",krug1.getP());
        System.out.printf("Площадь круга: %.2f\n",krug1.getS());
        prymoug prymoug1=new prymoug(3,4);
        System.out.printf("Периметр прямоульника: %.2f\n",prymoug1.getP());
        System.out.printf("Площадь прямоугольника: %.2f\n",prymoug1.getS());
    }
}