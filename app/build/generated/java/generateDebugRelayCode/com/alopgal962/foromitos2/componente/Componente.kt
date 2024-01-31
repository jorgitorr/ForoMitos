package com.alopgal962.foromitos2.componente

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.foromitos2.R
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'componente'.
 * Generated code; do not edit directly
 */
@Composable
fun Componente(
    modifier: Modifier = Modifier,
    zeusImage: Painter = EmptyPainter(),
    textoTextContent: String = "",
    pulsar: () -> Unit = {}
) {
    TopLevel(
        pulsar = pulsar,
        modifier = modifier
    ) {
        Imagen(
            zeusImage = zeusImage,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 9.00000473856835.dp,
                    y = 104.00000515580086.dp
                )
            )
        )
        Opacidad()
        Texto(
            textoTextContent = textoTextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 335, heightDp = 131)
@Composable
private fun ComponentePreview() {
    MaterialTheme {
        RelayContainer {
            Componente(
                pulsar = {},
                zeusImage = painterResource(R.drawable.componente_imagen),
                textoTextContent = "GRIEGA",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Imagen(
    zeusImage: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = zeusImage,
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 0.019782341029446364f).requiredWidth(353.0000305175781.dp).requiredHeight(339.0000305175781.dp)
    )
}

@Composable
fun Opacidad(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.componente_opacidad),
        modifier = modifier.requiredWidth(676.0.dp).requiredHeight(272.0.dp)
    )
}

@Composable
fun Texto(
    textoTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textoTextContent,
        fontSize = 40.0.sp,
        fontFamily = shrikhand,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 0.7.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(665.0.dp).requiredHeight(261.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    pulsar: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 17.0,
        content = content,
        modifier = modifier.tappable(onTap = pulsar).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
