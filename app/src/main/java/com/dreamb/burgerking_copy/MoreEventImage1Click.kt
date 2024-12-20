package com.dreamb.burgerking_copy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

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
        EventImage(R.drawable.more_event_image_1)
        ContentSpacer()
        ContentTextBold("세트메뉴가 하루종일 5500원 올데이킹")
        ContentSpacer()
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
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage2Click() {
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
        EventImage(R.drawable.more_event_image_2)
        ContentSpacer()
        ContentTextBold("매일 1명 456만의 골드바 당첨! 버거킹 456게임")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 456 크로켓\n" +
                    "\n" +
                    "2. 판매기간 : 24년 12월 19일 (목) ~ \n" +
                    "\n" +
                    "3. 유의 사항\n" +
                    "※본 이벤트는 2024년 12월 19일 09시 00분부터 2025년 1월 8일 23시 59분까지 진행됩니다.\n" +
                    "\n" +
                    "※본 이벤트는 회사의 사정에 따라 사전 예고 없이 변경 및 종료될 수 있습니다.\n" +
                    "\n" +
                    "※본 이벤트는 매장 내 키오스크 및 POS, 드라이브스루 주문방식을 통해서만 참여 가능하며, 그 외 주문방식(딜리버리, 킹오더 포함)은 참여 불가합니다.\n" +
                    "\n" +
                    "※ 본 이벤트는 모든 버거의 세트메뉴 주문 시에만 참여 가능하며 단품, 팩 구성은 참여 불가합니다.\n" +
                    "\n" +
                    "※본 이벤트는 1인 당 1일 5회까지 참여 가능합니다. (익일 0시 이후 재참여 가능)\n" +
                    "\n" +
                    "※본 이벤트는 국내 거주자 및 내국인 대상으로 한정됩니다.\n" +
                    "\n" +
                    "※ 456크로켓 구매 수량과 관계 없이 1회 구매당 제공되는 참가번호는 최대 5개로 제한됩니다.\n" +
                    "\n" +
                    "※잘못된 코드를 5회 이상 입력할 경우 당일 이벤트 응모 및 당첨 확인이 제한됩니다.(익일 0시 이후 재 참여 가능)\n" +
                    "\n" +
                    "※회사의 사정에 따라 사전 고지 없이 이벤트 일정, 내용 및 경품이 변경되거나 당첨자 발표일과 배송 일정이 지연될 수 있습니다.\n" +
                    "\n" +
                    "※ 이벤트에 참여한 전화번호는 이벤트응모 및 당첨횟수 제한, 당첨안내문자(LMS) 발송 등 이벤트의 원활한 진행을 위하여 이벤트 종료 시까지 수집 및 이용되며, 이벤트 종료 후 지체 없이 파기됩니다.\n" +
                    "\n" +
                    "※경품 발송에 필요한 개인정보는 당첨 결과 통지 후 당첨자에 한하여 수집합니다. 이를 기한 내 제출하지 않을 경우 당첨은 별도 고지 없이 자동 취소됩니다. (제출기한: 제출요청 LMS 발송 후 7일 이내)\n" +
                    "\n" +
                    "※ 경품수령정보 오기재로 인한 발송 오류 시 회사는 그에 대한 책임을 부담하지 아니하며 그에 따른 경품 재발송은 불가합니다.\n" +
                    "\n" +
                    "※1등 경품은 456만 원 상당의 골드바로 지급됩니다.\n" +
                    "\n" +
                    "※골드바: 2024년 11월 5일 시세 기준(8.667돈/32.5g/보증서 제공)\n" +
                    "\n" +
                    "※ 금 시세 변동으로 인해 경품 수령 시점에서 경품 가치에 차이가 발생할 수 있습니다.\n" +
                    "\n" +
                    "※골드바 경품은 19세 미만인 자는 수령할 수 없으며, 부정한 방법으로 응모 시 당첨은 예고 없이 취소됩니다.\n" +
                    "\n" +
                    "※ 비정상적인 방법으로 참여 시 당첨이 제한 또는 취소될 수 있습니다. (타인 신분증 도용, 거짓 명의생성 등)\n" +
                    "\n" +
                    "※5만 원 초과 경품에 대해 발생하는 제세공과금 22%는 회사가 부담합니다. 제세공과금 처리를 위해 당첨자에게 신분증 사본을 요구할 수 있으며, 비동의 시 당첨은 취소됩니다.\n" +
                    "\n" +
                    "※본 이벤트는 (주)이노레드와 (주)젤라블루코리아에 업무 위탁을 통하여 진행되는 이벤트입니다\n" +
                    "\n" +
                    "※이벤트 관련 문의: burgerking456@innored.co.kr\n" +
                    "\n" +
                    "※ 제외 매장: 대명비발디점 오션월드점 인천공항교통센터1점 인천공항1점 인천공항T2교통센터점 경남대점 경남삼천포점 광양중동점 김포현대아울렛점 대전문지점 대전현대아울렛점 서산호수공원점 지산리조트점 평택고덕삼성점"
        )
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage3Click() {
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
        EventImage(R.drawable.more_event_image_3)
        ContentSpacer()
        ContentTextBold("24년 12월 2FOR6000 프로모션")
        ContentSpacer()
        ContentText(
            "1. 행사명 : 2FOR6000\n" +
                    "\n" +
                    "2. 제품 : 와퍼주니어, 불고기와퍼주니어, 롱치킨버거\n" +
                    "\n" +
                    "3. 행사 기간 : 24년 12월 16일(월) ~ 25년 1월 5일(일), 21일간\n" +
                    "\n" +
                    "4. 행사 시간 : 매장 운영시간에 따라 상이 합니다.\n" +
                    "\n" +
                    "5. 유의 사항\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다.\n" +
                    "*1인 5개까지만 판매\n" +
                    "*매장별로 조기 종료될 수 있습니다.\n" +
                    "*다른 할인 및 쿠폰과 중복 혜택 불가\n" +
                    "*해당 프로모션은 제휴 포인트 적립 불가\n" +
                    "*딜리버리 주문 불가 및 예약 주문 불가\n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다.\n" +
                    "*단체 주문에서는 제외됩니다.\n" +
                    "\n" +
                    "6. 제외매장\n" +
                    "대명비발디점, 오션월드점, 인천공항1점, 인천공항교통센터1점, 인천공항T2교통센터점, 서울역점, 거제고현점, 거제수월점, 거제옥포점, 경기양평점, 경남대점, 경남삼천포점, 경주보문점, 광양LF스퀘어점, 광양중동점, 광주월계점, 광주일곡점, 광주첨단2지구점, 광주하남점, 구미신평점, 구미인의점, 군산대점, 군산수송점, 김포현대아울렛, 나주빛가람점, 대구대점, 대구죽전네거리DT, 대구테크노폴리스점, 대전관평점, 대전도안점, 대전현대아울렛점, 목포하당점, 보령동대점, 부산대신FS점, 부산안락DT점, 서산호수공원점, 세종반곡점, 순천법원점, 순천신대점, 안산고잔점, 여수웅천점, 오산궐동점, 원광대점, 원주기업도시점, 원주무실점, 의정부HP점, 전북대점, 정읍중앙점, 제천CGV점, 지산리조트점, 진주경상대점, 천안신방DT점, 청주동남점, 청주율량점, 충남대병원DT점, 충남도청점, 충북진천점, 평택고덕삼성점, 한동대점, 해운대비치점, 해운대우동점, 호남대점"
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage4Click() {
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
        EventImage(R.drawable.more_event_image_4)
        ContentSpacer()
        ContentTextBold("24년 12월 풀드 비프 와퍼 출시")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 풀드 비프 와퍼, 스파이시 풀드 비프 와퍼\n" +
                    "\n" +
                    "2. 판매기간 : 24년 12월 5일 (목) ~ 25년 3월 12일 (수)\n" +
                    "\n" +
                    "3. 유의 사항\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다. \n" +
                    "*본 제품은 밀, 대두, 우유, 토마토, 쇠고기, 난류를 포함하고 있습니다. \n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다.\n" +
                    "\n" +
                    "4. 제외매장 : 광주봉선점, 대명비발디점, 대전현대아울렛점, 오션월드점, 지산리조트점\n" +
                    "\n" +
                    "※ 버거킹 456게임 제외 매장: 대명비발디점 오션월드점 인천공항교통센터1점 인천공항1점 인천공항T2교통센터점 경남대점 경남삼천포점 광양중동점 김포현대아울렛점 대전문지점 대전현대아울렛점 서산호수공원점 지산리조트점 평택고덕삼성점"
        )
        ContentSpacer()
        ContentAlarmButton("이벤트 보러가기")
        ContentSpacer()
        ContentText("*모바일 앱에서만 이동 가능합니다.")
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage5Click() {
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
        EventImage(R.drawable.more_event_image_5)
        ContentSpacer()
        ContentTextBold("맛의 밸런스가 다르다! 오리지널스 화이트 페타")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 오리지널스 화이트 페타 싱글, 오리지널스 화이트 페타 더블 \n" +
                    "\n" +
                    "2. 판매기간 : 24년 11월 4일 (월) ~ 25년 1월 12일 (일) \n" +
                    "\n" +
                    "3. 유의 사항\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다. \n" +
                    "*본 제품은 밀, 대두, 우유, 돼지고기, 토마토, 쇠고기, 난류를 포함하고 있습니다. \n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다. \n" +
                    "\n" +
                    "4. 제외매장 : 경남대점, 경남삼천포점(S), 김포현대아울렛(S) ,대명비발디점, 대전현대아울렛점, 목포하당점, 오션월드점, 지산리조트점"
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage6Click() {
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
        EventImage(R.drawable.more_event_image_6)
        ContentSpacer()
        ContentTextBold("두툼버거 출시")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 두툼버거, 두툼버거 더블\n" +
                    "\n" +
                    "2. 판매기간 : 24년 8월 29일(목) ~ 25년 1월 15일(수)\n" +
                    "\n" +
                    "3. 유의 사항 \n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다. \n" +
                    "*본 제품은 밀, 대두, 우유, 돼지고기, 토마토, 닭고기, 쇠고기, 난류, 오징어를 포함하고 있습니다. \n" +
                    "*일부 매장은 판매에서 제외될 수 있습니다.\n" +
                    "\n" +
                    "4. 제외매장 : 김포현대아울렛 대명비발디 대전관평점 대전현대아울렛점 오션월드점 지산리조트점"
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage7Click() {
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
        EventImage(R.drawable.more_event_image_7)
        ContentSpacer()
        ContentTextBold("알림 키고 버거킹 소식 받으세요.")
        ContentSpacer()
        ContentAlarmButton("알림 켜기")
        ContentSpacer()
        ContentText("*모바일 앱에서만 이동 가능합니다.")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage8Click() {
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
        EventImage(R.drawable.more_event_image_8)
        ContentSpacer()
        ContentTextBold("멤버십 적립하고 할인혜택 놓치지 마세요!")
        ContentSpacer()
        ContentAlarmButton("내 등급 확인하기")
        ContentSpacer()
        ContentText("*모바일 앱에서만 이동 가능합니다.")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage9Click() {
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
        EventImage(R.drawable.more_event_image_9)
        ContentSpacer()
        ContentTextBold("리얼 어니언링 출시")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 리얼 어니언링\n" +
                    "\n" +
                    "2. 판매기간 : 24년 4월 15일(월) ~ \n" +
                    "\n" +
                    "3. 유의 사항\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다.\n" +
                    "*본 제품은 밀, 대두를 포함하고 있습니다. \n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다."
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage10Click() {
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
        EventImage(R.drawable.more_event_image_10)
        ContentSpacer()
        ContentTextBold("치킨킹, 치킨킹BLT")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 치킨킹, 치킨킹BLT\n" +
                    "\n" +
                    "2. 판매기간 : 23년 1월 9일(월) ~ \n" +
                    "\n" +
                    "3. 내용\n" +
                    "\n" +
                    "– 스파이시한 통닭다리살과 고소한 브리오쉬번이 만나 더 풍부해진 프리미엄 치킨버거, 치킨킹!\n" +
                    "\n" +
                    "– 스파이시한 통닭다리살 프리미엄 치킨버거에 베이컨, 양상추, 토마토를 더했다. 치킨킹 BLT!\n" +
                    "\n" +
                    "4. 유의 사항\n" +
                    "\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다.\n" +
                    "*본 제품은 밀, 대두, 우유, 돼지고기, 토마토, 닭고기, 쇠고기, 난를 포함하고 있습니다.\n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다.\n" +
                    "\n" +
                    "5. 제외매장 : 대명비발디점, 삼성라이온즈파크점, 오션월드점, 지산리조트점"
        )
        ContentSpacer()
        ContentButton("킹오더 주문하러 가기")
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage11Click() {
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
        EventImage(R.drawable.more_event_image_11)
        ContentSpacer()
        ContentTextBold("오믈렛킹모닝")
        ContentSpacer()
        ContentText(
            "1. 제품명 : 오믈렛킹모닝 / BLT 오믈렛킹모닝\n" +
                    "\n" +
                    "2. 판매기간 : 22년 11월 21일(월) ~ \n" +
                    "\n" +
                    "3. 판매시간 : 오전 04:00 ~ 11:00\n" +
                    "\n" +
                    "4. 내용\n" +
                    "\n" +
                    "- 더블 오믈렛과 소프트번의 부드러운 조합 \n" +
                    "\n" +
                    "5. 유의 사항\n" +
                    "\n" +
                    "*본 제품은 실제 이미지와 다를 수 있습니다.\n" +
                    "\n" +
                    "*본 제품은 밀, 대두, 우유, 돼지고기, 토마토, 난류를 포함하고 있습니다.\n" +
                    "\n" +
                    "*일부 매장은 행사에서 제외될 수 있습니다.\n" +
                    "\n" +
                    "6. 참여매장\n" +
                    "개봉점, 건대입구역점, 공덕역점, 공릉역점, 구리SK점, 길동사거리점, 대전둔산1점, 미아역점, 반포고속터미널점, 부평시장역점, 분당상록점, 불광점, 사당역점, 상록수역점, 서울역점, 시흥정왕점, 신논현역점, 신당역점, 신림역점, 연세로점, 의정부DT점, 인천공항교통센터1점, 인천주안점, 인천청라점, 장안SK점, 전남대후문점, 종로구청점, 청담점, 평촌금성GS점, 하남미사점"
        )
        ContentSpacer()
        ContentSpacer()
    }
}

@Composable
fun EventImage12Click() {
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
        EventImage(R.drawable.more_event_image_12)
        ContentSpacer()
        ContentTextBold("24시간 딜리버리")
        ContentSpacer()
        ContentText(
            "문 앞까지 배달 24시간 딜리버리 \n" +
                    "\n" +
                    "집에서 즐기는 즐거움! \n" +
                    "\n" +
                    "늦은 밤 버거가 생각날 때 망설이지 마세요~ \n" +
                    "\n" +
                    "24시 딜리버리로 언제든지 편안하게 버거를 즐겨보세요! \n" +
                    "\n" +
                    "24시 딜리버리 운영매장 : 가재울뉴타운점, 개봉점, 건대입구역점, 공릉역점, 구리SK점, 길동사거리점, 남양주별내오일뱅크점, 대전둔산1점, 대전유성온천역점, 문정점, 미아역점, 부평시장역점, 분당상록점, 불광점, 사당역점, 상록수역점, 석촌점, 성남신흥점, 성신여대입구역점, 수원영통점, 시흥정왕점, 신논현역점, 신당역점, 신림역점, 신정네거리역점, 연세로점, 영등포KT점, 의정부DT점, 인천주안점, 인천청라점, 장안SK점, 전남대후문점, 청담점, 파주야당역점, 평촌금성GS점, 하남미사점"
        )
        ContentSpacer()
        ContentSpacer()
    }
}