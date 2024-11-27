package com.example.ortografiamariamel.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.ortografiamariamel.R

@Composable
fun StartView(
    onStartClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.background(MaterialTheme.colorScheme.onPrimary)
    ){
        BackGroundImage(
            alpha = 1f,
            modifier = Modifier.fillMaxHeight(0.87f)
        )
        RecyclerButton(
            textButton = stringResource(R.string.button_start),
            modifier = Modifier
                .weight(1f)
                .padding(vertical = dimensionResource(id = R.dimen.short2_dp))
                .fillMaxWidth(0.5f),
            onClick = onStartClicked
        )
    }
}