package re1.demo.discount;

import re1.demo.Member;

public interface DiscountPolicy {

    public int discount(Member member, int price);
}
