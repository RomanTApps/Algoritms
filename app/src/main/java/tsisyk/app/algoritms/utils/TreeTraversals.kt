package tsisyk.app.algoritms.utils

class TreeTraversals {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return inorderTraversal(root.left) + root.value + inorderTraversal(root.right)
    }

    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return listOf(root.value) + preorderTraversal(root.left) + preorderTraversal(root.right)
    }

    fun postorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return postorderTraversal(root.left) + postorderTraversal(root.right) + listOf(root.value)
    }

    data class TreeNode(val value: Int, val left: TreeNode? = null, val right: TreeNode? = null)
}