public class MainProgram {
    public static void main(String[] args) {
        Integer [] numbers = {1 ,9 ,9 ,3 ,1 ,2 ,0 ,9};
        String [] text = {"A", "Legend", "was", "born!"};

        // Method to output array content of either type int or type string
        GenericsMethod.printArrayContent(numbers);
        GenericsMethod.printArrayContent(text);

        // Class that sets and gets a private single variable which can either be String or Integer
        GenericsClass<String> name = new GenericsClass<>();
        name.setType("Tlou Maponya");
        GenericsClass<Integer> age = new GenericsClass<>();
        age.setType(27);

        System.out.println(name.getType());
        System.out.println(age.getType());


    }
}
