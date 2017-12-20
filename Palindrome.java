package integration;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * this class is used to display the use of stack and queues. Even
 * though its very general implementation it is further used to check
 * if a name is palindrome or not.
 * 
 * @author saniya Ashraf
 */
public class Palindrome {
  Stack<Character> stack = new Stack<>();

  Queue<Character> queue = new LinkedList<>();


  /**
   * @param ch to add to the stack.
   */
  void pushCharacter(Character ch) {
    stack.push(ch);
  }

  /**
   * @param ch to add to a queue.
   */
  void enqueueCharacter(char ch) {
    queue.add(ch);
  }

  /**
   * @return char type another method to pop an item on the stack.
   */
  char popCharacter() {
    return stack.pop();
  }

  /**
   * @return another method to remove the queue item.
   */
  char dequeueCharacter() {
    return queue.remove();
  }

}
