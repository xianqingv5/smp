package com.yiche.smp.domain;

import java.util.ArrayList;
import java.util.List;

public class ShopAvgCluesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopAvgCluesExample() {
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

        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(String value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(String value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(String value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(String value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(String value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(String value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLike(String value) {
            addCriterion("is_top like", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotLike(String value) {
            addCriterion("is_top not like", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<String> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<String> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(String value1, String value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(String value1, String value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andTrendDecideIsNull() {
            addCriterion("trend_decide is null");
            return (Criteria) this;
        }

        public Criteria andTrendDecideIsNotNull() {
            addCriterion("trend_decide is not null");
            return (Criteria) this;
        }

        public Criteria andTrendDecideEqualTo(String value) {
            addCriterion("trend_decide =", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideNotEqualTo(String value) {
            addCriterion("trend_decide <>", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideGreaterThan(String value) {
            addCriterion("trend_decide >", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideGreaterThanOrEqualTo(String value) {
            addCriterion("trend_decide >=", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideLessThan(String value) {
            addCriterion("trend_decide <", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideLessThanOrEqualTo(String value) {
            addCriterion("trend_decide <=", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideLike(String value) {
            addCriterion("trend_decide like", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideNotLike(String value) {
            addCriterion("trend_decide not like", value, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideIn(List<String> values) {
            addCriterion("trend_decide in", values, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideNotIn(List<String> values) {
            addCriterion("trend_decide not in", values, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideBetween(String value1, String value2) {
            addCriterion("trend_decide between", value1, value2, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andTrendDecideNotBetween(String value1, String value2) {
            addCriterion("trend_decide not between", value1, value2, "trendDecide");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceIsNull() {
            addCriterion("shop_sell_difference is null");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceIsNotNull() {
            addCriterion("shop_sell_difference is not null");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceEqualTo(Double value) {
            addCriterion("shop_sell_difference =", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceNotEqualTo(Double value) {
            addCriterion("shop_sell_difference <>", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceGreaterThan(Double value) {
            addCriterion("shop_sell_difference >", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_sell_difference >=", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceLessThan(Double value) {
            addCriterion("shop_sell_difference <", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceLessThanOrEqualTo(Double value) {
            addCriterion("shop_sell_difference <=", value, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceIn(List<Double> values) {
            addCriterion("shop_sell_difference in", values, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceNotIn(List<Double> values) {
            addCriterion("shop_sell_difference not in", values, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceBetween(Double value1, Double value2) {
            addCriterion("shop_sell_difference between", value1, value2, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andShopSellDifferenceNotBetween(Double value1, Double value2) {
            addCriterion("shop_sell_difference not between", value1, value2, "shopSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceIsNull() {
            addCriterion("total_sell_difference is null");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceIsNotNull() {
            addCriterion("total_sell_difference is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceEqualTo(Double value) {
            addCriterion("total_sell_difference =", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceNotEqualTo(Double value) {
            addCriterion("total_sell_difference <>", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceGreaterThan(Double value) {
            addCriterion("total_sell_difference >", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_sell_difference >=", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceLessThan(Double value) {
            addCriterion("total_sell_difference <", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceLessThanOrEqualTo(Double value) {
            addCriterion("total_sell_difference <=", value, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceIn(List<Double> values) {
            addCriterion("total_sell_difference in", values, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceNotIn(List<Double> values) {
            addCriterion("total_sell_difference not in", values, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceBetween(Double value1, Double value2) {
            addCriterion("total_sell_difference between", value1, value2, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andTotalSellDifferenceNotBetween(Double value1, Double value2) {
            addCriterion("total_sell_difference not between", value1, value2, "totalSellDifference");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtIsNull() {
            addCriterion("sell_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtIsNotNull() {
            addCriterion("sell_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtEqualTo(Double value) {
            addCriterion("sell_yesteryear_owt =", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtNotEqualTo(Double value) {
            addCriterion("sell_yesteryear_owt <>", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtGreaterThan(Double value) {
            addCriterion("sell_yesteryear_owt >", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("sell_yesteryear_owt >=", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtLessThan(Double value) {
            addCriterion("sell_yesteryear_owt <", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("sell_yesteryear_owt <=", value, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtIn(List<Double> values) {
            addCriterion("sell_yesteryear_owt in", values, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtNotIn(List<Double> values) {
            addCriterion("sell_yesteryear_owt not in", values, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("sell_yesteryear_owt between", value1, value2, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("sell_yesteryear_owt not between", value1, value2, "sellYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andSellIsNull() {
            addCriterion("sell is null");
            return (Criteria) this;
        }

        public Criteria andSellIsNotNull() {
            addCriterion("sell is not null");
            return (Criteria) this;
        }

        public Criteria andSellEqualTo(Double value) {
            addCriterion("sell =", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotEqualTo(Double value) {
            addCriterion("sell <>", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThan(Double value) {
            addCriterion("sell >", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellGreaterThanOrEqualTo(Double value) {
            addCriterion("sell >=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThan(Double value) {
            addCriterion("sell <", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellLessThanOrEqualTo(Double value) {
            addCriterion("sell <=", value, "sell");
            return (Criteria) this;
        }

        public Criteria andSellIn(List<Double> values) {
            addCriterion("sell in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotIn(List<Double> values) {
            addCriterion("sell not in", values, "sell");
            return (Criteria) this;
        }

        public Criteria andSellBetween(Double value1, Double value2) {
            addCriterion("sell between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andSellNotBetween(Double value1, Double value2) {
            addCriterion("sell not between", value1, value2, "sell");
            return (Criteria) this;
        }

        public Criteria andSellCompareIsNull() {
            addCriterion("sell_compare is null");
            return (Criteria) this;
        }

        public Criteria andSellCompareIsNotNull() {
            addCriterion("sell_compare is not null");
            return (Criteria) this;
        }

        public Criteria andSellCompareEqualTo(Double value) {
            addCriterion("sell_compare =", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareNotEqualTo(Double value) {
            addCriterion("sell_compare <>", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareGreaterThan(Double value) {
            addCriterion("sell_compare >", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("sell_compare >=", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareLessThan(Double value) {
            addCriterion("sell_compare <", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareLessThanOrEqualTo(Double value) {
            addCriterion("sell_compare <=", value, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareIn(List<Double> values) {
            addCriterion("sell_compare in", values, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareNotIn(List<Double> values) {
            addCriterion("sell_compare not in", values, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareBetween(Double value1, Double value2) {
            addCriterion("sell_compare between", value1, value2, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andSellCompareNotBetween(Double value1, Double value2) {
            addCriterion("sell_compare not between", value1, value2, "sellCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtIsNull() {
            addCriterion("store_clues_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtIsNotNull() {
            addCriterion("store_clues_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtEqualTo(Double value) {
            addCriterion("store_clues_yesteryear_owt =", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtNotEqualTo(Double value) {
            addCriterion("store_clues_yesteryear_owt <>", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtGreaterThan(Double value) {
            addCriterion("store_clues_yesteryear_owt >", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("store_clues_yesteryear_owt >=", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtLessThan(Double value) {
            addCriterion("store_clues_yesteryear_owt <", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("store_clues_yesteryear_owt <=", value, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtIn(List<Double> values) {
            addCriterion("store_clues_yesteryear_owt in", values, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtNotIn(List<Double> values) {
            addCriterion("store_clues_yesteryear_owt not in", values, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("store_clues_yesteryear_owt between", value1, value2, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("store_clues_yesteryear_owt not between", value1, value2, "storeCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andStoreCluesIsNull() {
            addCriterion("store_clues is null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesIsNotNull() {
            addCriterion("store_clues is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesEqualTo(Double value) {
            addCriterion("store_clues =", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesNotEqualTo(Double value) {
            addCriterion("store_clues <>", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesGreaterThan(Double value) {
            addCriterion("store_clues >", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesGreaterThanOrEqualTo(Double value) {
            addCriterion("store_clues >=", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesLessThan(Double value) {
            addCriterion("store_clues <", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesLessThanOrEqualTo(Double value) {
            addCriterion("store_clues <=", value, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesIn(List<Double> values) {
            addCriterion("store_clues in", values, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesNotIn(List<Double> values) {
            addCriterion("store_clues not in", values, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesBetween(Double value1, Double value2) {
            addCriterion("store_clues between", value1, value2, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesNotBetween(Double value1, Double value2) {
            addCriterion("store_clues not between", value1, value2, "storeClues");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareIsNull() {
            addCriterion("store_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareIsNotNull() {
            addCriterion("store_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareEqualTo(Double value) {
            addCriterion("store_clues_compare =", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareNotEqualTo(Double value) {
            addCriterion("store_clues_compare <>", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareGreaterThan(Double value) {
            addCriterion("store_clues_compare >", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("store_clues_compare >=", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareLessThan(Double value) {
            addCriterion("store_clues_compare <", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("store_clues_compare <=", value, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareIn(List<Double> values) {
            addCriterion("store_clues_compare in", values, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareNotIn(List<Double> values) {
            addCriterion("store_clues_compare not in", values, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareBetween(Double value1, Double value2) {
            addCriterion("store_clues_compare between", value1, value2, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andStoreCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("store_clues_compare not between", value1, value2, "storeCluesCompare");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtIsNull() {
            addCriterion("all_clues_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtIsNotNull() {
            addCriterion("all_clues_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtEqualTo(Double value) {
            addCriterion("all_clues_yesteryear_owt =", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtNotEqualTo(Double value) {
            addCriterion("all_clues_yesteryear_owt <>", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtGreaterThan(Double value) {
            addCriterion("all_clues_yesteryear_owt >", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("all_clues_yesteryear_owt >=", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtLessThan(Double value) {
            addCriterion("all_clues_yesteryear_owt <", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("all_clues_yesteryear_owt <=", value, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtIn(List<Double> values) {
            addCriterion("all_clues_yesteryear_owt in", values, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtNotIn(List<Double> values) {
            addCriterion("all_clues_yesteryear_owt not in", values, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("all_clues_yesteryear_owt between", value1, value2, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("all_clues_yesteryear_owt not between", value1, value2, "allCluesYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andAllCluesIsNull() {
            addCriterion("all_clues is null");
            return (Criteria) this;
        }

        public Criteria andAllCluesIsNotNull() {
            addCriterion("all_clues is not null");
            return (Criteria) this;
        }

        public Criteria andAllCluesEqualTo(Double value) {
            addCriterion("all_clues =", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesNotEqualTo(Double value) {
            addCriterion("all_clues <>", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesGreaterThan(Double value) {
            addCriterion("all_clues >", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesGreaterThanOrEqualTo(Double value) {
            addCriterion("all_clues >=", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesLessThan(Double value) {
            addCriterion("all_clues <", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesLessThanOrEqualTo(Double value) {
            addCriterion("all_clues <=", value, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesIn(List<Double> values) {
            addCriterion("all_clues in", values, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesNotIn(List<Double> values) {
            addCriterion("all_clues not in", values, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesBetween(Double value1, Double value2) {
            addCriterion("all_clues between", value1, value2, "allClues");
            return (Criteria) this;
        }

        public Criteria andAllCluesNotBetween(Double value1, Double value2) {
            addCriterion("all_clues not between", value1, value2, "allClues");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareIsNull() {
            addCriterion("yiche_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareIsNotNull() {
            addCriterion("yiche_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareEqualTo(Double value) {
            addCriterion("yiche_clues_compare =", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareNotEqualTo(Double value) {
            addCriterion("yiche_clues_compare <>", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareGreaterThan(Double value) {
            addCriterion("yiche_clues_compare >", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_clues_compare >=", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareLessThan(Double value) {
            addCriterion("yiche_clues_compare <", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("yiche_clues_compare <=", value, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareIn(List<Double> values) {
            addCriterion("yiche_clues_compare in", values, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareNotIn(List<Double> values) {
            addCriterion("yiche_clues_compare not in", values, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareBetween(Double value1, Double value2) {
            addCriterion("yiche_clues_compare between", value1, value2, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("yiche_clues_compare not between", value1, value2, "yicheCluesCompare");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtIsNull() {
            addCriterion("dealer_data_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtIsNotNull() {
            addCriterion("dealer_data_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtEqualTo(Double value) {
            addCriterion("dealer_data_yesteryear_owt =", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtNotEqualTo(Double value) {
            addCriterion("dealer_data_yesteryear_owt <>", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtGreaterThan(Double value) {
            addCriterion("dealer_data_yesteryear_owt >", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("dealer_data_yesteryear_owt >=", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtLessThan(Double value) {
            addCriterion("dealer_data_yesteryear_owt <", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("dealer_data_yesteryear_owt <=", value, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtIn(List<Double> values) {
            addCriterion("dealer_data_yesteryear_owt in", values, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtNotIn(List<Double> values) {
            addCriterion("dealer_data_yesteryear_owt not in", values, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("dealer_data_yesteryear_owt between", value1, value2, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("dealer_data_yesteryear_owt not between", value1, value2, "dealerDataYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andDealerDataIsNull() {
            addCriterion("dealer_data is null");
            return (Criteria) this;
        }

        public Criteria andDealerDataIsNotNull() {
            addCriterion("dealer_data is not null");
            return (Criteria) this;
        }

        public Criteria andDealerDataEqualTo(Double value) {
            addCriterion("dealer_data =", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataNotEqualTo(Double value) {
            addCriterion("dealer_data <>", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataGreaterThan(Double value) {
            addCriterion("dealer_data >", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataGreaterThanOrEqualTo(Double value) {
            addCriterion("dealer_data >=", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataLessThan(Double value) {
            addCriterion("dealer_data <", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataLessThanOrEqualTo(Double value) {
            addCriterion("dealer_data <=", value, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataIn(List<Double> values) {
            addCriterion("dealer_data in", values, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataNotIn(List<Double> values) {
            addCriterion("dealer_data not in", values, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataBetween(Double value1, Double value2) {
            addCriterion("dealer_data between", value1, value2, "dealerData");
            return (Criteria) this;
        }

        public Criteria andDealerDataNotBetween(Double value1, Double value2) {
            addCriterion("dealer_data not between", value1, value2, "dealerData");
            return (Criteria) this;
        }

        public Criteria andShopCompareIsNull() {
            addCriterion("shop_compare is null");
            return (Criteria) this;
        }

        public Criteria andShopCompareIsNotNull() {
            addCriterion("shop_compare is not null");
            return (Criteria) this;
        }

        public Criteria andShopCompareEqualTo(Double value) {
            addCriterion("shop_compare =", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareNotEqualTo(Double value) {
            addCriterion("shop_compare <>", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareGreaterThan(Double value) {
            addCriterion("shop_compare >", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_compare >=", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareLessThan(Double value) {
            addCriterion("shop_compare <", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareLessThanOrEqualTo(Double value) {
            addCriterion("shop_compare <=", value, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareIn(List<Double> values) {
            addCriterion("shop_compare in", values, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareNotIn(List<Double> values) {
            addCriterion("shop_compare not in", values, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareBetween(Double value1, Double value2) {
            addCriterion("shop_compare between", value1, value2, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andShopCompareNotBetween(Double value1, Double value2) {
            addCriterion("shop_compare not between", value1, value2, "shopCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtIsNull() {
            addCriterion("baojia_app_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtIsNotNull() {
            addCriterion("baojia_app_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtEqualTo(Double value) {
            addCriterion("baojia_app_yesteryear_owt =", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtNotEqualTo(Double value) {
            addCriterion("baojia_app_yesteryear_owt <>", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtGreaterThan(Double value) {
            addCriterion("baojia_app_yesteryear_owt >", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("baojia_app_yesteryear_owt >=", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtLessThan(Double value) {
            addCriterion("baojia_app_yesteryear_owt <", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("baojia_app_yesteryear_owt <=", value, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtIn(List<Double> values) {
            addCriterion("baojia_app_yesteryear_owt in", values, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtNotIn(List<Double> values) {
            addCriterion("baojia_app_yesteryear_owt not in", values, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("baojia_app_yesteryear_owt between", value1, value2, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("baojia_app_yesteryear_owt not between", value1, value2, "baojiaAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppIsNull() {
            addCriterion("baojia_app is null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppIsNotNull() {
            addCriterion("baojia_app is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppEqualTo(Double value) {
            addCriterion("baojia_app =", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppNotEqualTo(Double value) {
            addCriterion("baojia_app <>", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppGreaterThan(Double value) {
            addCriterion("baojia_app >", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppGreaterThanOrEqualTo(Double value) {
            addCriterion("baojia_app >=", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppLessThan(Double value) {
            addCriterion("baojia_app <", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppLessThanOrEqualTo(Double value) {
            addCriterion("baojia_app <=", value, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppIn(List<Double> values) {
            addCriterion("baojia_app in", values, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppNotIn(List<Double> values) {
            addCriterion("baojia_app not in", values, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppBetween(Double value1, Double value2) {
            addCriterion("baojia_app between", value1, value2, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppNotBetween(Double value1, Double value2) {
            addCriterion("baojia_app not between", value1, value2, "baojiaApp");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareIsNull() {
            addCriterion("baojia_app_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareIsNotNull() {
            addCriterion("baojia_app_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareEqualTo(Double value) {
            addCriterion("baojia_app_clues_compare =", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareNotEqualTo(Double value) {
            addCriterion("baojia_app_clues_compare <>", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareGreaterThan(Double value) {
            addCriterion("baojia_app_clues_compare >", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("baojia_app_clues_compare >=", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareLessThan(Double value) {
            addCriterion("baojia_app_clues_compare <", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("baojia_app_clues_compare <=", value, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareIn(List<Double> values) {
            addCriterion("baojia_app_clues_compare in", values, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareNotIn(List<Double> values) {
            addCriterion("baojia_app_clues_compare not in", values, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareBetween(Double value1, Double value2) {
            addCriterion("baojia_app_clues_compare between", value1, value2, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andBaojiaAppCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("baojia_app_clues_compare not between", value1, value2, "baojiaAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtIsNull() {
            addCriterion("yiche_app_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtIsNotNull() {
            addCriterion("yiche_app_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtEqualTo(Double value) {
            addCriterion("yiche_app_yesteryear_owt =", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtNotEqualTo(Double value) {
            addCriterion("yiche_app_yesteryear_owt <>", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtGreaterThan(Double value) {
            addCriterion("yiche_app_yesteryear_owt >", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_app_yesteryear_owt >=", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtLessThan(Double value) {
            addCriterion("yiche_app_yesteryear_owt <", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("yiche_app_yesteryear_owt <=", value, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtIn(List<Double> values) {
            addCriterion("yiche_app_yesteryear_owt in", values, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtNotIn(List<Double> values) {
            addCriterion("yiche_app_yesteryear_owt not in", values, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("yiche_app_yesteryear_owt between", value1, value2, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("yiche_app_yesteryear_owt not between", value1, value2, "yicheAppYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheAppIsNull() {
            addCriterion("yiche_app is null");
            return (Criteria) this;
        }

        public Criteria andYicheAppIsNotNull() {
            addCriterion("yiche_app is not null");
            return (Criteria) this;
        }

        public Criteria andYicheAppEqualTo(Double value) {
            addCriterion("yiche_app =", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppNotEqualTo(Double value) {
            addCriterion("yiche_app <>", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppGreaterThan(Double value) {
            addCriterion("yiche_app >", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_app >=", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppLessThan(Double value) {
            addCriterion("yiche_app <", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppLessThanOrEqualTo(Double value) {
            addCriterion("yiche_app <=", value, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppIn(List<Double> values) {
            addCriterion("yiche_app in", values, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppNotIn(List<Double> values) {
            addCriterion("yiche_app not in", values, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppBetween(Double value1, Double value2) {
            addCriterion("yiche_app between", value1, value2, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppNotBetween(Double value1, Double value2) {
            addCriterion("yiche_app not between", value1, value2, "yicheApp");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareIsNull() {
            addCriterion("yiche_app_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareIsNotNull() {
            addCriterion("yiche_app_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareEqualTo(Double value) {
            addCriterion("yiche_app_clues_compare =", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareNotEqualTo(Double value) {
            addCriterion("yiche_app_clues_compare <>", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareGreaterThan(Double value) {
            addCriterion("yiche_app_clues_compare >", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_app_clues_compare >=", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareLessThan(Double value) {
            addCriterion("yiche_app_clues_compare <", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("yiche_app_clues_compare <=", value, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareIn(List<Double> values) {
            addCriterion("yiche_app_clues_compare in", values, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareNotIn(List<Double> values) {
            addCriterion("yiche_app_clues_compare not in", values, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareBetween(Double value1, Double value2) {
            addCriterion("yiche_app_clues_compare between", value1, value2, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheAppCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("yiche_app_clues_compare not between", value1, value2, "yicheAppCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtIsNull() {
            addCriterion("yiche_pc_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtIsNotNull() {
            addCriterion("yiche_pc_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtEqualTo(Double value) {
            addCriterion("yiche_pc_yesteryear_owt =", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtNotEqualTo(Double value) {
            addCriterion("yiche_pc_yesteryear_owt <>", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtGreaterThan(Double value) {
            addCriterion("yiche_pc_yesteryear_owt >", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_pc_yesteryear_owt >=", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtLessThan(Double value) {
            addCriterion("yiche_pc_yesteryear_owt <", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("yiche_pc_yesteryear_owt <=", value, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtIn(List<Double> values) {
            addCriterion("yiche_pc_yesteryear_owt in", values, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtNotIn(List<Double> values) {
            addCriterion("yiche_pc_yesteryear_owt not in", values, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("yiche_pc_yesteryear_owt between", value1, value2, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("yiche_pc_yesteryear_owt not between", value1, value2, "yichePcYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYichePcIsNull() {
            addCriterion("yiche_pc is null");
            return (Criteria) this;
        }

        public Criteria andYichePcIsNotNull() {
            addCriterion("yiche_pc is not null");
            return (Criteria) this;
        }

        public Criteria andYichePcEqualTo(Double value) {
            addCriterion("yiche_pc =", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcNotEqualTo(Double value) {
            addCriterion("yiche_pc <>", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcGreaterThan(Double value) {
            addCriterion("yiche_pc >", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_pc >=", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcLessThan(Double value) {
            addCriterion("yiche_pc <", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcLessThanOrEqualTo(Double value) {
            addCriterion("yiche_pc <=", value, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcIn(List<Double> values) {
            addCriterion("yiche_pc in", values, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcNotIn(List<Double> values) {
            addCriterion("yiche_pc not in", values, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcBetween(Double value1, Double value2) {
            addCriterion("yiche_pc between", value1, value2, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcNotBetween(Double value1, Double value2) {
            addCriterion("yiche_pc not between", value1, value2, "yichePc");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareIsNull() {
            addCriterion("yiche_pc_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareIsNotNull() {
            addCriterion("yiche_pc_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareEqualTo(Double value) {
            addCriterion("yiche_pc_clues_compare =", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareNotEqualTo(Double value) {
            addCriterion("yiche_pc_clues_compare <>", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareGreaterThan(Double value) {
            addCriterion("yiche_pc_clues_compare >", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_pc_clues_compare >=", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareLessThan(Double value) {
            addCriterion("yiche_pc_clues_compare <", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("yiche_pc_clues_compare <=", value, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareIn(List<Double> values) {
            addCriterion("yiche_pc_clues_compare in", values, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareNotIn(List<Double> values) {
            addCriterion("yiche_pc_clues_compare not in", values, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareBetween(Double value1, Double value2) {
            addCriterion("yiche_pc_clues_compare between", value1, value2, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYichePcCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("yiche_pc_clues_compare not between", value1, value2, "yichePcCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtIsNull() {
            addCriterion("yiche_wap_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtIsNotNull() {
            addCriterion("yiche_wap_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtEqualTo(Double value) {
            addCriterion("yiche_wap_yesteryear_owt =", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtNotEqualTo(Double value) {
            addCriterion("yiche_wap_yesteryear_owt <>", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtGreaterThan(Double value) {
            addCriterion("yiche_wap_yesteryear_owt >", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_wap_yesteryear_owt >=", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtLessThan(Double value) {
            addCriterion("yiche_wap_yesteryear_owt <", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("yiche_wap_yesteryear_owt <=", value, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtIn(List<Double> values) {
            addCriterion("yiche_wap_yesteryear_owt in", values, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtNotIn(List<Double> values) {
            addCriterion("yiche_wap_yesteryear_owt not in", values, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("yiche_wap_yesteryear_owt between", value1, value2, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("yiche_wap_yesteryear_owt not between", value1, value2, "yicheWapYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andYicheWapIsNull() {
            addCriterion("yiche_wap is null");
            return (Criteria) this;
        }

        public Criteria andYicheWapIsNotNull() {
            addCriterion("yiche_wap is not null");
            return (Criteria) this;
        }

        public Criteria andYicheWapEqualTo(Double value) {
            addCriterion("yiche_wap =", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapNotEqualTo(Double value) {
            addCriterion("yiche_wap <>", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapGreaterThan(Double value) {
            addCriterion("yiche_wap >", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_wap >=", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapLessThan(Double value) {
            addCriterion("yiche_wap <", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapLessThanOrEqualTo(Double value) {
            addCriterion("yiche_wap <=", value, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapIn(List<Double> values) {
            addCriterion("yiche_wap in", values, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapNotIn(List<Double> values) {
            addCriterion("yiche_wap not in", values, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapBetween(Double value1, Double value2) {
            addCriterion("yiche_wap between", value1, value2, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapNotBetween(Double value1, Double value2) {
            addCriterion("yiche_wap not between", value1, value2, "yicheWap");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareIsNull() {
            addCriterion("yiche_wap_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareIsNotNull() {
            addCriterion("yiche_wap_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareEqualTo(Double value) {
            addCriterion("yiche_wap_clues_compare =", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareNotEqualTo(Double value) {
            addCriterion("yiche_wap_clues_compare <>", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareGreaterThan(Double value) {
            addCriterion("yiche_wap_clues_compare >", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("yiche_wap_clues_compare >=", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareLessThan(Double value) {
            addCriterion("yiche_wap_clues_compare <", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("yiche_wap_clues_compare <=", value, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareIn(List<Double> values) {
            addCriterion("yiche_wap_clues_compare in", values, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareNotIn(List<Double> values) {
            addCriterion("yiche_wap_clues_compare not in", values, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareBetween(Double value1, Double value2) {
            addCriterion("yiche_wap_clues_compare between", value1, value2, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andYicheWapCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("yiche_wap_clues_compare not between", value1, value2, "yicheWapCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtIsNull() {
            addCriterion("other_yesteryear_owt is null");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtIsNotNull() {
            addCriterion("other_yesteryear_owt is not null");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtEqualTo(Double value) {
            addCriterion("other_yesteryear_owt =", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtNotEqualTo(Double value) {
            addCriterion("other_yesteryear_owt <>", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtGreaterThan(Double value) {
            addCriterion("other_yesteryear_owt >", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtGreaterThanOrEqualTo(Double value) {
            addCriterion("other_yesteryear_owt >=", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtLessThan(Double value) {
            addCriterion("other_yesteryear_owt <", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtLessThanOrEqualTo(Double value) {
            addCriterion("other_yesteryear_owt <=", value, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtIn(List<Double> values) {
            addCriterion("other_yesteryear_owt in", values, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtNotIn(List<Double> values) {
            addCriterion("other_yesteryear_owt not in", values, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtBetween(Double value1, Double value2) {
            addCriterion("other_yesteryear_owt between", value1, value2, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherYesteryearOwtNotBetween(Double value1, Double value2) {
            addCriterion("other_yesteryear_owt not between", value1, value2, "otherYesteryearOwt");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(Double value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(Double value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(Double value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(Double value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(Double value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<Double> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<Double> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(Double value1, Double value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(Double value1, Double value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareIsNull() {
            addCriterion("other_clues_compare is null");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareIsNotNull() {
            addCriterion("other_clues_compare is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareEqualTo(Double value) {
            addCriterion("other_clues_compare =", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareNotEqualTo(Double value) {
            addCriterion("other_clues_compare <>", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareGreaterThan(Double value) {
            addCriterion("other_clues_compare >", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareGreaterThanOrEqualTo(Double value) {
            addCriterion("other_clues_compare >=", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareLessThan(Double value) {
            addCriterion("other_clues_compare <", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareLessThanOrEqualTo(Double value) {
            addCriterion("other_clues_compare <=", value, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareIn(List<Double> values) {
            addCriterion("other_clues_compare in", values, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareNotIn(List<Double> values) {
            addCriterion("other_clues_compare not in", values, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareBetween(Double value1, Double value2) {
            addCriterion("other_clues_compare between", value1, value2, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andOtherCluesCompareNotBetween(Double value1, Double value2) {
            addCriterion("other_clues_compare not between", value1, value2, "otherCluesCompare");
            return (Criteria) this;
        }

        public Criteria andCluesDateIsNull() {
            addCriterion("clues_date is null");
            return (Criteria) this;
        }

        public Criteria andCluesDateIsNotNull() {
            addCriterion("clues_date is not null");
            return (Criteria) this;
        }

        public Criteria andCluesDateEqualTo(String value) {
            addCriterion("clues_date =", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateNotEqualTo(String value) {
            addCriterion("clues_date <>", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateGreaterThan(String value) {
            addCriterion("clues_date >", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateGreaterThanOrEqualTo(String value) {
            addCriterion("clues_date >=", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateLessThan(String value) {
            addCriterion("clues_date <", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateLessThanOrEqualTo(String value) {
            addCriterion("clues_date <=", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateLike(String value) {
            addCriterion("clues_date like", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateNotLike(String value) {
            addCriterion("clues_date not like", value, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateIn(List<String> values) {
            addCriterion("clues_date in", values, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateNotIn(List<String> values) {
            addCriterion("clues_date not in", values, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateBetween(String value1, String value2) {
            addCriterion("clues_date between", value1, value2, "cluesDate");
            return (Criteria) this;
        }

        public Criteria andCluesDateNotBetween(String value1, String value2) {
            addCriterion("clues_date not between", value1, value2, "cluesDate");
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