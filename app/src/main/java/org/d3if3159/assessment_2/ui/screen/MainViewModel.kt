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
}


