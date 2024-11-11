class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        row = [1]
        
        # Build the row for rowIndex iteratively
        for i in range(1, rowIndex + 1):
            # Build the next row based on the current row
            # Use the formula to generate the next row by modifying the previous row
            new_row = [1] * (i + 1)  # Create a new row with `i + 1` elements
            
            # Fill in the internal elements of the row
            for j in range(1, i):
                new_row[j] = row[j - 1] + row[j]
            
            # Update the row to be the newly formed row
            row = new_row
        
        return row