package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    // 저장할 MAP 선언
    private static Map<Long, Member> store = new HashMap<>();

    // 저장
    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // put(key, value);
    }

    // 아이디 검색
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);     // get(ksy);
    }
}
