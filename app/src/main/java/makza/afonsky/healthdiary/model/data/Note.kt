package makza.afonsky.healthdiary.model.data

import android.os.Parcelable
import java.text.DateFormat

/**
 * заметка
 */

data class Note(
    val textNote: String,
    val dateCreated: Long = System.currentTimeMillis()
) {
    val createdDateFormatted: String
        get() = DateFormat.getDateTimeInstance().format(dateCreated)
}

