package com.alopgal962.foromitos2.componentetextosymenciones

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'componente_textos_ymenciones'.
 * Generated code; do not edit directly
 */
@Composable
fun ComponenteTextosYmenciones(
    modifier: Modifier = Modifier,
    onPulsarTexto: () -> Unit = {},
    onPulsarMenciones: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TextosFrame(
            onPulsarTexto = onPulsarTexto,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            Textos(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TextosColor(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
        }
        MencionesFrame(
            onPulsarMenciones = onPulsarMenciones,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            Menciones(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            MencionesColor(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
        }
    }
}

@Preview(widthDp = 360, heightDp = 51)
@Composable
private fun ComponenteTextosYmencionesPreview() {
    MaterialTheme {
        RelayContainer {
            ComponenteTextosYmenciones(
                onPulsarTexto = {},
                onPulsarMenciones = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Textos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Textos",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 226,
            green = 112,
            blue = 34
        ),
        height = 1.171875.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 19.0.dp,
                end = 0.0.dp,
                bottom = 5.810810089111328.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextosColor(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 45.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TextosFrame(
    onPulsarTexto: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 32.0.dp,
                top = 0.0.dp,
                end = 229.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = onPulsarTexto).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Menciones(modifier: Modifier = Modifier) {
    RelayText(
        content = "Menciones",
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.3125.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.0.dp,
                top = 16.0.dp,
                end = 6.0.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MencionesColor(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 45.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MencionesFrame(
    onPulsarMenciones: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 140.0.dp,
                top = 0.0.dp,
                end = 117.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = onPulsarMenciones).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
