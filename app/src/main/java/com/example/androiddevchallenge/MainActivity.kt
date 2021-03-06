/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.data.num
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.utils.DarkModeUtils
import com.example.androiddevchallenge.utils.StatusBarUtils
import com.example.androiddevchallenge.view.CountdownView
import com.example.androiddevchallenge.viewModel.MyViewModel

class MainActivity : AppCompatActivity() {

    val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        val isDark = DarkModeUtils.isDarkMode(this)
        StatusBarUtils.initStatusBar(this, null, isDark)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val viewModel: MyViewModel = viewModel()
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { viewModel.start() },
                    backgroundColor = Color(0xff2ea3e4)
                ) {
                    Text(
                        text = "RUN",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            floatingActionButtonPosition = FabPosition.End,
            content = {
                Box(
                    // #2ea3e4
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xff2b6d8c)),
                    contentAlignment = Alignment.Center
                ) {
                    var size = 35.dp
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            Row() {
                                // num[viewModel.aa % 10]
                                CountdownView(numss = num[viewModel.s1], size = size)
                                CountdownView(numss = num[viewModel.s2], size = size)
                                CountdownView(numss = num[10], size = size)
                                CountdownView(numss = num[viewModel.m1], size = size)
                                CountdownView(numss = num[viewModel.m2], size = size)
                            }
                        }
                    )
                }
            }
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
