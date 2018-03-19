package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class YichePcwapAppLeadsChannelDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YichePcwapAppLeadsChannelDayExample() {
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

        public Criteria andDtIsNull() {
            addCriterion("dt is null");
            return (Criteria) this;
        }

        public Criteria andDtIsNotNull() {
            addCriterion("dt is not null");
            return (Criteria) this;
        }

        public Criteria andDtEqualTo(String value) {
            addCriterion("dt =", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotEqualTo(String value) {
            addCriterion("dt <>", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThan(String value) {
            addCriterion("dt >", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThanOrEqualTo(String value) {
            addCriterion("dt >=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThan(String value) {
            addCriterion("dt <", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThanOrEqualTo(String value) {
            addCriterion("dt <=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLike(String value) {
            addCriterion("dt like", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotLike(String value) {
            addCriterion("dt not like", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtIn(List<String> values) {
            addCriterion("dt in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotIn(List<String> values) {
            addCriterion("dt not in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtBetween(String value1, String value2) {
            addCriterion("dt between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotBetween(String value1, String value2) {
            addCriterion("dt not between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andPlatFormIsNull() {
            addCriterion("plat_form is null");
            return (Criteria) this;
        }

        public Criteria andPlatFormIsNotNull() {
            addCriterion("plat_form is not null");
            return (Criteria) this;
        }

        public Criteria andPlatFormEqualTo(String value) {
            addCriterion("plat_form =", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormNotEqualTo(String value) {
            addCriterion("plat_form <>", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormGreaterThan(String value) {
            addCriterion("plat_form >", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormGreaterThanOrEqualTo(String value) {
            addCriterion("plat_form >=", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormLessThan(String value) {
            addCriterion("plat_form <", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormLessThanOrEqualTo(String value) {
            addCriterion("plat_form <=", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormLike(String value) {
            addCriterion("plat_form like", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormNotLike(String value) {
            addCriterion("plat_form not like", value, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormIn(List<String> values) {
            addCriterion("plat_form in", values, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormNotIn(List<String> values) {
            addCriterion("plat_form not in", values, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormBetween(String value1, String value2) {
            addCriterion("plat_form between", value1, value2, "platForm");
            return (Criteria) this;
        }

        public Criteria andPlatFormNotBetween(String value1, String value2) {
            addCriterion("plat_form not between", value1, value2, "platForm");
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

        public Criteria andPathnameIsNull() {
            addCriterion("pathname is null");
            return (Criteria) this;
        }

        public Criteria andPathnameIsNotNull() {
            addCriterion("pathname is not null");
            return (Criteria) this;
        }

        public Criteria andPathnameEqualTo(String value) {
            addCriterion("pathname =", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotEqualTo(String value) {
            addCriterion("pathname <>", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThan(String value) {
            addCriterion("pathname >", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameGreaterThanOrEqualTo(String value) {
            addCriterion("pathname >=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThan(String value) {
            addCriterion("pathname <", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLessThanOrEqualTo(String value) {
            addCriterion("pathname <=", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameLike(String value) {
            addCriterion("pathname like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotLike(String value) {
            addCriterion("pathname not like", value, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameIn(List<String> values) {
            addCriterion("pathname in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotIn(List<String> values) {
            addCriterion("pathname not in", values, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameBetween(String value1, String value2) {
            addCriterion("pathname between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andPathnameNotBetween(String value1, String value2) {
            addCriterion("pathname not between", value1, value2, "pathname");
            return (Criteria) this;
        }

        public Criteria andMediaNoIsNull() {
            addCriterion("media_no is null");
            return (Criteria) this;
        }

        public Criteria andMediaNoIsNotNull() {
            addCriterion("media_no is not null");
            return (Criteria) this;
        }

        public Criteria andMediaNoEqualTo(String value) {
            addCriterion("media_no =", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoNotEqualTo(String value) {
            addCriterion("media_no <>", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoGreaterThan(String value) {
            addCriterion("media_no >", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoGreaterThanOrEqualTo(String value) {
            addCriterion("media_no >=", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoLessThan(String value) {
            addCriterion("media_no <", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoLessThanOrEqualTo(String value) {
            addCriterion("media_no <=", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoLike(String value) {
            addCriterion("media_no like", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoNotLike(String value) {
            addCriterion("media_no not like", value, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoIn(List<String> values) {
            addCriterion("media_no in", values, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoNotIn(List<String> values) {
            addCriterion("media_no not in", values, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoBetween(String value1, String value2) {
            addCriterion("media_no between", value1, value2, "mediaNo");
            return (Criteria) this;
        }

        public Criteria andMediaNoNotBetween(String value1, String value2) {
            addCriterion("media_no not between", value1, value2, "mediaNo");
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

        public Criteria andChannelDoorIsNull() {
            addCriterion("channel_door is null");
            return (Criteria) this;
        }

        public Criteria andChannelDoorIsNotNull() {
            addCriterion("channel_door is not null");
            return (Criteria) this;
        }

        public Criteria andChannelDoorEqualTo(String value) {
            addCriterion("channel_door =", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorNotEqualTo(String value) {
            addCriterion("channel_door <>", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorGreaterThan(String value) {
            addCriterion("channel_door >", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorGreaterThanOrEqualTo(String value) {
            addCriterion("channel_door >=", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorLessThan(String value) {
            addCriterion("channel_door <", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorLessThanOrEqualTo(String value) {
            addCriterion("channel_door <=", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorLike(String value) {
            addCriterion("channel_door like", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorNotLike(String value) {
            addCriterion("channel_door not like", value, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorIn(List<String> values) {
            addCriterion("channel_door in", values, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorNotIn(List<String> values) {
            addCriterion("channel_door not in", values, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorBetween(String value1, String value2) {
            addCriterion("channel_door between", value1, value2, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelDoorNotBetween(String value1, String value2) {
            addCriterion("channel_door not between", value1, value2, "channelDoor");
            return (Criteria) this;
        }

        public Criteria andChannelLocIsNull() {
            addCriterion("channel_loc is null");
            return (Criteria) this;
        }

        public Criteria andChannelLocIsNotNull() {
            addCriterion("channel_loc is not null");
            return (Criteria) this;
        }

        public Criteria andChannelLocEqualTo(String value) {
            addCriterion("channel_loc =", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocNotEqualTo(String value) {
            addCriterion("channel_loc <>", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocGreaterThan(String value) {
            addCriterion("channel_loc >", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocGreaterThanOrEqualTo(String value) {
            addCriterion("channel_loc >=", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocLessThan(String value) {
            addCriterion("channel_loc <", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocLessThanOrEqualTo(String value) {
            addCriterion("channel_loc <=", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocLike(String value) {
            addCriterion("channel_loc like", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocNotLike(String value) {
            addCriterion("channel_loc not like", value, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocIn(List<String> values) {
            addCriterion("channel_loc in", values, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocNotIn(List<String> values) {
            addCriterion("channel_loc not in", values, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocBetween(String value1, String value2) {
            addCriterion("channel_loc between", value1, value2, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andChannelLocNotBetween(String value1, String value2) {
            addCriterion("channel_loc not between", value1, value2, "channelLoc");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Long value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Long value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Long value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Long value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Long value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Long value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Long> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Long> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Long value1, Long value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Long value1, Long value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("uv is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("uv is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Long value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Long value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Long value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Long value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Long value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Long value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Long> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Long> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Long value1, Long value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Long value1, Long value2) {
            addCriterion("uv not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andViewClickIsNull() {
            addCriterion("view_click is null");
            return (Criteria) this;
        }

        public Criteria andViewClickIsNotNull() {
            addCriterion("view_click is not null");
            return (Criteria) this;
        }

        public Criteria andViewClickEqualTo(Long value) {
            addCriterion("view_click =", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickNotEqualTo(Long value) {
            addCriterion("view_click <>", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickGreaterThan(Long value) {
            addCriterion("view_click >", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickGreaterThanOrEqualTo(Long value) {
            addCriterion("view_click >=", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickLessThan(Long value) {
            addCriterion("view_click <", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickLessThanOrEqualTo(Long value) {
            addCriterion("view_click <=", value, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickIn(List<Long> values) {
            addCriterion("view_click in", values, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickNotIn(List<Long> values) {
            addCriterion("view_click not in", values, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickBetween(Long value1, Long value2) {
            addCriterion("view_click between", value1, value2, "viewClick");
            return (Criteria) this;
        }

        public Criteria andViewClickNotBetween(Long value1, Long value2) {
            addCriterion("view_click not between", value1, value2, "viewClick");
            return (Criteria) this;
        }

        public Criteria andCluecountIsNull() {
            addCriterion("cluecount is null");
            return (Criteria) this;
        }

        public Criteria andCluecountIsNotNull() {
            addCriterion("cluecount is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountEqualTo(Long value) {
            addCriterion("cluecount =", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountNotEqualTo(Long value) {
            addCriterion("cluecount <>", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountGreaterThan(Long value) {
            addCriterion("cluecount >", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount >=", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountLessThan(Long value) {
            addCriterion("cluecount <", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountLessThanOrEqualTo(Long value) {
            addCriterion("cluecount <=", value, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountIn(List<Long> values) {
            addCriterion("cluecount in", values, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountNotIn(List<Long> values) {
            addCriterion("cluecount not in", values, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountBetween(Long value1, Long value2) {
            addCriterion("cluecount between", value1, value2, "cluecount");
            return (Criteria) this;
        }

        public Criteria andCluecountNotBetween(Long value1, Long value2) {
            addCriterion("cluecount not between", value1, value2, "cluecount");
            return (Criteria) this;
        }

        public Criteria andClueusercountIsNull() {
            addCriterion("clueusercount is null");
            return (Criteria) this;
        }

        public Criteria andClueusercountIsNotNull() {
            addCriterion("clueusercount is not null");
            return (Criteria) this;
        }

        public Criteria andClueusercountEqualTo(Long value) {
            addCriterion("clueusercount =", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountNotEqualTo(Long value) {
            addCriterion("clueusercount <>", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountGreaterThan(Long value) {
            addCriterion("clueusercount >", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountGreaterThanOrEqualTo(Long value) {
            addCriterion("clueusercount >=", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountLessThan(Long value) {
            addCriterion("clueusercount <", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountLessThanOrEqualTo(Long value) {
            addCriterion("clueusercount <=", value, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountIn(List<Long> values) {
            addCriterion("clueusercount in", values, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountNotIn(List<Long> values) {
            addCriterion("clueusercount not in", values, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountBetween(Long value1, Long value2) {
            addCriterion("clueusercount between", value1, value2, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountNotBetween(Long value1, Long value2) {
            addCriterion("clueusercount not between", value1, value2, "clueusercount");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatIsNull() {
            addCriterion("clueusercount_newplat is null");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatIsNotNull() {
            addCriterion("clueusercount_newplat is not null");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatEqualTo(Long value) {
            addCriterion("clueusercount_newplat =", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatNotEqualTo(Long value) {
            addCriterion("clueusercount_newplat <>", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatGreaterThan(Long value) {
            addCriterion("clueusercount_newplat >", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatGreaterThanOrEqualTo(Long value) {
            addCriterion("clueusercount_newplat >=", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatLessThan(Long value) {
            addCriterion("clueusercount_newplat <", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatLessThanOrEqualTo(Long value) {
            addCriterion("clueusercount_newplat <=", value, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatIn(List<Long> values) {
            addCriterion("clueusercount_newplat in", values, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatNotIn(List<Long> values) {
            addCriterion("clueusercount_newplat not in", values, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatBetween(Long value1, Long value2) {
            addCriterion("clueusercount_newplat between", value1, value2, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewplatNotBetween(Long value1, Long value2) {
            addCriterion("clueusercount_newplat not between", value1, value2, "clueusercountNewplat");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandIsNull() {
            addCriterion("clueusercount_newbrand is null");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandIsNotNull() {
            addCriterion("clueusercount_newbrand is not null");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandEqualTo(Long value) {
            addCriterion("clueusercount_newbrand =", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandNotEqualTo(Long value) {
            addCriterion("clueusercount_newbrand <>", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandGreaterThan(Long value) {
            addCriterion("clueusercount_newbrand >", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandGreaterThanOrEqualTo(Long value) {
            addCriterion("clueusercount_newbrand >=", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandLessThan(Long value) {
            addCriterion("clueusercount_newbrand <", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandLessThanOrEqualTo(Long value) {
            addCriterion("clueusercount_newbrand <=", value, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandIn(List<Long> values) {
            addCriterion("clueusercount_newbrand in", values, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandNotIn(List<Long> values) {
            addCriterion("clueusercount_newbrand not in", values, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandBetween(Long value1, Long value2) {
            addCriterion("clueusercount_newbrand between", value1, value2, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andClueusercountNewbrandNotBetween(Long value1, Long value2) {
            addCriterion("clueusercount_newbrand not between", value1, value2, "clueusercountNewbrand");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarIsNull() {
            addCriterion("cluecount_newcar is null");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarIsNotNull() {
            addCriterion("cluecount_newcar is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarEqualTo(Long value) {
            addCriterion("cluecount_newcar =", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarNotEqualTo(Long value) {
            addCriterion("cluecount_newcar <>", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarGreaterThan(Long value) {
            addCriterion("cluecount_newcar >", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_newcar >=", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarLessThan(Long value) {
            addCriterion("cluecount_newcar <", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_newcar <=", value, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarIn(List<Long> values) {
            addCriterion("cluecount_newcar in", values, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarNotIn(List<Long> values) {
            addCriterion("cluecount_newcar not in", values, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarBetween(Long value1, Long value2) {
            addCriterion("cluecount_newcar between", value1, value2, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcarNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_newcar not between", value1, value2, "cluecountNewcar");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserIsNull() {
            addCriterion("cluecount_newcaruser is null");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserIsNotNull() {
            addCriterion("cluecount_newcaruser is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserEqualTo(Long value) {
            addCriterion("cluecount_newcaruser =", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserNotEqualTo(Long value) {
            addCriterion("cluecount_newcaruser <>", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserGreaterThan(Long value) {
            addCriterion("cluecount_newcaruser >", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_newcaruser >=", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserLessThan(Long value) {
            addCriterion("cluecount_newcaruser <", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_newcaruser <=", value, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserIn(List<Long> values) {
            addCriterion("cluecount_newcaruser in", values, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserNotIn(List<Long> values) {
            addCriterion("cluecount_newcaruser not in", values, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserBetween(Long value1, Long value2) {
            addCriterion("cluecount_newcaruser between", value1, value2, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountNewcaruserNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_newcaruser not between", value1, value2, "cluecountNewcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecount400IsNull() {
            addCriterion("cluecount_400 is null");
            return (Criteria) this;
        }

        public Criteria andCluecount400IsNotNull() {
            addCriterion("cluecount_400 is not null");
            return (Criteria) this;
        }

        public Criteria andCluecount400EqualTo(Long value) {
            addCriterion("cluecount_400 =", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400NotEqualTo(Long value) {
            addCriterion("cluecount_400 <>", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400GreaterThan(Long value) {
            addCriterion("cluecount_400 >", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400GreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_400 >=", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400LessThan(Long value) {
            addCriterion("cluecount_400 <", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400LessThanOrEqualTo(Long value) {
            addCriterion("cluecount_400 <=", value, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400In(List<Long> values) {
            addCriterion("cluecount_400 in", values, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400NotIn(List<Long> values) {
            addCriterion("cluecount_400 not in", values, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400Between(Long value1, Long value2) {
            addCriterion("cluecount_400 between", value1, value2, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecount400NotBetween(Long value1, Long value2) {
            addCriterion("cluecount_400 not between", value1, value2, "cluecount400");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainIsNull() {
            addCriterion("cluecount_maintain is null");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainIsNotNull() {
            addCriterion("cluecount_maintain is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainEqualTo(Long value) {
            addCriterion("cluecount_maintain =", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainNotEqualTo(Long value) {
            addCriterion("cluecount_maintain <>", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainGreaterThan(Long value) {
            addCriterion("cluecount_maintain >", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_maintain >=", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainLessThan(Long value) {
            addCriterion("cluecount_maintain <", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_maintain <=", value, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainIn(List<Long> values) {
            addCriterion("cluecount_maintain in", values, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainNotIn(List<Long> values) {
            addCriterion("cluecount_maintain not in", values, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainBetween(Long value1, Long value2) {
            addCriterion("cluecount_maintain between", value1, value2, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_maintain not between", value1, value2, "cluecountMaintain");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserIsNull() {
            addCriterion("cluecount_maintainuser is null");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserIsNotNull() {
            addCriterion("cluecount_maintainuser is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserEqualTo(Long value) {
            addCriterion("cluecount_maintainuser =", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserNotEqualTo(Long value) {
            addCriterion("cluecount_maintainuser <>", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserGreaterThan(Long value) {
            addCriterion("cluecount_maintainuser >", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_maintainuser >=", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserLessThan(Long value) {
            addCriterion("cluecount_maintainuser <", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_maintainuser <=", value, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserIn(List<Long> values) {
            addCriterion("cluecount_maintainuser in", values, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserNotIn(List<Long> values) {
            addCriterion("cluecount_maintainuser not in", values, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserBetween(Long value1, Long value2) {
            addCriterion("cluecount_maintainuser between", value1, value2, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountMaintainuserNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_maintainuser not between", value1, value2, "cluecountMaintainuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceIsNull() {
            addCriterion("cluecount_replace is null");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceIsNotNull() {
            addCriterion("cluecount_replace is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceEqualTo(Long value) {
            addCriterion("cluecount_replace =", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceNotEqualTo(Long value) {
            addCriterion("cluecount_replace <>", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceGreaterThan(Long value) {
            addCriterion("cluecount_replace >", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_replace >=", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceLessThan(Long value) {
            addCriterion("cluecount_replace <", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_replace <=", value, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceIn(List<Long> values) {
            addCriterion("cluecount_replace in", values, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceNotIn(List<Long> values) {
            addCriterion("cluecount_replace not in", values, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceBetween(Long value1, Long value2) {
            addCriterion("cluecount_replace between", value1, value2, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_replace not between", value1, value2, "cluecountReplace");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserIsNull() {
            addCriterion("cluecount_replaceuser is null");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserIsNotNull() {
            addCriterion("cluecount_replaceuser is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserEqualTo(Long value) {
            addCriterion("cluecount_replaceuser =", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserNotEqualTo(Long value) {
            addCriterion("cluecount_replaceuser <>", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserGreaterThan(Long value) {
            addCriterion("cluecount_replaceuser >", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_replaceuser >=", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserLessThan(Long value) {
            addCriterion("cluecount_replaceuser <", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_replaceuser <=", value, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserIn(List<Long> values) {
            addCriterion("cluecount_replaceuser in", values, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserNotIn(List<Long> values) {
            addCriterion("cluecount_replaceuser not in", values, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserBetween(Long value1, Long value2) {
            addCriterion("cluecount_replaceuser between", value1, value2, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountReplaceuserNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_replaceuser not between", value1, value2, "cluecountReplaceuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairIsNull() {
            addCriterion("cluecount_repair is null");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairIsNotNull() {
            addCriterion("cluecount_repair is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairEqualTo(Long value) {
            addCriterion("cluecount_repair =", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairNotEqualTo(Long value) {
            addCriterion("cluecount_repair <>", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairGreaterThan(Long value) {
            addCriterion("cluecount_repair >", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_repair >=", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairLessThan(Long value) {
            addCriterion("cluecount_repair <", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_repair <=", value, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairIn(List<Long> values) {
            addCriterion("cluecount_repair in", values, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairNotIn(List<Long> values) {
            addCriterion("cluecount_repair not in", values, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairBetween(Long value1, Long value2) {
            addCriterion("cluecount_repair between", value1, value2, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_repair not between", value1, value2, "cluecountRepair");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserIsNull() {
            addCriterion("cluecount_repairuser is null");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserIsNotNull() {
            addCriterion("cluecount_repairuser is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserEqualTo(Long value) {
            addCriterion("cluecount_repairuser =", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserNotEqualTo(Long value) {
            addCriterion("cluecount_repairuser <>", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserGreaterThan(Long value) {
            addCriterion("cluecount_repairuser >", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_repairuser >=", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserLessThan(Long value) {
            addCriterion("cluecount_repairuser <", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_repairuser <=", value, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserIn(List<Long> values) {
            addCriterion("cluecount_repairuser in", values, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserNotIn(List<Long> values) {
            addCriterion("cluecount_repairuser not in", values, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserBetween(Long value1, Long value2) {
            addCriterion("cluecount_repairuser between", value1, value2, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountRepairuserNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_repairuser not between", value1, value2, "cluecountRepairuser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarIsNull() {
            addCriterion("cluecount_testcar is null");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarIsNotNull() {
            addCriterion("cluecount_testcar is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarEqualTo(Long value) {
            addCriterion("cluecount_testcar =", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarNotEqualTo(Long value) {
            addCriterion("cluecount_testcar <>", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarGreaterThan(Long value) {
            addCriterion("cluecount_testcar >", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_testcar >=", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarLessThan(Long value) {
            addCriterion("cluecount_testcar <", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_testcar <=", value, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarIn(List<Long> values) {
            addCriterion("cluecount_testcar in", values, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarNotIn(List<Long> values) {
            addCriterion("cluecount_testcar not in", values, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarBetween(Long value1, Long value2) {
            addCriterion("cluecount_testcar between", value1, value2, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcarNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_testcar not between", value1, value2, "cluecountTestcar");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserIsNull() {
            addCriterion("cluecount_testcaruser is null");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserIsNotNull() {
            addCriterion("cluecount_testcaruser is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserEqualTo(Long value) {
            addCriterion("cluecount_testcaruser =", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserNotEqualTo(Long value) {
            addCriterion("cluecount_testcaruser <>", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserGreaterThan(Long value) {
            addCriterion("cluecount_testcaruser >", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_testcaruser >=", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserLessThan(Long value) {
            addCriterion("cluecount_testcaruser <", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_testcaruser <=", value, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserIn(List<Long> values) {
            addCriterion("cluecount_testcaruser in", values, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserNotIn(List<Long> values) {
            addCriterion("cluecount_testcaruser not in", values, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserBetween(Long value1, Long value2) {
            addCriterion("cluecount_testcaruser between", value1, value2, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountTestcaruserNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_testcaruser not between", value1, value2, "cluecountTestcaruser");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400IsNull() {
            addCriterion("cluecount_call400 is null");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400IsNotNull() {
            addCriterion("cluecount_call400 is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400EqualTo(Long value) {
            addCriterion("cluecount_call400 =", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400NotEqualTo(Long value) {
            addCriterion("cluecount_call400 <>", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400GreaterThan(Long value) {
            addCriterion("cluecount_call400 >", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400GreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_call400 >=", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400LessThan(Long value) {
            addCriterion("cluecount_call400 <", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400LessThanOrEqualTo(Long value) {
            addCriterion("cluecount_call400 <=", value, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400In(List<Long> values) {
            addCriterion("cluecount_call400 in", values, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400NotIn(List<Long> values) {
            addCriterion("cluecount_call400 not in", values, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400Between(Long value1, Long value2) {
            addCriterion("cluecount_call400 between", value1, value2, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400NotBetween(Long value1, Long value2) {
            addCriterion("cluecount_call400 not between", value1, value2, "cluecountCall400");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userIsNull() {
            addCriterion("cluecount_call400user is null");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userIsNotNull() {
            addCriterion("cluecount_call400user is not null");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userEqualTo(Long value) {
            addCriterion("cluecount_call400user =", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userNotEqualTo(Long value) {
            addCriterion("cluecount_call400user <>", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userGreaterThan(Long value) {
            addCriterion("cluecount_call400user >", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userGreaterThanOrEqualTo(Long value) {
            addCriterion("cluecount_call400user >=", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userLessThan(Long value) {
            addCriterion("cluecount_call400user <", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userLessThanOrEqualTo(Long value) {
            addCriterion("cluecount_call400user <=", value, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userIn(List<Long> values) {
            addCriterion("cluecount_call400user in", values, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userNotIn(List<Long> values) {
            addCriterion("cluecount_call400user not in", values, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userBetween(Long value1, Long value2) {
            addCriterion("cluecount_call400user between", value1, value2, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andCluecountCall400userNotBetween(Long value1, Long value2) {
            addCriterion("cluecount_call400user not between", value1, value2, "cluecountCall400user");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentIsNull() {
            addCriterion("lead_tran_percent is null");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentIsNotNull() {
            addCriterion("lead_tran_percent is not null");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentEqualTo(Float value) {
            addCriterion("lead_tran_percent =", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentNotEqualTo(Float value) {
            addCriterion("lead_tran_percent <>", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentGreaterThan(Float value) {
            addCriterion("lead_tran_percent >", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("lead_tran_percent >=", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentLessThan(Float value) {
            addCriterion("lead_tran_percent <", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentLessThanOrEqualTo(Float value) {
            addCriterion("lead_tran_percent <=", value, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentIn(List<Float> values) {
            addCriterion("lead_tran_percent in", values, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentNotIn(List<Float> values) {
            addCriterion("lead_tran_percent not in", values, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentBetween(Float value1, Float value2) {
            addCriterion("lead_tran_percent between", value1, value2, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andLeadTranPercentNotBetween(Float value1, Float value2) {
            addCriterion("lead_tran_percent not between", value1, value2, "leadTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentIsNull() {
            addCriterion("user_tran_percent is null");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentIsNotNull() {
            addCriterion("user_tran_percent is not null");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentEqualTo(Float value) {
            addCriterion("user_tran_percent =", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentNotEqualTo(Float value) {
            addCriterion("user_tran_percent <>", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentGreaterThan(Float value) {
            addCriterion("user_tran_percent >", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentGreaterThanOrEqualTo(Float value) {
            addCriterion("user_tran_percent >=", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentLessThan(Float value) {
            addCriterion("user_tran_percent <", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentLessThanOrEqualTo(Float value) {
            addCriterion("user_tran_percent <=", value, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentIn(List<Float> values) {
            addCriterion("user_tran_percent in", values, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentNotIn(List<Float> values) {
            addCriterion("user_tran_percent not in", values, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentBetween(Float value1, Float value2) {
            addCriterion("user_tran_percent between", value1, value2, "userTranPercent");
            return (Criteria) this;
        }

        public Criteria andUserTranPercentNotBetween(Float value1, Float value2) {
            addCriterion("user_tran_percent not between", value1, value2, "userTranPercent");
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

        public Criteria andViewpageTimeIsNull() {
            addCriterion("viewpage_time is null");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeIsNotNull() {
            addCriterion("viewpage_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeEqualTo(Float value) {
            addCriterion("viewpage_time =", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeNotEqualTo(Float value) {
            addCriterion("viewpage_time <>", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeGreaterThan(Float value) {
            addCriterion("viewpage_time >", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeGreaterThanOrEqualTo(Float value) {
            addCriterion("viewpage_time >=", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeLessThan(Float value) {
            addCriterion("viewpage_time <", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeLessThanOrEqualTo(Float value) {
            addCriterion("viewpage_time <=", value, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeIn(List<Float> values) {
            addCriterion("viewpage_time in", values, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeNotIn(List<Float> values) {
            addCriterion("viewpage_time not in", values, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeBetween(Float value1, Float value2) {
            addCriterion("viewpage_time between", value1, value2, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageTimeNotBetween(Float value1, Float value2) {
            addCriterion("viewpage_time not between", value1, value2, "viewpageTime");
            return (Criteria) this;
        }

        public Criteria andViewpageCountIsNull() {
            addCriterion("viewpage_count is null");
            return (Criteria) this;
        }

        public Criteria andViewpageCountIsNotNull() {
            addCriterion("viewpage_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewpageCountEqualTo(Float value) {
            addCriterion("viewpage_count =", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountNotEqualTo(Float value) {
            addCriterion("viewpage_count <>", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountGreaterThan(Float value) {
            addCriterion("viewpage_count >", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountGreaterThanOrEqualTo(Float value) {
            addCriterion("viewpage_count >=", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountLessThan(Float value) {
            addCriterion("viewpage_count <", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountLessThanOrEqualTo(Float value) {
            addCriterion("viewpage_count <=", value, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountIn(List<Float> values) {
            addCriterion("viewpage_count in", values, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountNotIn(List<Float> values) {
            addCriterion("viewpage_count not in", values, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountBetween(Float value1, Float value2) {
            addCriterion("viewpage_count between", value1, value2, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewpageCountNotBetween(Float value1, Float value2) {
            addCriterion("viewpage_count not between", value1, value2, "viewpageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountIsNull() {
            addCriterion("view_carstylepage_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountIsNotNull() {
            addCriterion("view_carstylepage_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountEqualTo(Float value) {
            addCriterion("view_carstylepage_count =", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountNotEqualTo(Float value) {
            addCriterion("view_carstylepage_count <>", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountGreaterThan(Float value) {
            addCriterion("view_carstylepage_count >", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountGreaterThanOrEqualTo(Float value) {
            addCriterion("view_carstylepage_count >=", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountLessThan(Float value) {
            addCriterion("view_carstylepage_count <", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountLessThanOrEqualTo(Float value) {
            addCriterion("view_carstylepage_count <=", value, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountIn(List<Float> values) {
            addCriterion("view_carstylepage_count in", values, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountNotIn(List<Float> values) {
            addCriterion("view_carstylepage_count not in", values, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountBetween(Float value1, Float value2) {
            addCriterion("view_carstylepage_count between", value1, value2, "viewCarstylepageCount");
            return (Criteria) this;
        }

        public Criteria andViewCarstylepageCountNotBetween(Float value1, Float value2) {
            addCriterion("view_carstylepage_count not between", value1, value2, "viewCarstylepageCount");
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

        public Criteria andClueAvgEqualTo(Long value) {
            addCriterion("clue_avg =", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotEqualTo(Long value) {
            addCriterion("clue_avg <>", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgGreaterThan(Long value) {
            addCriterion("clue_avg >", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgGreaterThanOrEqualTo(Long value) {
            addCriterion("clue_avg >=", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgLessThan(Long value) {
            addCriterion("clue_avg <", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgLessThanOrEqualTo(Long value) {
            addCriterion("clue_avg <=", value, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgIn(List<Long> values) {
            addCriterion("clue_avg in", values, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotIn(List<Long> values) {
            addCriterion("clue_avg not in", values, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgBetween(Long value1, Long value2) {
            addCriterion("clue_avg between", value1, value2, "clueAvg");
            return (Criteria) this;
        }

        public Criteria andClueAvgNotBetween(Long value1, Long value2) {
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