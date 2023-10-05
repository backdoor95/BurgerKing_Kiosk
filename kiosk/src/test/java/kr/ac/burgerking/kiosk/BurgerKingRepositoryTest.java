package kr.ac.burgerking.kiosk;

import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BurgerKingRepositoryTest {
    @Autowired
    BurgerkingRepository repository;

    @Test
    @Transactional
    @Rollback(false)
    public void test() {
        BurgerkingMember member = new BurgerkingMember();
        member.setName("세종대");
        Long savedId = repository.save(member);
        BurgerkingMember foundMember = repository.find(savedId);

        Assertions.assertThat(foundMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(foundMember.getName()).isEqualTo(member.getName());
        Assertions.assertThat(foundMember).isEqualTo(member);
    }
}