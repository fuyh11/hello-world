package po;

import java.util.ArrayList;
import java.util.List;

public class AdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminsExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aName is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aName is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aName =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aName <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aName >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aName >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aName <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aName <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aName like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aName not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aName in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aName not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aName between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aName not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andApassIsNull() {
            addCriterion("aPass is null");
            return (Criteria) this;
        }

        public Criteria andApassIsNotNull() {
            addCriterion("aPass is not null");
            return (Criteria) this;
        }

        public Criteria andApassEqualTo(String value) {
            addCriterion("aPass =", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotEqualTo(String value) {
            addCriterion("aPass <>", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassGreaterThan(String value) {
            addCriterion("aPass >", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassGreaterThanOrEqualTo(String value) {
            addCriterion("aPass >=", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLessThan(String value) {
            addCriterion("aPass <", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLessThanOrEqualTo(String value) {
            addCriterion("aPass <=", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassLike(String value) {
            addCriterion("aPass like", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotLike(String value) {
            addCriterion("aPass not like", value, "apass");
            return (Criteria) this;
        }

        public Criteria andApassIn(List<String> values) {
            addCriterion("aPass in", values, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotIn(List<String> values) {
            addCriterion("aPass not in", values, "apass");
            return (Criteria) this;
        }

        public Criteria andApassBetween(String value1, String value2) {
            addCriterion("aPass between", value1, value2, "apass");
            return (Criteria) this;
        }

        public Criteria andApassNotBetween(String value1, String value2) {
            addCriterion("aPass not between", value1, value2, "apass");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNull() {
            addCriterion("adminPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNotNull() {
            addCriterion("adminPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneEqualTo(Integer value) {
            addCriterion("adminPhone =", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotEqualTo(Integer value) {
            addCriterion("adminPhone <>", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThan(Integer value) {
            addCriterion("adminPhone >", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminPhone >=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThan(Integer value) {
            addCriterion("adminPhone <", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThanOrEqualTo(Integer value) {
            addCriterion("adminPhone <=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIn(List<Integer> values) {
            addCriterion("adminPhone in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotIn(List<Integer> values) {
            addCriterion("adminPhone not in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneBetween(Integer value1, Integer value2) {
            addCriterion("adminPhone between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("adminPhone not between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("adminEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("adminEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("adminEmail =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("adminEmail <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("adminEmail >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("adminEmail >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("adminEmail <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("adminEmail <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("adminEmail like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("adminEmail not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("adminEmail in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("adminEmail not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("adminEmail between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("adminEmail not between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminpictureIsNull() {
            addCriterion("adminPicture is null");
            return (Criteria) this;
        }

        public Criteria andAdminpictureIsNotNull() {
            addCriterion("adminPicture is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpictureEqualTo(String value) {
            addCriterion("adminPicture =", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureNotEqualTo(String value) {
            addCriterion("adminPicture <>", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureGreaterThan(String value) {
            addCriterion("adminPicture >", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureGreaterThanOrEqualTo(String value) {
            addCriterion("adminPicture >=", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureLessThan(String value) {
            addCriterion("adminPicture <", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureLessThanOrEqualTo(String value) {
            addCriterion("adminPicture <=", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureLike(String value) {
            addCriterion("adminPicture like", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureNotLike(String value) {
            addCriterion("adminPicture not like", value, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureIn(List<String> values) {
            addCriterion("adminPicture in", values, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureNotIn(List<String> values) {
            addCriterion("adminPicture not in", values, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureBetween(String value1, String value2) {
            addCriterion("adminPicture between", value1, value2, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminpictureNotBetween(String value1, String value2) {
            addCriterion("adminPicture not between", value1, value2, "adminpicture");
            return (Criteria) this;
        }

        public Criteria andAdminmessIsNull() {
            addCriterion("adminMess is null");
            return (Criteria) this;
        }

        public Criteria andAdminmessIsNotNull() {
            addCriterion("adminMess is not null");
            return (Criteria) this;
        }

        public Criteria andAdminmessEqualTo(String value) {
            addCriterion("adminMess =", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessNotEqualTo(String value) {
            addCriterion("adminMess <>", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessGreaterThan(String value) {
            addCriterion("adminMess >", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessGreaterThanOrEqualTo(String value) {
            addCriterion("adminMess >=", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessLessThan(String value) {
            addCriterion("adminMess <", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessLessThanOrEqualTo(String value) {
            addCriterion("adminMess <=", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessLike(String value) {
            addCriterion("adminMess like", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessNotLike(String value) {
            addCriterion("adminMess not like", value, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessIn(List<String> values) {
            addCriterion("adminMess in", values, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessNotIn(List<String> values) {
            addCriterion("adminMess not in", values, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessBetween(String value1, String value2) {
            addCriterion("adminMess between", value1, value2, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminmessNotBetween(String value1, String value2) {
            addCriterion("adminMess not between", value1, value2, "adminmess");
            return (Criteria) this;
        }

        public Criteria andAdminroleidIsNull() {
            addCriterion("adminRoleid is null");
            return (Criteria) this;
        }

        public Criteria andAdminroleidIsNotNull() {
            addCriterion("adminRoleid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminroleidEqualTo(Integer value) {
            addCriterion("adminRoleid =", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidNotEqualTo(Integer value) {
            addCriterion("adminRoleid <>", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidGreaterThan(Integer value) {
            addCriterion("adminRoleid >", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminRoleid >=", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidLessThan(Integer value) {
            addCriterion("adminRoleid <", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidLessThanOrEqualTo(Integer value) {
            addCriterion("adminRoleid <=", value, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidIn(List<Integer> values) {
            addCriterion("adminRoleid in", values, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidNotIn(List<Integer> values) {
            addCriterion("adminRoleid not in", values, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidBetween(Integer value1, Integer value2) {
            addCriterion("adminRoleid between", value1, value2, "adminroleid");
            return (Criteria) this;
        }

        public Criteria andAdminroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminRoleid not between", value1, value2, "adminroleid");
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