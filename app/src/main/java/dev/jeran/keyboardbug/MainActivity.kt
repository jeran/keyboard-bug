package dev.jeran.keyboardbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val modalBottomSheetState = rememberModalBottomSheetState(
                initialValue = ModalBottomSheetValue.Hidden,
                skipHalfExpanded = true,
            )
            val scope = rememberCoroutineScope()
            ModalBottomSheetLayout(
                sheetContent = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .imePadding(),
                        contentAlignment = Alignment.Center,
                    ) {
                        TextField(
                            value = "",
                            onValueChange = { },
                        )
                    }
                },
                sheetState = modalBottomSheetState,
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Button(
                        onClick = { scope.launch { modalBottomSheetState.show() } },
                    ) {
                        Text(text = "Open Sheet")
                    }
                }
            }
        }
    }
}
