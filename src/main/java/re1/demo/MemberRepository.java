package re1.demo;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
