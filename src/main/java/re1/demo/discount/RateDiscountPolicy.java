package re1.demo.discount;

import re1.demo.Member;
import re1.demo.enums.Grade;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade()== Grade.VIP){
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
