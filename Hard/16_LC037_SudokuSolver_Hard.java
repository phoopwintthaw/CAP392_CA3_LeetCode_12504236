// 37. Sudoku Solver 

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board)
    {
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c]=='.')
                {
                    for(char d='1';d<='9';d++)
                    {
                        if(isValid(board,r,c,d))
                        {
                            board[r][c]=d;
                            if(solve(board))
                                return true;
                            board[r][c]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isValid(char[][] board,int r,int c,char d)
    {
        for(int i=0;i<9;i++)
        {
            if(board[r][i]==d)
                return false;
            if(board[i][c]==d)
                return false;
            if(board[3*(r/3) + i/3][3*(c/3) + i%3]==d)
                return false;
        }
        return true;
    }
}
