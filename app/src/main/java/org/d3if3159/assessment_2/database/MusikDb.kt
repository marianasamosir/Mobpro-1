package org.d3if3159.assessment_2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.d3if3159.assessment_2.model.Musik

@Database(entities = [Musik::class], version = 1, exportSchema = false)
abstract class MusikDb : RoomDatabase() {
    abstract val dao: MusikDao
    companion object {

        @Volatile
        private var INSTANCE: MusikDb? = null
        fun getInstance(context: Context): MusikDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MusikDb::class.java,
                        "musik.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}