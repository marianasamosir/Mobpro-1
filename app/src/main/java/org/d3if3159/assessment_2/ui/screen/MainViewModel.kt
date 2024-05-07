package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3159.assessment_2.model.Musik

class MainViewModel: ViewModel() {

    val dataMusik = getDataDummy()

    private fun getDataDummy(): List<Musik> {
        return mutableListOf(
            Musik(1, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(2, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(3, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(4, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(5, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(6, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(7, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(8, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(9, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
            Musik(10, "Mengejar Impian", "Evlogia Givty", "Musik Rock"),
        )
    }
}

