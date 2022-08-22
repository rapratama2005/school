public class exceptionDemo3{
    public static void main (String args[]) throws Exception{
        int[] numbers = {1, 2, 3, 4};
        System.out.print("numbers: ");
        for (int i: numbers){System.out.print(i + " ");}System.out.println();
        try{
            System.out.println(numbers[4]);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("This (hopefully) prints 4");
        }
        if (numbers[3] != 3){
            throw new Exception("index 3 is not 3!");
        }
    }
}