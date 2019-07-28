package net.suncaper.hotel_manager.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class H_OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public H_OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Integer value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Integer value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Integer value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Integer value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Integer value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Integer> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Integer> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Integer value1, Integer value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIsNull() {
            addCriterion("o_orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIsNotNull() {
            addCriterion("o_orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeEqualTo(Date value) {
            addCriterionForJDBCDate("o_orderTime =", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("o_orderTime <>", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("o_orderTime >", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_orderTime >=", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeLessThan(Date value) {
            addCriterionForJDBCDate("o_orderTime <", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_orderTime <=", value, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeIn(List<Date> values) {
            addCriterionForJDBCDate("o_orderTime in", values, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("o_orderTime not in", values, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_orderTime between", value1, value2, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOOrdertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_orderTime not between", value1, value2, "oOrdertime");
            return (Criteria) this;
        }

        public Criteria andOCheckinIsNull() {
            addCriterion("o_checkin is null");
            return (Criteria) this;
        }

        public Criteria andOCheckinIsNotNull() {
            addCriterion("o_checkin is not null");
            return (Criteria) this;
        }

        public Criteria andOCheckinEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkin =", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinNotEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkin <>", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinGreaterThan(Date value) {
            addCriterionForJDBCDate("o_checkin >", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkin >=", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinLessThan(Date value) {
            addCriterionForJDBCDate("o_checkin <", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkin <=", value, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinIn(List<Date> values) {
            addCriterionForJDBCDate("o_checkin in", values, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinNotIn(List<Date> values) {
            addCriterionForJDBCDate("o_checkin not in", values, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_checkin between", value1, value2, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_checkin not between", value1, value2, "oCheckin");
            return (Criteria) this;
        }

        public Criteria andOCheckoutIsNull() {
            addCriterion("o_checkout is null");
            return (Criteria) this;
        }

        public Criteria andOCheckoutIsNotNull() {
            addCriterion("o_checkout is not null");
            return (Criteria) this;
        }

        public Criteria andOCheckoutEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkout =", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutNotEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkout <>", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutGreaterThan(Date value) {
            addCriterionForJDBCDate("o_checkout >", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkout >=", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutLessThan(Date value) {
            addCriterionForJDBCDate("o_checkout <", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_checkout <=", value, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutIn(List<Date> values) {
            addCriterionForJDBCDate("o_checkout in", values, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutNotIn(List<Date> values) {
            addCriterionForJDBCDate("o_checkout not in", values, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_checkout between", value1, value2, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOCheckoutNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_checkout not between", value1, value2, "oCheckout");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(String value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(String value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(String value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(String value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(String value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(String value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLike(String value) {
            addCriterion("o_status like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotLike(String value) {
            addCriterion("o_status not like", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<String> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<String> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(String value1, String value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(String value1, String value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOTelIsNull() {
            addCriterion("o_tel is null");
            return (Criteria) this;
        }

        public Criteria andOTelIsNotNull() {
            addCriterion("o_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOTelEqualTo(String value) {
            addCriterion("o_tel =", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotEqualTo(String value) {
            addCriterion("o_tel <>", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThan(String value) {
            addCriterion("o_tel >", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThanOrEqualTo(String value) {
            addCriterion("o_tel >=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThan(String value) {
            addCriterion("o_tel <", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThanOrEqualTo(String value) {
            addCriterion("o_tel <=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLike(String value) {
            addCriterion("o_tel like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotLike(String value) {
            addCriterion("o_tel not like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelIn(List<String> values) {
            addCriterion("o_tel in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotIn(List<String> values) {
            addCriterion("o_tel not in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelBetween(String value1, String value2) {
            addCriterion("o_tel between", value1, value2, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotBetween(String value1, String value2) {
            addCriterion("o_tel not between", value1, value2, "oTel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_order
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 25 14:17:35 GMT+08:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_order
     *
     * @mbg.generated Thu Jul 25 14:17:35 GMT+08:00 2019
     */
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