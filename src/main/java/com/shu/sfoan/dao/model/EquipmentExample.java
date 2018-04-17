package com.shu.sfoan.dao.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquIdIsNull() {
            addCriterion("equ_id is null");
            return (Criteria) this;
        }

        public Criteria andEquIdIsNotNull() {
            addCriterion("equ_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquIdEqualTo(String value) {
            addCriterion("equ_id =", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdNotEqualTo(String value) {
            addCriterion("equ_id <>", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdGreaterThan(String value) {
            addCriterion("equ_id >", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdGreaterThanOrEqualTo(String value) {
            addCriterion("equ_id >=", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdLessThan(String value) {
            addCriterion("equ_id <", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdLessThanOrEqualTo(String value) {
            addCriterion("equ_id <=", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdLike(String value) {
            addCriterion("equ_id like", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdNotLike(String value) {
            addCriterion("equ_id not like", value, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdIn(List<String> values) {
            addCriterion("equ_id in", values, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdNotIn(List<String> values) {
            addCriterion("equ_id not in", values, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdBetween(String value1, String value2) {
            addCriterion("equ_id between", value1, value2, "equId");
            return (Criteria) this;
        }

        public Criteria andEquIdNotBetween(String value1, String value2) {
            addCriterion("equ_id not between", value1, value2, "equId");
            return (Criteria) this;
        }

        public Criteria andEquNameIsNull() {
            addCriterion("equ_name is null");
            return (Criteria) this;
        }

        public Criteria andEquNameIsNotNull() {
            addCriterion("equ_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquNameEqualTo(String value) {
            addCriterion("equ_name =", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotEqualTo(String value) {
            addCriterion("equ_name <>", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameGreaterThan(String value) {
            addCriterion("equ_name >", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameGreaterThanOrEqualTo(String value) {
            addCriterion("equ_name >=", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLessThan(String value) {
            addCriterion("equ_name <", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLessThanOrEqualTo(String value) {
            addCriterion("equ_name <=", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameLike(String value) {
            addCriterion("equ_name like", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotLike(String value) {
            addCriterion("equ_name not like", value, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameIn(List<String> values) {
            addCriterion("equ_name in", values, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotIn(List<String> values) {
            addCriterion("equ_name not in", values, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameBetween(String value1, String value2) {
            addCriterion("equ_name between", value1, value2, "equName");
            return (Criteria) this;
        }

        public Criteria andEquNameNotBetween(String value1, String value2) {
            addCriterion("equ_name not between", value1, value2, "equName");
            return (Criteria) this;
        }

        public Criteria andEquTypeIsNull() {
            addCriterion("equ_type is null");
            return (Criteria) this;
        }

        public Criteria andEquTypeIsNotNull() {
            addCriterion("equ_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquTypeEqualTo(Integer value) {
            addCriterion("equ_type =", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotEqualTo(Integer value) {
            addCriterion("equ_type <>", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeGreaterThan(Integer value) {
            addCriterion("equ_type >", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("equ_type >=", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeLessThan(Integer value) {
            addCriterion("equ_type <", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeLessThanOrEqualTo(Integer value) {
            addCriterion("equ_type <=", value, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeIn(List<Integer> values) {
            addCriterion("equ_type in", values, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotIn(List<Integer> values) {
            addCriterion("equ_type not in", values, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeBetween(Integer value1, Integer value2) {
            addCriterion("equ_type between", value1, value2, "equType");
            return (Criteria) this;
        }

        public Criteria andEquTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("equ_type not between", value1, value2, "equType");
            return (Criteria) this;
        }

        public Criteria andEquPriceIsNull() {
            addCriterion("equ_price is null");
            return (Criteria) this;
        }

        public Criteria andEquPriceIsNotNull() {
            addCriterion("equ_price is not null");
            return (Criteria) this;
        }

        public Criteria andEquPriceEqualTo(String value) {
            addCriterion("equ_price =", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceNotEqualTo(String value) {
            addCriterion("equ_price <>", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceGreaterThan(String value) {
            addCriterion("equ_price >", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceGreaterThanOrEqualTo(String value) {
            addCriterion("equ_price >=", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceLessThan(String value) {
            addCriterion("equ_price <", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceLessThanOrEqualTo(String value) {
            addCriterion("equ_price <=", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceLike(String value) {
            addCriterion("equ_price like", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceNotLike(String value) {
            addCriterion("equ_price not like", value, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceIn(List<String> values) {
            addCriterion("equ_price in", values, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceNotIn(List<String> values) {
            addCriterion("equ_price not in", values, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceBetween(String value1, String value2) {
            addCriterion("equ_price between", value1, value2, "equPrice");
            return (Criteria) this;
        }

        public Criteria andEquPriceNotBetween(String value1, String value2) {
            addCriterion("equ_price not between", value1, value2, "equPrice");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Integer value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Integer value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Integer value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Integer value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Integer> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Integer> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Integer value1, Integer value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andEquKeeperIsNull() {
            addCriterion("equ_keeper is null");
            return (Criteria) this;
        }

        public Criteria andEquKeeperIsNotNull() {
            addCriterion("equ_keeper is not null");
            return (Criteria) this;
        }

        public Criteria andEquKeeperEqualTo(Integer value) {
            addCriterion("equ_keeper =", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperNotEqualTo(Integer value) {
            addCriterion("equ_keeper <>", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperGreaterThan(Integer value) {
            addCriterion("equ_keeper >", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperGreaterThanOrEqualTo(Integer value) {
            addCriterion("equ_keeper >=", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperLessThan(Integer value) {
            addCriterion("equ_keeper <", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperLessThanOrEqualTo(Integer value) {
            addCriterion("equ_keeper <=", value, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperIn(List<Integer> values) {
            addCriterion("equ_keeper in", values, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperNotIn(List<Integer> values) {
            addCriterion("equ_keeper not in", values, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperBetween(Integer value1, Integer value2) {
            addCriterion("equ_keeper between", value1, value2, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andEquKeeperNotBetween(Integer value1, Integer value2) {
            addCriterion("equ_keeper not between", value1, value2, "equKeeper");
            return (Criteria) this;
        }

        public Criteria andBuyingDateIsNull() {
            addCriterion("buying_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyingDateIsNotNull() {
            addCriterion("buying_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingDateEqualTo(String value) {
            addCriterion("buying_date =", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateNotEqualTo(String value) {
            addCriterion("buying_date <>", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateGreaterThan(String value) {
            addCriterion("buying_date >", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateGreaterThanOrEqualTo(String value) {
            addCriterion("buying_date >=", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateLessThan(String value) {
            addCriterion("buying_date <", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateLessThanOrEqualTo(String value) {
            addCriterion("buying_date <=", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateLike(String value) {
            addCriterion("buying_date like", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateNotLike(String value) {
            addCriterion("buying_date not like", value, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateIn(List<String> values) {
            addCriterion("buying_date in", values, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateNotIn(List<String> values) {
            addCriterion("buying_date not in", values, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateBetween(String value1, String value2) {
            addCriterion("buying_date between", value1, value2, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andBuyingDateNotBetween(String value1, String value2) {
            addCriterion("buying_date not between", value1, value2, "buyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateIsNull() {
            addCriterion("applying_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyingDateIsNotNull() {
            addCriterion("applying_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingDateEqualTo(String value) {
            addCriterion("applying_date =", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateNotEqualTo(String value) {
            addCriterion("applying_date <>", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateGreaterThan(String value) {
            addCriterion("applying_date >", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateGreaterThanOrEqualTo(String value) {
            addCriterion("applying_date >=", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateLessThan(String value) {
            addCriterion("applying_date <", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateLessThanOrEqualTo(String value) {
            addCriterion("applying_date <=", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateLike(String value) {
            addCriterion("applying_date like", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateNotLike(String value) {
            addCriterion("applying_date not like", value, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateIn(List<String> values) {
            addCriterion("applying_date in", values, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateNotIn(List<String> values) {
            addCriterion("applying_date not in", values, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateBetween(String value1, String value2) {
            addCriterion("applying_date between", value1, value2, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andApplyingDateNotBetween(String value1, String value2) {
            addCriterion("applying_date not between", value1, value2, "applyingDate");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(Integer value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(Integer value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(Integer value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(Integer value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<Integer> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<Integer> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(Integer value1, Integer value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andEquStatusIsNull() {
            addCriterion("equ_status is null");
            return (Criteria) this;
        }

        public Criteria andEquStatusIsNotNull() {
            addCriterion("equ_status is not null");
            return (Criteria) this;
        }

        public Criteria andEquStatusEqualTo(Integer value) {
            addCriterion("equ_status =", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusNotEqualTo(Integer value) {
            addCriterion("equ_status <>", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusGreaterThan(Integer value) {
            addCriterion("equ_status >", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("equ_status >=", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusLessThan(Integer value) {
            addCriterion("equ_status <", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusLessThanOrEqualTo(Integer value) {
            addCriterion("equ_status <=", value, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusIn(List<Integer> values) {
            addCriterion("equ_status in", values, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusNotIn(List<Integer> values) {
            addCriterion("equ_status not in", values, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusBetween(Integer value1, Integer value2) {
            addCriterion("equ_status between", value1, value2, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("equ_status not between", value1, value2, "equStatus");
            return (Criteria) this;
        }

        public Criteria andEquLocationIsNull() {
            addCriterion("equ_location is null");
            return (Criteria) this;
        }

        public Criteria andEquLocationIsNotNull() {
            addCriterion("equ_location is not null");
            return (Criteria) this;
        }

        public Criteria andEquLocationEqualTo(String value) {
            addCriterion("equ_location =", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationNotEqualTo(String value) {
            addCriterion("equ_location <>", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationGreaterThan(String value) {
            addCriterion("equ_location >", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationGreaterThanOrEqualTo(String value) {
            addCriterion("equ_location >=", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationLessThan(String value) {
            addCriterion("equ_location <", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationLessThanOrEqualTo(String value) {
            addCriterion("equ_location <=", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationLike(String value) {
            addCriterion("equ_location like", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationNotLike(String value) {
            addCriterion("equ_location not like", value, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationIn(List<String> values) {
            addCriterion("equ_location in", values, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationNotIn(List<String> values) {
            addCriterion("equ_location not in", values, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationBetween(String value1, String value2) {
            addCriterion("equ_location between", value1, value2, "equLocation");
            return (Criteria) this;
        }

        public Criteria andEquLocationNotBetween(String value1, String value2) {
            addCriterion("equ_location not between", value1, value2, "equLocation");
            return (Criteria) this;
        }

        public Criteria andStatementIsNull() {
            addCriterion("statement is null");
            return (Criteria) this;
        }

        public Criteria andStatementIsNotNull() {
            addCriterion("statement is not null");
            return (Criteria) this;
        }

        public Criteria andStatementEqualTo(String value) {
            addCriterion("statement =", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotEqualTo(String value) {
            addCriterion("statement <>", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThan(String value) {
            addCriterion("statement >", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThanOrEqualTo(String value) {
            addCriterion("statement >=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThan(String value) {
            addCriterion("statement <", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThanOrEqualTo(String value) {
            addCriterion("statement <=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLike(String value) {
            addCriterion("statement like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotLike(String value) {
            addCriterion("statement not like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementIn(List<String> values) {
            addCriterion("statement in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotIn(List<String> values) {
            addCriterion("statement not in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementBetween(String value1, String value2) {
            addCriterion("statement between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotBetween(String value1, String value2) {
            addCriterion("statement not between", value1, value2, "statement");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}