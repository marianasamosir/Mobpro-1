package org.d3if3159.assessment_2.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if3159.assessment_2.R
import org.d3if3159.assessment_2.ui.theme.Assessment2Theme

const val KEY_ID_MUSIK = "idMusik"
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavHostController, id: Long? = null) {
    var judul by remember { mutableStateOf("") }
    var pencipta by remember { mutableStateOf("") }
    var selectedGenre by remember { mutableStateOf("Pop") }

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(id = R.string.kembali),
                            tint = Color(0xFF1B547C)
                        )
                    }
                },
                title = {
                    if (id == null)
                        Text(text = stringResource(id = R.string.tambah_musik))
                    else
                        Text(text = stringResource(id = R.string.edit_musik))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFFE1AFF4),
                    titleContentColor = Color(0xFF1B547C)
                ),
                actions = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Outlined.Check,
                            contentDescription = stringResource(id = R.string.simpan),
                            tint = Color(0xFF1B547C)
                        )
                    }
                }
            )
        },

    ) {padding ->
        FormMusik(
            title = judul,
            onTitleChange = { judul = it},
            writer = pencipta,
            onWritChange = { pencipta = it },
            selectedGenre = selectedGenre,
            onGenChange = { selectedGenre = it },
            modifier = Modifier.padding(padding)
        )
    }
}

@Composable
fun FormMusik(
    title: String, onTitleChange: (String) -> Unit,
    writer: String, onWritChange: (String) -> Unit,
    selectedGenre: String, onGenChange: (String) -> Unit,
    modifier: Modifier
) {
    val radioList = listOf(
        stringResource(id = R.string.pop),
        stringResource(id = R.string.jazz),
        stringResource(id = R.string.klasik),
        stringResource(id = R.string.rock),
        stringResource(id = R.string.hiphop)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.app_intro),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = title,
            onValueChange = { onTitleChange },
            label = { Text(text = stringResource(id = R.string.judul)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = writer,
            onValueChange = { onWritChange },
            label = { Text(text = stringResource(id = R.string.pencipta)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .padding(top = 8.dp)
                .border(1.dp, Color.Gray, RoundedCornerShape(4.dp))
        ) {
            radioList.forEach { text ->
                GenreOption(
                    label = text,
                    isSelectedChange = selectedGenre == text,
                    modifier = Modifier
                        .selectable(
                            selected = selectedGenre == text,
                            onClick = { onGenChange(text) },
                            role = Role.RadioButton
                        )
                )
            }
        }

    }
}

@Composable
fun GenreOption(label: String, isSelectedChange: Boolean, modifier: Modifier) {
    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        RadioButton(
            selected = isSelectedChange,
            onClick = null
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DetailScreenPreview() {
    Assessment2Theme {
        DetailScreen(rememberNavController())
    }
}