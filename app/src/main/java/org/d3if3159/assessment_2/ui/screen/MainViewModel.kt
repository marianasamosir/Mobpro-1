package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3159.assessment_2.model.Musik

class MainViewModel : ViewModel() {

    val dataMusik = getDataDummy()

    private fun getDataDummy(): List<Musik> {
        return mutableListOf(
            Musik(1, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(2, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(3, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(4, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(5, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(6, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(7, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(8, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(9, "Manusia Biasa", "Yovie & Nuno", "Rock"),
            Musik(10, "Manusia Biasa", "Yovie & Nuno", "Rock"),
        )
    }
}

