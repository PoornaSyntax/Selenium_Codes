package practice;

public class Array_1 {
    public static void main(String[] args) {
        int[][] numbersArray = {
                {23, 12, 34, 45},
                {16, 15, 14},
                {65, 45, 34, 75, 46, 54}
        };
        // Choose the row you want to extract
        int rowIndex = 1;

        // Get the length of the row
        int rowLength = numbersArray[rowIndex].length;

        // Create a new array to store the selected row
        int[] singleArr = new int[rowLength];

        // Copy the elements from the 2D array to the new array using a loop
        for (int i = 0; i < rowLength; i++) {
            singleArr[i] = numbersArray[rowIndex][i];
        }
        // Print the selected row
        System.out.println("Selected row: ");
        for (int i = 0; i < singleArr.length; i++) {
            System.out.print(singleArr[i] + " ");
        }

    }
}
