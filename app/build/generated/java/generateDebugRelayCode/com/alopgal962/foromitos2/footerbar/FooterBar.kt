package com.alopgal962.foromitos2.footerbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.foromitos2.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'footer_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun FooterBar(
    modifier: Modifier = Modifier,
    onHome: () -> Unit = {},
    onDiscover: () -> Unit = {},
    onMe: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Home(onHome = onHome) {
            HomeSolidIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.3790311813354492.dp,
                        y = -7.163954734802246.dp
                    )
                )
            )
            NombreHome(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 11.021187782287598.dp
                    )
                )
            )
        }
        Discover(onDiscover = onDiscover) {
            SearchIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.2810077667236328.dp,
                        y = -7.195194244384766.dp
                    )
                )
            )
            NombreDiscover(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 11.021187782287598.dp
                    )
                )
            )
        }
        Me(onMe = onMe) {
            AccountStrokeIcon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -7.268455505371094.dp
                    )
                )
            )
            NombreMe(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.3918428421020508.dp,
                        y = 11.021187782287598.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 358, heightDp = 44)
@Composable
private fun FooterBarPreview() {
    MaterialTheme {
        FooterBar(
            onHome = {},
            onDiscover = {},
            onMe = {}
        )
    }
}

@Composable
fun HomeSolidIcon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_bar_home_solid_icon),
        modifier = modifier.requiredWidth(23.2419376373291.dp).requiredHeight(18.087343215942383.dp)
    )
}

@Composable
fun NombreHome(modifier: Modifier = Modifier) {
    RelayText(
        content = "Home",
        fontSize = 10.0.sp,
        fontFamily = proximaNova,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2180000305175782.em,
        letterSpacing = 0.15000000596046448.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(10.372880935668945.dp)
    )
}

@Composable
fun Home(
    onHome: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onHome).requiredWidth(28.0.dp).requiredHeight(32.415252685546875.dp)
    )
}

@Composable
fun SearchIcon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_bar_search_icon),
        modifier = modifier.requiredWidth(20.43798828125.dp).requiredHeight(18.024864196777344.dp)
    )
}

@Composable
fun NombreDiscover(modifier: Modifier = Modifier) {
    RelayText(
        content = "Discover",
        fontSize = 10.0.sp,
        fontFamily = proximaNova,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2180000305175782.em,
        letterSpacing = 0.15000000596046448.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(40.000003814697266.dp).requiredHeight(10.372880935668945.dp)
    )
}

@Composable
fun Discover(
    onDiscover: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onDiscover).requiredWidth(40.000003814697266.dp).requiredHeight(32.415252685546875.dp).alpha(alpha = 0.800000011920929f)
    )
}

@Composable
fun AccountStrokeIcon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_bar_account_stroke_icon),
        modifier = modifier.requiredWidth(18.2163143157959.dp).requiredHeight(17.878341674804688.dp)
    )
}

@Composable
fun NombreMe(modifier: Modifier = Modifier) {
    RelayText(
        content = "Me",
        fontSize = 10.0.sp,
        fontFamily = proximaNova,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2180000305175782.em,
        letterSpacing = 0.15000000596046448.sp,
        maxLines = -1,
        modifier = modifier.requiredWidth(14.0.dp).requiredHeight(10.372880935668945.dp)
    )
}

@Composable
fun Me(
    onMe: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onMe).requiredWidth(18.2163143157959.dp).requiredHeight(32.415252685546875.dp).alpha(alpha = 0.800000011920929f)
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
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 29.0.dp,
            top = 6.0.dp,
            end = 29.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 107.0,
        content = content,
        modifier = modifier.relayDropShadow(
            color = Color(
                alpha = 255,
                red = 38,
                green = 38,
                blue = 38
            ),
            borderRadius = 0.0.dp,
            blur = 0.0.dp,
            offsetX = 0.0.dp,
            offsetY = -0.33000001311302185.dp,
            spread = 0.0.dp
        )
    )
}
