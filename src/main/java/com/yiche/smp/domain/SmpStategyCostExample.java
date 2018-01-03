package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class SmpStategyCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmpStategyCostExample() {
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

        public Criteria andStategyCostIdIsNull() {
            addCriterion("stategy_cost_id is null");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdIsNotNull() {
            addCriterion("stategy_cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdEqualTo(Integer value) {
            addCriterion("stategy_cost_id =", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdNotEqualTo(Integer value) {
            addCriterion("stategy_cost_id <>", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdGreaterThan(Integer value) {
            addCriterion("stategy_cost_id >", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stategy_cost_id >=", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdLessThan(Integer value) {
            addCriterion("stategy_cost_id <", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("stategy_cost_id <=", value, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdIn(List<Integer> values) {
            addCriterion("stategy_cost_id in", values, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdNotIn(List<Integer> values) {
            addCriterion("stategy_cost_id not in", values, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdBetween(Integer value1, Integer value2) {
            addCriterion("stategy_cost_id between", value1, value2, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andStategyCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stategy_cost_id not between", value1, value2, "stategyCostId");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameIsNull() {
            addCriterion("cost_channel_name is null");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameIsNotNull() {
            addCriterion("cost_channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameEqualTo(String value) {
            addCriterion("cost_channel_name =", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameNotEqualTo(String value) {
            addCriterion("cost_channel_name <>", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameGreaterThan(String value) {
            addCriterion("cost_channel_name >", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("cost_channel_name >=", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameLessThan(String value) {
            addCriterion("cost_channel_name <", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameLessThanOrEqualTo(String value) {
            addCriterion("cost_channel_name <=", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameLike(String value) {
            addCriterion("cost_channel_name like", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameNotLike(String value) {
            addCriterion("cost_channel_name not like", value, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameIn(List<String> values) {
            addCriterion("cost_channel_name in", values, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameNotIn(List<String> values) {
            addCriterion("cost_channel_name not in", values, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameBetween(String value1, String value2) {
            addCriterion("cost_channel_name between", value1, value2, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostChannelNameNotBetween(String value1, String value2) {
            addCriterion("cost_channel_name not between", value1, value2, "costChannelName");
            return (Criteria) this;
        }

        public Criteria andCostMonthIsNull() {
            addCriterion("cost_month is null");
            return (Criteria) this;
        }

        public Criteria andCostMonthIsNotNull() {
            addCriterion("cost_month is not null");
            return (Criteria) this;
        }

        public Criteria andCostMonthEqualTo(String value) {
            addCriterion("cost_month =", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthNotEqualTo(String value) {
            addCriterion("cost_month <>", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthGreaterThan(String value) {
            addCriterion("cost_month >", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthGreaterThanOrEqualTo(String value) {
            addCriterion("cost_month >=", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthLessThan(String value) {
            addCriterion("cost_month <", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthLessThanOrEqualTo(String value) {
            addCriterion("cost_month <=", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthLike(String value) {
            addCriterion("cost_month like", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthNotLike(String value) {
            addCriterion("cost_month not like", value, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthIn(List<String> values) {
            addCriterion("cost_month in", values, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthNotIn(List<String> values) {
            addCriterion("cost_month not in", values, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthBetween(String value1, String value2) {
            addCriterion("cost_month between", value1, value2, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostMonthNotBetween(String value1, String value2) {
            addCriterion("cost_month not between", value1, value2, "costMonth");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
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