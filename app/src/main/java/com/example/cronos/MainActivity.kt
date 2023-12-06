package com.example.cronos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cronos.navigation.NavManager
import com.example.cronos.ui.theme.CronosAppTheme
import com.example.cronos.ui.theme.darkTheme
import com.example.cronos.viewModels.CronometroViewModel
import com.example.cronos.viewModels.CronosViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cronometroVM : CronometroViewModel by viewModels()
        val cronosVM : CronosViewModel by viewModels()
        setContent {
            CronosAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = darkTheme
                ) {
                    NavManager(cronometroVM, cronosVM)
                }
            }
        }
    }
}

