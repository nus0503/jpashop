package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private String member; // 회원 이름
    private OrderStatus orderStatus; // 주문 상태[ORDER, CANCEL]
}
