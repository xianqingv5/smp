package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoostExample() {
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

        public Criteria andCarmakeIsNull() {
            addCriterion("carmake is null");
            return (Criteria) this;
        }

        public Criteria andCarmakeIsNotNull() {
            addCriterion("carmake is not null");
            return (Criteria) this;
        }

        public Criteria andCarmakeEqualTo(String value) {
            addCriterion("carmake =", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeNotEqualTo(String value) {
            addCriterion("carmake <>", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeGreaterThan(String value) {
            addCriterion("carmake >", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeGreaterThanOrEqualTo(String value) {
            addCriterion("carmake >=", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeLessThan(String value) {
            addCriterion("carmake <", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeLessThanOrEqualTo(String value) {
            addCriterion("carmake <=", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeLike(String value) {
            addCriterion("carmake like", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeNotLike(String value) {
            addCriterion("carmake not like", value, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeIn(List<String> values) {
            addCriterion("carmake in", values, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeNotIn(List<String> values) {
            addCriterion("carmake not in", values, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeBetween(String value1, String value2) {
            addCriterion("carmake between", value1, value2, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarmakeNotBetween(String value1, String value2) {
            addCriterion("carmake not between", value1, value2, "carmake");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNull() {
            addCriterion("carbrand is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNotNull() {
            addCriterion("carbrand is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandEqualTo(String value) {
            addCriterion("carbrand =", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotEqualTo(String value) {
            addCriterion("carbrand <>", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThan(String value) {
            addCriterion("carbrand >", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("carbrand >=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThan(String value) {
            addCriterion("carbrand <", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThanOrEqualTo(String value) {
            addCriterion("carbrand <=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLike(String value) {
            addCriterion("carbrand like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotLike(String value) {
            addCriterion("carbrand not like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandIn(List<String> values) {
            addCriterion("carbrand in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotIn(List<String> values) {
            addCriterion("carbrand not in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandBetween(String value1, String value2) {
            addCriterion("carbrand between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotBetween(String value1, String value2) {
            addCriterion("carbrand not between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarmodelIsNull() {
            addCriterion("carmodel is null");
            return (Criteria) this;
        }

        public Criteria andCarmodelIsNotNull() {
            addCriterion("carmodel is not null");
            return (Criteria) this;
        }

        public Criteria andCarmodelEqualTo(String value) {
            addCriterion("carmodel =", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelNotEqualTo(String value) {
            addCriterion("carmodel <>", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelGreaterThan(String value) {
            addCriterion("carmodel >", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelGreaterThanOrEqualTo(String value) {
            addCriterion("carmodel >=", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelLessThan(String value) {
            addCriterion("carmodel <", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelLessThanOrEqualTo(String value) {
            addCriterion("carmodel <=", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelLike(String value) {
            addCriterion("carmodel like", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelNotLike(String value) {
            addCriterion("carmodel not like", value, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelIn(List<String> values) {
            addCriterion("carmodel in", values, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelNotIn(List<String> values) {
            addCriterion("carmodel not in", values, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelBetween(String value1, String value2) {
            addCriterion("carmodel between", value1, value2, "carmodel");
            return (Criteria) this;
        }

        public Criteria andCarmodelNotBetween(String value1, String value2) {
            addCriterion("carmodel not between", value1, value2, "carmodel");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentIsNull() {
            addCriterion("budgetDepartment is null");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentIsNotNull() {
            addCriterion("budgetDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentEqualTo(String value) {
            addCriterion("budgetDepartment =", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentNotEqualTo(String value) {
            addCriterion("budgetDepartment <>", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentGreaterThan(String value) {
            addCriterion("budgetDepartment >", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("budgetDepartment >=", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentLessThan(String value) {
            addCriterion("budgetDepartment <", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentLessThanOrEqualTo(String value) {
            addCriterion("budgetDepartment <=", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentLike(String value) {
            addCriterion("budgetDepartment like", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentNotLike(String value) {
            addCriterion("budgetDepartment not like", value, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentIn(List<String> values) {
            addCriterion("budgetDepartment in", values, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentNotIn(List<String> values) {
            addCriterion("budgetDepartment not in", values, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentBetween(String value1, String value2) {
            addCriterion("budgetDepartment between", value1, value2, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetdepartmentNotBetween(String value1, String value2) {
            addCriterion("budgetDepartment not between", value1, value2, "budgetdepartment");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueIsNull() {
            addCriterion("budgetValue is null");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueIsNotNull() {
            addCriterion("budgetValue is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueEqualTo(Integer value) {
            addCriterion("budgetValue =", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueNotEqualTo(Integer value) {
            addCriterion("budgetValue <>", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueGreaterThan(Integer value) {
            addCriterion("budgetValue >", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("budgetValue >=", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueLessThan(Integer value) {
            addCriterion("budgetValue <", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueLessThanOrEqualTo(Integer value) {
            addCriterion("budgetValue <=", value, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueIn(List<Integer> values) {
            addCriterion("budgetValue in", values, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueNotIn(List<Integer> values) {
            addCriterion("budgetValue not in", values, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueBetween(Integer value1, Integer value2) {
            addCriterion("budgetValue between", value1, value2, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andBudgetvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("budgetValue not between", value1, value2, "budgetvalue");
            return (Criteria) this;
        }

        public Criteria andClueIsNull() {
            addCriterion("clue is null");
            return (Criteria) this;
        }

        public Criteria andClueIsNotNull() {
            addCriterion("clue is not null");
            return (Criteria) this;
        }

        public Criteria andClueEqualTo(Integer value) {
            addCriterion("clue =", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueNotEqualTo(Integer value) {
            addCriterion("clue <>", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueGreaterThan(Integer value) {
            addCriterion("clue >", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueGreaterThanOrEqualTo(Integer value) {
            addCriterion("clue >=", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueLessThan(Integer value) {
            addCriterion("clue <", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueLessThanOrEqualTo(Integer value) {
            addCriterion("clue <=", value, "clue");
            return (Criteria) this;
        }

        public Criteria andClueIn(List<Integer> values) {
            addCriterion("clue in", values, "clue");
            return (Criteria) this;
        }

        public Criteria andClueNotIn(List<Integer> values) {
            addCriterion("clue not in", values, "clue");
            return (Criteria) this;
        }

        public Criteria andClueBetween(Integer value1, Integer value2) {
            addCriterion("clue between", value1, value2, "clue");
            return (Criteria) this;
        }

        public Criteria andClueNotBetween(Integer value1, Integer value2) {
            addCriterion("clue not between", value1, value2, "clue");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andLinktypeIsNull() {
            addCriterion("linkType is null");
            return (Criteria) this;
        }

        public Criteria andLinktypeIsNotNull() {
            addCriterion("linkType is not null");
            return (Criteria) this;
        }

        public Criteria andLinktypeEqualTo(String value) {
            addCriterion("linkType =", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeNotEqualTo(String value) {
            addCriterion("linkType <>", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeGreaterThan(String value) {
            addCriterion("linkType >", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeGreaterThanOrEqualTo(String value) {
            addCriterion("linkType >=", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeLessThan(String value) {
            addCriterion("linkType <", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeLessThanOrEqualTo(String value) {
            addCriterion("linkType <=", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeLike(String value) {
            addCriterion("linkType like", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeNotLike(String value) {
            addCriterion("linkType not like", value, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeIn(List<String> values) {
            addCriterion("linkType in", values, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeNotIn(List<String> values) {
            addCriterion("linkType not in", values, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeBetween(String value1, String value2) {
            addCriterion("linkType between", value1, value2, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinktypeNotBetween(String value1, String value2) {
            addCriterion("linkType not between", value1, value2, "linktype");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNull() {
            addCriterion("linkUrl is null");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNotNull() {
            addCriterion("linkUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurlEqualTo(String value) {
            addCriterion("linkUrl =", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotEqualTo(String value) {
            addCriterion("linkUrl <>", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThan(String value) {
            addCriterion("linkUrl >", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThanOrEqualTo(String value) {
            addCriterion("linkUrl >=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThan(String value) {
            addCriterion("linkUrl <", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThanOrEqualTo(String value) {
            addCriterion("linkUrl <=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLike(String value) {
            addCriterion("linkUrl like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotLike(String value) {
            addCriterion("linkUrl not like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlIn(List<String> values) {
            addCriterion("linkUrl in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotIn(List<String> values) {
            addCriterion("linkUrl not in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlBetween(String value1, String value2) {
            addCriterion("linkUrl between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotBetween(String value1, String value2) {
            addCriterion("linkUrl not between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andUploadfilepathIsNull() {
            addCriterion("uploadFilePath is null");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathIsNotNull() {
            addCriterion("uploadFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathEqualTo(String value) {
            addCriterion("uploadFilePath =", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathNotEqualTo(String value) {
            addCriterion("uploadFilePath <>", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathGreaterThan(String value) {
            addCriterion("uploadFilePath >", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathGreaterThanOrEqualTo(String value) {
            addCriterion("uploadFilePath >=", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathLessThan(String value) {
            addCriterion("uploadFilePath <", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathLessThanOrEqualTo(String value) {
            addCriterion("uploadFilePath <=", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathLike(String value) {
            addCriterion("uploadFilePath like", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathNotLike(String value) {
            addCriterion("uploadFilePath not like", value, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathIn(List<String> values) {
            addCriterion("uploadFilePath in", values, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathNotIn(List<String> values) {
            addCriterion("uploadFilePath not in", values, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathBetween(String value1, String value2) {
            addCriterion("uploadFilePath between", value1, value2, "uploadfilepath");
            return (Criteria) this;
        }

        public Criteria andUploadfilepathNotBetween(String value1, String value2) {
            addCriterion("uploadFilePath not between", value1, value2, "uploadfilepath");
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