package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if3159.assessment_2.database.MusikDao
import org.d3if3159.assessment_2.model.Musik
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DetailViewModel(private val dao: MusikDao) : ViewModel() {

    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    fun insert(judul: String, pencipta: String, genre: String) {
        val musik = Musik(
            tanggal = formatter.format(Date()),
            judul = judul,
            pencipta = pencipta,
            genre = genre
        )
        viewModelScope.launch(Dispatchers.IO){
            dao.insert(musik)
        }
    }
    suspend fun getMusik(id: Long): Musik? {
        return dao.getMusikById(id)
    }

    fun update(id: Long, judul: String, pencipta: String, genre: String) {
        val musik = Musik(
            id       = id,
            tanggal  = formatter.format(Date()),
            judul    = judul,
            pencipta = pencipta,
            genre    = genre
        )
        viewModelScope.launch(Dispatchers.IO){
            dao.update(musik)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO){
            dao.deleteById(id)
        }
    }
}