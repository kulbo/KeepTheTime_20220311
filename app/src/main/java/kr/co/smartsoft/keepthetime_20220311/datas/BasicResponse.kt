package kr.co.smartsoft.keepthetime_20220311.datas

// 서버가 주는 응답의 제일 기본형태인 code, message, data를 파싱해주는 클래스

class BasicResponse(
    val code: Int,
    val message: String,
    val data: DataResponse
) {

}