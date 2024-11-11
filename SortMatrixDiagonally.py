class Solution:
    def diagonalSort(self, mat: List[List[int]]) -> List[List[int]]:
        diagonals = defaultdict(list)
        
        for r in range(len(mat)):
            for c in range(len(mat[0])):
                diagonals[r - c].append(mat[r][c])
        
        for key in diagonals:
            diagonals[key].sort()
        
        for r in range(len(mat)):
            for c in range(len(mat[0])):
                mat[r][c] = diagonals[r - c].pop(0)  
        
        return mat