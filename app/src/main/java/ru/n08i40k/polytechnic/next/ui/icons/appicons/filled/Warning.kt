@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

package ru.n08i40k.polytechnic.next.ui.icons.appicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ru.n08i40k.polytechnic.next.ui.icons.appicons.FilledGroup

val FilledGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(
            name = "Warning", defaultWidth = 24.dp, defaultHeight = 24.dp,
            viewportWidth = 512.0f, viewportHeight = 512.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(278.313f, 48.296f)
                curveTo(284.928f, 52.075f, 290.41f, 57.557f, 294.189f, 64.172f)
                lineTo(476.667f, 383.508f)
                curveTo(488.358f, 403.967f, 481.25f, 430.03f, 460.791f, 441.722f)
                curveTo(454.344f, 445.405f, 447.047f, 447.343f, 439.622f, 447.343f)
                lineTo(74.667f, 447.343f)
                curveTo(51.103f, 447.343f, 32.0f, 428.241f, 32.0f, 404.677f)
                curveTo(32.0f, 397.251f, 33.938f, 389.955f, 37.622f, 383.508f)
                lineTo(220.099f, 64.172f)
                curveTo(231.79f, 43.713f, 257.854f, 36.605f, 278.313f, 48.296f)
                close()
                moveTo(256.0f, 314.667f)
                curveTo(240.762f, 314.667f, 229.333f, 325.931f, 229.333f, 340.949f)
                curveTo(229.333f, 356.651f, 240.416f, 367.915f, 256.0f, 367.915f)
                curveTo(271.238f, 367.915f, 282.667f, 356.651f, 282.667f, 341.291f)
                curveTo(282.667f, 325.931f, 271.238f, 314.667f, 256.0f, 314.667f)
                close()
                moveTo(277.333f, 149.333f)
                lineTo(234.667f, 149.333f)
                lineTo(234.667f, 277.333f)
                lineTo(277.333f, 277.333f)
                lineTo(277.333f, 149.333f)
                close()
            }
        }
            .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
