import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <T> void  printArray(T[] array){
        for (T element : array){
            System.out.println(element+ "  ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        Box<Integer> integerBox =new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer content: "+ integerBox.getContent());
        Integer[] intArray = {1,2,3,4};
        String[] stringArray = {"A","B","C"};

        //Gọi phương thức generic
        printArray(intArray);
        printArray(stringArray);

        //Tạo danh sách số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        //In danh sách
        Pair<String, Integer> pair = new OrderPair<>("Age",25);
        System.out.println("Key: "+pair.getKey()+", value: "+pair.getValue());

    }
}