// 51. N-Queens

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queenCol = new int[n];

        int row = 0;
        queenCol[row] = -1; 

        while(row >= 0)
        {
            queenCol[row]++;
            if(queenCol[row]==n)
            {
                row--;
                continue;
            }

            boolean safe=true; 
            for(int r=0;r<row;r++)
            {
                int c=queenCol[r];
                if(c==queenCol[row] || Math.abs(c-queenCol[row]) == row-r)
                {
                    safe=false;
                    break;
                } 
            }

            if(!safe)
                continue; 

            if(row==n-1)
            {
                List<String> board = new ArrayList<>();
                for(int r=0;r<n;r++)
                {
                    char[] line = new char[n];
                    Arrays.fill(line,'.');
                    line[queenCol[r]] = 'Q';
                    board.add(new String(line));
                }
                result.add(board);
            }
            else 
            {
                row++;
                queenCol[row]=-1;
            }
        }
        return result;
    }
}
