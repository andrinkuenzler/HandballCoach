package ch.hslu.mobpro.handballcoach.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Handball::class], version = 1)
abstract class HandballDatabase: RoomDatabase() {

    abstract fun handballDao(): HandballDao

    companion object {
        @Volatile
        private var INSTANCE: HandballDatabase? = null

        fun getDatabase(context: Context): HandballDatabase {
            return INSTANCE ?: synchronized(this) {
                val db = Room.databaseBuilder(
                    context.applicationContext,
                    HandballDatabase::class.java,
                    "handball_database"
                ).allowMainThreadQueries()
                    .build()
                INSTANCE = db
                db
            }
        }
    }
}