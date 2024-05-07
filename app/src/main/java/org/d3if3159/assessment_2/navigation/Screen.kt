package org.d3if3159.assessment_2.navigation

import org.d3if3159.assessment_2.ui.screen.KEY_ID_MUSIK

open class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_MUSIK}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}