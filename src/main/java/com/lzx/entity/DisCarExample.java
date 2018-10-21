package com.lzx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisCarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public DisCarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
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
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_car
     *
     * @mbg.generated
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(String value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(String value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(String value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(String value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(String value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(String value) {
            addCriterion("route_id like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(String value) {
            addCriterion("route_id not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<String> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<String> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(String value1, String value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(String value1, String value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarOrginIsNull() {
            addCriterion("car_orgin is null");
            return (Criteria) this;
        }

        public Criteria andCarOrginIsNotNull() {
            addCriterion("car_orgin is not null");
            return (Criteria) this;
        }

        public Criteria andCarOrginEqualTo(String value) {
            addCriterion("car_orgin =", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotEqualTo(String value) {
            addCriterion("car_orgin <>", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginGreaterThan(String value) {
            addCriterion("car_orgin >", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginGreaterThanOrEqualTo(String value) {
            addCriterion("car_orgin >=", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLessThan(String value) {
            addCriterion("car_orgin <", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLessThanOrEqualTo(String value) {
            addCriterion("car_orgin <=", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLike(String value) {
            addCriterion("car_orgin like", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotLike(String value) {
            addCriterion("car_orgin not like", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginIn(List<String> values) {
            addCriterion("car_orgin in", values, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotIn(List<String> values) {
            addCriterion("car_orgin not in", values, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginBetween(String value1, String value2) {
            addCriterion("car_orgin between", value1, value2, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotBetween(String value1, String value2) {
            addCriterion("car_orgin not between", value1, value2, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarProdateIsNull() {
            addCriterion("car_prodate is null");
            return (Criteria) this;
        }

        public Criteria andCarProdateIsNotNull() {
            addCriterion("car_prodate is not null");
            return (Criteria) this;
        }

        public Criteria andCarProdateEqualTo(Date value) {
            addCriterion("car_prodate =", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateNotEqualTo(Date value) {
            addCriterion("car_prodate <>", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateGreaterThan(Date value) {
            addCriterion("car_prodate >", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateGreaterThanOrEqualTo(Date value) {
            addCriterion("car_prodate >=", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateLessThan(Date value) {
            addCriterion("car_prodate <", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateLessThanOrEqualTo(Date value) {
            addCriterion("car_prodate <=", value, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateIn(List<Date> values) {
            addCriterion("car_prodate in", values, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateNotIn(List<Date> values) {
            addCriterion("car_prodate not in", values, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateBetween(Date value1, Date value2) {
            addCriterion("car_prodate between", value1, value2, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarProdateNotBetween(Date value1, Date value2) {
            addCriterion("car_prodate not between", value1, value2, "carProdate");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeIsNull() {
            addCriterion("car_buytime is null");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeIsNotNull() {
            addCriterion("car_buytime is not null");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeEqualTo(Date value) {
            addCriterion("car_buytime =", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeNotEqualTo(Date value) {
            addCriterion("car_buytime <>", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeGreaterThan(Date value) {
            addCriterion("car_buytime >", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("car_buytime >=", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeLessThan(Date value) {
            addCriterion("car_buytime <", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeLessThanOrEqualTo(Date value) {
            addCriterion("car_buytime <=", value, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeIn(List<Date> values) {
            addCriterion("car_buytime in", values, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeNotIn(List<Date> values) {
            addCriterion("car_buytime not in", values, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeBetween(Date value1, Date value2) {
            addCriterion("car_buytime between", value1, value2, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarBuytimeNotBetween(Date value1, Date value2) {
            addCriterion("car_buytime not between", value1, value2, "carBuytime");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIsNull() {
            addCriterion("car_capacity is null");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIsNotNull() {
            addCriterion("car_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCarCapacityEqualTo(Integer value) {
            addCriterion("car_capacity =", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotEqualTo(Integer value) {
            addCriterion("car_capacity <>", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityGreaterThan(Integer value) {
            addCriterion("car_capacity >", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_capacity >=", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityLessThan(Integer value) {
            addCriterion("car_capacity <", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("car_capacity <=", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIn(List<Integer> values) {
            addCriterion("car_capacity in", values, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotIn(List<Integer> values) {
            addCriterion("car_capacity not in", values, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityBetween(Integer value1, Integer value2) {
            addCriterion("car_capacity between", value1, value2, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("car_capacity not between", value1, value2, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNull() {
            addCriterion("car_state is null");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNotNull() {
            addCriterion("car_state is not null");
            return (Criteria) this;
        }

        public Criteria andCarStateEqualTo(Boolean value) {
            addCriterion("car_state =", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotEqualTo(Boolean value) {
            addCriterion("car_state <>", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThan(Boolean value) {
            addCriterion("car_state >", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("car_state >=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThan(Boolean value) {
            addCriterion("car_state <", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThanOrEqualTo(Boolean value) {
            addCriterion("car_state <=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateIn(List<Boolean> values) {
            addCriterion("car_state in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotIn(List<Boolean> values) {
            addCriterion("car_state not in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateBetween(Boolean value1, Boolean value2) {
            addCriterion("car_state between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("car_state not between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_car
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dis_car
     *
     * @mbg.generated
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