package romantsisyk.github.io.lib.algorithms.text_processing

import java.util.Stack

class ExpressionEvaluator {
    fun evaluate(expression: String): Int {
        val ops = Stack<Char>()
        val values = Stack<Int>()

        for (token in expression) {
            when {
                token.isDigit() -> values.push(token.toString().toInt())
                token == '(' -> ops.push(token)
                token in "+-*/" -> {
                    while (!ops.isEmpty() && hasPrecedence(token, ops.peek())) {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                    }
                    ops.push(token)
                }
                token == ')' -> {
                    while (ops.peek() != '(') {
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()))
                    }
                    ops.pop()
                }
            }
        }
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()))
        }
        return values.pop()
    }

    private fun hasPrecedence(op1: Char, op2: Char): Boolean {
        if (op2 == '(' || op2 == ')') return false
        return !((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
    }

    private fun applyOp(op: Char, b: Int, a: Int): Int {
        return when (op) {
            '+' -> a + b
            '-' -> a - b
            '*' -> a * b
            '/' -> if (b != 0) a / b else throw UnsupportedOperationException("Cannot divide by zero.")
            else -> throw IllegalArgumentException("Unsupported operation $op")
        }
    }
}
