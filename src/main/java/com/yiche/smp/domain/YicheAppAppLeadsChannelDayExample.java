package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class YicheAppAppLeadsChannelDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YicheAppAppLeadsChannelDayExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andUserCntIsNull() {
            addCriterion("user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andUserCntIsNotNull() {
            addCriterion("user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andUserCntEqualTo(Long value) {
            addCriterion("user_cnt =", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntNotEqualTo(Long value) {
            addCriterion("user_cnt <>", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntGreaterThan(Long value) {
            addCriterion("user_cnt >", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("user_cnt >=", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntLessThan(Long value) {
            addCriterion("user_cnt <", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntLessThanOrEqualTo(Long value) {
            addCriterion("user_cnt <=", value, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntIn(List<Long> values) {
            addCriterion("user_cnt in", values, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntNotIn(List<Long> values) {
            addCriterion("user_cnt not in", values, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntBetween(Long value1, Long value2) {
            addCriterion("user_cnt between", value1, value2, "userCnt");
            return (Criteria) this;
        }

        public Criteria andUserCntNotBetween(Long value1, Long value2) {
            addCriterion("user_cnt not between", value1, value2, "userCnt");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayIsNull() {
            addCriterion("overlap_7day is null");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayIsNotNull() {
            addCriterion("overlap_7day is not null");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayEqualTo(Long value) {
            addCriterion("overlap_7day =", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayNotEqualTo(Long value) {
            addCriterion("overlap_7day <>", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayGreaterThan(Long value) {
            addCriterion("overlap_7day >", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayGreaterThanOrEqualTo(Long value) {
            addCriterion("overlap_7day >=", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayLessThan(Long value) {
            addCriterion("overlap_7day <", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayLessThanOrEqualTo(Long value) {
            addCriterion("overlap_7day <=", value, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayIn(List<Long> values) {
            addCriterion("overlap_7day in", values, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayNotIn(List<Long> values) {
            addCriterion("overlap_7day not in", values, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayBetween(Long value1, Long value2) {
            addCriterion("overlap_7day between", value1, value2, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andOverlap7dayNotBetween(Long value1, Long value2) {
            addCriterion("overlap_7day not between", value1, value2, "overlap7day");
            return (Criteria) this;
        }

        public Criteria andNewUserCntIsNull() {
            addCriterion("new_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewUserCntIsNotNull() {
            addCriterion("new_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserCntEqualTo(Long value) {
            addCriterion("new_user_cnt =", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntNotEqualTo(Long value) {
            addCriterion("new_user_cnt <>", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntGreaterThan(Long value) {
            addCriterion("new_user_cnt >", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_user_cnt >=", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntLessThan(Long value) {
            addCriterion("new_user_cnt <", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntLessThanOrEqualTo(Long value) {
            addCriterion("new_user_cnt <=", value, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntIn(List<Long> values) {
            addCriterion("new_user_cnt in", values, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntNotIn(List<Long> values) {
            addCriterion("new_user_cnt not in", values, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntBetween(Long value1, Long value2) {
            addCriterion("new_user_cnt between", value1, value2, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCntNotBetween(Long value1, Long value2) {
            addCriterion("new_user_cnt not between", value1, value2, "newUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserCostIsNull() {
            addCriterion("new_user_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewUserCostIsNotNull() {
            addCriterion("new_user_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserCostEqualTo(Float value) {
            addCriterion("new_user_cost =", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostNotEqualTo(Float value) {
            addCriterion("new_user_cost <>", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostGreaterThan(Float value) {
            addCriterion("new_user_cost >", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_cost >=", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostLessThan(Float value) {
            addCriterion("new_user_cost <", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostLessThanOrEqualTo(Float value) {
            addCriterion("new_user_cost <=", value, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostIn(List<Float> values) {
            addCriterion("new_user_cost in", values, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostNotIn(List<Float> values) {
            addCriterion("new_user_cost not in", values, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostBetween(Float value1, Float value2) {
            addCriterion("new_user_cost between", value1, value2, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserCostNotBetween(Float value1, Float value2) {
            addCriterion("new_user_cost not between", value1, value2, "newUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCntIsNull() {
            addCriterion("leads_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLeadsCntIsNotNull() {
            addCriterion("leads_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsCntEqualTo(Long value) {
            addCriterion("leads_cnt =", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntNotEqualTo(Long value) {
            addCriterion("leads_cnt <>", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntGreaterThan(Long value) {
            addCriterion("leads_cnt >", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntGreaterThanOrEqualTo(Long value) {
            addCriterion("leads_cnt >=", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntLessThan(Long value) {
            addCriterion("leads_cnt <", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntLessThanOrEqualTo(Long value) {
            addCriterion("leads_cnt <=", value, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntIn(List<Long> values) {
            addCriterion("leads_cnt in", values, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntNotIn(List<Long> values) {
            addCriterion("leads_cnt not in", values, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntBetween(Long value1, Long value2) {
            addCriterion("leads_cnt between", value1, value2, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsCntNotBetween(Long value1, Long value2) {
            addCriterion("leads_cnt not between", value1, value2, "leadsCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaIsNull() {
            addCriterion("user_to_leads_reta is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaIsNotNull() {
            addCriterion("user_to_leads_reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaEqualTo(Float value) {
            addCriterion("user_to_leads_reta =", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaNotEqualTo(Float value) {
            addCriterion("user_to_leads_reta <>", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaGreaterThan(Float value) {
            addCriterion("user_to_leads_reta >", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_reta >=", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaLessThan(Float value) {
            addCriterion("user_to_leads_reta <", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaLessThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_reta <=", value, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaIn(List<Float> values) {
            addCriterion("user_to_leads_reta in", values, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaNotIn(List<Float> values) {
            addCriterion("user_to_leads_reta not in", values, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_reta between", value1, value2, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeadsRetaNotBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_reta not between", value1, value2, "userToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andLeadsCostIsNull() {
            addCriterion("leads_cost is null");
            return (Criteria) this;
        }

        public Criteria andLeadsCostIsNotNull() {
            addCriterion("leads_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsCostEqualTo(Float value) {
            addCriterion("leads_cost =", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostNotEqualTo(Float value) {
            addCriterion("leads_cost <>", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostGreaterThan(Float value) {
            addCriterion("leads_cost >", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostGreaterThanOrEqualTo(Float value) {
            addCriterion("leads_cost >=", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostLessThan(Float value) {
            addCriterion("leads_cost <", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostLessThanOrEqualTo(Float value) {
            addCriterion("leads_cost <=", value, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostIn(List<Float> values) {
            addCriterion("leads_cost in", values, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostNotIn(List<Float> values) {
            addCriterion("leads_cost not in", values, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostBetween(Float value1, Float value2) {
            addCriterion("leads_cost between", value1, value2, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andLeadsCostNotBetween(Float value1, Float value2) {
            addCriterion("leads_cost not between", value1, value2, "leadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntIsNull() {
            addCriterion("new_leads_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntIsNotNull() {
            addCriterion("new_leads_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntEqualTo(Long value) {
            addCriterion("new_leads_cnt =", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntNotEqualTo(Long value) {
            addCriterion("new_leads_cnt <>", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntGreaterThan(Long value) {
            addCriterion("new_leads_cnt >", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_leads_cnt >=", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntLessThan(Long value) {
            addCriterion("new_leads_cnt <", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntLessThanOrEqualTo(Long value) {
            addCriterion("new_leads_cnt <=", value, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntIn(List<Long> values) {
            addCriterion("new_leads_cnt in", values, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntNotIn(List<Long> values) {
            addCriterion("new_leads_cnt not in", values, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntBetween(Long value1, Long value2) {
            addCriterion("new_leads_cnt between", value1, value2, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCntNotBetween(Long value1, Long value2) {
            addCriterion("new_leads_cnt not between", value1, value2, "newLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaIsNull() {
            addCriterion("new_leads_reta is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaIsNotNull() {
            addCriterion("new_leads_reta is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaEqualTo(Float value) {
            addCriterion("new_leads_reta =", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaNotEqualTo(Float value) {
            addCriterion("new_leads_reta <>", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaGreaterThan(Float value) {
            addCriterion("new_leads_reta >", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("new_leads_reta >=", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaLessThan(Float value) {
            addCriterion("new_leads_reta <", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaLessThanOrEqualTo(Float value) {
            addCriterion("new_leads_reta <=", value, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaIn(List<Float> values) {
            addCriterion("new_leads_reta in", values, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaNotIn(List<Float> values) {
            addCriterion("new_leads_reta not in", values, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaBetween(Float value1, Float value2) {
            addCriterion("new_leads_reta between", value1, value2, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsRetaNotBetween(Float value1, Float value2) {
            addCriterion("new_leads_reta not between", value1, value2, "newLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostIsNull() {
            addCriterion("new_leads_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostIsNotNull() {
            addCriterion("new_leads_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostEqualTo(Float value) {
            addCriterion("new_leads_cost =", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostNotEqualTo(Float value) {
            addCriterion("new_leads_cost <>", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostGreaterThan(Float value) {
            addCriterion("new_leads_cost >", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_leads_cost >=", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostLessThan(Float value) {
            addCriterion("new_leads_cost <", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostLessThanOrEqualTo(Float value) {
            addCriterion("new_leads_cost <=", value, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostIn(List<Float> values) {
            addCriterion("new_leads_cost in", values, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostNotIn(List<Float> values) {
            addCriterion("new_leads_cost not in", values, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostBetween(Float value1, Float value2) {
            addCriterion("new_leads_cost between", value1, value2, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsCostNotBetween(Float value1, Float value2) {
            addCriterion("new_leads_cost not between", value1, value2, "newLeadsCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntIsNull() {
            addCriterion("user_to_leads_7day_cnt is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntIsNotNull() {
            addCriterion("user_to_leads_7day_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntEqualTo(Long value) {
            addCriterion("user_to_leads_7day_cnt =", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntNotEqualTo(Long value) {
            addCriterion("user_to_leads_7day_cnt <>", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntGreaterThan(Long value) {
            addCriterion("user_to_leads_7day_cnt >", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntGreaterThanOrEqualTo(Long value) {
            addCriterion("user_to_leads_7day_cnt >=", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntLessThan(Long value) {
            addCriterion("user_to_leads_7day_cnt <", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntLessThanOrEqualTo(Long value) {
            addCriterion("user_to_leads_7day_cnt <=", value, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntIn(List<Long> values) {
            addCriterion("user_to_leads_7day_cnt in", values, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntNotIn(List<Long> values) {
            addCriterion("user_to_leads_7day_cnt not in", values, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntBetween(Long value1, Long value2) {
            addCriterion("user_to_leads_7day_cnt between", value1, value2, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCntNotBetween(Long value1, Long value2) {
            addCriterion("user_to_leads_7day_cnt not between", value1, value2, "userToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaIsNull() {
            addCriterion("user_to_leads_7day_reta is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaIsNotNull() {
            addCriterion("user_to_leads_7day_reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaEqualTo(Float value) {
            addCriterion("user_to_leads_7day_reta =", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaNotEqualTo(Float value) {
            addCriterion("user_to_leads_7day_reta <>", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaGreaterThan(Float value) {
            addCriterion("user_to_leads_7day_reta >", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_7day_reta >=", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaLessThan(Float value) {
            addCriterion("user_to_leads_7day_reta <", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaLessThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_7day_reta <=", value, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaIn(List<Float> values) {
            addCriterion("user_to_leads_7day_reta in", values, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaNotIn(List<Float> values) {
            addCriterion("user_to_leads_7day_reta not in", values, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_7day_reta between", value1, value2, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayRetaNotBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_7day_reta not between", value1, value2, "userToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostIsNull() {
            addCriterion("user_to_leads_7day_cost is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostIsNotNull() {
            addCriterion("user_to_leads_7day_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostEqualTo(Float value) {
            addCriterion("user_to_leads_7day_cost =", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostNotEqualTo(Float value) {
            addCriterion("user_to_leads_7day_cost <>", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostGreaterThan(Float value) {
            addCriterion("user_to_leads_7day_cost >", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostGreaterThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_7day_cost >=", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostLessThan(Float value) {
            addCriterion("user_to_leads_7day_cost <", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostLessThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_7day_cost <=", value, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostIn(List<Float> values) {
            addCriterion("user_to_leads_7day_cost in", values, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostNotIn(List<Float> values) {
            addCriterion("user_to_leads_7day_cost not in", values, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_7day_cost between", value1, value2, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads7dayCostNotBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_7day_cost not between", value1, value2, "userToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntIsNull() {
            addCriterion("user_to_leads_30day_cnt is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntIsNotNull() {
            addCriterion("user_to_leads_30day_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntEqualTo(Long value) {
            addCriterion("user_to_leads_30day_cnt =", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntNotEqualTo(Long value) {
            addCriterion("user_to_leads_30day_cnt <>", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntGreaterThan(Long value) {
            addCriterion("user_to_leads_30day_cnt >", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntGreaterThanOrEqualTo(Long value) {
            addCriterion("user_to_leads_30day_cnt >=", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntLessThan(Long value) {
            addCriterion("user_to_leads_30day_cnt <", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntLessThanOrEqualTo(Long value) {
            addCriterion("user_to_leads_30day_cnt <=", value, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntIn(List<Long> values) {
            addCriterion("user_to_leads_30day_cnt in", values, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntNotIn(List<Long> values) {
            addCriterion("user_to_leads_30day_cnt not in", values, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntBetween(Long value1, Long value2) {
            addCriterion("user_to_leads_30day_cnt between", value1, value2, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCntNotBetween(Long value1, Long value2) {
            addCriterion("user_to_leads_30day_cnt not between", value1, value2, "userToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaIsNull() {
            addCriterion("user_to_leads_30day_reta is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaIsNotNull() {
            addCriterion("user_to_leads_30day_reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaEqualTo(Float value) {
            addCriterion("user_to_leads_30day_reta =", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaNotEqualTo(Float value) {
            addCriterion("user_to_leads_30day_reta <>", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaGreaterThan(Float value) {
            addCriterion("user_to_leads_30day_reta >", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_30day_reta >=", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaLessThan(Float value) {
            addCriterion("user_to_leads_30day_reta <", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaLessThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_30day_reta <=", value, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaIn(List<Float> values) {
            addCriterion("user_to_leads_30day_reta in", values, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaNotIn(List<Float> values) {
            addCriterion("user_to_leads_30day_reta not in", values, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_30day_reta between", value1, value2, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayRetaNotBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_30day_reta not between", value1, value2, "userToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostIsNull() {
            addCriterion("user_to_leads_30day_cost is null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostIsNotNull() {
            addCriterion("user_to_leads_30day_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostEqualTo(Float value) {
            addCriterion("user_to_leads_30day_cost =", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostNotEqualTo(Float value) {
            addCriterion("user_to_leads_30day_cost <>", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostGreaterThan(Float value) {
            addCriterion("user_to_leads_30day_cost >", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostGreaterThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_30day_cost >=", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostLessThan(Float value) {
            addCriterion("user_to_leads_30day_cost <", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostLessThanOrEqualTo(Float value) {
            addCriterion("user_to_leads_30day_cost <=", value, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostIn(List<Float> values) {
            addCriterion("user_to_leads_30day_cost in", values, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostNotIn(List<Float> values) {
            addCriterion("user_to_leads_30day_cost not in", values, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_30day_cost between", value1, value2, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserToLeads30dayCostNotBetween(Float value1, Float value2) {
            addCriterion("user_to_leads_30day_cost not between", value1, value2, "userToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntIsNull() {
            addCriterion("leads_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntIsNotNull() {
            addCriterion("leads_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntEqualTo(Long value) {
            addCriterion("leads_user_cnt =", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntNotEqualTo(Long value) {
            addCriterion("leads_user_cnt <>", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntGreaterThan(Long value) {
            addCriterion("leads_user_cnt >", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("leads_user_cnt >=", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntLessThan(Long value) {
            addCriterion("leads_user_cnt <", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntLessThanOrEqualTo(Long value) {
            addCriterion("leads_user_cnt <=", value, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntIn(List<Long> values) {
            addCriterion("leads_user_cnt in", values, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntNotIn(List<Long> values) {
            addCriterion("leads_user_cnt not in", values, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntBetween(Long value1, Long value2) {
            addCriterion("leads_user_cnt between", value1, value2, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntNotBetween(Long value1, Long value2) {
            addCriterion("leads_user_cnt not between", value1, value2, "leadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaIsNull() {
            addCriterion("leads_user_cnt_reta is null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaIsNotNull() {
            addCriterion("leads_user_cnt_reta is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaEqualTo(Float value) {
            addCriterion("leads_user_cnt_reta =", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaNotEqualTo(Float value) {
            addCriterion("leads_user_cnt_reta <>", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaGreaterThan(Float value) {
            addCriterion("leads_user_cnt_reta >", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("leads_user_cnt_reta >=", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaLessThan(Float value) {
            addCriterion("leads_user_cnt_reta <", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaLessThanOrEqualTo(Float value) {
            addCriterion("leads_user_cnt_reta <=", value, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaIn(List<Float> values) {
            addCriterion("leads_user_cnt_reta in", values, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaNotIn(List<Float> values) {
            addCriterion("leads_user_cnt_reta not in", values, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaBetween(Float value1, Float value2) {
            addCriterion("leads_user_cnt_reta between", value1, value2, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCntRetaNotBetween(Float value1, Float value2) {
            addCriterion("leads_user_cnt_reta not between", value1, value2, "leadsUserCntReta");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostIsNull() {
            addCriterion("leads_user_cost is null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostIsNotNull() {
            addCriterion("leads_user_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostEqualTo(Float value) {
            addCriterion("leads_user_cost =", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostNotEqualTo(Float value) {
            addCriterion("leads_user_cost <>", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostGreaterThan(Float value) {
            addCriterion("leads_user_cost >", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostGreaterThanOrEqualTo(Float value) {
            addCriterion("leads_user_cost >=", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostLessThan(Float value) {
            addCriterion("leads_user_cost <", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostLessThanOrEqualTo(Float value) {
            addCriterion("leads_user_cost <=", value, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostIn(List<Float> values) {
            addCriterion("leads_user_cost in", values, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostNotIn(List<Float> values) {
            addCriterion("leads_user_cost not in", values, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostBetween(Float value1, Float value2) {
            addCriterion("leads_user_cost between", value1, value2, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andLeadsUserCostNotBetween(Float value1, Float value2) {
            addCriterion("leads_user_cost not between", value1, value2, "leadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntIsNull() {
            addCriterion("new_leads_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntIsNotNull() {
            addCriterion("new_leads_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntEqualTo(Long value) {
            addCriterion("new_leads_user_cnt =", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntNotEqualTo(Long value) {
            addCriterion("new_leads_user_cnt <>", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntGreaterThan(Long value) {
            addCriterion("new_leads_user_cnt >", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_leads_user_cnt >=", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntLessThan(Long value) {
            addCriterion("new_leads_user_cnt <", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntLessThanOrEqualTo(Long value) {
            addCriterion("new_leads_user_cnt <=", value, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntIn(List<Long> values) {
            addCriterion("new_leads_user_cnt in", values, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntNotIn(List<Long> values) {
            addCriterion("new_leads_user_cnt not in", values, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntBetween(Long value1, Long value2) {
            addCriterion("new_leads_user_cnt between", value1, value2, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCntNotBetween(Long value1, Long value2) {
            addCriterion("new_leads_user_cnt not between", value1, value2, "newLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaIsNull() {
            addCriterion("new_leads_user_reta is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaIsNotNull() {
            addCriterion("new_leads_user_reta is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaEqualTo(Float value) {
            addCriterion("new_leads_user_reta =", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaNotEqualTo(Float value) {
            addCriterion("new_leads_user_reta <>", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaGreaterThan(Float value) {
            addCriterion("new_leads_user_reta >", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("new_leads_user_reta >=", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaLessThan(Float value) {
            addCriterion("new_leads_user_reta <", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaLessThanOrEqualTo(Float value) {
            addCriterion("new_leads_user_reta <=", value, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaIn(List<Float> values) {
            addCriterion("new_leads_user_reta in", values, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaNotIn(List<Float> values) {
            addCriterion("new_leads_user_reta not in", values, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaBetween(Float value1, Float value2) {
            addCriterion("new_leads_user_reta between", value1, value2, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserRetaNotBetween(Float value1, Float value2) {
            addCriterion("new_leads_user_reta not between", value1, value2, "newLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntIsNull() {
            addCriterion("brand_new_leads_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntIsNotNull() {
            addCriterion("brand_new_leads_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntEqualTo(Long value) {
            addCriterion("brand_new_leads_user_cnt =", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntNotEqualTo(Long value) {
            addCriterion("brand_new_leads_user_cnt <>", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntGreaterThan(Long value) {
            addCriterion("brand_new_leads_user_cnt >", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_new_leads_user_cnt >=", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntLessThan(Long value) {
            addCriterion("brand_new_leads_user_cnt <", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntLessThanOrEqualTo(Long value) {
            addCriterion("brand_new_leads_user_cnt <=", value, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntIn(List<Long> values) {
            addCriterion("brand_new_leads_user_cnt in", values, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntNotIn(List<Long> values) {
            addCriterion("brand_new_leads_user_cnt not in", values, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntBetween(Long value1, Long value2) {
            addCriterion("brand_new_leads_user_cnt between", value1, value2, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserCntNotBetween(Long value1, Long value2) {
            addCriterion("brand_new_leads_user_cnt not between", value1, value2, "brandNewLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaIsNull() {
            addCriterion("brand_new_leads_user_reta is null");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaIsNotNull() {
            addCriterion("brand_new_leads_user_reta is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaEqualTo(Float value) {
            addCriterion("brand_new_leads_user_reta =", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaNotEqualTo(Float value) {
            addCriterion("brand_new_leads_user_reta <>", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaGreaterThan(Float value) {
            addCriterion("brand_new_leads_user_reta >", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("brand_new_leads_user_reta >=", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaLessThan(Float value) {
            addCriterion("brand_new_leads_user_reta <", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaLessThanOrEqualTo(Float value) {
            addCriterion("brand_new_leads_user_reta <=", value, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaIn(List<Float> values) {
            addCriterion("brand_new_leads_user_reta in", values, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaNotIn(List<Float> values) {
            addCriterion("brand_new_leads_user_reta not in", values, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaBetween(Float value1, Float value2) {
            addCriterion("brand_new_leads_user_reta between", value1, value2, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andBrandNewLeadsUserRetaNotBetween(Float value1, Float value2) {
            addCriterion("brand_new_leads_user_reta not between", value1, value2, "brandNewLeadsUserReta");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostIsNull() {
            addCriterion("new_leads_user_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostIsNotNull() {
            addCriterion("new_leads_user_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostEqualTo(Float value) {
            addCriterion("new_leads_user_cost =", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostNotEqualTo(Float value) {
            addCriterion("new_leads_user_cost <>", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostGreaterThan(Float value) {
            addCriterion("new_leads_user_cost >", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_leads_user_cost >=", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostLessThan(Float value) {
            addCriterion("new_leads_user_cost <", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostLessThanOrEqualTo(Float value) {
            addCriterion("new_leads_user_cost <=", value, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostIn(List<Float> values) {
            addCriterion("new_leads_user_cost in", values, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostNotIn(List<Float> values) {
            addCriterion("new_leads_user_cost not in", values, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostBetween(Float value1, Float value2) {
            addCriterion("new_leads_user_cost between", value1, value2, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewLeadsUserCostNotBetween(Float value1, Float value2) {
            addCriterion("new_leads_user_cost not between", value1, value2, "newLeadsUserCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntIsNull() {
            addCriterion("new_user_to_leads_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntIsNotNull() {
            addCriterion("new_user_to_leads_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntEqualTo(Long value) {
            addCriterion("new_user_to_leads_cnt =", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntNotEqualTo(Long value) {
            addCriterion("new_user_to_leads_cnt <>", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntGreaterThan(Long value) {
            addCriterion("new_user_to_leads_cnt >", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_cnt >=", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntLessThan(Long value) {
            addCriterion("new_user_to_leads_cnt <", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntLessThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_cnt <=", value, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntIn(List<Long> values) {
            addCriterion("new_user_to_leads_cnt in", values, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntNotIn(List<Long> values) {
            addCriterion("new_user_to_leads_cnt not in", values, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_cnt between", value1, value2, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCntNotBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_cnt not between", value1, value2, "newUserToLeadsCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaIsNull() {
            addCriterion("new_user_to_leads_reta is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaIsNotNull() {
            addCriterion("new_user_to_leads_reta is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaEqualTo(Float value) {
            addCriterion("new_user_to_leads_reta =", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_reta <>", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaGreaterThan(Float value) {
            addCriterion("new_user_to_leads_reta >", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_reta >=", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaLessThan(Float value) {
            addCriterion("new_user_to_leads_reta <", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_reta <=", value, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaIn(List<Float> values) {
            addCriterion("new_user_to_leads_reta in", values, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_reta not in", values, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_reta between", value1, value2, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsRetaNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_reta not between", value1, value2, "newUserToLeadsReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostIsNull() {
            addCriterion("new_user_to_leads_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostIsNotNull() {
            addCriterion("new_user_to_leads_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostEqualTo(Float value) {
            addCriterion("new_user_to_leads_cost =", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_cost <>", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostGreaterThan(Float value) {
            addCriterion("new_user_to_leads_cost >", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_cost >=", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostLessThan(Float value) {
            addCriterion("new_user_to_leads_cost <", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_cost <=", value, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostIn(List<Float> values) {
            addCriterion("new_user_to_leads_cost in", values, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_cost not in", values, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_cost between", value1, value2, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeadsCostNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_cost not between", value1, value2, "newUserToLeadsCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntIsNull() {
            addCriterion("new_user_to_leads_7day_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntIsNotNull() {
            addCriterion("new_user_to_leads_7day_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntEqualTo(Long value) {
            addCriterion("new_user_to_leads_7day_cnt =", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntNotEqualTo(Long value) {
            addCriterion("new_user_to_leads_7day_cnt <>", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntGreaterThan(Long value) {
            addCriterion("new_user_to_leads_7day_cnt >", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_7day_cnt >=", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntLessThan(Long value) {
            addCriterion("new_user_to_leads_7day_cnt <", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntLessThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_7day_cnt <=", value, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntIn(List<Long> values) {
            addCriterion("new_user_to_leads_7day_cnt in", values, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntNotIn(List<Long> values) {
            addCriterion("new_user_to_leads_7day_cnt not in", values, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_7day_cnt between", value1, value2, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCntNotBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_7day_cnt not between", value1, value2, "newUserToLeads7dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaIsNull() {
            addCriterion("new_user_to_leads_7day_reta is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaIsNotNull() {
            addCriterion("new_user_to_leads_7day_reta is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_reta =", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_reta <>", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaGreaterThan(Float value) {
            addCriterion("new_user_to_leads_7day_reta >", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_reta >=", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaLessThan(Float value) {
            addCriterion("new_user_to_leads_7day_reta <", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_reta <=", value, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaIn(List<Float> values) {
            addCriterion("new_user_to_leads_7day_reta in", values, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_7day_reta not in", values, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_7day_reta between", value1, value2, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayRetaNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_7day_reta not between", value1, value2, "newUserToLeads7dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostIsNull() {
            addCriterion("new_user_to_leads_7day_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostIsNotNull() {
            addCriterion("new_user_to_leads_7day_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_cost =", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_cost <>", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostGreaterThan(Float value) {
            addCriterion("new_user_to_leads_7day_cost >", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_cost >=", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostLessThan(Float value) {
            addCriterion("new_user_to_leads_7day_cost <", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_7day_cost <=", value, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostIn(List<Float> values) {
            addCriterion("new_user_to_leads_7day_cost in", values, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_7day_cost not in", values, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_7day_cost between", value1, value2, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads7dayCostNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_7day_cost not between", value1, value2, "newUserToLeads7dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntIsNull() {
            addCriterion("new_user_to_leads_30day_cnt is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntIsNotNull() {
            addCriterion("new_user_to_leads_30day_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntEqualTo(Long value) {
            addCriterion("new_user_to_leads_30day_cnt =", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntNotEqualTo(Long value) {
            addCriterion("new_user_to_leads_30day_cnt <>", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntGreaterThan(Long value) {
            addCriterion("new_user_to_leads_30day_cnt >", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntGreaterThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_30day_cnt >=", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntLessThan(Long value) {
            addCriterion("new_user_to_leads_30day_cnt <", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntLessThanOrEqualTo(Long value) {
            addCriterion("new_user_to_leads_30day_cnt <=", value, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntIn(List<Long> values) {
            addCriterion("new_user_to_leads_30day_cnt in", values, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntNotIn(List<Long> values) {
            addCriterion("new_user_to_leads_30day_cnt not in", values, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_30day_cnt between", value1, value2, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCntNotBetween(Long value1, Long value2) {
            addCriterion("new_user_to_leads_30day_cnt not between", value1, value2, "newUserToLeads30dayCnt");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaIsNull() {
            addCriterion("new_user_to_leads_30day_reta is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaIsNotNull() {
            addCriterion("new_user_to_leads_30day_reta is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_reta =", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_reta <>", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaGreaterThan(Float value) {
            addCriterion("new_user_to_leads_30day_reta >", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_reta >=", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaLessThan(Float value) {
            addCriterion("new_user_to_leads_30day_reta <", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_reta <=", value, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaIn(List<Float> values) {
            addCriterion("new_user_to_leads_30day_reta in", values, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_30day_reta not in", values, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_30day_reta between", value1, value2, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayRetaNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_30day_reta not between", value1, value2, "newUserToLeads30dayReta");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostIsNull() {
            addCriterion("new_user_to_leads_30day_cost is null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostIsNotNull() {
            addCriterion("new_user_to_leads_30day_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_cost =", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostNotEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_cost <>", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostGreaterThan(Float value) {
            addCriterion("new_user_to_leads_30day_cost >", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostGreaterThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_cost >=", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostLessThan(Float value) {
            addCriterion("new_user_to_leads_30day_cost <", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostLessThanOrEqualTo(Float value) {
            addCriterion("new_user_to_leads_30day_cost <=", value, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostIn(List<Float> values) {
            addCriterion("new_user_to_leads_30day_cost in", values, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostNotIn(List<Float> values) {
            addCriterion("new_user_to_leads_30day_cost not in", values, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_30day_cost between", value1, value2, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andNewUserToLeads30dayCostNotBetween(Float value1, Float value2) {
            addCriterion("new_user_to_leads_30day_cost not between", value1, value2, "newUserToLeads30dayCost");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaIsNull() {
            addCriterion("user_cnt_2reta is null");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaIsNotNull() {
            addCriterion("user_cnt_2reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaEqualTo(Float value) {
            addCriterion("user_cnt_2reta =", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaNotEqualTo(Float value) {
            addCriterion("user_cnt_2reta <>", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaGreaterThan(Float value) {
            addCriterion("user_cnt_2reta >", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_cnt_2reta >=", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaLessThan(Float value) {
            addCriterion("user_cnt_2reta <", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaLessThanOrEqualTo(Float value) {
            addCriterion("user_cnt_2reta <=", value, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaIn(List<Float> values) {
            addCriterion("user_cnt_2reta in", values, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaNotIn(List<Float> values) {
            addCriterion("user_cnt_2reta not in", values, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaBetween(Float value1, Float value2) {
            addCriterion("user_cnt_2reta between", value1, value2, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt2retaNotBetween(Float value1, Float value2) {
            addCriterion("user_cnt_2reta not between", value1, value2, "userCnt2reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaIsNull() {
            addCriterion("user_cnt_3reta is null");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaIsNotNull() {
            addCriterion("user_cnt_3reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaEqualTo(Float value) {
            addCriterion("user_cnt_3reta =", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaNotEqualTo(Float value) {
            addCriterion("user_cnt_3reta <>", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaGreaterThan(Float value) {
            addCriterion("user_cnt_3reta >", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_cnt_3reta >=", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaLessThan(Float value) {
            addCriterion("user_cnt_3reta <", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaLessThanOrEqualTo(Float value) {
            addCriterion("user_cnt_3reta <=", value, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaIn(List<Float> values) {
            addCriterion("user_cnt_3reta in", values, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaNotIn(List<Float> values) {
            addCriterion("user_cnt_3reta not in", values, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaBetween(Float value1, Float value2) {
            addCriterion("user_cnt_3reta between", value1, value2, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt3retaNotBetween(Float value1, Float value2) {
            addCriterion("user_cnt_3reta not between", value1, value2, "userCnt3reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaIsNull() {
            addCriterion("user_cnt_7reta is null");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaIsNotNull() {
            addCriterion("user_cnt_7reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaEqualTo(Float value) {
            addCriterion("user_cnt_7reta =", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaNotEqualTo(Float value) {
            addCriterion("user_cnt_7reta <>", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaGreaterThan(Float value) {
            addCriterion("user_cnt_7reta >", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_cnt_7reta >=", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaLessThan(Float value) {
            addCriterion("user_cnt_7reta <", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaLessThanOrEqualTo(Float value) {
            addCriterion("user_cnt_7reta <=", value, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaIn(List<Float> values) {
            addCriterion("user_cnt_7reta in", values, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaNotIn(List<Float> values) {
            addCriterion("user_cnt_7reta not in", values, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaBetween(Float value1, Float value2) {
            addCriterion("user_cnt_7reta between", value1, value2, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt7retaNotBetween(Float value1, Float value2) {
            addCriterion("user_cnt_7reta not between", value1, value2, "userCnt7reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaIsNull() {
            addCriterion("user_cnt_14reta is null");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaIsNotNull() {
            addCriterion("user_cnt_14reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaEqualTo(Float value) {
            addCriterion("user_cnt_14reta =", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaNotEqualTo(Float value) {
            addCriterion("user_cnt_14reta <>", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaGreaterThan(Float value) {
            addCriterion("user_cnt_14reta >", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_cnt_14reta >=", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaLessThan(Float value) {
            addCriterion("user_cnt_14reta <", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaLessThanOrEqualTo(Float value) {
            addCriterion("user_cnt_14reta <=", value, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaIn(List<Float> values) {
            addCriterion("user_cnt_14reta in", values, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaNotIn(List<Float> values) {
            addCriterion("user_cnt_14reta not in", values, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaBetween(Float value1, Float value2) {
            addCriterion("user_cnt_14reta between", value1, value2, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt14retaNotBetween(Float value1, Float value2) {
            addCriterion("user_cnt_14reta not between", value1, value2, "userCnt14reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaIsNull() {
            addCriterion("user_cnt_30reta is null");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaIsNotNull() {
            addCriterion("user_cnt_30reta is not null");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaEqualTo(Float value) {
            addCriterion("user_cnt_30reta =", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaNotEqualTo(Float value) {
            addCriterion("user_cnt_30reta <>", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaGreaterThan(Float value) {
            addCriterion("user_cnt_30reta >", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaGreaterThanOrEqualTo(Float value) {
            addCriterion("user_cnt_30reta >=", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaLessThan(Float value) {
            addCriterion("user_cnt_30reta <", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaLessThanOrEqualTo(Float value) {
            addCriterion("user_cnt_30reta <=", value, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaIn(List<Float> values) {
            addCriterion("user_cnt_30reta in", values, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaNotIn(List<Float> values) {
            addCriterion("user_cnt_30reta not in", values, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaBetween(Float value1, Float value2) {
            addCriterion("user_cnt_30reta between", value1, value2, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andUserCnt30retaNotBetween(Float value1, Float value2) {
            addCriterion("user_cnt_30reta not between", value1, value2, "userCnt30reta");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgIsNull() {
            addCriterion("visit_time_avg is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgIsNotNull() {
            addCriterion("visit_time_avg is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgEqualTo(Float value) {
            addCriterion("visit_time_avg =", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgNotEqualTo(Float value) {
            addCriterion("visit_time_avg <>", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgGreaterThan(Float value) {
            addCriterion("visit_time_avg >", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgGreaterThanOrEqualTo(Float value) {
            addCriterion("visit_time_avg >=", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgLessThan(Float value) {
            addCriterion("visit_time_avg <", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgLessThanOrEqualTo(Float value) {
            addCriterion("visit_time_avg <=", value, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgIn(List<Float> values) {
            addCriterion("visit_time_avg in", values, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgNotIn(List<Float> values) {
            addCriterion("visit_time_avg not in", values, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgBetween(Float value1, Float value2) {
            addCriterion("visit_time_avg between", value1, value2, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitTimeAvgNotBetween(Float value1, Float value2) {
            addCriterion("visit_time_avg not between", value1, value2, "visitTimeAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgIsNull() {
            addCriterion("visit_page_avg is null");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgIsNotNull() {
            addCriterion("visit_page_avg is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgEqualTo(Float value) {
            addCriterion("visit_page_avg =", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgNotEqualTo(Float value) {
            addCriterion("visit_page_avg <>", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgGreaterThan(Float value) {
            addCriterion("visit_page_avg >", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgGreaterThanOrEqualTo(Float value) {
            addCriterion("visit_page_avg >=", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgLessThan(Float value) {
            addCriterion("visit_page_avg <", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgLessThanOrEqualTo(Float value) {
            addCriterion("visit_page_avg <=", value, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgIn(List<Float> values) {
            addCriterion("visit_page_avg in", values, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgNotIn(List<Float> values) {
            addCriterion("visit_page_avg not in", values, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgBetween(Float value1, Float value2) {
            addCriterion("visit_page_avg between", value1, value2, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitPageAvgNotBetween(Float value1, Float value2) {
            addCriterion("visit_page_avg not between", value1, value2, "visitPageAvg");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvIsNull() {
            addCriterion("visit_model_pv is null");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvIsNotNull() {
            addCriterion("visit_model_pv is not null");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvEqualTo(Long value) {
            addCriterion("visit_model_pv =", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvNotEqualTo(Long value) {
            addCriterion("visit_model_pv <>", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvGreaterThan(Long value) {
            addCriterion("visit_model_pv >", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_model_pv >=", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvLessThan(Long value) {
            addCriterion("visit_model_pv <", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvLessThanOrEqualTo(Long value) {
            addCriterion("visit_model_pv <=", value, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvIn(List<Long> values) {
            addCriterion("visit_model_pv in", values, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvNotIn(List<Long> values) {
            addCriterion("visit_model_pv not in", values, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvBetween(Long value1, Long value2) {
            addCriterion("visit_model_pv between", value1, value2, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelPvNotBetween(Long value1, Long value2) {
            addCriterion("visit_model_pv not between", value1, value2, "visitModelPv");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaIsNull() {
            addCriterion("visit_model_reta is null");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaIsNotNull() {
            addCriterion("visit_model_reta is not null");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaEqualTo(Float value) {
            addCriterion("visit_model_reta =", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaNotEqualTo(Float value) {
            addCriterion("visit_model_reta <>", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaGreaterThan(Float value) {
            addCriterion("visit_model_reta >", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("visit_model_reta >=", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaLessThan(Float value) {
            addCriterion("visit_model_reta <", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaLessThanOrEqualTo(Float value) {
            addCriterion("visit_model_reta <=", value, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaIn(List<Float> values) {
            addCriterion("visit_model_reta in", values, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaNotIn(List<Float> values) {
            addCriterion("visit_model_reta not in", values, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaBetween(Float value1, Float value2) {
            addCriterion("visit_model_reta between", value1, value2, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitModelRetaNotBetween(Float value1, Float value2) {
            addCriterion("visit_model_reta not between", value1, value2, "visitModelReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvIsNull() {
            addCriterion("visit_leads_pv is null");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvIsNotNull() {
            addCriterion("visit_leads_pv is not null");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvEqualTo(Long value) {
            addCriterion("visit_leads_pv =", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvNotEqualTo(Long value) {
            addCriterion("visit_leads_pv <>", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvGreaterThan(Long value) {
            addCriterion("visit_leads_pv >", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_leads_pv >=", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvLessThan(Long value) {
            addCriterion("visit_leads_pv <", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvLessThanOrEqualTo(Long value) {
            addCriterion("visit_leads_pv <=", value, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvIn(List<Long> values) {
            addCriterion("visit_leads_pv in", values, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvNotIn(List<Long> values) {
            addCriterion("visit_leads_pv not in", values, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvBetween(Long value1, Long value2) {
            addCriterion("visit_leads_pv between", value1, value2, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsPvNotBetween(Long value1, Long value2) {
            addCriterion("visit_leads_pv not between", value1, value2, "visitLeadsPv");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaIsNull() {
            addCriterion("visit_leads_reta is null");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaIsNotNull() {
            addCriterion("visit_leads_reta is not null");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaEqualTo(Float value) {
            addCriterion("visit_leads_reta =", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaNotEqualTo(Float value) {
            addCriterion("visit_leads_reta <>", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaGreaterThan(Float value) {
            addCriterion("visit_leads_reta >", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("visit_leads_reta >=", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaLessThan(Float value) {
            addCriterion("visit_leads_reta <", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaLessThanOrEqualTo(Float value) {
            addCriterion("visit_leads_reta <=", value, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaIn(List<Float> values) {
            addCriterion("visit_leads_reta in", values, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaNotIn(List<Float> values) {
            addCriterion("visit_leads_reta not in", values, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaBetween(Float value1, Float value2) {
            addCriterion("visit_leads_reta between", value1, value2, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andVisitLeadsRetaNotBetween(Float value1, Float value2) {
            addCriterion("visit_leads_reta not between", value1, value2, "visitLeadsReta");
            return (Criteria) this;
        }

        public Criteria andCallUserCntIsNull() {
            addCriterion("call_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCallUserCntIsNotNull() {
            addCriterion("call_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCallUserCntEqualTo(Long value) {
            addCriterion("call_user_cnt =", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntNotEqualTo(Long value) {
            addCriterion("call_user_cnt <>", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntGreaterThan(Long value) {
            addCriterion("call_user_cnt >", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("call_user_cnt >=", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntLessThan(Long value) {
            addCriterion("call_user_cnt <", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntLessThanOrEqualTo(Long value) {
            addCriterion("call_user_cnt <=", value, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntIn(List<Long> values) {
            addCriterion("call_user_cnt in", values, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntNotIn(List<Long> values) {
            addCriterion("call_user_cnt not in", values, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntBetween(Long value1, Long value2) {
            addCriterion("call_user_cnt between", value1, value2, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallUserCntNotBetween(Long value1, Long value2) {
            addCriterion("call_user_cnt not between", value1, value2, "callUserCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNull() {
            addCriterion("call_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNotNull() {
            addCriterion("call_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualTo(Long value) {
            addCriterion("call_cnt =", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Long value) {
            addCriterion("call_cnt <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Long value) {
            addCriterion("call_cnt >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Long value) {
            addCriterion("call_cnt >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Long value) {
            addCriterion("call_cnt <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Long value) {
            addCriterion("call_cnt <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntIn(List<Long> values) {
            addCriterion("call_cnt in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotIn(List<Long> values) {
            addCriterion("call_cnt not in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntBetween(Long value1, Long value2) {
            addCriterion("call_cnt between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotBetween(Long value1, Long value2) {
            addCriterion("call_cnt not between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaIsNull() {
            addCriterion("call_answer_reta is null");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaIsNotNull() {
            addCriterion("call_answer_reta is not null");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaEqualTo(Float value) {
            addCriterion("call_answer_reta =", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaNotEqualTo(Float value) {
            addCriterion("call_answer_reta <>", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaGreaterThan(Float value) {
            addCriterion("call_answer_reta >", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("call_answer_reta >=", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaLessThan(Float value) {
            addCriterion("call_answer_reta <", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaLessThanOrEqualTo(Float value) {
            addCriterion("call_answer_reta <=", value, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaIn(List<Float> values) {
            addCriterion("call_answer_reta in", values, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaNotIn(List<Float> values) {
            addCriterion("call_answer_reta not in", values, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaBetween(Float value1, Float value2) {
            addCriterion("call_answer_reta between", value1, value2, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallAnswerRetaNotBetween(Float value1, Float value2) {
            addCriterion("call_answer_reta not between", value1, value2, "callAnswerReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaIsNull() {
            addCriterion("call_questionnaire_done_reta is null");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaIsNotNull() {
            addCriterion("call_questionnaire_done_reta is not null");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaEqualTo(Float value) {
            addCriterion("call_questionnaire_done_reta =", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaNotEqualTo(Float value) {
            addCriterion("call_questionnaire_done_reta <>", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaGreaterThan(Float value) {
            addCriterion("call_questionnaire_done_reta >", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("call_questionnaire_done_reta >=", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaLessThan(Float value) {
            addCriterion("call_questionnaire_done_reta <", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaLessThanOrEqualTo(Float value) {
            addCriterion("call_questionnaire_done_reta <=", value, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaIn(List<Float> values) {
            addCriterion("call_questionnaire_done_reta in", values, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaNotIn(List<Float> values) {
            addCriterion("call_questionnaire_done_reta not in", values, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaBetween(Float value1, Float value2) {
            addCriterion("call_questionnaire_done_reta between", value1, value2, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCallQuestionnaireDoneRetaNotBetween(Float value1, Float value2) {
            addCriterion("call_questionnaire_done_reta not between", value1, value2, "callQuestionnaireDoneReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaIsNull() {
            addCriterion("car_buy_plan_reta is null");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaIsNotNull() {
            addCriterion("car_buy_plan_reta is not null");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaEqualTo(Float value) {
            addCriterion("car_buy_plan_reta =", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaNotEqualTo(Float value) {
            addCriterion("car_buy_plan_reta <>", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaGreaterThan(Float value) {
            addCriterion("car_buy_plan_reta >", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("car_buy_plan_reta >=", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaLessThan(Float value) {
            addCriterion("car_buy_plan_reta <", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaLessThanOrEqualTo(Float value) {
            addCriterion("car_buy_plan_reta <=", value, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaIn(List<Float> values) {
            addCriterion("car_buy_plan_reta in", values, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaNotIn(List<Float> values) {
            addCriterion("car_buy_plan_reta not in", values, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaBetween(Float value1, Float value2) {
            addCriterion("car_buy_plan_reta between", value1, value2, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andCarBuyPlanRetaNotBetween(Float value1, Float value2) {
            addCriterion("car_buy_plan_reta not between", value1, value2, "carBuyPlanReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaIsNull() {
            addCriterion("exit_price_reta is null");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaIsNotNull() {
            addCriterion("exit_price_reta is not null");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaEqualTo(Float value) {
            addCriterion("exit_price_reta =", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaNotEqualTo(Float value) {
            addCriterion("exit_price_reta <>", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaGreaterThan(Float value) {
            addCriterion("exit_price_reta >", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("exit_price_reta >=", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaLessThan(Float value) {
            addCriterion("exit_price_reta <", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaLessThanOrEqualTo(Float value) {
            addCriterion("exit_price_reta <=", value, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaIn(List<Float> values) {
            addCriterion("exit_price_reta in", values, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaNotIn(List<Float> values) {
            addCriterion("exit_price_reta not in", values, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaBetween(Float value1, Float value2) {
            addCriterion("exit_price_reta between", value1, value2, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitPriceRetaNotBetween(Float value1, Float value2) {
            addCriterion("exit_price_reta not between", value1, value2, "exitPriceReta");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntIsNull() {
            addCriterion("exit_leads_user_cnt is null");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntIsNotNull() {
            addCriterion("exit_leads_user_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntEqualTo(Long value) {
            addCriterion("exit_leads_user_cnt =", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntNotEqualTo(Long value) {
            addCriterion("exit_leads_user_cnt <>", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntGreaterThan(Long value) {
            addCriterion("exit_leads_user_cnt >", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntGreaterThanOrEqualTo(Long value) {
            addCriterion("exit_leads_user_cnt >=", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntLessThan(Long value) {
            addCriterion("exit_leads_user_cnt <", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntLessThanOrEqualTo(Long value) {
            addCriterion("exit_leads_user_cnt <=", value, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntIn(List<Long> values) {
            addCriterion("exit_leads_user_cnt in", values, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntNotIn(List<Long> values) {
            addCriterion("exit_leads_user_cnt not in", values, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntBetween(Long value1, Long value2) {
            addCriterion("exit_leads_user_cnt between", value1, value2, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andExitLeadsUserCntNotBetween(Long value1, Long value2) {
            addCriterion("exit_leads_user_cnt not between", value1, value2, "exitLeadsUserCnt");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaIsNull() {
            addCriterion("overlap_year_reta is null");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaIsNotNull() {
            addCriterion("overlap_year_reta is not null");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaEqualTo(Float value) {
            addCriterion("overlap_year_reta =", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaNotEqualTo(Float value) {
            addCriterion("overlap_year_reta <>", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaGreaterThan(Float value) {
            addCriterion("overlap_year_reta >", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("overlap_year_reta >=", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaLessThan(Float value) {
            addCriterion("overlap_year_reta <", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaLessThanOrEqualTo(Float value) {
            addCriterion("overlap_year_reta <=", value, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaIn(List<Float> values) {
            addCriterion("overlap_year_reta in", values, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaNotIn(List<Float> values) {
            addCriterion("overlap_year_reta not in", values, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaBetween(Float value1, Float value2) {
            addCriterion("overlap_year_reta between", value1, value2, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andOverlapYearRetaNotBetween(Float value1, Float value2) {
            addCriterion("overlap_year_reta not between", value1, value2, "overlapYearReta");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntIsNull() {
            addCriterion("model_plan_cnt is null");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntIsNotNull() {
            addCriterion("model_plan_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntEqualTo(Float value) {
            addCriterion("model_plan_cnt =", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntNotEqualTo(Float value) {
            addCriterion("model_plan_cnt <>", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntGreaterThan(Float value) {
            addCriterion("model_plan_cnt >", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntGreaterThanOrEqualTo(Float value) {
            addCriterion("model_plan_cnt >=", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntLessThan(Float value) {
            addCriterion("model_plan_cnt <", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntLessThanOrEqualTo(Float value) {
            addCriterion("model_plan_cnt <=", value, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntIn(List<Float> values) {
            addCriterion("model_plan_cnt in", values, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntNotIn(List<Float> values) {
            addCriterion("model_plan_cnt not in", values, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntBetween(Float value1, Float value2) {
            addCriterion("model_plan_cnt between", value1, value2, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andModelPlanCntNotBetween(Float value1, Float value2) {
            addCriterion("model_plan_cnt not between", value1, value2, "modelPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntIsNull() {
            addCriterion("car_plan_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntIsNotNull() {
            addCriterion("car_plan_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntEqualTo(Float value) {
            addCriterion("car_plan_cnt =", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntNotEqualTo(Float value) {
            addCriterion("car_plan_cnt <>", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntGreaterThan(Float value) {
            addCriterion("car_plan_cnt >", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntGreaterThanOrEqualTo(Float value) {
            addCriterion("car_plan_cnt >=", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntLessThan(Float value) {
            addCriterion("car_plan_cnt <", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntLessThanOrEqualTo(Float value) {
            addCriterion("car_plan_cnt <=", value, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntIn(List<Float> values) {
            addCriterion("car_plan_cnt in", values, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntNotIn(List<Float> values) {
            addCriterion("car_plan_cnt not in", values, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntBetween(Float value1, Float value2) {
            addCriterion("car_plan_cnt between", value1, value2, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andCarPlanCntNotBetween(Float value1, Float value2) {
            addCriterion("car_plan_cnt not between", value1, value2, "carPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntIsNull() {
            addCriterion("brand_plan_cnt is null");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntIsNotNull() {
            addCriterion("brand_plan_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntEqualTo(Float value) {
            addCriterion("brand_plan_cnt =", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntNotEqualTo(Float value) {
            addCriterion("brand_plan_cnt <>", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntGreaterThan(Float value) {
            addCriterion("brand_plan_cnt >", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntGreaterThanOrEqualTo(Float value) {
            addCriterion("brand_plan_cnt >=", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntLessThan(Float value) {
            addCriterion("brand_plan_cnt <", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntLessThanOrEqualTo(Float value) {
            addCriterion("brand_plan_cnt <=", value, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntIn(List<Float> values) {
            addCriterion("brand_plan_cnt in", values, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntNotIn(List<Float> values) {
            addCriterion("brand_plan_cnt not in", values, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntBetween(Float value1, Float value2) {
            addCriterion("brand_plan_cnt between", value1, value2, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andBrandPlanCntNotBetween(Float value1, Float value2) {
            addCriterion("brand_plan_cnt not between", value1, value2, "brandPlanCnt");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaIsNull() {
            addCriterion("remote_leads_reta is null");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaIsNotNull() {
            addCriterion("remote_leads_reta is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaEqualTo(Float value) {
            addCriterion("remote_leads_reta =", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaNotEqualTo(Float value) {
            addCriterion("remote_leads_reta <>", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaGreaterThan(Float value) {
            addCriterion("remote_leads_reta >", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaGreaterThanOrEqualTo(Float value) {
            addCriterion("remote_leads_reta >=", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaLessThan(Float value) {
            addCriterion("remote_leads_reta <", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaLessThanOrEqualTo(Float value) {
            addCriterion("remote_leads_reta <=", value, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaIn(List<Float> values) {
            addCriterion("remote_leads_reta in", values, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaNotIn(List<Float> values) {
            addCriterion("remote_leads_reta not in", values, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaBetween(Float value1, Float value2) {
            addCriterion("remote_leads_reta between", value1, value2, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andRemoteLeadsRetaNotBetween(Float value1, Float value2) {
            addCriterion("remote_leads_reta not between", value1, value2, "remoteLeadsReta");
            return (Criteria) this;
        }

        public Criteria andBtIsNull() {
            addCriterion("bt is null");
            return (Criteria) this;
        }

        public Criteria andBtIsNotNull() {
            addCriterion("bt is not null");
            return (Criteria) this;
        }

        public Criteria andBtEqualTo(String value) {
            addCriterion("bt =", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotEqualTo(String value) {
            addCriterion("bt <>", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtGreaterThan(String value) {
            addCriterion("bt >", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtGreaterThanOrEqualTo(String value) {
            addCriterion("bt >=", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtLessThan(String value) {
            addCriterion("bt <", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtLessThanOrEqualTo(String value) {
            addCriterion("bt <=", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtLike(String value) {
            addCriterion("bt like", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotLike(String value) {
            addCriterion("bt not like", value, "bt");
            return (Criteria) this;
        }

        public Criteria andBtIn(List<String> values) {
            addCriterion("bt in", values, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotIn(List<String> values) {
            addCriterion("bt not in", values, "bt");
            return (Criteria) this;
        }

        public Criteria andBtBetween(String value1, String value2) {
            addCriterion("bt between", value1, value2, "bt");
            return (Criteria) this;
        }

        public Criteria andBtNotBetween(String value1, String value2) {
            addCriterion("bt not between", value1, value2, "bt");
            return (Criteria) this;
        }

        public Criteria andClueAvgIsNull() {
            addCriterion("clue_avg is null");
            return (Criteria) this;
        }

        public Criteria andClueAvgIsNotNull() {
            addCriterion("clue_avg is not null");
            return (Criteria) this;
        }

        public Criteria andClueAvgEqualTo(Float value) {
            addCriterion("clue_avg =", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotEqualTo(Float value) {
            addCriterion("clue_avg <>", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgGreaterThan(Float value) {
            addCriterion("clue_avg >", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgGreaterThanOrEqualTo(Float value) {
            addCriterion("clue_avg >=", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgLessThan(Float value) {
            addCriterion("clue_avg <", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgLessThanOrEqualTo(Float value) {
            addCriterion("clue_avg <=", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgIn(List<Float> values) {
            addCriterion("clue_avg in", values, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotIn(List<Float> values) {
            addCriterion("clue_avg not in", values, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgBetween(Float value1, Float value2) {
            addCriterion("clue_avg between", value1, value2, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotBetween(Float value1, Float value2) {
            addCriterion("clue_avg not between", value1, value2, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearIsNull() {
            addCriterion("clueusercount_brandyear is null");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearIsNotNull() {
            addCriterion("clueusercount_brandyear is not null");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearEqualTo(Long value) {
            addCriterion("clueusercount_brandyear =", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearNotEqualTo(Long value) {
            addCriterion("clueusercount_brandyear <>", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearGreaterThan(Long value) {
            addCriterion("clueusercount_brandyear >", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearGreaterThanOrEqualTo(Long value) {
            addCriterion("clueusercount_brandyear >=", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearLessThan(Long value) {
            addCriterion("clueusercount_brandyear <", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearLessThanOrEqualTo(Long value) {
            addCriterion("clueusercount_brandyear <=", value, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearIn(List<Long> values) {
            addCriterion("clueusercount_brandyear in", values, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearNotIn(List<Long> values) {
            addCriterion("clueusercount_brandyear not in", values, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearBetween(Long value1, Long value2) {
            addCriterion("clueusercount_brandyear between", value1, value2, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andClueusercountBrandyearNotBetween(Long value1, Long value2) {
            addCriterion("clueusercount_brandyear not between", value1, value2, "clueusercountBrandyear");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentIsNull() {
            addCriterion("platform_userrepeat_percent is null");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentIsNotNull() {
            addCriterion("platform_userrepeat_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentEqualTo(Float value) {
            addCriterion("platform_userrepeat_percent =", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentNotEqualTo(Float value) {
            addCriterion("platform_userrepeat_percent <>", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentGreaterThan(Float value) {
            addCriterion("platform_userrepeat_percent >", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("platform_userrepeat_percent >=", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentLessThan(Float value) {
            addCriterion("platform_userrepeat_percent <", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentLessThanOrEqualTo(Float value) {
            addCriterion("platform_userrepeat_percent <=", value, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentIn(List<Float> values) {
            addCriterion("platform_userrepeat_percent in", values, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentNotIn(List<Float> values) {
            addCriterion("platform_userrepeat_percent not in", values, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentBetween(Float value1, Float value2) {
            addCriterion("platform_userrepeat_percent between", value1, value2, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformUserrepeatPercentNotBetween(Float value1, Float value2) {
            addCriterion("platform_userrepeat_percent not between", value1, value2, "platformUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentIsNull() {
            addCriterion("platform_brand_userrepeat_percent is null");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentIsNotNull() {
            addCriterion("platform_brand_userrepeat_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentEqualTo(Float value) {
            addCriterion("platform_brand_userrepeat_percent =", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentNotEqualTo(Float value) {
            addCriterion("platform_brand_userrepeat_percent <>", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentGreaterThan(Float value) {
            addCriterion("platform_brand_userrepeat_percent >", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("platform_brand_userrepeat_percent >=", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentLessThan(Float value) {
            addCriterion("platform_brand_userrepeat_percent <", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentLessThanOrEqualTo(Float value) {
            addCriterion("platform_brand_userrepeat_percent <=", value, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentIn(List<Float> values) {
            addCriterion("platform_brand_userrepeat_percent in", values, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentNotIn(List<Float> values) {
            addCriterion("platform_brand_userrepeat_percent not in", values, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentBetween(Float value1, Float value2) {
            addCriterion("platform_brand_userrepeat_percent between", value1, value2, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andPlatformBrandUserrepeatPercentNotBetween(Float value1, Float value2) {
            addCriterion("platform_brand_userrepeat_percent not between", value1, value2, "platformBrandUserrepeatPercent");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("application not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andActualConsumeIsNull() {
            addCriterion("actual_consume is null");
            return (Criteria) this;
        }

        public Criteria andActualConsumeIsNotNull() {
            addCriterion("actual_consume is not null");
            return (Criteria) this;
        }

        public Criteria andActualConsumeEqualTo(Float value) {
            addCriterion("actual_consume =", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeNotEqualTo(Float value) {
            addCriterion("actual_consume <>", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeGreaterThan(Float value) {
            addCriterion("actual_consume >", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_consume >=", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeLessThan(Float value) {
            addCriterion("actual_consume <", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeLessThanOrEqualTo(Float value) {
            addCriterion("actual_consume <=", value, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeIn(List<Float> values) {
            addCriterion("actual_consume in", values, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeNotIn(List<Float> values) {
            addCriterion("actual_consume not in", values, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeBetween(Float value1, Float value2) {
            addCriterion("actual_consume between", value1, value2, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andActualConsumeNotBetween(Float value1, Float value2) {
            addCriterion("actual_consume not between", value1, value2, "actualConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeIsNull() {
            addCriterion("account_consume is null");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeIsNotNull() {
            addCriterion("account_consume is not null");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeEqualTo(Float value) {
            addCriterion("account_consume =", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeNotEqualTo(Float value) {
            addCriterion("account_consume <>", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeGreaterThan(Float value) {
            addCriterion("account_consume >", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeGreaterThanOrEqualTo(Float value) {
            addCriterion("account_consume >=", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeLessThan(Float value) {
            addCriterion("account_consume <", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeLessThanOrEqualTo(Float value) {
            addCriterion("account_consume <=", value, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeIn(List<Float> values) {
            addCriterion("account_consume in", values, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeNotIn(List<Float> values) {
            addCriterion("account_consume not in", values, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeBetween(Float value1, Float value2) {
            addCriterion("account_consume between", value1, value2, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAccountConsumeNotBetween(Float value1, Float value2) {
            addCriterion("account_consume not between", value1, value2, "accountConsume");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateIsNull() {
            addCriterion("agency_rebate is null");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateIsNotNull() {
            addCriterion("agency_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateEqualTo(Float value) {
            addCriterion("agency_rebate =", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateNotEqualTo(Float value) {
            addCriterion("agency_rebate <>", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateGreaterThan(Float value) {
            addCriterion("agency_rebate >", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateGreaterThanOrEqualTo(Float value) {
            addCriterion("agency_rebate >=", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateLessThan(Float value) {
            addCriterion("agency_rebate <", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateLessThanOrEqualTo(Float value) {
            addCriterion("agency_rebate <=", value, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateIn(List<Float> values) {
            addCriterion("agency_rebate in", values, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateNotIn(List<Float> values) {
            addCriterion("agency_rebate not in", values, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateBetween(Float value1, Float value2) {
            addCriterion("agency_rebate between", value1, value2, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andAgencyRebateNotBetween(Float value1, Float value2) {
            addCriterion("agency_rebate not between", value1, value2, "agencyRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateIsNull() {
            addCriterion("media_rebate is null");
            return (Criteria) this;
        }

        public Criteria andMediaRebateIsNotNull() {
            addCriterion("media_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andMediaRebateEqualTo(Float value) {
            addCriterion("media_rebate =", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateNotEqualTo(Float value) {
            addCriterion("media_rebate <>", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateGreaterThan(Float value) {
            addCriterion("media_rebate >", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateGreaterThanOrEqualTo(Float value) {
            addCriterion("media_rebate >=", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateLessThan(Float value) {
            addCriterion("media_rebate <", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateLessThanOrEqualTo(Float value) {
            addCriterion("media_rebate <=", value, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateIn(List<Float> values) {
            addCriterion("media_rebate in", values, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateNotIn(List<Float> values) {
            addCriterion("media_rebate not in", values, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateBetween(Float value1, Float value2) {
            addCriterion("media_rebate between", value1, value2, "mediaRebate");
            return (Criteria) this;
        }

        public Criteria andMediaRebateNotBetween(Float value1, Float value2) {
            addCriterion("media_rebate not between", value1, value2, "mediaRebate");
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