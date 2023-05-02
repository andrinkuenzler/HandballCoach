package ch.hslu.mobpro.handballcoach.room.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "handball")
data class Handball (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String?,
    val attackFrontLeft: String?,
    val attackFrontMid: String?,
    val attackFrontRight: String?,
    val attackBackLeft: String?,
    val attackBackMid: String?,
    val attackBackRight: String?,
    val technicalDouble: String?,
    val technicalStep: String?,
    val technicalCatch: String?,
    val defenseFrontLeft: String?,
    val defenseFrontMid: String?,
    val defenseFrontRight: String?,
    val defenseBackLeft: String?,
    val defenseBackMid: String?,
    val defenseBackRight: String?
)