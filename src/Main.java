import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums = nums.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < nums.size(); i++) {
            int number = nums.get(i) % 2;
            if (number == 0) {
                System.out.println("Это чётное число - " + nums.get(i));
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }

    public static void task2() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums = nums.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < nums.size(); i++) {
            int number = nums.get(i) % 2;
            if (number != 0) {
                System.out.println("Это нечётное число - " + nums.get(i));
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }

    public static void task3() {

        List<String> word1 = new ArrayList<>(Arrays.asList("горела ", "горела ", "изба ", "пылыхала ", "изба "));
        word1.stream().filter(i -> Collections.frequency(word1, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void task4() {
        ArrayList<String> Word = new ArrayList<>(Arrays.asList("горела ", "горела ", "изба ", "пылыхала ", "изба "));
        // Тут я запутался и уже не могу разобрать, что к чему
        }
}