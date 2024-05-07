package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3159.assessment_2.model.Musik

class DetailViewModel : ViewModel() {

    fun getMusik(id: Long): Musik {
        return Musik(id, "Manusia Biasa", "Yovie & Nuno", "Musik Rock")
    }
}