public class Main{
    public static void main(String[] args) {
        StringArr arr=new StringArr(5);
        arr.add("доброе");
        arr.add("утро");
        arr.add("солнышко");
        arr.add("моё");
        arr.add("прекрасное");

        System.out.println("Полученный массив: "+arr.getArr2());
        System.out.println("Размер массива: "+arr.getSize());
        System.out.println("Самая длинная строка: "+arr.maxarr());
        System.out.printf("Средняя длина строк: %.2f\n",arr.AverageLen());



    }
}
