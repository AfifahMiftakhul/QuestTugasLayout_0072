package com.example.activity3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity3.R


@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.header_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = stringResource(id = R.string.header_subtitle),
            fontSize = 14.sp,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(16.dp))


        CardItem(
            cardColorId = R.color.card_gray,
            nameResId = R.string.name_1,
            infoResId = 0,
            addressResId = R.string.address_1,
            imageResId = R.drawable.singa
        )

        CardItem(
            cardColorId = R.color.card_purple,
            nameResId = R.string.name_2,
            infoResId = R.string.phone_2,
            addressResId = R.string.address_2,
            imageResId = R.drawable.singa
        )
        CardItem(
            cardColorId = R.color.card_blue,
            nameResId = R.string.name_3,
            infoResId = R.string.phone_3,
            addressResId = R.string.address_3,
            imageResId = R.drawable.singa
        )

        CardItem(
            cardColorId = R.color.card_green,
            nameResId = R.string.name_4,
            infoResId = R.string.phone_4,
            addressResId = R.string.address_4,
            imageResId = R.drawable.singa
        )

        Spacer(modifier = Modifier.weight(1f))


        Text(
            text = stringResource(id = R.string.footer_text),
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}


@Composable
fun CardItem(
    cardColorId: Int,
    nameResId: Int,
    infoResId: Int,
    addressResId: Int,
    imageResId: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = cardColorId)
        ),
        shape = RoundedCornerShape(12.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.size(45.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ) {

                Text(
                    text = stringResource(id = nameResId),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                if (infoResId != 0) {
                    Text(
                        text = stringResource(id = infoResId),
                        color = Color.White,
                        fontSize = 13.sp
                    )
                }
                Text(
                    text = stringResource(id = addressResId),
                    color = Color.White,
                    fontSize = 13.sp
                )
            }
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.size(45.dp)
            )
        }
    }
}








