public class WordSearch {
    public static void main(String[] args) {
        String input = "WELCOMETOZOHOCORPORATION";
        String substring = "too";

        // Convert input string to 2D array
        char[][] grid = convertTo2DArray(input);

        // Search for substring "too" from left to right and top to bottom
        searchLeftToRight(grid, substring);
        searchTopToBottom(grid, substring);
    }

    // Function to convert string to 2D array
    private static char[][] convertTo2DArray(String input) {
        int len = input.length();
        int dimension = (int) Math.sqrt(len); // Assuming square grid, but we can adapt if rectangular
        char[][] grid = new char[dimension][dimension];
        int k = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                grid[i][j] = input.charAt(k++);
            }
        }
        return grid;
    }

    // Function to search substring "too" from left to right
    private static void searchLeftToRight(char[][] grid, String substring) {
        int len = grid.length;
        int subLen = substring.length();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= len - subLen; j++) {
                boolean found = true;
                for (int k = 0; k < subLen; k++) {
                    if (grid[i][j + k] != substring.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Left to Right: Start index: <" + i + "," + j + "> End index: <" + i + ","
                            + (j + subLen - 1) + ">");
                    return; // Assuming we want to find only the first occurrence
                }
            }
        }
    }

    // Function to search substring "too" from top to bottom
    private static void searchTopToBottom(char[][] grid, String substring) {
        int len = grid.length;
        int subLen = substring.length();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= len - subLen; j++) {
                boolean found = true;
                for (int k = 0; k < subLen; k++) {
                    if (grid[j + k][i] != substring.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Top to Bottom: Start index: <" + j + "," + i + "> End index: <"
                            + (j + subLen - 1) + "," + i + ">");
                    return; // Assuming we want to find only the first occurrence
                }
            }
        }
    }
}
