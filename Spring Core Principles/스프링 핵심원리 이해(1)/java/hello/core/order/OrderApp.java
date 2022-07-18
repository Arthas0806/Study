package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        // 멤버 조회 기능
        MemberService memberService = new MemberServiceImpl();
        //주문 기능
        OrderService orderService = new OrderServiceImpl();

        // 테스트용
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        // 회원가입처럼 메모리에 넣어놓기
        memberService.join(member);

        // 주문내역
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);

    }
}
