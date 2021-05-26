package makza.afonsky.healthdiary.model.db

import androidx.room.TypeConverter

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String{
        return priority.name
    }

    fun toPriority(priority: String): Priority{
        return Priority.valueOf(priority)
    }
}