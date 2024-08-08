package re1.demo.discount;

import re1.demo.Member;
import re1.demo.enums.Grade;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFix = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade()==Grade.VIP) {
            return price - 1000;
        } else {
            return 0;
        }
    }
}
