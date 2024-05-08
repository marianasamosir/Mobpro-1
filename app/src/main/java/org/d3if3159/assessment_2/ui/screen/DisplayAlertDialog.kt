package org.d3if3159.assessment_2.ui.screen

import android.content.res.Configuration
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import org.d3if3159.assessment_2.R
import org.d3if3159.assessment_2.ui.theme.Assessment2Theme

@Composable
fun DisplayAlertDialog(
    openDialog: Boolean,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit
) {
    if (openDialog) {
        AlertDialog(
            text = { Text(
                text = stringResource(R.string.pesan_hapus),
                color = Color(0xFF3F8892)
            ) },
            confirmButton = {
                TextButton(onClick = { onConfirmation() }) {
                    Text(
                        text = stringResource(R.string.tombol_hapus),
                        color = Color(0xFF3F8892)
                    )
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismissRequest() }) {
                    Text(
                        text = stringResource(R.string.tombol_batal),
                        color = Color(0xFF3F8892)
                    )
                }
            },
            onDismissRequest = { onDismissRequest() },
            containerColor = Color(0xFFC3E4E8)
        )
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DialogPreview(){
    Assessment2Theme {
        DisplayAlertDialog(
            openDialog = true,
            onDismissRequest = {},
            onConfirmation = {}
        )
    }
}