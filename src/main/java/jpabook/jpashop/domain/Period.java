package jpabook.jpashop.domain;

import javax.persistence.Embeddable;
import java.sql.Date;

@Embeddable
public class Period {


    private Date startDate;

    private Date endDate;




}
