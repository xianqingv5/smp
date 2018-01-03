package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class OverviewChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverviewChannelExample() {
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

        public Criteria andOverviewIdIsNull() {
            addCriterion("overview_id is null");
            return (Criteria) this;
        }

        public Criteria andOverviewIdIsNotNull() {
            addCriterion("overview_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverviewIdEqualTo(Integer value) {
            addCriterion("overview_id =", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdNotEqualTo(Integer value) {
            addCriterion("overview_id <>", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdGreaterThan(Integer value) {
            addCriterion("overview_id >", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("overview_id >=", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdLessThan(Integer value) {
            addCriterion("overview_id <", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("overview_id <=", value, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdIn(List<Integer> values) {
            addCriterion("overview_id in", values, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdNotIn(List<Integer> values) {
            addCriterion("overview_id not in", values, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdBetween(Integer value1, Integer value2) {
            addCriterion("overview_id between", value1, value2, "overviewId");
            return (Criteria) this;
        }

        public Criteria andOverviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("overview_id not between", value1, value2, "overviewId");
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

        public Criteria andDataPlatformIsNull() {
            addCriterion("data_platform is null");
            return (Criteria) this;
        }

        public Criteria andDataPlatformIsNotNull() {
            addCriterion("data_platform is not null");
            return (Criteria) this;
        }

        public Criteria andDataPlatformEqualTo(Integer value) {
            addCriterion("data_platform =", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformNotEqualTo(Integer value) {
            addCriterion("data_platform <>", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformGreaterThan(Integer value) {
            addCriterion("data_platform >", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_platform >=", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformLessThan(Integer value) {
            addCriterion("data_platform <", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("data_platform <=", value, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformIn(List<Integer> values) {
            addCriterion("data_platform in", values, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformNotIn(List<Integer> values) {
            addCriterion("data_platform not in", values, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformBetween(Integer value1, Integer value2) {
            addCriterion("data_platform between", value1, value2, "dataPlatform");
            return (Criteria) this;
        }

        public Criteria andDataPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("data_platform not between", value1, value2, "dataPlatform");
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