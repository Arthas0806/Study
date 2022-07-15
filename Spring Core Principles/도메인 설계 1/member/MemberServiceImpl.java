package hello.core.member;

public class MemberServiceImpl implements MemberService{

    /**
     * MemberService 인터페이스 implements
     * 구현체가 하나만 있을때는 뒤에 impl이라고 관례상 많이 쓴다.
     */

    // 가입을 하고 회원을 찾기 위해서 memberRepository 인터페이스를 가지고 와야한다.
    // 인터페이스만 가지고 있으면 nullPointException이 발생해서 구현 객체를 설정해줘야한다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // join을 실행시키면 다형성에 의해서 MemberRepository 인터페이스가 아니라 MemoryMemeberRepository가 호출된다.
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
