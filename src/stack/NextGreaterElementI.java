package stack;
import java.util.*;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] elementsToFind = {4, 1, 2};
        int[] sourceArray = {1, 3, 4, 2};
        int[] result = nextGreaterElement(elementsToFind, sourceArray);

        System.out.println("Next Greater Elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] nextGreaterElement(int[] elementsToFind, int[] sourceArray) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();

        // Iterate through the source array in reverse order
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            int currentElement = sourceArray[i];

            // Pop elements from the stack until a greater element is found
            while (!stack.isEmpty() && currentElement >= stack.peek()) {
                stack.pop();
            }

            // Store the next greater element in the map
            if (stack.isEmpty()) {
                nextGreaterMap.put(currentElement, -1);
            } else {
                nextGreaterMap.put(currentElement, stack.peek());
            }

            // Push the current element onto the stack
            stack.push(currentElement);
        }

        // Populate the result array
        int[] result = new int[elementsToFind.length];
        for (int i = 0; i < elementsToFind.length; i++) {
            result[i] = nextGreaterMap.get(elementsToFind[i]);
        }

        return result;
    }
}
