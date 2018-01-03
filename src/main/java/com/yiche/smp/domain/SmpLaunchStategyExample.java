package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class SmpLaunchStategyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmpLaunchStategyExample() {
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

        public Criteria andLaunchStategyIdIsNull() {
            addCriterion("launch_stategy_id is null");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdIsNotNull() {
            addCriterion("launch_stategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdEqualTo(Integer value) {
            addCriterion("launch_stategy_id =", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdNotEqualTo(Integer value) {
            addCriterion("launch_stategy_id <>", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdGreaterThan(Integer value) {
            addCriterion("launch_stategy_id >", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("launch_stategy_id >=", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdLessThan(Integer value) {
            addCriterion("launch_stategy_id <", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdLessThanOrEqualTo(Integer value) {
            addCriterion("launch_stategy_id <=", value, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdIn(List<Integer> values) {
            addCriterion("launch_stategy_id in", values, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdNotIn(List<Integer> values) {
            addCriterion("launch_stategy_id not in", values, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdBetween(Integer value1, Integer value2) {
            addCriterion("launch_stategy_id between", value1, value2, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andLaunchStategyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("launch_stategy_id not between", value1, value2, "launchStategyId");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIsNull() {
            addCriterion("advert_type is null");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIsNotNull() {
            addCriterion("advert_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeEqualTo(String value) {
            addCriterion("advert_type =", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotEqualTo(String value) {
            addCriterion("advert_type <>", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeGreaterThan(String value) {
            addCriterion("advert_type >", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("advert_type >=", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeLessThan(String value) {
            addCriterion("advert_type <", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeLessThanOrEqualTo(String value) {
            addCriterion("advert_type <=", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeLike(String value) {
            addCriterion("advert_type like", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotLike(String value) {
            addCriterion("advert_type not like", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIn(List<String> values) {
            addCriterion("advert_type in", values, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotIn(List<String> values) {
            addCriterion("advert_type not in", values, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeBetween(String value1, String value2) {
            addCriterion("advert_type between", value1, value2, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotBetween(String value1, String value2) {
            addCriterion("advert_type not between", value1, value2, "advertType");
            return (Criteria) this;
        }

        public Criteria andChannelTraitIsNull() {
            addCriterion("channel_trait is null");
            return (Criteria) this;
        }

        public Criteria andChannelTraitIsNotNull() {
            addCriterion("channel_trait is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTraitEqualTo(String value) {
            addCriterion("channel_trait =", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitNotEqualTo(String value) {
            addCriterion("channel_trait <>", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitGreaterThan(String value) {
            addCriterion("channel_trait >", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitGreaterThanOrEqualTo(String value) {
            addCriterion("channel_trait >=", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitLessThan(String value) {
            addCriterion("channel_trait <", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitLessThanOrEqualTo(String value) {
            addCriterion("channel_trait <=", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitLike(String value) {
            addCriterion("channel_trait like", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitNotLike(String value) {
            addCriterion("channel_trait not like", value, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitIn(List<String> values) {
            addCriterion("channel_trait in", values, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitNotIn(List<String> values) {
            addCriterion("channel_trait not in", values, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitBetween(String value1, String value2) {
            addCriterion("channel_trait between", value1, value2, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andChannelTraitNotBetween(String value1, String value2) {
            addCriterion("channel_trait not between", value1, value2, "channelTrait");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalIsNull() {
            addCriterion("commerce_festival is null");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalIsNotNull() {
            addCriterion("commerce_festival is not null");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalEqualTo(String value) {
            addCriterion("commerce_festival =", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalNotEqualTo(String value) {
            addCriterion("commerce_festival <>", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalGreaterThan(String value) {
            addCriterion("commerce_festival >", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalGreaterThanOrEqualTo(String value) {
            addCriterion("commerce_festival >=", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalLessThan(String value) {
            addCriterion("commerce_festival <", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalLessThanOrEqualTo(String value) {
            addCriterion("commerce_festival <=", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalLike(String value) {
            addCriterion("commerce_festival like", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalNotLike(String value) {
            addCriterion("commerce_festival not like", value, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalIn(List<String> values) {
            addCriterion("commerce_festival in", values, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalNotIn(List<String> values) {
            addCriterion("commerce_festival not in", values, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalBetween(String value1, String value2) {
            addCriterion("commerce_festival between", value1, value2, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCommerceFestivalNotBetween(String value1, String value2) {
            addCriterion("commerce_festival not between", value1, value2, "commerceFestival");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyIsNull() {
            addCriterion("car_show_stategy is null");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyIsNotNull() {
            addCriterion("car_show_stategy is not null");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyEqualTo(String value) {
            addCriterion("car_show_stategy =", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyNotEqualTo(String value) {
            addCriterion("car_show_stategy <>", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyGreaterThan(String value) {
            addCriterion("car_show_stategy >", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyGreaterThanOrEqualTo(String value) {
            addCriterion("car_show_stategy >=", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyLessThan(String value) {
            addCriterion("car_show_stategy <", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyLessThanOrEqualTo(String value) {
            addCriterion("car_show_stategy <=", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyLike(String value) {
            addCriterion("car_show_stategy like", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyNotLike(String value) {
            addCriterion("car_show_stategy not like", value, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyIn(List<String> values) {
            addCriterion("car_show_stategy in", values, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyNotIn(List<String> values) {
            addCriterion("car_show_stategy not in", values, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyBetween(String value1, String value2) {
            addCriterion("car_show_stategy between", value1, value2, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andCarShowStategyNotBetween(String value1, String value2) {
            addCriterion("car_show_stategy not between", value1, value2, "carShowStategy");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
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