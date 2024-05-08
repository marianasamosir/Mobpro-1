package org.d3if3159.assessment_2.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3159.assessment_2.model.Musik

class DetailViewModel : ViewModel() {
    fun getMusik(id: Long): Musik {
        return Musik(
            id,
            "Mengejar Impian",
            "Evlogia",
            "Jazz",
            "2024-08-$id 19:29:21"
        )
    }
}