package com.alopgal962.foromitos2.componentegrande

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
 * This composable was generated from the UI Package 'componente_grande'.
 * Generated code; do not edit directly
 */
@Composable
fun ComponenteGrande(
    modifier: Modifier = Modifier,
    imagen: Painter = EmptyPainter(),
    texto: String = "",
    pulsar: () -> Unit = {}
) {
    TopLevel(
        pulsar = pulsar,
        modifier = modifier
    ) {
        Image38(
            imagen = imagen,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 4.00000548362641.dp,
                    y = 49.50000473856835.dp
                )
            )
        )
        Rectangle8()
        CULTURASANTIGUAS(
            texto = texto,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 45.0.dp,
                    y = 80.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 320, heightDp = 254)
@Composable
private fun ComponenteGrandePreview() {
    MaterialTheme {
        RelayContainer {
            ComponenteGrande(
                pulsar = {},
                imagen = painterResource(R.drawable.componente_grande_image_38),
                texto = "CULTURAS \nANTIGUAS",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Image38(
    imagen: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagen,
        contentScale = ContentScale.Crop,
        modifier = modifier.graphicsLayer(rotationZ = 0.019782341029446364f).requiredWidth(328.0000305175781.dp).requiredHeight(353.0000305175781.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.componente_grande_rectangle_8),
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(272.0.dp)
    )
}

@Composable
fun CULTURASANTIGUAS(
    texto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = texto,
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
        modifier = modifier.requiredWidth(229.0.dp).requiredHeight(89.0.dp).wrapContentHeight(
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
