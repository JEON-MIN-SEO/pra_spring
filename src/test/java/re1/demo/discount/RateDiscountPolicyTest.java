package re1.demo.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import re1.demo.Member;
import re1.demo.enums.Grade;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    void vip() {
        //given
        Member member = new Member(1L, "VIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

}