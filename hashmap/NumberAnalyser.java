import java.util.*;

public class NumberAnalyser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();
        scanner.close();

        HashMap<Integer, List<Integer>> groups = new HashMap<>();

        String[] numbers = input.split(" ");

        for (String s : numbers) {
            int number = Integer.parseInt(s);
            int digitSum = digitSum(number);

            groups.putIfAbsent(digitSum, new ArrayList<>());
            groups.get(digitSum).add(number);
        }

        List<Integer> keys = new ArrayList<>(groups.keySet());
        Collections.sort(keys);

        for (int key : keys) {
            System.out.print(key + ": ");
            for (int value : groups.get(key)) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}