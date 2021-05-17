package cmpe277.sjsu.edu.newsapp.database

import androidx.room.TypeConverter
import cmpe277.sjsu.edu.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}