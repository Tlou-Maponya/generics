public class GenericsMethod {

    public static <T> void printArrayContent(T [] intStringArray){
        for (int i = 0; i < intStringArray.length; i++) {
            System.out.print(intStringArray[i] + " ");
        }
        System.out.println("\n");
    }
}
