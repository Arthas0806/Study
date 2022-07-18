package hello.core.order;


/**
 *  1.주문생성시에 회원id, 상품명, 상품가격등을 보내고, 주문결과를 반환 받는다.
 */

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
