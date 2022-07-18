package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    // VIP의 할인률은 무조건 1000원 할인이라서
    private int discountFixAomunt = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if( member.getGrade() == Grade.VIP){
            return discountFixAomunt;
        }else {
            return 0;
        }
    }
}
