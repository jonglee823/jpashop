package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    private String INSERT_MEMBER;

    private LocalDateTime INSERT_DATE;

    private String LAST_MODIFIED_MEMBER;

    private LocalDateTime LAST_MODIFIED_DATE;

    public String getINSERT_MEMBER() {
        return INSERT_MEMBER;
    }

    public void setINSERT_MEMBER(String INSERT_MEMBER) {
        this.INSERT_MEMBER = INSERT_MEMBER;
    }

    public LocalDateTime getINSERT_DATE() {
        return INSERT_DATE;
    }

    public void setINSERT_DATE(LocalDateTime INSERT_DATE) {
        this.INSERT_DATE = INSERT_DATE;
    }

    public String getLAST_MODIFIED_MEMBER() {
        return LAST_MODIFIED_MEMBER;
    }

    public void setLAST_MODIFIED_MEMBER(String LAST_MODIFIED_MEMBER) {
        this.LAST_MODIFIED_MEMBER = LAST_MODIFIED_MEMBER;
    }

    public LocalDateTime getLAST_MODIFIED_DATE() {
        return LAST_MODIFIED_DATE;
    }

    public void setLAST_MODIFIED_DATE(LocalDateTime LAST_MODIFIED_DATE) {
        this.LAST_MODIFIED_DATE = LAST_MODIFIED_DATE;
    }
}
