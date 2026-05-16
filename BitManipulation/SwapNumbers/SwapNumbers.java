// Swapper class with swapXOR function
class Swapper {
    // Function to swap two numbers using XOR
    public void swapXOR(int[] arr) {
        // Step 1: XOR first and second
        arr[0] = arr[0] ^ arr[1];

        // Step 2: XOR new first with second, result is original first
        arr[1] = arr[0] ^ arr[1];

        // Step 3: XOR new first with new second, result is original second
        arr[0] = arr[0] ^ arr[1];
    }
}

// Separate Main class
public class Main {
    public static void main(String[] args) {
        // Initialize array with two numbers
        int[] nums = {5, 10};

        // Create swapper object and call swapXOR
        Swapper swapper = new Swapper();
        swapper.swapXOR(nums);

        // Print the result
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);
    }
}
