class Solution {
    public boolean isValidSudoku(char[][] board) {


        // iterate over rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            HashSet<Character> columnSet = new HashSet<>();
            char[] row = board[i];
            for (char currentCh : row) {
                if (currentCh != '.') {
                    if (!set.add(currentCh)) {
                        return false;
                    }
                }
            }

            // iterate over columns
            for (int j = 0; j < 9; j++) {
                char currentChar = board[j][i];
                if (currentChar != '.') {
                    if (!columnSet.add(currentChar)) {
                        return false;
                    }
                }
            }
        }

        HashSet<Character>[] squareSet = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentCh = board[i][j];
                if (currentCh == '.') {
                    continue;
                }

                int square = (i / 3) * 3 + (j / 3);
                if (squareSet[square] == null) {
                    squareSet[square] = new HashSet<>();
                }
                if (!squareSet[square].add(currentCh)) {
                    return false;
                }
            }
        }
        return true;
    }
}
