package kr.ac.burgerking.kiosk;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BurgerkingMember {

    @Id
    @GeneratedValue// 기본키 값이 자동으로 생성
    private Long id;
    private String name;
}
