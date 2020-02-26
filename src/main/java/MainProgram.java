public class MainProgram {
    public static void main(String[] args) {
        Integer [] numbers = {1 ,9 ,9 ,3 ,1 ,2 ,0 ,9};
        String [] text = {"A", "Legend", "was", "born!"};

        GenericsMethod.printArrayContent(numbers);
        GenericsMethod.printArrayContent(text);

    }
}
