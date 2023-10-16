package jpabook.jpashop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    public abstract class Item extends BaseEntity { //Item 객체 단독으로 테이블에 저장할일이 있을까? 없을까를 기준으로 추상화 여부 결정
        @Id @GeneratedValue
        @Column(name = "ITEM_ID")
        private Long id;

        private String name;

        private int price;

        private int stockQuantity;

        @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
        private List<Category> categories = new ArrayList<>();

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(int stockQuantity) {
            this.stockQuantity = stockQuantity;
        }

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }
    }