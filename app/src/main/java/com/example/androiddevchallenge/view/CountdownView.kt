package com.example.androiddevchallenge.view

import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.data.num
import com.example.androiddevchallenge.viewModel.MyViewModel


@Composable
fun CountdownView(modifier: Modifier = Modifier, numss: Array<Array<Int>>, size: Dp) {
    val viewModel: MyViewModel = viewModel()
    var blue by remember { mutableStateOf(true) }

    val color1 by animateColorAsState(
        White,
        animationSpec = spring(Spring.StiffnessVeryLow, 500000f),
    )

    val color2 by animateColorAsState(
        Color(0xff2b6d8c),
        animationSpec = spring(Spring.StiffnessVeryLow, 500000f),
    )

    val rotation by animateFloatAsState(
        if (blue) 89.5f else 0f,
        animationSpec = spring(25f, 1000000f),
        finishedListener = {
            if (viewModel.isRun == false) {

            }
            blue = !blue
        }
    )

    val rotation1 by animateFloatAsState(
        targetValue = 0f,
        animationSpec = spring(Spring.StiffnessVeryLow, 1000000f),
    )

    val rotation2 by animateFloatAsState(
        targetValue = 89f,
        animationSpec = spring(Spring.StiffnessVeryLow, 1000000f),
    )

    return LazyColumn {
        itemsIndexed(numss) { itemPosition, row ->
            LazyRow {
                itemsIndexed(row) { position, data ->
                    Log.d("6688", "item   $itemPosition   posttion     $position")
                    Box(
                        modifier = Modifier
                            .graphicsLayer(
//                                rotationX = if(!viewModel.isRun) 89f else (if (num[viewModel.aa % 10][itemPosition][position] == 1) rotation1 else rotation2),
                                rotationX = if (viewModel.isRun) rotation else 0f
                            )
                            .width(size)
                            .height(size)
                            .padding(size / 10)
                            .background(Color.White)
//                            .background(if (!viewModel.isRun) Color.White else (if(blue) color2 else (if (num[viewModel.aa % 10][itemPosition][position] == 1) color1 else color2)))
                            .background(if (!viewModel.isRun) Color.White else (if (numss[itemPosition][position] == 1) color1 else color2))
                    )
                }
            }
        }
    }
}