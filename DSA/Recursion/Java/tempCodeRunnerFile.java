public static char[][] convertToMatrix(String str) {
        int row = 5;
        int col = str.length() / row;

        char[][] matrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = str.charAt(i * col + j);
            }
        }

        return matrix;
    }