package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRspository extends JpaRepository<Member, Long> , MemberRepository{


    // select m from Member M where =?    @Override
    Optional<Member> findByName(String name);
}
