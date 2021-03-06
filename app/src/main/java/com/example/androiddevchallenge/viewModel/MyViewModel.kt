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
package com.example.androiddevchallenge.viewModel

import android.os.Handler
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MyViewModel : ViewModel() {

    var aa by mutableStateOf(0)

    var s1 by mutableStateOf(0)
    var s2 by mutableStateOf(0)
    var m1 by mutableStateOf(0)
    var m2 by mutableStateOf(0)
    lateinit var handler: Handler
    lateinit var runss: Runnable

    var isRun by mutableStateOf(false)

    fun start() {

        val ss = Random.nextInt(1000, 2599)
//        val ss = 10
        aa = 0

        isRun = true
        handler = Handler()
        runss = Runnable {
            aa++
            val time = ss - aa
            if (time < 0) {
                isRun = false
                return@Runnable
            }

            val s = time / 60
            val m = time - s * 60

            if (s.toString().length == 1) {
                s1 = 0
                s2 = s
            } else {
                s1 = s / 10
                s2 = s % 10
            }
            if (m.toString().length == 1) {
                m1 = 0
                m2 = m
            } else {
                m1 = m / 10
                m2 = m % 10
            }

            Log.d(
                "66881010",
                "aa =  $aa   time =  $time   s1 =  $s1   s2 =  $s2  m1 = $m1  m2 = $m2"
            )

            handler.postDelayed(runss, 1000)
        }
        handler.postDelayed(runss, 1000)
    }
}
