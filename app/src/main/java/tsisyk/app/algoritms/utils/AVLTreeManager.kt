package tsisyk.app.algoritms.utils

class AVLTreeManager {
    data class TreeNode(val value: Int, var left: TreeNode? = null, var right: TreeNode? = null, var height: Int = 1)

    var root: TreeNode? = null

    private fun height(node: TreeNode?): Int = node?.height ?: 0

    private fun updateHeight(node: TreeNode) {
        node.height = 1 + maxOf(height(node.left), height(node.right))
    }

    private fun balanceFactor(node: TreeNode?): Int = height(node?.left) - height(node?.right)

    private fun rotateRight(y: TreeNode): TreeNode {
        val x = y.left!!
        val T2 = x.right

        // Perform rotation
        x.right = y
        y.left = T2

        // Update heights
        updateHeight(y)
        updateHeight(x)

        return x
    }

    private fun rotateLeft(x: TreeNode): TreeNode {
        val y = x.right!!
        val T2 = y.left

        // Perform rotation
        y.left = x
        x.right = T2

        // Update heights
        updateHeight(x)
        updateHeight(y)

        return y
    }

    private fun rebalance(node: TreeNode): TreeNode {
        updateHeight(node)
        val balance = balanceFactor(node)

        // Left Left Case
        if (balance > 1 && balanceFactor(node.left) >= 0) {
            return rotateRight(node)
        }

        // Left Right Case
        if (balance > 1 && balanceFactor(node.left) < 0) {
            node.left = rotateLeft(node.left!!)
            return rotateRight(node)
        }

        // Right Right Case
        if (balance < -1 && balanceFactor(node.right) <= 0) {
            return rotateLeft(node)
        }

        // Right Left Case
        if (balance < -1 && balanceFactor(node.right) > 0) {
            node.right = rotateRight(node.right!!)
            return rotateLeft(node)
        }

        return node
    }

    fun insert(value: Int) {
        root = insertRec(root, value)
    }

    private fun insertRec(current: TreeNode?, value: Int): TreeNode? {
        if (current == null) {
            return TreeNode(value)
        }
        when {
            value < current.value -> current.left = insertRec(current.left, value)
            value > current.value -> current.right = insertRec(current.right, value)
            else -> return current
        }

        return rebalance(current)
    }
}
