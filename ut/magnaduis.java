import java.util.Queue;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);

    if (queue.length() > 0) {
      System.out.println("The queue is not empty");
    }
  }
}
