package org.d3if3159.assessment_2.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import org.d3if3159.assessment_2.model.Musik

@Dao
interface MusikDao {

    @Insert
    suspend fun insert(musik: Musik)

    @Update
    suspend fun update(musik: Musik)

    @Query("SELECT * FROM musik ORDER BY tanggal DESC, judul ASC")
    fun getMusik(): Flow<List<Musik>>
}