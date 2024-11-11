# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def inorder_traversal(node):
            if not node:
                return []
            return inorder_traversal(node.left) + [node.val] + inorder_traversal(node.right)
        
        sorted_values = inorder_traversal(root)
        
        # Step 2: Build a balanced BST from the sorted values
        def build_balanced_bst(nums):
            if not nums:
                return None
            mid = len(nums) // 2
            node = TreeNode(nums[mid])
            node.left = build_balanced_bst(nums[:mid])
            node.right = build_balanced_bst(nums[mid + 1:])
            return node
        
        return build_balanced_bst(sorted_values)