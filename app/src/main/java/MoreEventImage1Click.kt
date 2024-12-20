import android.app.Activity
import android.content.Intent
import android.media.metrics.Event
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamb.burgerking_copy.MoreActivity
import com.dreamb.burgerking_copy.R

@Preview(showBackground = true)
@Composable
fun EventImage1Click() {
    val scrollState = rememberScrollState()
    val background_color = 0xFFf4ebdc
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .background(color = Color(background_color))
            .padding(WindowInsets.systemBars.asPaddingValues())
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(scrollState)
    ) {
        TopNavBar()
        EventImage()
        ContentSpacer()
        ContentTextBold("세트메뉴가 하루종일 5500원 올데이킹")
        ContentText(
            "※ 본 제품은 실제 이미지와 다를 수 있습니다.\n" +
                    "※ 콜라와 프렌치프라이는 (R) 사이즈로 제공됩니다.\n" +
                    "※ 행사시간 : 매장 운영시간에 따라 상이합니다.\n" +
                    "※ 매장별로 조기종료될 수 있습니다.\n" +
                    "※ 다른 할인 및 쿠폰과 중복 혜택 불가.\n" +
                    "※ 딜리버리 주문 불가 및 예약 주문 불가.\n" +
                    "※ 일부 매장은 행사에서 제외될 수 있습니다.\n" +
                    "※ 올데이킹 제외매장 : 군산수송점 대명비발디점 대전관평점 대전현대아울렛점 보령동대점 오션월드점 인천공항1점 인천공항교통센터1점 인천공항T2교통센터점 지산리조트점"
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
    }
}

