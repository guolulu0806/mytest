package com.yz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GangweiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GangweiExample() {
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

        public Criteria andGangweiNameIsNull() {
            addCriterion("gangwei_name is null");
            return (Criteria) this;
        }

        public Criteria andGangweiNameIsNotNull() {
            addCriterion("gangwei_name is not null");
            return (Criteria) this;
        }

        public Criteria andGangweiNameEqualTo(String value) {
            addCriterion("gangwei_name =", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameNotEqualTo(String value) {
            addCriterion("gangwei_name <>", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameGreaterThan(String value) {
            addCriterion("gangwei_name >", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameGreaterThanOrEqualTo(String value) {
            addCriterion("gangwei_name >=", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameLessThan(String value) {
            addCriterion("gangwei_name <", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameLessThanOrEqualTo(String value) {
            addCriterion("gangwei_name <=", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameLike(String value) {
            addCriterion("gangwei_name like", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameNotLike(String value) {
            addCriterion("gangwei_name not like", value, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameIn(List<String> values) {
            addCriterion("gangwei_name in", values, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameNotIn(List<String> values) {
            addCriterion("gangwei_name not in", values, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameBetween(String value1, String value2) {
            addCriterion("gangwei_name between", value1, value2, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiNameNotBetween(String value1, String value2) {
            addCriterion("gangwei_name not between", value1, value2, "gangweiName");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeIsNull() {
            addCriterion("gangwei_code is null");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeIsNotNull() {
            addCriterion("gangwei_code is not null");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeEqualTo(String value) {
            addCriterion("gangwei_code =", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeNotEqualTo(String value) {
            addCriterion("gangwei_code <>", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeGreaterThan(String value) {
            addCriterion("gangwei_code >", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gangwei_code >=", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeLessThan(String value) {
            addCriterion("gangwei_code <", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeLessThanOrEqualTo(String value) {
            addCriterion("gangwei_code <=", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeLike(String value) {
            addCriterion("gangwei_code like", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeNotLike(String value) {
            addCriterion("gangwei_code not like", value, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeIn(List<String> values) {
            addCriterion("gangwei_code in", values, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeNotIn(List<String> values) {
            addCriterion("gangwei_code not in", values, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeBetween(String value1, String value2) {
            addCriterion("gangwei_code between", value1, value2, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andGangweiCodeNotBetween(String value1, String value2) {
            addCriterion("gangwei_code not between", value1, value2, "gangweiCode");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeIsNull() {
            addCriterion("gangwei_type is null");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeIsNotNull() {
            addCriterion("gangwei_type is not null");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeEqualTo(String value) {
            addCriterion("gangwei_type =", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeNotEqualTo(String value) {
            addCriterion("gangwei_type <>", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeGreaterThan(String value) {
            addCriterion("gangwei_type >", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gangwei_type >=", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeLessThan(String value) {
            addCriterion("gangwei_type <", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeLessThanOrEqualTo(String value) {
            addCriterion("gangwei_type <=", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeLike(String value) {
            addCriterion("gangwei_type like", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeNotLike(String value) {
            addCriterion("gangwei_type not like", value, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeIn(List<String> values) {
            addCriterion("gangwei_type in", values, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeNotIn(List<String> values) {
            addCriterion("gangwei_type not in", values, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeBetween(String value1, String value2) {
            addCriterion("gangwei_type between", value1, value2, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andGangweiTypeNotBetween(String value1, String value2) {
            addCriterion("gangwei_type not between", value1, value2, "gangweiType");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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