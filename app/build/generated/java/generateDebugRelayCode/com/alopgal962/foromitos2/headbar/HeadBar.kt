package com.alopgal962.foromitos2.headbar

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.foromitos2.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'head_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun HeadBar(
    modifier: Modifier = Modifier,
    texto: String = "",
    pulsarMensajes: () -> Unit = {},
    pulsarOpciones: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        MailStrokeIcon(
            pulsarMensajes = pulsarMensajes,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 151.0.dp,
                    y = -0.5.dp
                )
            )
        )
        Icon(
            pulsarOpciones = pulsarOpciones,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -150.0.dp,
                    y = -0.5.dp
                )
            )
        )
        Headline(
            texto = texto,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 51)
@Composable
private fun HeadBarPreview() {
    MaterialTheme {
        RelayContainer {
            HeadBar(
                pulsarMensajes = {},
                pulsarOpciones = {},
                texto = "Culturas",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun MailStrokeIcon(
    pulsarMensajes: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.head_bar_mail_stroke_icon),
        modifier = modifier.tappable(onTap = pulsarMensajes).requiredWidth(20.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun Icon(
    pulsarOpciones: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.head_bar_icon),
        modifier = modifier.tappable(onTap = pulsarOpciones).requiredWidth(18.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Headline(
    texto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = texto,
        fontSize = 22.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.272727279663086.em,
        letterSpacing = -0.88.sp,
        maxLines = -1,
        modifier = modifier.requiredWidth(244.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 68,
            green = 34,
            blue = 0
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
