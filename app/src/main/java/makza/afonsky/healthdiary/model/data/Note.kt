package makza.afonsky.healthdiary.model.data

import android.os.Parcelable
import java.text.DateFormat

/**
 * заметка
 */

data class Note(
    val name: String,
    val created: Long = System.currentTimeMillis()
) {
    val createdDateFormatted: String
        get() = DateFormat.getDateTimeInstance().format(created)
}

