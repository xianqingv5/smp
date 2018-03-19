package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplyChannelChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyChannelChangeExample() {
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

        public Criteria andApplyuserIsNull() {
            addCriterion("applyUser is null");
            return (Criteria) this;
        }

        public Criteria andApplyuserIsNotNull() {
            addCriterion("applyUser is not null");
            return (Criteria) this;
        }

        public Criteria andApplyuserEqualTo(String value) {
            addCriterion("applyUser =", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotEqualTo(String value) {
            addCriterion("applyUser <>", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserGreaterThan(String value) {
            addCriterion("applyUser >", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("applyUser >=", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLessThan(String value) {
            addCriterion("applyUser <", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLessThanOrEqualTo(String value) {
            addCriterion("applyUser <=", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserLike(String value) {
            addCriterion("applyUser like", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotLike(String value) {
            addCriterion("applyUser not like", value, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserIn(List<String> values) {
            addCriterion("applyUser in", values, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotIn(List<String> values) {
            addCriterion("applyUser not in", values, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserBetween(String value1, String value2) {
            addCriterion("applyUser between", value1, value2, "applyuser");
            return (Criteria) this;
        }

        public Criteria andApplyuserNotBetween(String value1, String value2) {
            addCriterion("applyUser not between", value1, value2, "applyuser");
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

        public Criteria andApplychannelIsNull() {
            addCriterion("applyChannel is null");
            return (Criteria) this;
        }

        public Criteria andApplychannelIsNotNull() {
            addCriterion("applyChannel is not null");
            return (Criteria) this;
        }

        public Criteria andApplychannelEqualTo(String value) {
            addCriterion("applyChannel =", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotEqualTo(String value) {
            addCriterion("applyChannel <>", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelGreaterThan(String value) {
            addCriterion("applyChannel >", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelGreaterThanOrEqualTo(String value) {
            addCriterion("applyChannel >=", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLessThan(String value) {
            addCriterion("applyChannel <", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLessThanOrEqualTo(String value) {
            addCriterion("applyChannel <=", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelLike(String value) {
            addCriterion("applyChannel like", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotLike(String value) {
            addCriterion("applyChannel not like", value, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelIn(List<String> values) {
            addCriterion("applyChannel in", values, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotIn(List<String> values) {
            addCriterion("applyChannel not in", values, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelBetween(String value1, String value2) {
            addCriterion("applyChannel between", value1, value2, "applychannel");
            return (Criteria) this;
        }

        public Criteria andApplychannelNotBetween(String value1, String value2) {
            addCriterion("applyChannel not between", value1, value2, "applychannel");
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

        public Criteria andApplystarttimeIsNull() {
            addCriterion("applyStartTime is null");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeIsNotNull() {
            addCriterion("applyStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("applyStartTime =", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyStartTime <>", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("applyStartTime >", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyStartTime >=", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeLessThan(Date value) {
            addCriterionForJDBCDate("applyStartTime <", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyStartTime <=", value, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("applyStartTime in", values, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyStartTime not in", values, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyStartTime between", value1, value2, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplystarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyStartTime not between", value1, value2, "applystarttime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeIsNull() {
            addCriterion("applyEndTime is null");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeIsNotNull() {
            addCriterion("applyEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("applyEndTime =", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("applyEndTime <>", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("applyEndTime >", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyEndTime >=", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeLessThan(Date value) {
            addCriterionForJDBCDate("applyEndTime <", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applyEndTime <=", value, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("applyEndTime in", values, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("applyEndTime not in", values, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyEndTime between", value1, value2, "applyendtime");
            return (Criteria) this;
        }

        public Criteria andApplyendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applyEndTime not between", value1, value2, "applyendtime");
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

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
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

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIsNull() {
            addCriterion("refuseReason is null");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIsNotNull() {
            addCriterion("refuseReason is not null");
            return (Criteria) this;
        }

        public Criteria andRefusereasonEqualTo(String value) {
            addCriterion("refuseReason =", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotEqualTo(String value) {
            addCriterion("refuseReason <>", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonGreaterThan(String value) {
            addCriterion("refuseReason >", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuseReason >=", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLessThan(String value) {
            addCriterion("refuseReason <", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLessThanOrEqualTo(String value) {
            addCriterion("refuseReason <=", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonLike(String value) {
            addCriterion("refuseReason like", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotLike(String value) {
            addCriterion("refuseReason not like", value, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonIn(List<String> values) {
            addCriterion("refuseReason in", values, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotIn(List<String> values) {
            addCriterion("refuseReason not in", values, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonBetween(String value1, String value2) {
            addCriterion("refuseReason between", value1, value2, "refusereason");
            return (Criteria) this;
        }

        public Criteria andRefusereasonNotBetween(String value1, String value2) {
            addCriterion("refuseReason not between", value1, value2, "refusereason");
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