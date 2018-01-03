package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class ChannelDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelDetailExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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

        public Criteria andNewAcRatioIsNull() {
            addCriterion("new_ac_ratio is null");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioIsNotNull() {
            addCriterion("new_ac_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioEqualTo(Float value) {
            addCriterion("new_ac_ratio =", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioNotEqualTo(Float value) {
            addCriterion("new_ac_ratio <>", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioGreaterThan(Float value) {
            addCriterion("new_ac_ratio >", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("new_ac_ratio >=", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioLessThan(Float value) {
            addCriterion("new_ac_ratio <", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioLessThanOrEqualTo(Float value) {
            addCriterion("new_ac_ratio <=", value, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioIn(List<Float> values) {
            addCriterion("new_ac_ratio in", values, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioNotIn(List<Float> values) {
            addCriterion("new_ac_ratio not in", values, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioBetween(Float value1, Float value2) {
            addCriterion("new_ac_ratio between", value1, value2, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcRatioNotBetween(Float value1, Float value2) {
            addCriterion("new_ac_ratio not between", value1, value2, "newAcRatio");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreIsNull() {
            addCriterion("new_ac_score is null");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreIsNotNull() {
            addCriterion("new_ac_score is not null");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreEqualTo(Float value) {
            addCriterion("new_ac_score =", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreNotEqualTo(Float value) {
            addCriterion("new_ac_score <>", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreGreaterThan(Float value) {
            addCriterion("new_ac_score >", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("new_ac_score >=", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreLessThan(Float value) {
            addCriterion("new_ac_score <", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreLessThanOrEqualTo(Float value) {
            addCriterion("new_ac_score <=", value, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreIn(List<Float> values) {
            addCriterion("new_ac_score in", values, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreNotIn(List<Float> values) {
            addCriterion("new_ac_score not in", values, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreBetween(Float value1, Float value2) {
            addCriterion("new_ac_score between", value1, value2, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andNewAcScoreNotBetween(Float value1, Float value2) {
            addCriterion("new_ac_score not between", value1, value2, "newAcScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioIsNull() {
            addCriterion("day_sevenoc_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioIsNotNull() {
            addCriterion("day_sevenoc_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioEqualTo(Float value) {
            addCriterion("day_sevenoc_ratio =", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioNotEqualTo(Float value) {
            addCriterion("day_sevenoc_ratio <>", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioGreaterThan(Float value) {
            addCriterion("day_sevenoc_ratio >", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenoc_ratio >=", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioLessThan(Float value) {
            addCriterion("day_sevenoc_ratio <", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenoc_ratio <=", value, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioIn(List<Float> values) {
            addCriterion("day_sevenoc_ratio in", values, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioNotIn(List<Float> values) {
            addCriterion("day_sevenoc_ratio not in", values, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevenoc_ratio between", value1, value2, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenoc_ratio not between", value1, value2, "daySevenocRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreIsNull() {
            addCriterion("day_sevenoc_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreIsNotNull() {
            addCriterion("day_sevenoc_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreEqualTo(Float value) {
            addCriterion("day_sevenoc_score =", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreNotEqualTo(Float value) {
            addCriterion("day_sevenoc_score <>", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreGreaterThan(Float value) {
            addCriterion("day_sevenoc_score >", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenoc_score >=", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreLessThan(Float value) {
            addCriterion("day_sevenoc_score <", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenoc_score <=", value, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreIn(List<Float> values) {
            addCriterion("day_sevenoc_score in", values, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreNotIn(List<Float> values) {
            addCriterion("day_sevenoc_score not in", values, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevenoc_score between", value1, value2, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenocScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenoc_score not between", value1, value2, "daySevenocScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioIsNull() {
            addCriterion("day_sevenuc_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioIsNotNull() {
            addCriterion("day_sevenuc_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioEqualTo(Float value) {
            addCriterion("day_sevenuc_ratio =", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioNotEqualTo(Float value) {
            addCriterion("day_sevenuc_ratio <>", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioGreaterThan(Float value) {
            addCriterion("day_sevenuc_ratio >", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenuc_ratio >=", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioLessThan(Float value) {
            addCriterion("day_sevenuc_ratio <", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenuc_ratio <=", value, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioIn(List<Float> values) {
            addCriterion("day_sevenuc_ratio in", values, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioNotIn(List<Float> values) {
            addCriterion("day_sevenuc_ratio not in", values, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevenuc_ratio between", value1, value2, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenuc_ratio not between", value1, value2, "daySevenucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreIsNull() {
            addCriterion("day_sevenuc_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreIsNotNull() {
            addCriterion("day_sevenuc_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreEqualTo(Float value) {
            addCriterion("day_sevenuc_score =", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreNotEqualTo(Float value) {
            addCriterion("day_sevenuc_score <>", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreGreaterThan(Float value) {
            addCriterion("day_sevenuc_score >", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenuc_score >=", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreLessThan(Float value) {
            addCriterion("day_sevenuc_score <", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenuc_score <=", value, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreIn(List<Float> values) {
            addCriterion("day_sevenuc_score in", values, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreNotIn(List<Float> values) {
            addCriterion("day_sevenuc_score not in", values, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevenuc_score between", value1, value2, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenucScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenuc_score not between", value1, value2, "daySevenucScore");
            return (Criteria) this;
        }

        public Criteria andDauRatioIsNull() {
            addCriterion("dau_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDauRatioIsNotNull() {
            addCriterion("dau_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDauRatioEqualTo(Float value) {
            addCriterion("dau_ratio =", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioNotEqualTo(Float value) {
            addCriterion("dau_ratio <>", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioGreaterThan(Float value) {
            addCriterion("dau_ratio >", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("dau_ratio >=", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioLessThan(Float value) {
            addCriterion("dau_ratio <", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioLessThanOrEqualTo(Float value) {
            addCriterion("dau_ratio <=", value, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioIn(List<Float> values) {
            addCriterion("dau_ratio in", values, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioNotIn(List<Float> values) {
            addCriterion("dau_ratio not in", values, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioBetween(Float value1, Float value2) {
            addCriterion("dau_ratio between", value1, value2, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauRatioNotBetween(Float value1, Float value2) {
            addCriterion("dau_ratio not between", value1, value2, "dauRatio");
            return (Criteria) this;
        }

        public Criteria andDauScoreIsNull() {
            addCriterion("dau_score is null");
            return (Criteria) this;
        }

        public Criteria andDauScoreIsNotNull() {
            addCriterion("dau_score is not null");
            return (Criteria) this;
        }

        public Criteria andDauScoreEqualTo(Float value) {
            addCriterion("dau_score =", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreNotEqualTo(Float value) {
            addCriterion("dau_score <>", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreGreaterThan(Float value) {
            addCriterion("dau_score >", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("dau_score >=", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreLessThan(Float value) {
            addCriterion("dau_score <", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreLessThanOrEqualTo(Float value) {
            addCriterion("dau_score <=", value, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreIn(List<Float> values) {
            addCriterion("dau_score in", values, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreNotIn(List<Float> values) {
            addCriterion("dau_score not in", values, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreBetween(Float value1, Float value2) {
            addCriterion("dau_score between", value1, value2, "dauScore");
            return (Criteria) this;
        }

        public Criteria andDauScoreNotBetween(Float value1, Float value2) {
            addCriterion("dau_score not between", value1, value2, "dauScore");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioIsNull() {
            addCriterion("new_au_ratio is null");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioIsNotNull() {
            addCriterion("new_au_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioEqualTo(Float value) {
            addCriterion("new_au_ratio =", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioNotEqualTo(Float value) {
            addCriterion("new_au_ratio <>", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioGreaterThan(Float value) {
            addCriterion("new_au_ratio >", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("new_au_ratio >=", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioLessThan(Float value) {
            addCriterion("new_au_ratio <", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioLessThanOrEqualTo(Float value) {
            addCriterion("new_au_ratio <=", value, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioIn(List<Float> values) {
            addCriterion("new_au_ratio in", values, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioNotIn(List<Float> values) {
            addCriterion("new_au_ratio not in", values, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioBetween(Float value1, Float value2) {
            addCriterion("new_au_ratio between", value1, value2, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuRatioNotBetween(Float value1, Float value2) {
            addCriterion("new_au_ratio not between", value1, value2, "newAuRatio");
            return (Criteria) this;
        }

        public Criteria andNewAuNumIsNull() {
            addCriterion("new_au_num is null");
            return (Criteria) this;
        }

        public Criteria andNewAuNumIsNotNull() {
            addCriterion("new_au_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewAuNumEqualTo(Integer value) {
            addCriterion("new_au_num =", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumNotEqualTo(Integer value) {
            addCriterion("new_au_num <>", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumGreaterThan(Integer value) {
            addCriterion("new_au_num >", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_au_num >=", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumLessThan(Integer value) {
            addCriterion("new_au_num <", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumLessThanOrEqualTo(Integer value) {
            addCriterion("new_au_num <=", value, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumIn(List<Integer> values) {
            addCriterion("new_au_num in", values, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumNotIn(List<Integer> values) {
            addCriterion("new_au_num not in", values, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumBetween(Integer value1, Integer value2) {
            addCriterion("new_au_num between", value1, value2, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("new_au_num not between", value1, value2, "newAuNum");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreIsNull() {
            addCriterion("new_au_score is null");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreIsNotNull() {
            addCriterion("new_au_score is not null");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreEqualTo(Float value) {
            addCriterion("new_au_score =", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreNotEqualTo(Float value) {
            addCriterion("new_au_score <>", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreGreaterThan(Float value) {
            addCriterion("new_au_score >", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("new_au_score >=", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreLessThan(Float value) {
            addCriterion("new_au_score <", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreLessThanOrEqualTo(Float value) {
            addCriterion("new_au_score <=", value, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreIn(List<Float> values) {
            addCriterion("new_au_score in", values, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreNotIn(List<Float> values) {
            addCriterion("new_au_score not in", values, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreBetween(Float value1, Float value2) {
            addCriterion("new_au_score between", value1, value2, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andNewAuScoreNotBetween(Float value1, Float value2) {
            addCriterion("new_au_score not between", value1, value2, "newAuScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioIsNull() {
            addCriterion("day_sevencn_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioIsNotNull() {
            addCriterion("day_sevencn_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioEqualTo(Float value) {
            addCriterion("day_sevencn_ratio =", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioNotEqualTo(Float value) {
            addCriterion("day_sevencn_ratio <>", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioGreaterThan(Float value) {
            addCriterion("day_sevencn_ratio >", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevencn_ratio >=", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioLessThan(Float value) {
            addCriterion("day_sevencn_ratio <", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevencn_ratio <=", value, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioIn(List<Float> values) {
            addCriterion("day_sevencn_ratio in", values, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioNotIn(List<Float> values) {
            addCriterion("day_sevencn_ratio not in", values, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevencn_ratio between", value1, value2, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevencn_ratio not between", value1, value2, "daySevencnRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreIsNull() {
            addCriterion("day_sevencn_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreIsNotNull() {
            addCriterion("day_sevencn_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreEqualTo(Float value) {
            addCriterion("day_sevencn_score =", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreNotEqualTo(Float value) {
            addCriterion("day_sevencn_score <>", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreGreaterThan(Float value) {
            addCriterion("day_sevencn_score >", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevencn_score >=", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreLessThan(Float value) {
            addCriterion("day_sevencn_score <", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevencn_score <=", value, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreIn(List<Float> values) {
            addCriterion("day_sevencn_score in", values, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreNotIn(List<Float> values) {
            addCriterion("day_sevencn_score not in", values, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevencn_score between", value1, value2, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevencnScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevencn_score not between", value1, value2, "daySevencnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioIsNull() {
            addCriterion("day_sevenun_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioIsNotNull() {
            addCriterion("day_sevenun_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioEqualTo(Float value) {
            addCriterion("day_sevenun_ratio =", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioNotEqualTo(Float value) {
            addCriterion("day_sevenun_ratio <>", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioGreaterThan(Float value) {
            addCriterion("day_sevenun_ratio >", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenun_ratio >=", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioLessThan(Float value) {
            addCriterion("day_sevenun_ratio <", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenun_ratio <=", value, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioIn(List<Float> values) {
            addCriterion("day_sevenun_ratio in", values, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioNotIn(List<Float> values) {
            addCriterion("day_sevenun_ratio not in", values, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevenun_ratio between", value1, value2, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenun_ratio not between", value1, value2, "daySevenunRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreIsNull() {
            addCriterion("day_sevenun_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreIsNotNull() {
            addCriterion("day_sevenun_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreEqualTo(Float value) {
            addCriterion("day_sevenun_score =", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreNotEqualTo(Float value) {
            addCriterion("day_sevenun_score <>", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreGreaterThan(Float value) {
            addCriterion("day_sevenun_score >", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenun_score >=", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreLessThan(Float value) {
            addCriterion("day_sevenun_score <", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenun_score <=", value, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreIn(List<Float> values) {
            addCriterion("day_sevenun_score in", values, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreNotIn(List<Float> values) {
            addCriterion("day_sevenun_score not in", values, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevenun_score between", value1, value2, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenunScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenun_score not between", value1, value2, "daySevenunScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioIsNull() {
            addCriterion("morrow_keep_ratio is null");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioIsNotNull() {
            addCriterion("morrow_keep_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioEqualTo(Float value) {
            addCriterion("morrow_keep_ratio =", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioNotEqualTo(Float value) {
            addCriterion("morrow_keep_ratio <>", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioGreaterThan(Float value) {
            addCriterion("morrow_keep_ratio >", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("morrow_keep_ratio >=", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioLessThan(Float value) {
            addCriterion("morrow_keep_ratio <", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioLessThanOrEqualTo(Float value) {
            addCriterion("morrow_keep_ratio <=", value, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioIn(List<Float> values) {
            addCriterion("morrow_keep_ratio in", values, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioNotIn(List<Float> values) {
            addCriterion("morrow_keep_ratio not in", values, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioBetween(Float value1, Float value2) {
            addCriterion("morrow_keep_ratio between", value1, value2, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepRatioNotBetween(Float value1, Float value2) {
            addCriterion("morrow_keep_ratio not between", value1, value2, "morrowKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreIsNull() {
            addCriterion("morrow_keep_score is null");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreIsNotNull() {
            addCriterion("morrow_keep_score is not null");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreEqualTo(Float value) {
            addCriterion("morrow_keep_score =", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreNotEqualTo(Float value) {
            addCriterion("morrow_keep_score <>", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreGreaterThan(Float value) {
            addCriterion("morrow_keep_score >", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("morrow_keep_score >=", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreLessThan(Float value) {
            addCriterion("morrow_keep_score <", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreLessThanOrEqualTo(Float value) {
            addCriterion("morrow_keep_score <=", value, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreIn(List<Float> values) {
            addCriterion("morrow_keep_score in", values, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreNotIn(List<Float> values) {
            addCriterion("morrow_keep_score not in", values, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreBetween(Float value1, Float value2) {
            addCriterion("morrow_keep_score between", value1, value2, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andMorrowKeepScoreNotBetween(Float value1, Float value2) {
            addCriterion("morrow_keep_score not between", value1, value2, "morrowKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioIsNull() {
            addCriterion("seven_keep_ratio is null");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioIsNotNull() {
            addCriterion("seven_keep_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioEqualTo(Float value) {
            addCriterion("seven_keep_ratio =", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioNotEqualTo(Float value) {
            addCriterion("seven_keep_ratio <>", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioGreaterThan(Float value) {
            addCriterion("seven_keep_ratio >", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("seven_keep_ratio >=", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioLessThan(Float value) {
            addCriterion("seven_keep_ratio <", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioLessThanOrEqualTo(Float value) {
            addCriterion("seven_keep_ratio <=", value, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioIn(List<Float> values) {
            addCriterion("seven_keep_ratio in", values, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioNotIn(List<Float> values) {
            addCriterion("seven_keep_ratio not in", values, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioBetween(Float value1, Float value2) {
            addCriterion("seven_keep_ratio between", value1, value2, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepRatioNotBetween(Float value1, Float value2) {
            addCriterion("seven_keep_ratio not between", value1, value2, "sevenKeepRatio");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreIsNull() {
            addCriterion("seven_keep_score is null");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreIsNotNull() {
            addCriterion("seven_keep_score is not null");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreEqualTo(Float value) {
            addCriterion("seven_keep_score =", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreNotEqualTo(Float value) {
            addCriterion("seven_keep_score <>", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreGreaterThan(Float value) {
            addCriterion("seven_keep_score >", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("seven_keep_score >=", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreLessThan(Float value) {
            addCriterion("seven_keep_score <", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreLessThanOrEqualTo(Float value) {
            addCriterion("seven_keep_score <=", value, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreIn(List<Float> values) {
            addCriterion("seven_keep_score in", values, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreNotIn(List<Float> values) {
            addCriterion("seven_keep_score not in", values, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreBetween(Float value1, Float value2) {
            addCriterion("seven_keep_score between", value1, value2, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andSevenKeepScoreNotBetween(Float value1, Float value2) {
            addCriterion("seven_keep_score not between", value1, value2, "sevenKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioIsNull() {
            addCriterion("month_keep_ratio is null");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioIsNotNull() {
            addCriterion("month_keep_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioEqualTo(Float value) {
            addCriterion("month_keep_ratio =", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioNotEqualTo(Float value) {
            addCriterion("month_keep_ratio <>", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioGreaterThan(Float value) {
            addCriterion("month_keep_ratio >", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("month_keep_ratio >=", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioLessThan(Float value) {
            addCriterion("month_keep_ratio <", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioLessThanOrEqualTo(Float value) {
            addCriterion("month_keep_ratio <=", value, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioIn(List<Float> values) {
            addCriterion("month_keep_ratio in", values, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioNotIn(List<Float> values) {
            addCriterion("month_keep_ratio not in", values, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioBetween(Float value1, Float value2) {
            addCriterion("month_keep_ratio between", value1, value2, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepRatioNotBetween(Float value1, Float value2) {
            addCriterion("month_keep_ratio not between", value1, value2, "monthKeepRatio");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreIsNull() {
            addCriterion("month_keep_score is null");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreIsNotNull() {
            addCriterion("month_keep_score is not null");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreEqualTo(Float value) {
            addCriterion("month_keep_score =", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreNotEqualTo(Float value) {
            addCriterion("month_keep_score <>", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreGreaterThan(Float value) {
            addCriterion("month_keep_score >", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("month_keep_score >=", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreLessThan(Float value) {
            addCriterion("month_keep_score <", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreLessThanOrEqualTo(Float value) {
            addCriterion("month_keep_score <=", value, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreIn(List<Float> values) {
            addCriterion("month_keep_score in", values, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreNotIn(List<Float> values) {
            addCriterion("month_keep_score not in", values, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreBetween(Float value1, Float value2) {
            addCriterion("month_keep_score between", value1, value2, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andMonthKeepScoreNotBetween(Float value1, Float value2) {
            addCriterion("month_keep_score not between", value1, value2, "monthKeepScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioIsNull() {
            addCriterion("avg_ua_time_ratio is null");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioIsNotNull() {
            addCriterion("avg_ua_time_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioEqualTo(Float value) {
            addCriterion("avg_ua_time_ratio =", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioNotEqualTo(Float value) {
            addCriterion("avg_ua_time_ratio <>", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioGreaterThan(Float value) {
            addCriterion("avg_ua_time_ratio >", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_ua_time_ratio >=", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioLessThan(Float value) {
            addCriterion("avg_ua_time_ratio <", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioLessThanOrEqualTo(Float value) {
            addCriterion("avg_ua_time_ratio <=", value, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioIn(List<Float> values) {
            addCriterion("avg_ua_time_ratio in", values, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioNotIn(List<Float> values) {
            addCriterion("avg_ua_time_ratio not in", values, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioBetween(Float value1, Float value2) {
            addCriterion("avg_ua_time_ratio between", value1, value2, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeRatioNotBetween(Float value1, Float value2) {
            addCriterion("avg_ua_time_ratio not between", value1, value2, "avgUaTimeRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreIsNull() {
            addCriterion("avg_ua_time_score is null");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreIsNotNull() {
            addCriterion("avg_ua_time_score is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreEqualTo(Float value) {
            addCriterion("avg_ua_time_score =", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreNotEqualTo(Float value) {
            addCriterion("avg_ua_time_score <>", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreGreaterThan(Float value) {
            addCriterion("avg_ua_time_score >", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_ua_time_score >=", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreLessThan(Float value) {
            addCriterion("avg_ua_time_score <", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreLessThanOrEqualTo(Float value) {
            addCriterion("avg_ua_time_score <=", value, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreIn(List<Float> values) {
            addCriterion("avg_ua_time_score in", values, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreNotIn(List<Float> values) {
            addCriterion("avg_ua_time_score not in", values, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreBetween(Float value1, Float value2) {
            addCriterion("avg_ua_time_score between", value1, value2, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaTimeScoreNotBetween(Float value1, Float value2) {
            addCriterion("avg_ua_time_score not between", value1, value2, "avgUaTimeScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioIsNull() {
            addCriterion("avg_ua_pn_ratio is null");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioIsNotNull() {
            addCriterion("avg_ua_pn_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioEqualTo(Float value) {
            addCriterion("avg_ua_pn_ratio =", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioNotEqualTo(Float value) {
            addCriterion("avg_ua_pn_ratio <>", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioGreaterThan(Float value) {
            addCriterion("avg_ua_pn_ratio >", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_ua_pn_ratio >=", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioLessThan(Float value) {
            addCriterion("avg_ua_pn_ratio <", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioLessThanOrEqualTo(Float value) {
            addCriterion("avg_ua_pn_ratio <=", value, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioIn(List<Float> values) {
            addCriterion("avg_ua_pn_ratio in", values, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioNotIn(List<Float> values) {
            addCriterion("avg_ua_pn_ratio not in", values, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioBetween(Float value1, Float value2) {
            addCriterion("avg_ua_pn_ratio between", value1, value2, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnRatioNotBetween(Float value1, Float value2) {
            addCriterion("avg_ua_pn_ratio not between", value1, value2, "avgUaPnRatio");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreIsNull() {
            addCriterion("avg_ua_pn_score is null");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreIsNotNull() {
            addCriterion("avg_ua_pn_score is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreEqualTo(Float value) {
            addCriterion("avg_ua_pn_score =", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreNotEqualTo(Float value) {
            addCriterion("avg_ua_pn_score <>", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreGreaterThan(Float value) {
            addCriterion("avg_ua_pn_score >", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_ua_pn_score >=", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreLessThan(Float value) {
            addCriterion("avg_ua_pn_score <", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreLessThanOrEqualTo(Float value) {
            addCriterion("avg_ua_pn_score <=", value, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreIn(List<Float> values) {
            addCriterion("avg_ua_pn_score in", values, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreNotIn(List<Float> values) {
            addCriterion("avg_ua_pn_score not in", values, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreBetween(Float value1, Float value2) {
            addCriterion("avg_ua_pn_score between", value1, value2, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andAvgUaPnScoreNotBetween(Float value1, Float value2) {
            addCriterion("avg_ua_pn_score not between", value1, value2, "avgUaPnScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioIsNull() {
            addCriterion("day_sevenbcc_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioIsNotNull() {
            addCriterion("day_sevenbcc_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioEqualTo(Float value) {
            addCriterion("day_sevenbcc_ratio =", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioNotEqualTo(Float value) {
            addCriterion("day_sevenbcc_ratio <>", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioGreaterThan(Float value) {
            addCriterion("day_sevenbcc_ratio >", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenbcc_ratio >=", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioLessThan(Float value) {
            addCriterion("day_sevenbcc_ratio <", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenbcc_ratio <=", value, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioIn(List<Float> values) {
            addCriterion("day_sevenbcc_ratio in", values, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioNotIn(List<Float> values) {
            addCriterion("day_sevenbcc_ratio not in", values, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevenbcc_ratio between", value1, value2, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenbcc_ratio not between", value1, value2, "daySevenbccRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreIsNull() {
            addCriterion("day_sevenbcc_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreIsNotNull() {
            addCriterion("day_sevenbcc_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreEqualTo(Float value) {
            addCriterion("day_sevenbcc_score =", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreNotEqualTo(Float value) {
            addCriterion("day_sevenbcc_score <>", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreGreaterThan(Float value) {
            addCriterion("day_sevenbcc_score >", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenbcc_score >=", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreLessThan(Float value) {
            addCriterion("day_sevenbcc_score <", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenbcc_score <=", value, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreIn(List<Float> values) {
            addCriterion("day_sevenbcc_score in", values, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreNotIn(List<Float> values) {
            addCriterion("day_sevenbcc_score not in", values, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevenbcc_score between", value1, value2, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenbccScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenbcc_score not between", value1, value2, "daySevenbccScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioIsNull() {
            addCriterion("day_sevenouc_ratio is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioIsNotNull() {
            addCriterion("day_sevenouc_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioEqualTo(Float value) {
            addCriterion("day_sevenouc_ratio =", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioNotEqualTo(Float value) {
            addCriterion("day_sevenouc_ratio <>", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioGreaterThan(Float value) {
            addCriterion("day_sevenouc_ratio >", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenouc_ratio >=", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioLessThan(Float value) {
            addCriterion("day_sevenouc_ratio <", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenouc_ratio <=", value, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioIn(List<Float> values) {
            addCriterion("day_sevenouc_ratio in", values, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioNotIn(List<Float> values) {
            addCriterion("day_sevenouc_ratio not in", values, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioBetween(Float value1, Float value2) {
            addCriterion("day_sevenouc_ratio between", value1, value2, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucRatioNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenouc_ratio not between", value1, value2, "daySevenoucRatio");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreIsNull() {
            addCriterion("day_sevenouc_score is null");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreIsNotNull() {
            addCriterion("day_sevenouc_score is not null");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreEqualTo(Float value) {
            addCriterion("day_sevenouc_score =", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreNotEqualTo(Float value) {
            addCriterion("day_sevenouc_score <>", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreGreaterThan(Float value) {
            addCriterion("day_sevenouc_score >", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("day_sevenouc_score >=", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreLessThan(Float value) {
            addCriterion("day_sevenouc_score <", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreLessThanOrEqualTo(Float value) {
            addCriterion("day_sevenouc_score <=", value, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreIn(List<Float> values) {
            addCriterion("day_sevenouc_score in", values, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreNotIn(List<Float> values) {
            addCriterion("day_sevenouc_score not in", values, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreBetween(Float value1, Float value2) {
            addCriterion("day_sevenouc_score between", value1, value2, "daySevenoucScore");
            return (Criteria) this;
        }

        public Criteria andDaySevenoucScoreNotBetween(Float value1, Float value2) {
            addCriterion("day_sevenouc_score not between", value1, value2, "daySevenoucScore");
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

        public Criteria andChannelDateIsNull() {
            addCriterion("channel_date is null");
            return (Criteria) this;
        }

        public Criteria andChannelDateIsNotNull() {
            addCriterion("channel_date is not null");
            return (Criteria) this;
        }

        public Criteria andChannelDateEqualTo(String value) {
            addCriterion("channel_date =", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateNotEqualTo(String value) {
            addCriterion("channel_date <>", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateGreaterThan(String value) {
            addCriterion("channel_date >", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateGreaterThanOrEqualTo(String value) {
            addCriterion("channel_date >=", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateLessThan(String value) {
            addCriterion("channel_date <", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateLessThanOrEqualTo(String value) {
            addCriterion("channel_date <=", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateLike(String value) {
            addCriterion("channel_date like", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateNotLike(String value) {
            addCriterion("channel_date not like", value, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateIn(List<String> values) {
            addCriterion("channel_date in", values, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateNotIn(List<String> values) {
            addCriterion("channel_date not in", values, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateBetween(String value1, String value2) {
            addCriterion("channel_date between", value1, value2, "channelDate");
            return (Criteria) this;
        }

        public Criteria andChannelDateNotBetween(String value1, String value2) {
            addCriterion("channel_date not between", value1, value2, "channelDate");
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