package po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPileIdIsNull() {
            addCriterion("pile_id is null");
            return (Criteria) this;
        }

        public Criteria andPileIdIsNotNull() {
            addCriterion("pile_id is not null");
            return (Criteria) this;
        }

        public Criteria andPileIdEqualTo(String value) {
            addCriterion("pile_id =", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdNotEqualTo(String value) {
            addCriterion("pile_id <>", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdGreaterThan(String value) {
            addCriterion("pile_id >", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdGreaterThanOrEqualTo(String value) {
            addCriterion("pile_id >=", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdLessThan(String value) {
            addCriterion("pile_id <", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdLessThanOrEqualTo(String value) {
            addCriterion("pile_id <=", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdLike(String value) {
            addCriterion("pile_id like", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdNotLike(String value) {
            addCriterion("pile_id not like", value, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdIn(List<String> values) {
            addCriterion("pile_id in", values, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdNotIn(List<String> values) {
            addCriterion("pile_id not in", values, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdBetween(String value1, String value2) {
            addCriterion("pile_id between", value1, value2, "pileId");
            return (Criteria) this;
        }

        public Criteria andPileIdNotBetween(String value1, String value2) {
            addCriterion("pile_id not between", value1, value2, "pileId");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNull() {
            addCriterion("order_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNotNull() {
            addCriterion("order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneEqualTo(String value) {
            addCriterion("order_phone =", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotEqualTo(String value) {
            addCriterion("order_phone <>", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThan(String value) {
            addCriterion("order_phone >", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_phone >=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThan(String value) {
            addCriterion("order_phone <", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("order_phone <=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLike(String value) {
            addCriterion("order_phone like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotLike(String value) {
            addCriterion("order_phone not like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIn(List<String> values) {
            addCriterion("order_phone in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotIn(List<String> values) {
            addCriterion("order_phone not in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneBetween(String value1, String value2) {
            addCriterion("order_phone between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("order_phone not between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderStartIsNull() {
            addCriterion("order_start is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartIsNotNull() {
            addCriterion("order_start is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartEqualTo(Date value) {
            addCriterion("order_start =", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotEqualTo(Date value) {
            addCriterion("order_start <>", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartGreaterThan(Date value) {
            addCriterion("order_start >", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartGreaterThanOrEqualTo(Date value) {
            addCriterion("order_start >=", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartLessThan(Date value) {
            addCriterion("order_start <", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartLessThanOrEqualTo(Date value) {
            addCriterion("order_start <=", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartIn(List<Date> values) {
            addCriterion("order_start in", values, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotIn(List<Date> values) {
            addCriterion("order_start not in", values, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartBetween(Date value1, Date value2) {
            addCriterion("order_start between", value1, value2, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotBetween(Date value1, Date value2) {
            addCriterion("order_start not between", value1, value2, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNull() {
            addCriterion("order_end is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNotNull() {
            addCriterion("order_end is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndEqualTo(Date value) {
            addCriterion("order_end =", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotEqualTo(Date value) {
            addCriterion("order_end <>", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThan(Date value) {
            addCriterion("order_end >", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThanOrEqualTo(Date value) {
            addCriterion("order_end >=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThan(Date value) {
            addCriterion("order_end <", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThanOrEqualTo(Date value) {
            addCriterion("order_end <=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndIn(List<Date> values) {
            addCriterion("order_end in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotIn(List<Date> values) {
            addCriterion("order_end not in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndBetween(Date value1, Date value2) {
            addCriterion("order_end between", value1, value2, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotBetween(Date value1, Date value2) {
            addCriterion("order_end not between", value1, value2, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(BigDecimal value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Integer value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Integer value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Integer value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Integer value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Integer> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Integer> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderMethodIsNull() {
            addCriterion("order_method is null");
            return (Criteria) this;
        }

        public Criteria andOrderMethodIsNotNull() {
            addCriterion("order_method is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMethodEqualTo(String value) {
            addCriterion("order_method =", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodNotEqualTo(String value) {
            addCriterion("order_method <>", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodGreaterThan(String value) {
            addCriterion("order_method >", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodGreaterThanOrEqualTo(String value) {
            addCriterion("order_method >=", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodLessThan(String value) {
            addCriterion("order_method <", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodLessThanOrEqualTo(String value) {
            addCriterion("order_method <=", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodLike(String value) {
            addCriterion("order_method like", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodNotLike(String value) {
            addCriterion("order_method not like", value, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodIn(List<String> values) {
            addCriterion("order_method in", values, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodNotIn(List<String> values) {
            addCriterion("order_method not in", values, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodBetween(String value1, String value2) {
            addCriterion("order_method between", value1, value2, "orderMethod");
            return (Criteria) this;
        }

        public Criteria andOrderMethodNotBetween(String value1, String value2) {
            addCriterion("order_method not between", value1, value2, "orderMethod");
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