/*
    파일명        : MyCouponVO
    최초 작성자    : 박제형
    최초 작성날짜   : 2023.12.01
*/

package kr.co.Dal.my.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MyCouponVO {

    /* coupon VO */

    /* cp_user_tb */
    private int cp_id; // 쿠폰id
    private int user_id; // 회원id
    private String edate; // 사용시작일
    private String bdate; // 사용종료일
    private String use_stat; // 사용상태
    private String cp_user_rdat; // 적립일

    /* cp_tb */
    private String cp_name; // 쿠폰이름
    private String cp_code; // 쿠폰코드
    private String cp_type; // 쿠폰유형
    private String cp_disct; // 할인금액비율
    private String cp_grade; // 허용등급
    private String cp_cnt; // 발급갯수
    private String cp_disct_type; // 쿠폰할인유형
    private String cp_min_price; // 최소주문금액
    private String cp_wdate; // 만료날짜
    private String cp_rdate; // 생성날짜


}
