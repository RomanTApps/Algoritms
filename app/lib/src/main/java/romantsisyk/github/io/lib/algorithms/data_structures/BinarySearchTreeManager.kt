package romantsisyk.github.io.lib.algorithms.data_structures

class BinarySearchTreeManager {
    data class TreeNode(val value: Int, var left: romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode? = null, var right: romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode? = null)

    var root: romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode? = null

    fun insert(value: Int) {
        root = insertRec(root, value)
    }

    private fun insertRec(current: romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode?, value: Int): romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode {
        if (current == null) return romantsisyk.github.io.lib.algorithms.data_structures.BinarySearchTreeManager.TreeNode(
            value
        )
        if (value < current.value) {
            current.left = insertRec(current.left, value)
        } else if (value > current.value) {
            current.right = insertRec(current.right, value)
        }
        return current
    }

    fun contains(value: Int): Boolean {
        var current = root
        while (current != null) {
            if (value < current.value) {
                current = current.left
            } else if (value > current.value) {
                current = current.right
            } else {
                return true
            }
        }
        return false
    }
}