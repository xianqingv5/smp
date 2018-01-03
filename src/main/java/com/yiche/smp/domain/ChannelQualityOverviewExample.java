package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class ChannelQualityOverviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelQualityOverviewExample() {
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

        public Criteria andScoreAfterDataIsNull() {
            addCriterion("score_after_data is null");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataIsNotNull() {
            addCriterion("score_after_data is not null");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataEqualTo(String value) {
            addCriterion("score_after_data =", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataNotEqualTo(String value) {
            addCriterion("score_after_data <>", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataGreaterThan(String value) {
            addCriterion("score_after_data >", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataGreaterThanOrEqualTo(String value) {
            addCriterion("score_after_data >=", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataLessThan(String value) {
            addCriterion("score_after_data <", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataLessThanOrEqualTo(String value) {
            addCriterion("score_after_data <=", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataLike(String value) {
            addCriterion("score_after_data like", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataNotLike(String value) {
            addCriterion("score_after_data not like", value, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataIn(List<String> values) {
            addCriterion("score_after_data in", values, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataNotIn(List<String> values) {
            addCriterion("score_after_data not in", values, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataBetween(String value1, String value2) {
            addCriterion("score_after_data between", value1, value2, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreAfterDataNotBetween(String value1, String value2) {
            addCriterion("score_after_data not between", value1, value2, "scoreAfterData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataIsNull() {
            addCriterion("score_wave_down_data is null");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataIsNotNull() {
            addCriterion("score_wave_down_data is not null");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataEqualTo(String value) {
            addCriterion("score_wave_down_data =", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataNotEqualTo(String value) {
            addCriterion("score_wave_down_data <>", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataGreaterThan(String value) {
            addCriterion("score_wave_down_data >", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataGreaterThanOrEqualTo(String value) {
            addCriterion("score_wave_down_data >=", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataLessThan(String value) {
            addCriterion("score_wave_down_data <", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataLessThanOrEqualTo(String value) {
            addCriterion("score_wave_down_data <=", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataLike(String value) {
            addCriterion("score_wave_down_data like", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataNotLike(String value) {
            addCriterion("score_wave_down_data not like", value, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataIn(List<String> values) {
            addCriterion("score_wave_down_data in", values, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataNotIn(List<String> values) {
            addCriterion("score_wave_down_data not in", values, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataBetween(String value1, String value2) {
            addCriterion("score_wave_down_data between", value1, value2, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveDownDataNotBetween(String value1, String value2) {
            addCriterion("score_wave_down_data not between", value1, value2, "scoreWaveDownData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataIsNull() {
            addCriterion("score_front_data is null");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataIsNotNull() {
            addCriterion("score_front_data is not null");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataEqualTo(String value) {
            addCriterion("score_front_data =", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataNotEqualTo(String value) {
            addCriterion("score_front_data <>", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataGreaterThan(String value) {
            addCriterion("score_front_data >", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataGreaterThanOrEqualTo(String value) {
            addCriterion("score_front_data >=", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataLessThan(String value) {
            addCriterion("score_front_data <", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataLessThanOrEqualTo(String value) {
            addCriterion("score_front_data <=", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataLike(String value) {
            addCriterion("score_front_data like", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataNotLike(String value) {
            addCriterion("score_front_data not like", value, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataIn(List<String> values) {
            addCriterion("score_front_data in", values, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataNotIn(List<String> values) {
            addCriterion("score_front_data not in", values, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataBetween(String value1, String value2) {
            addCriterion("score_front_data between", value1, value2, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreFrontDataNotBetween(String value1, String value2) {
            addCriterion("score_front_data not between", value1, value2, "scoreFrontData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataIsNull() {
            addCriterion("score_wave_up_data is null");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataIsNotNull() {
            addCriterion("score_wave_up_data is not null");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataEqualTo(String value) {
            addCriterion("score_wave_up_data =", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataNotEqualTo(String value) {
            addCriterion("score_wave_up_data <>", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataGreaterThan(String value) {
            addCriterion("score_wave_up_data >", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataGreaterThanOrEqualTo(String value) {
            addCriterion("score_wave_up_data >=", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataLessThan(String value) {
            addCriterion("score_wave_up_data <", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataLessThanOrEqualTo(String value) {
            addCriterion("score_wave_up_data <=", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataLike(String value) {
            addCriterion("score_wave_up_data like", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataNotLike(String value) {
            addCriterion("score_wave_up_data not like", value, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataIn(List<String> values) {
            addCriterion("score_wave_up_data in", values, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataNotIn(List<String> values) {
            addCriterion("score_wave_up_data not in", values, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataBetween(String value1, String value2) {
            addCriterion("score_wave_up_data between", value1, value2, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andScoreWaveUpDataNotBetween(String value1, String value2) {
            addCriterion("score_wave_up_data not between", value1, value2, "scoreWaveUpData");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("come_from is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("come_from is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(Integer value) {
            addCriterion("come_from =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(Integer value) {
            addCriterion("come_from <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(Integer value) {
            addCriterion("come_from >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_from >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(Integer value) {
            addCriterion("come_from <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(Integer value) {
            addCriterion("come_from <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<Integer> values) {
            addCriterion("come_from in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<Integer> values) {
            addCriterion("come_from not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(Integer value1, Integer value2) {
            addCriterion("come_from between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(Integer value1, Integer value2) {
            addCriterion("come_from not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andMonthDataIsNull() {
            addCriterion("month_data is null");
            return (Criteria) this;
        }

        public Criteria andMonthDataIsNotNull() {
            addCriterion("month_data is not null");
            return (Criteria) this;
        }

        public Criteria andMonthDataEqualTo(String value) {
            addCriterion("month_data =", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataNotEqualTo(String value) {
            addCriterion("month_data <>", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataGreaterThan(String value) {
            addCriterion("month_data >", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataGreaterThanOrEqualTo(String value) {
            addCriterion("month_data >=", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataLessThan(String value) {
            addCriterion("month_data <", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataLessThanOrEqualTo(String value) {
            addCriterion("month_data <=", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataLike(String value) {
            addCriterion("month_data like", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataNotLike(String value) {
            addCriterion("month_data not like", value, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataIn(List<String> values) {
            addCriterion("month_data in", values, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataNotIn(List<String> values) {
            addCriterion("month_data not in", values, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataBetween(String value1, String value2) {
            addCriterion("month_data between", value1, value2, "monthData");
            return (Criteria) this;
        }

        public Criteria andMonthDataNotBetween(String value1, String value2) {
            addCriterion("month_data not between", value1, value2, "monthData");
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