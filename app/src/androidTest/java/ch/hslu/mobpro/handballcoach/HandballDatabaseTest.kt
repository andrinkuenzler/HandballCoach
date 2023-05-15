package ch.hslu.mobpro.handballcoach

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import ch.hslu.mobpro.handballcoach.room.database.Handball
import ch.hslu.mobpro.handballcoach.room.database.HandballDao
import ch.hslu.mobpro.handballcoach.room.database.HandballDatabase
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.IOException
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.equalTo


class HandballDatabaseTest {
    private lateinit var handballDao: HandballDao
    private lateinit var db: HandballDatabase

    @Before
    fun createDB(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, HandballDatabase::class.java).build()
        handballDao = db.handballDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb(){
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeToDb(){
        //Write to DB
        val handball = Handball(
            title = "title",
            attackFrontLeft = "0",
            attackFrontMid = "1",
            attackFrontRight = "3",
            attackBackLeft = "4",
            attackBackMid = "10",
            attackBackRight = "11",
            technicalDouble = "12",
            technicalStep = "13",
            technicalCatch = "14",
            defenseFrontLeft = "15",
            defenseFrontMid = "16",
            defenseFrontRight = "17",
            defenseBackLeft = "18",
            defenseBackMid = "19",
            defenseBackRight = "20"
        )

        handballDao.insert(handball)

        val game = handballDao.getGameByTitle("title")
        //Test Attack from DB
        assertThat(game.attackFrontLeft, equalTo("0"))
        assertThat(game.attackFrontMid, equalTo("1"))
        assertThat(game.attackFrontRight, equalTo("3"))
        assertThat(game.attackBackLeft, equalTo("4"))
        assertThat(game.attackBackMid, equalTo("10"))
        assertThat(game.attackBackRight, equalTo("11"))

        //Test Technical from DB
        assertThat(game.technicalDouble, equalTo("12"))
        assertThat(game.technicalStep, equalTo("13"))
        assertThat(game.technicalCatch, equalTo("14"))

        //Test Defense from DB
        assertThat(game.defenseFrontLeft, equalTo("15"))
        assertThat(game.defenseFrontMid, equalTo("16"))
        assertThat(game.defenseFrontRight, equalTo("17"))
        assertThat(game.defenseBackLeft, equalTo("18"))
        assertThat(game.defenseBackMid, equalTo("19"))
        assertThat(game.defenseBackRight, equalTo("20"))

    }


}

