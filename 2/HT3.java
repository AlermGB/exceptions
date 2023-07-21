import java.io.FileNotFoundException;

public class HT3 {
    public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (NullPointerException ex) { // Throwable выбрасываем в последнюю очередь
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   }
   
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException { // не понятно, каким образом метод может столкнуться с таким исключением
   System.out.println(a + b);
}

}
