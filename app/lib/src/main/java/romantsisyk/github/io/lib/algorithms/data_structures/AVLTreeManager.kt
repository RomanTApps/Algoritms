package romantsisyk.github.io.lib.algorithms.data_structures

class AVLTreeManager {
    data class TreeNode(val value: Int, var left: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode? = null, var right: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode? = null, var height: Int = 1)

    var root: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode? = null

    private fun height(node: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode?): Int = node?.height ?: 0

    private fun updateHeight(node: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode) {
        node.height = 1 + maxOf(height(node.left), height(node.right))
    }

    private fun balanceFactor(node: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode?): Int = height(node?.left) - height(node?.right)

    private fun rotateRight(y: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode): romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode {
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

    private fun rotateLeft(x: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode): romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode {
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

    private fun rebalance(node: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode): romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode {
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

    private fun insertRec(current: romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode?, value: Int): romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode {
        if (current == null) {
            return romantsisyk.github.io.lib.algorithms.data_structures.AVLTreeManager.TreeNode(
                value
            )
        }
        when {
            value < current.value -> current.left = insertRec(current.left, value)
            value > current.value -> current.right = insertRec(current.right, value)
            else -> return current
        }

        return rebalance(current)
    }
}
