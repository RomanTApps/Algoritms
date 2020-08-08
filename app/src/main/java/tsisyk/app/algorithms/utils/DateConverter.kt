package tsisyk.app.algorithms.utils

import java.text.SimpleDateFormat
import java.util.Date

class DateConverter {
    fun convertToDate(dateString: String, format: String): Date {
        val formatter = SimpleDateFormat(format)
        return formatter.parse(dateString)
    }

    fun convertToString(date: Date, format: String): String {
        val formatter = SimpleDateFormat(format)
        return formatter.format(date)
    }
}
