public class Main {
    public static void main(String[] args) {
         double [] numbers = { 3.2, 6.4, 9.8, 5.4, -4.3, -7.3, 14.5, 12.4, -11.15, 9.2, 4.9, 8.3, 19.23, 1.9, 2.7};
         int numberCount = 0;
         double allNumber = 0.0;
         boolean check = false;


        for ( double cast : numbers ) {
            if (cast < 0) {
                check = true;
            } else if (cast > 0 && check) {
                numberCount++;
                allNumber += cast;
                System.out.println(cast);
            }

            System.out.println(" Среднее арифметическое = " + allNumber / numberCount);

        }
    }
}