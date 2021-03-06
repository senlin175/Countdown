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
package com.example.androiddevchallenge.data

import androidx.compose.ui.graphics.Color

/**
 * 用来显示点阵的三维数组
 */
val digit = arrayOf(
    arrayOf(
        arrayOf(0, 0, 1, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 1, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 1, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 1, 1, 0),
        arrayOf(0, 1, 1, 0, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 1, 1, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 1, 1)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 0, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(1, 1, 1, 1, 1, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
    ),
    arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 0, 0, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 0, 0, 0, 0)
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 1, 1, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 0, 0, 0)
    )
)

val num = arrayOf(
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 1),
        arrayOf(0, 0, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 0, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
    ),
    arrayOf(
        arrayOf(1, 1, 1, 0),
        arrayOf(1, 0, 1, 0),
        arrayOf(1, 1, 1, 0),
        arrayOf(0, 0, 1, 0),
        arrayOf(0, 0, 1, 0),
    ),
    arrayOf(
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 0, 0, 0),
        arrayOf(0, 1, 0, 0),
        arrayOf(0, 0, 0, 0),
    ),
)

val init = arrayOf(
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
    arrayOf(0, 0, 0, 0),
)

val ColorSer = arrayOf(
    Color.Yellow,
    Color(0xffee7600),
    Color(0xffee82ee),
    Color.Red,
    Color(0xffEE9A00),
    Color(0xffff00ff),
    Color(0xffffd700),
    Color(0xffff0000),
    Color(0xffa020f0),
    Color(0xffab82ff),
    Color(0xff9aff9a),
    Color(0xff7fffd4),
    Color(0xff00f5ff),
    Color.Magenta
)
