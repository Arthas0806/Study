package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     * 할인된 금액을 리턴을 해주는 곳
     */

    int discount(Member member, int price);
}
