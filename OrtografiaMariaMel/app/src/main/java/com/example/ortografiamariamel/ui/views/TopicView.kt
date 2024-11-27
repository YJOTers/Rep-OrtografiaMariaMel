package com.example.ortografiamariamel.ui.views

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.ortografiamariamel.R
import com.example.ortografiamariamel.ui.theme.Typography

@Composable
fun TopicView(
    @StringRes subtitleId: Int,
    @StringRes summaryId: Int,
    @DrawableRes imageId: Int,
    modifier: Modifier = Modifier
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(horizontal = dimensionResource(R.dimen.short6_dp))
            .verticalScroll(state = ScrollState(0), enabled = true)
    ){
        Text(
            text = stringResource(id = R.string.title_unit),
            style = Typography.titleLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
        Spacer(modifier = Modifier.sizeIn(
            minHeight = dimensionResource(R.dimen.short3_dp),
            maxHeight = dimensionResource(R.dimen.short4_dp)
        ))
        Text(
            text = stringResource(id = subtitleId),
            style = Typography.titleLarge,
            color = MaterialTheme.colorScheme.primaryContainer
        )
        Spacer(modifier = Modifier.sizeIn(
            minHeight = dimensionResource(R.dimen.short3_dp),
            maxHeight = dimensionResource(R.dimen.short4_dp)
        ))
        Image(
            painter = painterResource(id = imageId),
            contentScale = ContentScale.Fit,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(modifier = Modifier.sizeIn(
            minHeight = dimensionResource(R.dimen.short3_dp),
            maxHeight = dimensionResource(R.dimen.short4_dp)
        ))
        Text(
            text = stringResource(id = summaryId),
            style = Typography.bodyLarge,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}