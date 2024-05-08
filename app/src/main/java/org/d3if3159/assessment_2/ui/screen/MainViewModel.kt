package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import org.d3if3159.assessment_2.database.MusikDao
import org.d3if3159.assessment_2.model.Musik

class MainViewModel(dao: MusikDao): ViewModel() {

    val dataMusik: StateFlow<List<Musik>> = dao.getMusik().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = emptyList()
    )

//    private fun getDataDummy(): List<Musik> {
//
//        val dataMusik = mutableListOf<Musik>()
//        val judulMusik = listOf(
//            "Mengejar Impian",
//            "Menciptakan Suasana",
//            "Anugerah Terbaik",
//            "Aku dan Dia",
//            "Mengejar Impian",
//            "Menciptakan Suasana",
//            "Anugerah Terbaik",
//            "Aku dan Dia"
//        )
//        val pencipta = listOf(
//            "Evlogia Sihombing",
//            "Yosi Priskiella",
//            "Martahan Bennington",
//            "Yonnathan Bryan",
//            "Evlogia Sihombing",
//            "Yosi Priskiella",
//            "Martahan Bennington",
//            "Yonnathan Bryan"
//        )
//        val genre = listOf(
//            "Musik Pop",
//            "Musik Rock",
//            "Musik Jazz",
//            "Musik Hip-Hop",
//            "Musik Pop",
//            "Musik Rock",
//            "Musik Jazz",
//            "Musik Hip-Hop"
//        )
//        for (i in 7 downTo 0) {
//            dataMusik.add(
//                Musik(
//                    i.toLong(),
//                    judulMusik[i],
//                    pencipta[i],
//                    genre[i],
//                    "2024-05-$i 18:52:24 ",
//                )
//            )
//        }
//        return dataMusik
//    }
}


