package ch.hslu.mobpro.handballcoach

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface HandballDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(handball: Handball)

    @Query("SELECT * FROM handball")
    fun getAllGames(): Array<Handball>

    @Query("SELECT title FROM handball")
    fun getAllTitles(): Array<String>

    @Query("SELECT * FROM handball WHERE title = :title")
    fun getGameByTitle(title: String): Handball
}