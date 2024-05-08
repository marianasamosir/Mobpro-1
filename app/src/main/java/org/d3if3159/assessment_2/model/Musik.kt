package org.d3if3159.assessment_2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "musik")
data class Musik(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val judul: String,
    val pencipta: String,
    val genre: String,
    val tanggal: String
)
