public class HT2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            //double catchedRes1 = intArray[8] / d; самое простое - избавиться от неинициализарованного массива. но код странный, т.к. d = 0 задается в блоке try, catch всегда ловит эксепшн
            double catchedRes1 = 8/d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
