package tsisyk.app.algorithms.utils

class MarkdownParser {
    fun parse(markdown: String): String {
        val lines = markdown.lines()
        val html = StringBuilder()

        for (line in lines) {
            when {
                line.startsWith("### ") -> html.append("<h3>${line.substring(4)}</h3>")
                line.startsWith("## ") -> html.append("<h2>${line.substring(3)}</h2>")
                line.startsWith("# ") -> html.append("<h1>${line.substring(2)}</h1>")
                line.startsWith("**") && line.endsWith("**") -> html.append("<strong>${line.substring(2, line.length - 2)}</strong>")
                line.startsWith("*") && line.endsWith("*") -> html.append("<em>${line.substring(1, line.length - 1)}</em>")
                else -> html.append("<p>$line</p>")
            }
        }
        return html.toString()
    }
}