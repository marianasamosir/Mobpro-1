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
    fun getMusik(id: Long): Musik {
        return Musik(
            id,
            "Mengejar Impian",
            "Evlogia",
            "Musik Jazz",
            "2024-08-$id 19:29:21"
        )
    }
}