package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameIsNull() {
            addCriterion("channel_info_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameIsNotNull() {
            addCriterion("channel_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameEqualTo(String value) {
            addCriterion("channel_info_name =", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameNotEqualTo(String value) {
            addCriterion("channel_info_name <>", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameGreaterThan(String value) {
            addCriterion("channel_info_name >", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_info_name >=", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameLessThan(String value) {
            addCriterion("channel_info_name <", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameLessThanOrEqualTo(String value) {
            addCriterion("channel_info_name <=", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameLike(String value) {
            addCriterion("channel_info_name like", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameNotLike(String value) {
            addCriterion("channel_info_name not like", value, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameIn(List<String> values) {
            addCriterion("channel_info_name in", values, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameNotIn(List<String> values) {
            addCriterion("channel_info_name not in", values, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameBetween(String value1, String value2) {
            addCriterion("channel_info_name between", value1, value2, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoNameNotBetween(String value1, String value2) {
            addCriterion("channel_info_name not between", value1, value2, "channelInfoName");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueIsNull() {
            addCriterion("channel_info_value is null");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueIsNotNull() {
            addCriterion("channel_info_value is not null");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueEqualTo(String value) {
            addCriterion("channel_info_value =", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueNotEqualTo(String value) {
            addCriterion("channel_info_value <>", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueGreaterThan(String value) {
            addCriterion("channel_info_value >", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueGreaterThanOrEqualTo(String value) {
            addCriterion("channel_info_value >=", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueLessThan(String value) {
            addCriterion("channel_info_value <", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueLessThanOrEqualTo(String value) {
            addCriterion("channel_info_value <=", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueLike(String value) {
            addCriterion("channel_info_value like", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueNotLike(String value) {
            addCriterion("channel_info_value not like", value, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueIn(List<String> values) {
            addCriterion("channel_info_value in", values, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueNotIn(List<String> values) {
            addCriterion("channel_info_value not in", values, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueBetween(String value1, String value2) {
            addCriterion("channel_info_value between", value1, value2, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andChannelInfoValueNotBetween(String value1, String value2) {
            addCriterion("channel_info_value not between", value1, value2, "channelInfoValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameIsNull() {
            addCriterion("sample_demand_name is null");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameIsNotNull() {
            addCriterion("sample_demand_name is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameEqualTo(String value) {
            addCriterion("sample_demand_name =", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameNotEqualTo(String value) {
            addCriterion("sample_demand_name <>", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameGreaterThan(String value) {
            addCriterion("sample_demand_name >", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameGreaterThanOrEqualTo(String value) {
            addCriterion("sample_demand_name >=", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameLessThan(String value) {
            addCriterion("sample_demand_name <", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameLessThanOrEqualTo(String value) {
            addCriterion("sample_demand_name <=", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameLike(String value) {
            addCriterion("sample_demand_name like", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameNotLike(String value) {
            addCriterion("sample_demand_name not like", value, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameIn(List<String> values) {
            addCriterion("sample_demand_name in", values, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameNotIn(List<String> values) {
            addCriterion("sample_demand_name not in", values, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameBetween(String value1, String value2) {
            addCriterion("sample_demand_name between", value1, value2, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandNameNotBetween(String value1, String value2) {
            addCriterion("sample_demand_name not between", value1, value2, "sampleDemandName");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueIsNull() {
            addCriterion("sample_demand_value is null");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueIsNotNull() {
            addCriterion("sample_demand_value is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueEqualTo(String value) {
            addCriterion("sample_demand_value =", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueNotEqualTo(String value) {
            addCriterion("sample_demand_value <>", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueGreaterThan(String value) {
            addCriterion("sample_demand_value >", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueGreaterThanOrEqualTo(String value) {
            addCriterion("sample_demand_value >=", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueLessThan(String value) {
            addCriterion("sample_demand_value <", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueLessThanOrEqualTo(String value) {
            addCriterion("sample_demand_value <=", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueLike(String value) {
            addCriterion("sample_demand_value like", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueNotLike(String value) {
            addCriterion("sample_demand_value not like", value, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueIn(List<String> values) {
            addCriterion("sample_demand_value in", values, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueNotIn(List<String> values) {
            addCriterion("sample_demand_value not in", values, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueBetween(String value1, String value2) {
            addCriterion("sample_demand_value between", value1, value2, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andSampleDemandValueNotBetween(String value1, String value2) {
            addCriterion("sample_demand_value not between", value1, value2, "sampleDemandValue");
            return (Criteria) this;
        }

        public Criteria andDataReferNameIsNull() {
            addCriterion("data_refer_name is null");
            return (Criteria) this;
        }

        public Criteria andDataReferNameIsNotNull() {
            addCriterion("data_refer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataReferNameEqualTo(String value) {
            addCriterion("data_refer_name =", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameNotEqualTo(String value) {
            addCriterion("data_refer_name <>", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameGreaterThan(String value) {
            addCriterion("data_refer_name >", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_refer_name >=", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameLessThan(String value) {
            addCriterion("data_refer_name <", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameLessThanOrEqualTo(String value) {
            addCriterion("data_refer_name <=", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameLike(String value) {
            addCriterion("data_refer_name like", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameNotLike(String value) {
            addCriterion("data_refer_name not like", value, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameIn(List<String> values) {
            addCriterion("data_refer_name in", values, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameNotIn(List<String> values) {
            addCriterion("data_refer_name not in", values, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameBetween(String value1, String value2) {
            addCriterion("data_refer_name between", value1, value2, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferNameNotBetween(String value1, String value2) {
            addCriterion("data_refer_name not between", value1, value2, "dataReferName");
            return (Criteria) this;
        }

        public Criteria andDataReferValueIsNull() {
            addCriterion("data_refer_value is null");
            return (Criteria) this;
        }

        public Criteria andDataReferValueIsNotNull() {
            addCriterion("data_refer_value is not null");
            return (Criteria) this;
        }

        public Criteria andDataReferValueEqualTo(String value) {
            addCriterion("data_refer_value =", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueNotEqualTo(String value) {
            addCriterion("data_refer_value <>", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueGreaterThan(String value) {
            addCriterion("data_refer_value >", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueGreaterThanOrEqualTo(String value) {
            addCriterion("data_refer_value >=", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueLessThan(String value) {
            addCriterion("data_refer_value <", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueLessThanOrEqualTo(String value) {
            addCriterion("data_refer_value <=", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueLike(String value) {
            addCriterion("data_refer_value like", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueNotLike(String value) {
            addCriterion("data_refer_value not like", value, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueIn(List<String> values) {
            addCriterion("data_refer_value in", values, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueNotIn(List<String> values) {
            addCriterion("data_refer_value not in", values, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueBetween(String value1, String value2) {
            addCriterion("data_refer_value between", value1, value2, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andDataReferValueNotBetween(String value1, String value2) {
            addCriterion("data_refer_value not between", value1, value2, "dataReferValue");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNull() {
            addCriterion("enclosure is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("enclosure =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("enclosure <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("enclosure >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("enclosure <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("enclosure <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("enclosure like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("enclosure not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("enclosure in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("enclosure not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("enclosure between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("enclosure not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIsNull() {
            addCriterion("upload_file_path is null");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIsNotNull() {
            addCriterion("upload_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathEqualTo(String value) {
            addCriterion("upload_file_path =", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotEqualTo(String value) {
            addCriterion("upload_file_path <>", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathGreaterThan(String value) {
            addCriterion("upload_file_path >", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("upload_file_path >=", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLessThan(String value) {
            addCriterion("upload_file_path <", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLessThanOrEqualTo(String value) {
            addCriterion("upload_file_path <=", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathLike(String value) {
            addCriterion("upload_file_path like", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotLike(String value) {
            addCriterion("upload_file_path not like", value, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathIn(List<String> values) {
            addCriterion("upload_file_path in", values, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotIn(List<String> values) {
            addCriterion("upload_file_path not in", values, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathBetween(String value1, String value2) {
            addCriterion("upload_file_path between", value1, value2, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andUploadFilePathNotBetween(String value1, String value2) {
            addCriterion("upload_file_path not between", value1, value2, "uploadFilePath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIsNull() {
            addCriterion("enclosure_name is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIsNotNull() {
            addCriterion("enclosure_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameEqualTo(String value) {
            addCriterion("enclosure_name =", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotEqualTo(String value) {
            addCriterion("enclosure_name <>", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameGreaterThan(String value) {
            addCriterion("enclosure_name >", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure_name >=", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLessThan(String value) {
            addCriterion("enclosure_name <", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLessThanOrEqualTo(String value) {
            addCriterion("enclosure_name <=", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameLike(String value) {
            addCriterion("enclosure_name like", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotLike(String value) {
            addCriterion("enclosure_name not like", value, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameIn(List<String> values) {
            addCriterion("enclosure_name in", values, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotIn(List<String> values) {
            addCriterion("enclosure_name not in", values, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameBetween(String value1, String value2) {
            addCriterion("enclosure_name between", value1, value2, "enclosureName");
            return (Criteria) this;
        }

        public Criteria andEnclosureNameNotBetween(String value1, String value2) {
            addCriterion("enclosure_name not between", value1, value2, "enclosureName");
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