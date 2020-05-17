package tsisyk.app.algorithms.utils

class BinarySearchTreeManager {
    data class TreeNode(val value: Int, var left: TreeNode? = null, var right: TreeNode? = null)

    var root: TreeNode? = null

    fun insert(value: Int) {
        root = insertRec(root, value)
    }

    private fun insertRec(current: TreeNode?, value: Int): TreeNode {
        if (current == null) return TreeNode(value)
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