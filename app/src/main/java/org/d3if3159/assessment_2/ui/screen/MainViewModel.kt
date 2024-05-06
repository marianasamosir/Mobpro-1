package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3159.assessment_2.model.Musik

class MainViewModel : ViewModel() {

    val dataMusik = getDataDummy()

    private fun getDataDummy(): List<Musik> {
        val dataMusik = mutableListOf<Musik>()
        for (i in 29 downTo 20) {
            dataMusik.add(
                Musik(
                    i.toLong(),
                    "Manusia Biasa",
                    "Yovie & Nuno",
                    "Jazz"
                )
            )
        }
        return dataMusik
    }
}

