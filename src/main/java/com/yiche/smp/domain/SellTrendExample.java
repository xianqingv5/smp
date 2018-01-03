package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class SellTrendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellTrendExample() {
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

        public Criteria andMonthdataIsNull() {
            addCriterion("monthdata is null");
            return (Criteria) this;
        }

        public Criteria andMonthdataIsNotNull() {
            addCriterion("monthdata is not null");
            return (Criteria) this;
        }

        public Criteria andMonthdataEqualTo(String value) {
            addCriterion("monthdata =", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataNotEqualTo(String value) {
            addCriterion("monthdata <>", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataGreaterThan(String value) {
            addCriterion("monthdata >", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataGreaterThanOrEqualTo(String value) {
            addCriterion("monthdata >=", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataLessThan(String value) {
            addCriterion("monthdata <", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataLessThanOrEqualTo(String value) {
            addCriterion("monthdata <=", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataLike(String value) {
            addCriterion("monthdata like", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataNotLike(String value) {
            addCriterion("monthdata not like", value, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataIn(List<String> values) {
            addCriterion("monthdata in", values, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataNotIn(List<String> values) {
            addCriterion("monthdata not in", values, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataBetween(String value1, String value2) {
            addCriterion("monthdata between", value1, value2, "monthdata");
            return (Criteria) this;
        }

        public Criteria andMonthdataNotBetween(String value1, String value2) {
            addCriterion("monthdata not between", value1, value2, "monthdata");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andClueNumberIsNull() {
            addCriterion("clue_number is null");
            return (Criteria) this;
        }

        public Criteria andClueNumberIsNotNull() {
            addCriterion("clue_number is not null");
            return (Criteria) this;
        }

        public Criteria andClueNumberEqualTo(Double value) {
            addCriterion("clue_number =", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberNotEqualTo(Double value) {
            addCriterion("clue_number <>", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberGreaterThan(Double value) {
            addCriterion("clue_number >", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("clue_number >=", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberLessThan(Double value) {
            addCriterion("clue_number <", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberLessThanOrEqualTo(Double value) {
            addCriterion("clue_number <=", value, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberIn(List<Double> values) {
            addCriterion("clue_number in", values, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberNotIn(List<Double> values) {
            addCriterion("clue_number not in", values, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberBetween(Double value1, Double value2) {
            addCriterion("clue_number between", value1, value2, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andClueNumberNotBetween(Double value1, Double value2) {
            addCriterion("clue_number not between", value1, value2, "clueNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberIsNull() {
            addCriterion("dealer_number is null");
            return (Criteria) this;
        }

        public Criteria andDealerNumberIsNotNull() {
            addCriterion("dealer_number is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNumberEqualTo(Double value) {
            addCriterion("dealer_number =", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberNotEqualTo(Double value) {
            addCriterion("dealer_number <>", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberGreaterThan(Double value) {
            addCriterion("dealer_number >", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("dealer_number >=", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberLessThan(Double value) {
            addCriterion("dealer_number <", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberLessThanOrEqualTo(Double value) {
            addCriterion("dealer_number <=", value, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberIn(List<Double> values) {
            addCriterion("dealer_number in", values, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberNotIn(List<Double> values) {
            addCriterion("dealer_number not in", values, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberBetween(Double value1, Double value2) {
            addCriterion("dealer_number between", value1, value2, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andDealerNumberNotBetween(Double value1, Double value2) {
            addCriterion("dealer_number not between", value1, value2, "dealerNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberIsNull() {
            addCriterion("store_clue_number is null");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberIsNotNull() {
            addCriterion("store_clue_number is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberEqualTo(Double value) {
            addCriterion("store_clue_number =", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberNotEqualTo(Double value) {
            addCriterion("store_clue_number <>", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberGreaterThan(Double value) {
            addCriterion("store_clue_number >", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("store_clue_number >=", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberLessThan(Double value) {
            addCriterion("store_clue_number <", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberLessThanOrEqualTo(Double value) {
            addCriterion("store_clue_number <=", value, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberIn(List<Double> values) {
            addCriterion("store_clue_number in", values, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberNotIn(List<Double> values) {
            addCriterion("store_clue_number not in", values, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberBetween(Double value1, Double value2) {
            addCriterion("store_clue_number between", value1, value2, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andStoreClueNumberNotBetween(Double value1, Double value2) {
            addCriterion("store_clue_number not between", value1, value2, "storeClueNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberIsNull() {
            addCriterion("sell_number is null");
            return (Criteria) this;
        }

        public Criteria andSellNumberIsNotNull() {
            addCriterion("sell_number is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumberEqualTo(Double value) {
            addCriterion("sell_number =", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotEqualTo(Double value) {
            addCriterion("sell_number <>", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberGreaterThan(Double value) {
            addCriterion("sell_number >", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("sell_number >=", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberLessThan(Double value) {
            addCriterion("sell_number <", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberLessThanOrEqualTo(Double value) {
            addCriterion("sell_number <=", value, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberIn(List<Double> values) {
            addCriterion("sell_number in", values, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotIn(List<Double> values) {
            addCriterion("sell_number not in", values, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberBetween(Double value1, Double value2) {
            addCriterion("sell_number between", value1, value2, "sellNumber");
            return (Criteria) this;
        }

        public Criteria andSellNumberNotBetween(Double value1, Double value2) {
            addCriterion("sell_number not between", value1, value2, "sellNumber");
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