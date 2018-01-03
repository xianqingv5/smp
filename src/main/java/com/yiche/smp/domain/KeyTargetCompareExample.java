package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class KeyTargetCompareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeyTargetCompareExample() {
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

        public Criteria andKeyIndexIdIsNull() {
            addCriterion("key_index_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdIsNotNull() {
            addCriterion("key_index_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdEqualTo(Integer value) {
            addCriterion("key_index_id =", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdNotEqualTo(Integer value) {
            addCriterion("key_index_id <>", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdGreaterThan(Integer value) {
            addCriterion("key_index_id >", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_index_id >=", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdLessThan(Integer value) {
            addCriterion("key_index_id <", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdLessThanOrEqualTo(Integer value) {
            addCriterion("key_index_id <=", value, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdIn(List<Integer> values) {
            addCriterion("key_index_id in", values, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdNotIn(List<Integer> values) {
            addCriterion("key_index_id not in", values, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdBetween(Integer value1, Integer value2) {
            addCriterion("key_index_id between", value1, value2, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyIndexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("key_index_id not between", value1, value2, "keyIndexId");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNull() {
            addCriterion("key_type is null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNotNull() {
            addCriterion("key_type is not null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeEqualTo(String value) {
            addCriterion("key_type =", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotEqualTo(String value) {
            addCriterion("key_type <>", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThan(String value) {
            addCriterion("key_type >", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("key_type >=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThan(String value) {
            addCriterion("key_type <", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThanOrEqualTo(String value) {
            addCriterion("key_type <=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLike(String value) {
            addCriterion("key_type like", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotLike(String value) {
            addCriterion("key_type not like", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIn(List<String> values) {
            addCriterion("key_type in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotIn(List<String> values) {
            addCriterion("key_type not in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeBetween(String value1, String value2) {
            addCriterion("key_type between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotBetween(String value1, String value2) {
            addCriterion("key_type not between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNull() {
            addCriterion("detail_name is null");
            return (Criteria) this;
        }

        public Criteria andDetailNameIsNotNull() {
            addCriterion("detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNameEqualTo(String value) {
            addCriterion("detail_name =", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotEqualTo(String value) {
            addCriterion("detail_name <>", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThan(String value) {
            addCriterion("detail_name >", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("detail_name >=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThan(String value) {
            addCriterion("detail_name <", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLessThanOrEqualTo(String value) {
            addCriterion("detail_name <=", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameLike(String value) {
            addCriterion("detail_name like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotLike(String value) {
            addCriterion("detail_name not like", value, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameIn(List<String> values) {
            addCriterion("detail_name in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotIn(List<String> values) {
            addCriterion("detail_name not in", values, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameBetween(String value1, String value2) {
            addCriterion("detail_name between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andDetailNameNotBetween(String value1, String value2) {
            addCriterion("detail_name not between", value1, value2, "detailName");
            return (Criteria) this;
        }

        public Criteria andMonthCompareIsNull() {
            addCriterion("month_compare is null");
            return (Criteria) this;
        }

        public Criteria andMonthCompareIsNotNull() {
            addCriterion("month_compare is not null");
            return (Criteria) this;
        }

        public Criteria andMonthCompareEqualTo(Double value) {
            addCriterion("month_compare =", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareNotEqualTo(Double value) {
            addCriterion("month_compare <>", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareGreaterThan(Double value) {
            addCriterion("month_compare >", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("month_compare >=", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareLessThan(Double value) {
            addCriterion("month_compare <", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareLessThanOrEqualTo(Double value) {
            addCriterion("month_compare <=", value, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareIn(List<Double> values) {
            addCriterion("month_compare in", values, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareNotIn(List<Double> values) {
            addCriterion("month_compare not in", values, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareBetween(Double value1, Double value2) {
            addCriterion("month_compare between", value1, value2, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andMonthCompareNotBetween(Double value1, Double value2) {
            addCriterion("month_compare not between", value1, value2, "monthCompare");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelCompareIsNull() {
            addCriterion("channel_compare is null");
            return (Criteria) this;
        }

        public Criteria andChannelCompareIsNotNull() {
            addCriterion("channel_compare is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCompareEqualTo(Double value) {
            addCriterion("channel_compare =", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareNotEqualTo(Double value) {
            addCriterion("channel_compare <>", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareGreaterThan(Double value) {
            addCriterion("channel_compare >", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("channel_compare >=", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareLessThan(Double value) {
            addCriterion("channel_compare <", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareLessThanOrEqualTo(Double value) {
            addCriterion("channel_compare <=", value, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareIn(List<Double> values) {
            addCriterion("channel_compare in", values, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareNotIn(List<Double> values) {
            addCriterion("channel_compare not in", values, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareBetween(Double value1, Double value2) {
            addCriterion("channel_compare between", value1, value2, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andChannelCompareNotBetween(Double value1, Double value2) {
            addCriterion("channel_compare not between", value1, value2, "channelCompare");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
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