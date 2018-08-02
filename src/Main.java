import java.util.*;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        //int sum1 = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            num = scanner.nextInt();
            numbers.offer(num);
            sum += num;
        }
        //System.out.println(sum);

        //Iterator<Integer> iterator = numbers.iterator();
        while(num < numbers.size()){
            if(num <= numbers.size()-2){
                System.out.print(numbers.peek() + " + ");
            }
            if(num == numbers.size()-1){
                System.out.print(numbers.poll() + " = ");
            }

            numbers.poll();

        }
        System.out.println(sum);


    }
}
