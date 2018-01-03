package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class MonthClueColumnarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthClueColumnarExample() {
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

        public Criteria andClueColumnarIdIsNull() {
            addCriterion("clue_columnar_id is null");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdIsNotNull() {
            addCriterion("clue_columnar_id is not null");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdEqualTo(Integer value) {
            addCriterion("clue_columnar_id =", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdNotEqualTo(Integer value) {
            addCriterion("clue_columnar_id <>", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdGreaterThan(Integer value) {
            addCriterion("clue_columnar_id >", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue_columnar_id >=", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdLessThan(Integer value) {
            addCriterion("clue_columnar_id <", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdLessThanOrEqualTo(Integer value) {
            addCriterion("clue_columnar_id <=", value, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdIn(List<Integer> values) {
            addCriterion("clue_columnar_id in", values, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdNotIn(List<Integer> values) {
            addCriterion("clue_columnar_id not in", values, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdBetween(Integer value1, Integer value2) {
            addCriterion("clue_columnar_id between", value1, value2, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andClueColumnarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clue_columnar_id not between", value1, value2, "clueColumnarId");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendIsNull() {
            addCriterion("conform_market_trend is null");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendIsNotNull() {
            addCriterion("conform_market_trend is not null");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendEqualTo(Integer value) {
            addCriterion("conform_market_trend =", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendNotEqualTo(Integer value) {
            addCriterion("conform_market_trend <>", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendGreaterThan(Integer value) {
            addCriterion("conform_market_trend >", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendGreaterThanOrEqualTo(Integer value) {
            addCriterion("conform_market_trend >=", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendLessThan(Integer value) {
            addCriterion("conform_market_trend <", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendLessThanOrEqualTo(Integer value) {
            addCriterion("conform_market_trend <=", value, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendIn(List<Integer> values) {
            addCriterion("conform_market_trend in", values, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendNotIn(List<Integer> values) {
            addCriterion("conform_market_trend not in", values, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendBetween(Integer value1, Integer value2) {
            addCriterion("conform_market_trend between", value1, value2, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andConformMarketTrendNotBetween(Integer value1, Integer value2) {
            addCriterion("conform_market_trend not between", value1, value2, "conformMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendIsNull() {
            addCriterion("up_market_trend is null");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendIsNotNull() {
            addCriterion("up_market_trend is not null");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendEqualTo(Integer value) {
            addCriterion("up_market_trend =", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendNotEqualTo(Integer value) {
            addCriterion("up_market_trend <>", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendGreaterThan(Integer value) {
            addCriterion("up_market_trend >", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_market_trend >=", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendLessThan(Integer value) {
            addCriterion("up_market_trend <", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendLessThanOrEqualTo(Integer value) {
            addCriterion("up_market_trend <=", value, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendIn(List<Integer> values) {
            addCriterion("up_market_trend in", values, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendNotIn(List<Integer> values) {
            addCriterion("up_market_trend not in", values, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendBetween(Integer value1, Integer value2) {
            addCriterion("up_market_trend between", value1, value2, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUpMarketTrendNotBetween(Integer value1, Integer value2) {
            addCriterion("up_market_trend not between", value1, value2, "upMarketTrend");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpIsNull() {
            addCriterion("under_maket_trend_shop_up is null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpIsNotNull() {
            addCriterion("under_maket_trend_shop_up is not null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpEqualTo(Integer value) {
            addCriterion("under_maket_trend_shop_up =", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpNotEqualTo(Integer value) {
            addCriterion("under_maket_trend_shop_up <>", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpGreaterThan(Integer value) {
            addCriterion("under_maket_trend_shop_up >", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_shop_up >=", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpLessThan(Integer value) {
            addCriterion("under_maket_trend_shop_up <", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpLessThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_shop_up <=", value, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpIn(List<Integer> values) {
            addCriterion("under_maket_trend_shop_up in", values, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpNotIn(List<Integer> values) {
            addCriterion("under_maket_trend_shop_up not in", values, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_shop_up between", value1, value2, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendShopUpNotBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_shop_up not between", value1, value2, "underMaketTrendShopUp");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientIsNull() {
            addCriterion("under_maket_trend_clue_up_insufficient is null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientIsNotNull() {
            addCriterion("under_maket_trend_clue_up_insufficient is not null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient =", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientNotEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient <>", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientGreaterThan(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient >", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientGreaterThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient >=", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientLessThan(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient <", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientLessThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_up_insufficient <=", value, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientIn(List<Integer> values) {
            addCriterion("under_maket_trend_clue_up_insufficient in", values, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientNotIn(List<Integer> values) {
            addCriterion("under_maket_trend_clue_up_insufficient not in", values, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_clue_up_insufficient between", value1, value2, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueUpInsufficientNotBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_clue_up_insufficient not between", value1, value2, "underMaketTrendClueUpInsufficient");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideIsNull() {
            addCriterion("under_maket_trend_clue_glide is null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideIsNotNull() {
            addCriterion("under_maket_trend_clue_glide is not null");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_glide =", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideNotEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_glide <>", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideGreaterThan(Integer value) {
            addCriterion("under_maket_trend_clue_glide >", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideGreaterThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_glide >=", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideLessThan(Integer value) {
            addCriterion("under_maket_trend_clue_glide <", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideLessThanOrEqualTo(Integer value) {
            addCriterion("under_maket_trend_clue_glide <=", value, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideIn(List<Integer> values) {
            addCriterion("under_maket_trend_clue_glide in", values, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideNotIn(List<Integer> values) {
            addCriterion("under_maket_trend_clue_glide not in", values, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_clue_glide between", value1, value2, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andUnderMaketTrendClueGlideNotBetween(Integer value1, Integer value2) {
            addCriterion("under_maket_trend_clue_glide not between", value1, value2, "underMaketTrendClueGlide");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNull() {
            addCriterion("data_date is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("data_date is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(String value) {
            addCriterion("data_date =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(String value) {
            addCriterion("data_date <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(String value) {
            addCriterion("data_date >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("data_date >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(String value) {
            addCriterion("data_date <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(String value) {
            addCriterion("data_date <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLike(String value) {
            addCriterion("data_date like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotLike(String value) {
            addCriterion("data_date not like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<String> values) {
            addCriterion("data_date in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<String> values) {
            addCriterion("data_date not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(String value1, String value2) {
            addCriterion("data_date between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(String value1, String value2) {
            addCriterion("data_date not between", value1, value2, "dataDate");
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