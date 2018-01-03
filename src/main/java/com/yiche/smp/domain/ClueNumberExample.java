package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClueNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClueNumberExample() {
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

        public Criteria andNumidIsNull() {
            addCriterion("numId is null");
            return (Criteria) this;
        }

        public Criteria andNumidIsNotNull() {
            addCriterion("numId is not null");
            return (Criteria) this;
        }

        public Criteria andNumidEqualTo(Integer value) {
            addCriterion("numId =", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidNotEqualTo(Integer value) {
            addCriterion("numId <>", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidGreaterThan(Integer value) {
            addCriterion("numId >", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("numId >=", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidLessThan(Integer value) {
            addCriterion("numId <", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidLessThanOrEqualTo(Integer value) {
            addCriterion("numId <=", value, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidIn(List<Integer> values) {
            addCriterion("numId in", values, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidNotIn(List<Integer> values) {
            addCriterion("numId not in", values, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidBetween(Integer value1, Integer value2) {
            addCriterion("numId between", value1, value2, "numid");
            return (Criteria) this;
        }

        public Criteria andNumidNotBetween(Integer value1, Integer value2) {
            addCriterion("numId not between", value1, value2, "numid");
            return (Criteria) this;
        }

        public Criteria andNumtypenameIsNull() {
            addCriterion("numTypeName is null");
            return (Criteria) this;
        }

        public Criteria andNumtypenameIsNotNull() {
            addCriterion("numTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andNumtypenameEqualTo(String value) {
            addCriterion("numTypeName =", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameNotEqualTo(String value) {
            addCriterion("numTypeName <>", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameGreaterThan(String value) {
            addCriterion("numTypeName >", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("numTypeName >=", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameLessThan(String value) {
            addCriterion("numTypeName <", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameLessThanOrEqualTo(String value) {
            addCriterion("numTypeName <=", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameLike(String value) {
            addCriterion("numTypeName like", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameNotLike(String value) {
            addCriterion("numTypeName not like", value, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameIn(List<String> values) {
            addCriterion("numTypeName in", values, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameNotIn(List<String> values) {
            addCriterion("numTypeName not in", values, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameBetween(String value1, String value2) {
            addCriterion("numTypeName between", value1, value2, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNumtypenameNotBetween(String value1, String value2) {
            addCriterion("numTypeName not between", value1, value2, "numtypename");
            return (Criteria) this;
        }

        public Criteria andNummonthyearIsNull() {
            addCriterion("numMonthYear is null");
            return (Criteria) this;
        }

        public Criteria andNummonthyearIsNotNull() {
            addCriterion("numMonthYear is not null");
            return (Criteria) this;
        }

        public Criteria andNummonthyearEqualTo(Date value) {
            addCriterionForJDBCDate("numMonthYear =", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearNotEqualTo(Date value) {
            addCriterionForJDBCDate("numMonthYear <>", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearGreaterThan(Date value) {
            addCriterionForJDBCDate("numMonthYear >", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("numMonthYear >=", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearLessThan(Date value) {
            addCriterionForJDBCDate("numMonthYear <", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("numMonthYear <=", value, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearIn(List<Date> values) {
            addCriterionForJDBCDate("numMonthYear in", values, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearNotIn(List<Date> values) {
            addCriterionForJDBCDate("numMonthYear not in", values, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("numMonthYear between", value1, value2, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNummonthyearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("numMonthYear not between", value1, value2, "nummonthyear");
            return (Criteria) this;
        }

        public Criteria andNumvalueIsNull() {
            addCriterion("numValue is null");
            return (Criteria) this;
        }

        public Criteria andNumvalueIsNotNull() {
            addCriterion("numValue is not null");
            return (Criteria) this;
        }

        public Criteria andNumvalueEqualTo(String value) {
            addCriterion("numValue =", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueNotEqualTo(String value) {
            addCriterion("numValue <>", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueGreaterThan(String value) {
            addCriterion("numValue >", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueGreaterThanOrEqualTo(String value) {
            addCriterion("numValue >=", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueLessThan(String value) {
            addCriterion("numValue <", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueLessThanOrEqualTo(String value) {
            addCriterion("numValue <=", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueLike(String value) {
            addCriterion("numValue like", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueNotLike(String value) {
            addCriterion("numValue not like", value, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueIn(List<String> values) {
            addCriterion("numValue in", values, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueNotIn(List<String> values) {
            addCriterion("numValue not in", values, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueBetween(String value1, String value2) {
            addCriterion("numValue between", value1, value2, "numvalue");
            return (Criteria) this;
        }

        public Criteria andNumvalueNotBetween(String value1, String value2) {
            addCriterion("numValue not between", value1, value2, "numvalue");
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