package po;

import java.util.ArrayList;
import java.util.List;

public class PileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PileExample() {
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

        public Criteria andPilePasswordIsNull() {
            addCriterion("pile_password is null");
            return (Criteria) this;
        }

        public Criteria andPilePasswordIsNotNull() {
            addCriterion("pile_password is not null");
            return (Criteria) this;
        }

        public Criteria andPilePasswordEqualTo(String value) {
            addCriterion("pile_password =", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordNotEqualTo(String value) {
            addCriterion("pile_password <>", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordGreaterThan(String value) {
            addCriterion("pile_password >", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pile_password >=", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordLessThan(String value) {
            addCriterion("pile_password <", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordLessThanOrEqualTo(String value) {
            addCriterion("pile_password <=", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordLike(String value) {
            addCriterion("pile_password like", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordNotLike(String value) {
            addCriterion("pile_password not like", value, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordIn(List<String> values) {
            addCriterion("pile_password in", values, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordNotIn(List<String> values) {
            addCriterion("pile_password not in", values, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordBetween(String value1, String value2) {
            addCriterion("pile_password between", value1, value2, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPilePasswordNotBetween(String value1, String value2) {
            addCriterion("pile_password not between", value1, value2, "pilePassword");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeIsNull() {
            addCriterion("pile_longitude is null");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeIsNotNull() {
            addCriterion("pile_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeEqualTo(Double value) {
            addCriterion("pile_longitude =", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeNotEqualTo(Double value) {
            addCriterion("pile_longitude <>", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeGreaterThan(Double value) {
            addCriterion("pile_longitude >", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("pile_longitude >=", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeLessThan(Double value) {
            addCriterion("pile_longitude <", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("pile_longitude <=", value, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeIn(List<Double> values) {
            addCriterion("pile_longitude in", values, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeNotIn(List<Double> values) {
            addCriterion("pile_longitude not in", values, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeBetween(Double value1, Double value2) {
            addCriterion("pile_longitude between", value1, value2, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("pile_longitude not between", value1, value2, "pileLongitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeIsNull() {
            addCriterion("pile_latitude is null");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeIsNotNull() {
            addCriterion("pile_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeEqualTo(Double value) {
            addCriterion("pile_latitude =", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeNotEqualTo(Double value) {
            addCriterion("pile_latitude <>", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeGreaterThan(Double value) {
            addCriterion("pile_latitude >", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("pile_latitude >=", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeLessThan(Double value) {
            addCriterion("pile_latitude <", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("pile_latitude <=", value, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeIn(List<Double> values) {
            addCriterion("pile_latitude in", values, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeNotIn(List<Double> values) {
            addCriterion("pile_latitude not in", values, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeBetween(Double value1, Double value2) {
            addCriterion("pile_latitude between", value1, value2, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("pile_latitude not between", value1, value2, "pileLatitude");
            return (Criteria) this;
        }

        public Criteria andPileAreaidIsNull() {
            addCriterion("pile_areaid is null");
            return (Criteria) this;
        }

        public Criteria andPileAreaidIsNotNull() {
            addCriterion("pile_areaid is not null");
            return (Criteria) this;
        }

        public Criteria andPileAreaidEqualTo(String value) {
            addCriterion("pile_areaid =", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidNotEqualTo(String value) {
            addCriterion("pile_areaid <>", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidGreaterThan(String value) {
            addCriterion("pile_areaid >", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("pile_areaid >=", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidLessThan(String value) {
            addCriterion("pile_areaid <", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidLessThanOrEqualTo(String value) {
            addCriterion("pile_areaid <=", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidLike(String value) {
            addCriterion("pile_areaid like", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidNotLike(String value) {
            addCriterion("pile_areaid not like", value, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidIn(List<String> values) {
            addCriterion("pile_areaid in", values, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidNotIn(List<String> values) {
            addCriterion("pile_areaid not in", values, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidBetween(String value1, String value2) {
            addCriterion("pile_areaid between", value1, value2, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAreaidNotBetween(String value1, String value2) {
            addCriterion("pile_areaid not between", value1, value2, "pileAreaid");
            return (Criteria) this;
        }

        public Criteria andPileAddressIsNull() {
            addCriterion("pile_address is null");
            return (Criteria) this;
        }

        public Criteria andPileAddressIsNotNull() {
            addCriterion("pile_address is not null");
            return (Criteria) this;
        }

        public Criteria andPileAddressEqualTo(String value) {
            addCriterion("pile_address =", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressNotEqualTo(String value) {
            addCriterion("pile_address <>", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressGreaterThan(String value) {
            addCriterion("pile_address >", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pile_address >=", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressLessThan(String value) {
            addCriterion("pile_address <", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressLessThanOrEqualTo(String value) {
            addCriterion("pile_address <=", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressLike(String value) {
            addCriterion("pile_address like", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressNotLike(String value) {
            addCriterion("pile_address not like", value, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressIn(List<String> values) {
            addCriterion("pile_address in", values, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressNotIn(List<String> values) {
            addCriterion("pile_address not in", values, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressBetween(String value1, String value2) {
            addCriterion("pile_address between", value1, value2, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileAddressNotBetween(String value1, String value2) {
            addCriterion("pile_address not between", value1, value2, "pileAddress");
            return (Criteria) this;
        }

        public Criteria andPileStaffidIsNull() {
            addCriterion("pile_staffid is null");
            return (Criteria) this;
        }

        public Criteria andPileStaffidIsNotNull() {
            addCriterion("pile_staffid is not null");
            return (Criteria) this;
        }

        public Criteria andPileStaffidEqualTo(String value) {
            addCriterion("pile_staffid =", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidNotEqualTo(String value) {
            addCriterion("pile_staffid <>", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidGreaterThan(String value) {
            addCriterion("pile_staffid >", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("pile_staffid >=", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidLessThan(String value) {
            addCriterion("pile_staffid <", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidLessThanOrEqualTo(String value) {
            addCriterion("pile_staffid <=", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidLike(String value) {
            addCriterion("pile_staffid like", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidNotLike(String value) {
            addCriterion("pile_staffid not like", value, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidIn(List<String> values) {
            addCriterion("pile_staffid in", values, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidNotIn(List<String> values) {
            addCriterion("pile_staffid not in", values, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidBetween(String value1, String value2) {
            addCriterion("pile_staffid between", value1, value2, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffidNotBetween(String value1, String value2) {
            addCriterion("pile_staffid not between", value1, value2, "pileStaffid");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameIsNull() {
            addCriterion("pile_staffname is null");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameIsNotNull() {
            addCriterion("pile_staffname is not null");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameEqualTo(String value) {
            addCriterion("pile_staffname =", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameNotEqualTo(String value) {
            addCriterion("pile_staffname <>", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameGreaterThan(String value) {
            addCriterion("pile_staffname >", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("pile_staffname >=", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameLessThan(String value) {
            addCriterion("pile_staffname <", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameLessThanOrEqualTo(String value) {
            addCriterion("pile_staffname <=", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameLike(String value) {
            addCriterion("pile_staffname like", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameNotLike(String value) {
            addCriterion("pile_staffname not like", value, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameIn(List<String> values) {
            addCriterion("pile_staffname in", values, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameNotIn(List<String> values) {
            addCriterion("pile_staffname not in", values, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameBetween(String value1, String value2) {
            addCriterion("pile_staffname between", value1, value2, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStaffnameNotBetween(String value1, String value2) {
            addCriterion("pile_staffname not between", value1, value2, "pileStaffname");
            return (Criteria) this;
        }

        public Criteria andPileStateIsNull() {
            addCriterion("pile_state is null");
            return (Criteria) this;
        }

        public Criteria andPileStateIsNotNull() {
            addCriterion("pile_state is not null");
            return (Criteria) this;
        }

        public Criteria andPileStateEqualTo(Byte value) {
            addCriterion("pile_state =", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateNotEqualTo(Byte value) {
            addCriterion("pile_state <>", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateGreaterThan(Byte value) {
            addCriterion("pile_state >", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("pile_state >=", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateLessThan(Byte value) {
            addCriterion("pile_state <", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateLessThanOrEqualTo(Byte value) {
            addCriterion("pile_state <=", value, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateIn(List<Byte> values) {
            addCriterion("pile_state in", values, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateNotIn(List<Byte> values) {
            addCriterion("pile_state not in", values, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateBetween(Byte value1, Byte value2) {
            addCriterion("pile_state between", value1, value2, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileStateNotBetween(Byte value1, Byte value2) {
            addCriterion("pile_state not between", value1, value2, "pileState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateIsNull() {
            addCriterion("pile_use_state is null");
            return (Criteria) this;
        }

        public Criteria andPileUseStateIsNotNull() {
            addCriterion("pile_use_state is not null");
            return (Criteria) this;
        }

        public Criteria andPileUseStateEqualTo(Byte value) {
            addCriterion("pile_use_state =", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateNotEqualTo(Byte value) {
            addCriterion("pile_use_state <>", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateGreaterThan(Byte value) {
            addCriterion("pile_use_state >", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("pile_use_state >=", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateLessThan(Byte value) {
            addCriterion("pile_use_state <", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateLessThanOrEqualTo(Byte value) {
            addCriterion("pile_use_state <=", value, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateIn(List<Byte> values) {
            addCriterion("pile_use_state in", values, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateNotIn(List<Byte> values) {
            addCriterion("pile_use_state not in", values, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateBetween(Byte value1, Byte value2) {
            addCriterion("pile_use_state between", value1, value2, "pileUseState");
            return (Criteria) this;
        }

        public Criteria andPileUseStateNotBetween(Byte value1, Byte value2) {
            addCriterion("pile_use_state not between", value1, value2, "pileUseState");
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