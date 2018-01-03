package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class ChannelQualityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelQualityExample() {
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

        public Criteria andChannelNumberIsNull() {
            addCriterion("channel_number is null");
            return (Criteria) this;
        }

        public Criteria andChannelNumberIsNotNull() {
            addCriterion("channel_number is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNumberEqualTo(String value) {
            addCriterion("channel_number =", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberNotEqualTo(String value) {
            addCriterion("channel_number <>", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberGreaterThan(String value) {
            addCriterion("channel_number >", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("channel_number >=", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberLessThan(String value) {
            addCriterion("channel_number <", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberLessThanOrEqualTo(String value) {
            addCriterion("channel_number <=", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberLike(String value) {
            addCriterion("channel_number like", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberNotLike(String value) {
            addCriterion("channel_number not like", value, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberIn(List<String> values) {
            addCriterion("channel_number in", values, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberNotIn(List<String> values) {
            addCriterion("channel_number not in", values, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberBetween(String value1, String value2) {
            addCriterion("channel_number between", value1, value2, "channelNumber");
            return (Criteria) this;
        }

        public Criteria andChannelNumberNotBetween(String value1, String value2) {
            addCriterion("channel_number not between", value1, value2, "channelNumber");
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

        public Criteria andIndexScoreIsNull() {
            addCriterion("index_score is null");
            return (Criteria) this;
        }

        public Criteria andIndexScoreIsNotNull() {
            addCriterion("index_score is not null");
            return (Criteria) this;
        }

        public Criteria andIndexScoreEqualTo(Double value) {
            addCriterion("index_score =", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreNotEqualTo(Double value) {
            addCriterion("index_score <>", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreGreaterThan(Double value) {
            addCriterion("index_score >", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("index_score >=", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreLessThan(Double value) {
            addCriterion("index_score <", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreLessThanOrEqualTo(Double value) {
            addCriterion("index_score <=", value, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreIn(List<Double> values) {
            addCriterion("index_score in", values, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreNotIn(List<Double> values) {
            addCriterion("index_score not in", values, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreBetween(Double value1, Double value2) {
            addCriterion("index_score between", value1, value2, "indexScore");
            return (Criteria) this;
        }

        public Criteria andIndexScoreNotBetween(Double value1, Double value2) {
            addCriterion("index_score not between", value1, value2, "indexScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreIsNull() {
            addCriterion("number_score is null");
            return (Criteria) this;
        }

        public Criteria andNumberScoreIsNotNull() {
            addCriterion("number_score is not null");
            return (Criteria) this;
        }

        public Criteria andNumberScoreEqualTo(Double value) {
            addCriterion("number_score =", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreNotEqualTo(Double value) {
            addCriterion("number_score <>", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreGreaterThan(Double value) {
            addCriterion("number_score >", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("number_score >=", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreLessThan(Double value) {
            addCriterion("number_score <", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreLessThanOrEqualTo(Double value) {
            addCriterion("number_score <=", value, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreIn(List<Double> values) {
            addCriterion("number_score in", values, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreNotIn(List<Double> values) {
            addCriterion("number_score not in", values, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreBetween(Double value1, Double value2) {
            addCriterion("number_score between", value1, value2, "numberScore");
            return (Criteria) this;
        }

        public Criteria andNumberScoreNotBetween(Double value1, Double value2) {
            addCriterion("number_score not between", value1, value2, "numberScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIsNull() {
            addCriterion("quality_score is null");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIsNotNull() {
            addCriterion("quality_score is not null");
            return (Criteria) this;
        }

        public Criteria andQualityScoreEqualTo(Double value) {
            addCriterion("quality_score =", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotEqualTo(Double value) {
            addCriterion("quality_score <>", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreGreaterThan(Double value) {
            addCriterion("quality_score >", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("quality_score >=", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreLessThan(Double value) {
            addCriterion("quality_score <", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreLessThanOrEqualTo(Double value) {
            addCriterion("quality_score <=", value, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreIn(List<Double> values) {
            addCriterion("quality_score in", values, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotIn(List<Double> values) {
            addCriterion("quality_score not in", values, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreBetween(Double value1, Double value2) {
            addCriterion("quality_score between", value1, value2, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andQualityScoreNotBetween(Double value1, Double value2) {
            addCriterion("quality_score not between", value1, value2, "qualityScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreIsNull() {
            addCriterion("efficiency_score is null");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreIsNotNull() {
            addCriterion("efficiency_score is not null");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreEqualTo(Double value) {
            addCriterion("efficiency_score =", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreNotEqualTo(Double value) {
            addCriterion("efficiency_score <>", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreGreaterThan(Double value) {
            addCriterion("efficiency_score >", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("efficiency_score >=", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreLessThan(Double value) {
            addCriterion("efficiency_score <", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreLessThanOrEqualTo(Double value) {
            addCriterion("efficiency_score <=", value, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreIn(List<Double> values) {
            addCriterion("efficiency_score in", values, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreNotIn(List<Double> values) {
            addCriterion("efficiency_score not in", values, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreBetween(Double value1, Double value2) {
            addCriterion("efficiency_score between", value1, value2, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andEfficiencyScoreNotBetween(Double value1, Double value2) {
            addCriterion("efficiency_score not between", value1, value2, "efficiencyScore");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Double value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Double value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Double value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Double value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Double> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Double> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Double value1, Double value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andRankShangeIsNull() {
            addCriterion("rank_shange is null");
            return (Criteria) this;
        }

        public Criteria andRankShangeIsNotNull() {
            addCriterion("rank_shange is not null");
            return (Criteria) this;
        }

        public Criteria andRankShangeEqualTo(Integer value) {
            addCriterion("rank_shange =", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeNotEqualTo(Integer value) {
            addCriterion("rank_shange <>", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeGreaterThan(Integer value) {
            addCriterion("rank_shange >", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_shange >=", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeLessThan(Integer value) {
            addCriterion("rank_shange <", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeLessThanOrEqualTo(Integer value) {
            addCriterion("rank_shange <=", value, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeIn(List<Integer> values) {
            addCriterion("rank_shange in", values, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeNotIn(List<Integer> values) {
            addCriterion("rank_shange not in", values, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeBetween(Integer value1, Integer value2) {
            addCriterion("rank_shange between", value1, value2, "rankShange");
            return (Criteria) this;
        }

        public Criteria andRankShangeNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_shange not between", value1, value2, "rankShange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeIsNull() {
            addCriterion("score_change is null");
            return (Criteria) this;
        }

        public Criteria andScoreChangeIsNotNull() {
            addCriterion("score_change is not null");
            return (Criteria) this;
        }

        public Criteria andScoreChangeEqualTo(Double value) {
            addCriterion("score_change =", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeNotEqualTo(Double value) {
            addCriterion("score_change <>", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeGreaterThan(Double value) {
            addCriterion("score_change >", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("score_change >=", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeLessThan(Double value) {
            addCriterion("score_change <", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeLessThanOrEqualTo(Double value) {
            addCriterion("score_change <=", value, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeIn(List<Double> values) {
            addCriterion("score_change in", values, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeNotIn(List<Double> values) {
            addCriterion("score_change not in", values, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeBetween(Double value1, Double value2) {
            addCriterion("score_change between", value1, value2, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andScoreChangeNotBetween(Double value1, Double value2) {
            addCriterion("score_change not between", value1, value2, "scoreChange");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNull() {
            addCriterion("month_time is null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNotNull() {
            addCriterion("month_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeEqualTo(String value) {
            addCriterion("month_time =", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotEqualTo(String value) {
            addCriterion("month_time <>", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThan(String value) {
            addCriterion("month_time >", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThanOrEqualTo(String value) {
            addCriterion("month_time >=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThan(String value) {
            addCriterion("month_time <", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThanOrEqualTo(String value) {
            addCriterion("month_time <=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLike(String value) {
            addCriterion("month_time like", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotLike(String value) {
            addCriterion("month_time not like", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIn(List<String> values) {
            addCriterion("month_time in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotIn(List<String> values) {
            addCriterion("month_time not in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeBetween(String value1, String value2) {
            addCriterion("month_time between", value1, value2, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotBetween(String value1, String value2) {
            addCriterion("month_time not between", value1, value2, "monthTime");
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

        public Criteria andChannelTimeIsNull() {
            addCriterion("channel_time is null");
            return (Criteria) this;
        }

        public Criteria andChannelTimeIsNotNull() {
            addCriterion("channel_time is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTimeEqualTo(String value) {
            addCriterion("channel_time =", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeNotEqualTo(String value) {
            addCriterion("channel_time <>", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeGreaterThan(String value) {
            addCriterion("channel_time >", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_time >=", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeLessThan(String value) {
            addCriterion("channel_time <", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeLessThanOrEqualTo(String value) {
            addCriterion("channel_time <=", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeLike(String value) {
            addCriterion("channel_time like", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeNotLike(String value) {
            addCriterion("channel_time not like", value, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeIn(List<String> values) {
            addCriterion("channel_time in", values, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeNotIn(List<String> values) {
            addCriterion("channel_time not in", values, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeBetween(String value1, String value2) {
            addCriterion("channel_time between", value1, value2, "channelTime");
            return (Criteria) this;
        }

        public Criteria andChannelTimeNotBetween(String value1, String value2) {
            addCriterion("channel_time not between", value1, value2, "channelTime");
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