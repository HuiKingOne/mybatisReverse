package com.rundejy.cloud.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JwOrderInfoPromotionClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JwOrderInfoPromotionClassExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNull() {
            addCriterion("source_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNotNull() {
            addCriterion("source_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdEqualTo(Long value) {
            addCriterion("source_order_id =", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotEqualTo(Long value) {
            addCriterion("source_order_id <>", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThan(Long value) {
            addCriterion("source_order_id >", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_order_id >=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThan(Long value) {
            addCriterion("source_order_id <", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("source_order_id <=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIn(List<Long> values) {
            addCriterion("source_order_id in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotIn(List<Long> values) {
            addCriterion("source_order_id not in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdBetween(Long value1, Long value2) {
            addCriterion("source_order_id between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("source_order_id not between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdIsNull() {
            addCriterion("target_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdIsNotNull() {
            addCriterion("target_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdEqualTo(Long value) {
            addCriterion("target_order_id =", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdNotEqualTo(Long value) {
            addCriterion("target_order_id <>", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdGreaterThan(Long value) {
            addCriterion("target_order_id >", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_order_id >=", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdLessThan(Long value) {
            addCriterion("target_order_id <", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("target_order_id <=", value, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdIn(List<Long> values) {
            addCriterion("target_order_id in", values, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdNotIn(List<Long> values) {
            addCriterion("target_order_id not in", values, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdBetween(Long value1, Long value2) {
            addCriterion("target_order_id between", value1, value2, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andTargetOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("target_order_id not between", value1, value2, "targetOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdIsNull() {
            addCriterion("source_product_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdIsNotNull() {
            addCriterion("source_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdEqualTo(Integer value) {
            addCriterion("source_product_id =", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdNotEqualTo(Integer value) {
            addCriterion("source_product_id <>", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdGreaterThan(Integer value) {
            addCriterion("source_product_id >", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_product_id >=", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdLessThan(Integer value) {
            addCriterion("source_product_id <", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_product_id <=", value, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdIn(List<Integer> values) {
            addCriterion("source_product_id in", values, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdNotIn(List<Integer> values) {
            addCriterion("source_product_id not in", values, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdBetween(Integer value1, Integer value2) {
            addCriterion("source_product_id between", value1, value2, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_product_id not between", value1, value2, "sourceProductId");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameIsNull() {
            addCriterion("source_product_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameIsNotNull() {
            addCriterion("source_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameEqualTo(String value) {
            addCriterion("source_product_name =", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameNotEqualTo(String value) {
            addCriterion("source_product_name <>", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameGreaterThan(String value) {
            addCriterion("source_product_name >", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_product_name >=", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameLessThan(String value) {
            addCriterion("source_product_name <", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameLessThanOrEqualTo(String value) {
            addCriterion("source_product_name <=", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameLike(String value) {
            addCriterion("source_product_name like", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameNotLike(String value) {
            addCriterion("source_product_name not like", value, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameIn(List<String> values) {
            addCriterion("source_product_name in", values, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameNotIn(List<String> values) {
            addCriterion("source_product_name not in", values, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameBetween(String value1, String value2) {
            addCriterion("source_product_name between", value1, value2, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andSourceProductNameNotBetween(String value1, String value2) {
            addCriterion("source_product_name not between", value1, value2, "sourceProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdIsNull() {
            addCriterion("target_product_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdIsNotNull() {
            addCriterion("target_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdEqualTo(Integer value) {
            addCriterion("target_product_id =", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdNotEqualTo(Integer value) {
            addCriterion("target_product_id <>", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdGreaterThan(Integer value) {
            addCriterion("target_product_id >", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_product_id >=", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdLessThan(Integer value) {
            addCriterion("target_product_id <", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("target_product_id <=", value, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdIn(List<Integer> values) {
            addCriterion("target_product_id in", values, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdNotIn(List<Integer> values) {
            addCriterion("target_product_id not in", values, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdBetween(Integer value1, Integer value2) {
            addCriterion("target_product_id between", value1, value2, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("target_product_id not between", value1, value2, "targetProductId");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameIsNull() {
            addCriterion("target_product_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameIsNotNull() {
            addCriterion("target_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameEqualTo(String value) {
            addCriterion("target_product_name =", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameNotEqualTo(String value) {
            addCriterion("target_product_name <>", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameGreaterThan(String value) {
            addCriterion("target_product_name >", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_product_name >=", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameLessThan(String value) {
            addCriterion("target_product_name <", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameLessThanOrEqualTo(String value) {
            addCriterion("target_product_name <=", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameLike(String value) {
            addCriterion("target_product_name like", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameNotLike(String value) {
            addCriterion("target_product_name not like", value, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameIn(List<String> values) {
            addCriterion("target_product_name in", values, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameNotIn(List<String> values) {
            addCriterion("target_product_name not in", values, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameBetween(String value1, String value2) {
            addCriterion("target_product_name between", value1, value2, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andTargetProductNameNotBetween(String value1, String value2) {
            addCriterion("target_product_name not between", value1, value2, "targetProductName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdIsNull() {
            addCriterion("source_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdIsNotNull() {
            addCriterion("source_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdEqualTo(Long value) {
            addCriterion("source_subject_id =", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdNotEqualTo(Long value) {
            addCriterion("source_subject_id <>", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdGreaterThan(Long value) {
            addCriterion("source_subject_id >", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_subject_id >=", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdLessThan(Long value) {
            addCriterion("source_subject_id <", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("source_subject_id <=", value, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdIn(List<Long> values) {
            addCriterion("source_subject_id in", values, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdNotIn(List<Long> values) {
            addCriterion("source_subject_id not in", values, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdBetween(Long value1, Long value2) {
            addCriterion("source_subject_id between", value1, value2, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("source_subject_id not between", value1, value2, "sourceSubjectId");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameIsNull() {
            addCriterion("source_subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameIsNotNull() {
            addCriterion("source_subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameEqualTo(String value) {
            addCriterion("source_subject_name =", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameNotEqualTo(String value) {
            addCriterion("source_subject_name <>", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameGreaterThan(String value) {
            addCriterion("source_subject_name >", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_subject_name >=", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameLessThan(String value) {
            addCriterion("source_subject_name <", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("source_subject_name <=", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameLike(String value) {
            addCriterion("source_subject_name like", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameNotLike(String value) {
            addCriterion("source_subject_name not like", value, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameIn(List<String> values) {
            addCriterion("source_subject_name in", values, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameNotIn(List<String> values) {
            addCriterion("source_subject_name not in", values, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameBetween(String value1, String value2) {
            addCriterion("source_subject_name between", value1, value2, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andSourceSubjectNameNotBetween(String value1, String value2) {
            addCriterion("source_subject_name not between", value1, value2, "sourceSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdIsNull() {
            addCriterion("target_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdIsNotNull() {
            addCriterion("target_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdEqualTo(Long value) {
            addCriterion("target_subject_id =", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdNotEqualTo(Long value) {
            addCriterion("target_subject_id <>", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdGreaterThan(Long value) {
            addCriterion("target_subject_id >", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_subject_id >=", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdLessThan(Long value) {
            addCriterion("target_subject_id <", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("target_subject_id <=", value, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdIn(List<Long> values) {
            addCriterion("target_subject_id in", values, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdNotIn(List<Long> values) {
            addCriterion("target_subject_id not in", values, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdBetween(Long value1, Long value2) {
            addCriterion("target_subject_id between", value1, value2, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("target_subject_id not between", value1, value2, "targetSubjectId");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameIsNull() {
            addCriterion("target_subject_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameIsNotNull() {
            addCriterion("target_subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameEqualTo(String value) {
            addCriterion("target_subject_name =", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameNotEqualTo(String value) {
            addCriterion("target_subject_name <>", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameGreaterThan(String value) {
            addCriterion("target_subject_name >", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_subject_name >=", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameLessThan(String value) {
            addCriterion("target_subject_name <", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("target_subject_name <=", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameLike(String value) {
            addCriterion("target_subject_name like", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameNotLike(String value) {
            addCriterion("target_subject_name not like", value, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameIn(List<String> values) {
            addCriterion("target_subject_name in", values, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameNotIn(List<String> values) {
            addCriterion("target_subject_name not in", values, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameBetween(String value1, String value2) {
            addCriterion("target_subject_name between", value1, value2, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andTargetSubjectNameNotBetween(String value1, String value2) {
            addCriterion("target_subject_name not between", value1, value2, "targetSubjectName");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Long value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Long value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Long value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Long value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Long> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Long> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Long value1, Long value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNull() {
            addCriterion("course_num is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNotNull() {
            addCriterion("course_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumEqualTo(Integer value) {
            addCriterion("course_num =", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotEqualTo(Integer value) {
            addCriterion("course_num <>", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThan(Integer value) {
            addCriterion("course_num >", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_num >=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThan(Integer value) {
            addCriterion("course_num <", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThanOrEqualTo(Integer value) {
            addCriterion("course_num <=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIn(List<Integer> values) {
            addCriterion("course_num in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotIn(List<Integer> values) {
            addCriterion("course_num not in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumBetween(Integer value1, Integer value2) {
            addCriterion("course_num between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("course_num not between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdIsNull() {
            addCriterion("target_class_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdIsNotNull() {
            addCriterion("target_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdEqualTo(Long value) {
            addCriterion("target_class_id =", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdNotEqualTo(Long value) {
            addCriterion("target_class_id <>", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdGreaterThan(Long value) {
            addCriterion("target_class_id >", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_class_id >=", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdLessThan(Long value) {
            addCriterion("target_class_id <", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdLessThanOrEqualTo(Long value) {
            addCriterion("target_class_id <=", value, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdIn(List<Long> values) {
            addCriterion("target_class_id in", values, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdNotIn(List<Long> values) {
            addCriterion("target_class_id not in", values, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdBetween(Long value1, Long value2) {
            addCriterion("target_class_id between", value1, value2, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassIdNotBetween(Long value1, Long value2) {
            addCriterion("target_class_id not between", value1, value2, "targetClassId");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameIsNull() {
            addCriterion("target_class_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameIsNotNull() {
            addCriterion("target_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameEqualTo(String value) {
            addCriterion("target_class_name =", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameNotEqualTo(String value) {
            addCriterion("target_class_name <>", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameGreaterThan(String value) {
            addCriterion("target_class_name >", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_class_name >=", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameLessThan(String value) {
            addCriterion("target_class_name <", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameLessThanOrEqualTo(String value) {
            addCriterion("target_class_name <=", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameLike(String value) {
            addCriterion("target_class_name like", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameNotLike(String value) {
            addCriterion("target_class_name not like", value, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameIn(List<String> values) {
            addCriterion("target_class_name in", values, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameNotIn(List<String> values) {
            addCriterion("target_class_name not in", values, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameBetween(String value1, String value2) {
            addCriterion("target_class_name between", value1, value2, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andTargetClassNameNotBetween(String value1, String value2) {
            addCriterion("target_class_name not between", value1, value2, "targetClassName");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdIsNull() {
            addCriterion("old_course_id is null");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdIsNotNull() {
            addCriterion("old_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdEqualTo(Integer value) {
            addCriterion("old_course_id =", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdNotEqualTo(Integer value) {
            addCriterion("old_course_id <>", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdGreaterThan(Integer value) {
            addCriterion("old_course_id >", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_course_id >=", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdLessThan(Integer value) {
            addCriterion("old_course_id <", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("old_course_id <=", value, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdIn(List<Integer> values) {
            addCriterion("old_course_id in", values, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdNotIn(List<Integer> values) {
            addCriterion("old_course_id not in", values, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("old_course_id between", value1, value2, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("old_course_id not between", value1, value2, "oldCourseId");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameIsNull() {
            addCriterion("old_course_name is null");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameIsNotNull() {
            addCriterion("old_course_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameEqualTo(String value) {
            addCriterion("old_course_name =", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameNotEqualTo(String value) {
            addCriterion("old_course_name <>", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameGreaterThan(String value) {
            addCriterion("old_course_name >", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_course_name >=", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameLessThan(String value) {
            addCriterion("old_course_name <", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameLessThanOrEqualTo(String value) {
            addCriterion("old_course_name <=", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameLike(String value) {
            addCriterion("old_course_name like", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameNotLike(String value) {
            addCriterion("old_course_name not like", value, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameIn(List<String> values) {
            addCriterion("old_course_name in", values, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameNotIn(List<String> values) {
            addCriterion("old_course_name not in", values, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameBetween(String value1, String value2) {
            addCriterion("old_course_name between", value1, value2, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNameNotBetween(String value1, String value2) {
            addCriterion("old_course_name not between", value1, value2, "oldCourseName");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumIsNull() {
            addCriterion("old_course_num is null");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumIsNotNull() {
            addCriterion("old_course_num is not null");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumEqualTo(Integer value) {
            addCriterion("old_course_num =", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumNotEqualTo(Integer value) {
            addCriterion("old_course_num <>", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumGreaterThan(Integer value) {
            addCriterion("old_course_num >", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_course_num >=", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumLessThan(Integer value) {
            addCriterion("old_course_num <", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumLessThanOrEqualTo(Integer value) {
            addCriterion("old_course_num <=", value, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumIn(List<Integer> values) {
            addCriterion("old_course_num in", values, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumNotIn(List<Integer> values) {
            addCriterion("old_course_num not in", values, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumBetween(Integer value1, Integer value2) {
            addCriterion("old_course_num between", value1, value2, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andOldCourseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("old_course_num not between", value1, value2, "oldCourseNum");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdIsNull() {
            addCriterion("source_class_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdIsNotNull() {
            addCriterion("source_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdEqualTo(Long value) {
            addCriterion("source_class_id =", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdNotEqualTo(Long value) {
            addCriterion("source_class_id <>", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdGreaterThan(Long value) {
            addCriterion("source_class_id >", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_class_id >=", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdLessThan(Long value) {
            addCriterion("source_class_id <", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdLessThanOrEqualTo(Long value) {
            addCriterion("source_class_id <=", value, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdIn(List<Long> values) {
            addCriterion("source_class_id in", values, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdNotIn(List<Long> values) {
            addCriterion("source_class_id not in", values, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdBetween(Long value1, Long value2) {
            addCriterion("source_class_id between", value1, value2, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassIdNotBetween(Long value1, Long value2) {
            addCriterion("source_class_id not between", value1, value2, "sourceClassId");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameIsNull() {
            addCriterion("source_class_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameIsNotNull() {
            addCriterion("source_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameEqualTo(String value) {
            addCriterion("source_class_name =", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameNotEqualTo(String value) {
            addCriterion("source_class_name <>", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameGreaterThan(String value) {
            addCriterion("source_class_name >", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_class_name >=", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameLessThan(String value) {
            addCriterion("source_class_name <", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameLessThanOrEqualTo(String value) {
            addCriterion("source_class_name <=", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameLike(String value) {
            addCriterion("source_class_name like", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameNotLike(String value) {
            addCriterion("source_class_name not like", value, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameIn(List<String> values) {
            addCriterion("source_class_name in", values, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameNotIn(List<String> values) {
            addCriterion("source_class_name not in", values, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameBetween(String value1, String value2) {
            addCriterion("source_class_name between", value1, value2, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andSourceClassNameNotBetween(String value1, String value2) {
            addCriterion("source_class_name not between", value1, value2, "sourceClassName");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIsNull() {
            addCriterion("enroll_id is null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIsNotNull() {
            addCriterion("enroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdEqualTo(Long value) {
            addCriterion("enroll_id =", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotEqualTo(Long value) {
            addCriterion("enroll_id <>", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThan(Long value) {
            addCriterion("enroll_id >", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enroll_id >=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThan(Long value) {
            addCriterion("enroll_id <", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThanOrEqualTo(Long value) {
            addCriterion("enroll_id <=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIn(List<Long> values) {
            addCriterion("enroll_id in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotIn(List<Long> values) {
            addCriterion("enroll_id not in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdBetween(Long value1, Long value2) {
            addCriterion("enroll_id between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotBetween(Long value1, Long value2) {
            addCriterion("enroll_id not between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIsNull() {
            addCriterion("enroll_name is null");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIsNotNull() {
            addCriterion("enroll_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollNameEqualTo(String value) {
            addCriterion("enroll_name =", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotEqualTo(String value) {
            addCriterion("enroll_name <>", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameGreaterThan(String value) {
            addCriterion("enroll_name >", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_name >=", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLessThan(String value) {
            addCriterion("enroll_name <", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLessThanOrEqualTo(String value) {
            addCriterion("enroll_name <=", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLike(String value) {
            addCriterion("enroll_name like", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotLike(String value) {
            addCriterion("enroll_name not like", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIn(List<String> values) {
            addCriterion("enroll_name in", values, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotIn(List<String> values) {
            addCriterion("enroll_name not in", values, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameBetween(String value1, String value2) {
            addCriterion("enroll_name between", value1, value2, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotBetween(String value1, String value2) {
            addCriterion("enroll_name not between", value1, value2, "enrollName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNull() {
            addCriterion("class_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNotNull() {
            addCriterion("class_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdEqualTo(Long value) {
            addCriterion("class_teacher_id =", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotEqualTo(Long value) {
            addCriterion("class_teacher_id <>", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThan(Long value) {
            addCriterion("class_teacher_id >", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_teacher_id >=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThan(Long value) {
            addCriterion("class_teacher_id <", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("class_teacher_id <=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIn(List<Long> values) {
            addCriterion("class_teacher_id in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotIn(List<Long> values) {
            addCriterion("class_teacher_id not in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdBetween(Long value1, Long value2) {
            addCriterion("class_teacher_id between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("class_teacher_id not between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameIsNull() {
            addCriterion("class_teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameIsNotNull() {
            addCriterion("class_teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameEqualTo(String value) {
            addCriterion("class_teacher_name =", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameNotEqualTo(String value) {
            addCriterion("class_teacher_name <>", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameGreaterThan(String value) {
            addCriterion("class_teacher_name >", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_teacher_name >=", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameLessThan(String value) {
            addCriterion("class_teacher_name <", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("class_teacher_name <=", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameLike(String value) {
            addCriterion("class_teacher_name like", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameNotLike(String value) {
            addCriterion("class_teacher_name not like", value, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameIn(List<String> values) {
            addCriterion("class_teacher_name in", values, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameNotIn(List<String> values) {
            addCriterion("class_teacher_name not in", values, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameBetween(String value1, String value2) {
            addCriterion("class_teacher_name between", value1, value2, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andClassTeacherNameNotBetween(String value1, String value2) {
            addCriterion("class_teacher_name not between", value1, value2, "classTeacherName");
            return (Criteria) this;
        }

        public Criteria andCampusIdIsNull() {
            addCriterion("campus_id is null");
            return (Criteria) this;
        }

        public Criteria andCampusIdIsNotNull() {
            addCriterion("campus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampusIdEqualTo(Long value) {
            addCriterion("campus_id =", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotEqualTo(Long value) {
            addCriterion("campus_id <>", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdGreaterThan(Long value) {
            addCriterion("campus_id >", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("campus_id >=", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdLessThan(Long value) {
            addCriterion("campus_id <", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdLessThanOrEqualTo(Long value) {
            addCriterion("campus_id <=", value, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdIn(List<Long> values) {
            addCriterion("campus_id in", values, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotIn(List<Long> values) {
            addCriterion("campus_id not in", values, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdBetween(Long value1, Long value2) {
            addCriterion("campus_id between", value1, value2, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusIdNotBetween(Long value1, Long value2) {
            addCriterion("campus_id not between", value1, value2, "campusId");
            return (Criteria) this;
        }

        public Criteria andCampusNameIsNull() {
            addCriterion("campus_name is null");
            return (Criteria) this;
        }

        public Criteria andCampusNameIsNotNull() {
            addCriterion("campus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCampusNameEqualTo(String value) {
            addCriterion("campus_name =", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameNotEqualTo(String value) {
            addCriterion("campus_name <>", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameGreaterThan(String value) {
            addCriterion("campus_name >", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameGreaterThanOrEqualTo(String value) {
            addCriterion("campus_name >=", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameLessThan(String value) {
            addCriterion("campus_name <", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameLessThanOrEqualTo(String value) {
            addCriterion("campus_name <=", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameLike(String value) {
            addCriterion("campus_name like", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameNotLike(String value) {
            addCriterion("campus_name not like", value, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameIn(List<String> values) {
            addCriterion("campus_name in", values, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameNotIn(List<String> values) {
            addCriterion("campus_name not in", values, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameBetween(String value1, String value2) {
            addCriterion("campus_name between", value1, value2, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusNameNotBetween(String value1, String value2) {
            addCriterion("campus_name not between", value1, value2, "campusName");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentIsNull() {
            addCriterion("campus_id_current is null");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentIsNotNull() {
            addCriterion("campus_id_current is not null");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentEqualTo(Long value) {
            addCriterion("campus_id_current =", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentNotEqualTo(Long value) {
            addCriterion("campus_id_current <>", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentGreaterThan(Long value) {
            addCriterion("campus_id_current >", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentGreaterThanOrEqualTo(Long value) {
            addCriterion("campus_id_current >=", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentLessThan(Long value) {
            addCriterion("campus_id_current <", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentLessThanOrEqualTo(Long value) {
            addCriterion("campus_id_current <=", value, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentIn(List<Long> values) {
            addCriterion("campus_id_current in", values, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentNotIn(List<Long> values) {
            addCriterion("campus_id_current not in", values, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentBetween(Long value1, Long value2) {
            addCriterion("campus_id_current between", value1, value2, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusIdCurrentNotBetween(Long value1, Long value2) {
            addCriterion("campus_id_current not between", value1, value2, "campusIdCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentIsNull() {
            addCriterion("campus_name_current is null");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentIsNotNull() {
            addCriterion("campus_name_current is not null");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentEqualTo(String value) {
            addCriterion("campus_name_current =", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentNotEqualTo(String value) {
            addCriterion("campus_name_current <>", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentGreaterThan(String value) {
            addCriterion("campus_name_current >", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("campus_name_current >=", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentLessThan(String value) {
            addCriterion("campus_name_current <", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentLessThanOrEqualTo(String value) {
            addCriterion("campus_name_current <=", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentLike(String value) {
            addCriterion("campus_name_current like", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentNotLike(String value) {
            addCriterion("campus_name_current not like", value, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentIn(List<String> values) {
            addCriterion("campus_name_current in", values, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentNotIn(List<String> values) {
            addCriterion("campus_name_current not in", values, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentBetween(String value1, String value2) {
            addCriterion("campus_name_current between", value1, value2, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCampusNameCurrentNotBetween(String value1, String value2) {
            addCriterion("campus_name_current not between", value1, value2, "campusNameCurrent");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Long value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Long value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Long value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Long value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Long> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Long> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Long value1, Long value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andExamineStausIsNull() {
            addCriterion("examine_staus is null");
            return (Criteria) this;
        }

        public Criteria andExamineStausIsNotNull() {
            addCriterion("examine_staus is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStausEqualTo(String value) {
            addCriterion("examine_staus =", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausNotEqualTo(String value) {
            addCriterion("examine_staus <>", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausGreaterThan(String value) {
            addCriterion("examine_staus >", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausGreaterThanOrEqualTo(String value) {
            addCriterion("examine_staus >=", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausLessThan(String value) {
            addCriterion("examine_staus <", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausLessThanOrEqualTo(String value) {
            addCriterion("examine_staus <=", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausLike(String value) {
            addCriterion("examine_staus like", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausNotLike(String value) {
            addCriterion("examine_staus not like", value, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausIn(List<String> values) {
            addCriterion("examine_staus in", values, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausNotIn(List<String> values) {
            addCriterion("examine_staus not in", values, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausBetween(String value1, String value2) {
            addCriterion("examine_staus between", value1, value2, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andExamineStausNotBetween(String value1, String value2) {
            addCriterion("examine_staus not between", value1, value2, "examineStaus");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentIsNull() {
            addCriterion("supplementary_payment is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentIsNotNull() {
            addCriterion("supplementary_payment is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentEqualTo(Integer value) {
            addCriterion("supplementary_payment =", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentNotEqualTo(Integer value) {
            addCriterion("supplementary_payment <>", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentGreaterThan(Integer value) {
            addCriterion("supplementary_payment >", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplementary_payment >=", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentLessThan(Integer value) {
            addCriterion("supplementary_payment <", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("supplementary_payment <=", value, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentIn(List<Integer> values) {
            addCriterion("supplementary_payment in", values, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentNotIn(List<Integer> values) {
            addCriterion("supplementary_payment not in", values, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentBetween(Integer value1, Integer value2) {
            addCriterion("supplementary_payment between", value1, value2, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andSupplementaryPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("supplementary_payment not between", value1, value2, "supplementaryPayment");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("apply_reason is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("apply_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("apply_reason =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("apply_reason <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("apply_reason >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_reason >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("apply_reason <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("apply_reason <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("apply_reason like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("apply_reason not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("apply_reason in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("apply_reason not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("apply_reason between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("apply_reason not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdIsNull() {
            addCriterion("source_class_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdIsNotNull() {
            addCriterion("source_class_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdEqualTo(Long value) {
            addCriterion("source_class_type_id =", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdNotEqualTo(Long value) {
            addCriterion("source_class_type_id <>", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdGreaterThan(Long value) {
            addCriterion("source_class_type_id >", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_class_type_id >=", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdLessThan(Long value) {
            addCriterion("source_class_type_id <", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("source_class_type_id <=", value, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdIn(List<Long> values) {
            addCriterion("source_class_type_id in", values, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdNotIn(List<Long> values) {
            addCriterion("source_class_type_id not in", values, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdBetween(Long value1, Long value2) {
            addCriterion("source_class_type_id between", value1, value2, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("source_class_type_id not between", value1, value2, "sourceClassTypeId");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameIsNull() {
            addCriterion("source_class_type_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameIsNotNull() {
            addCriterion("source_class_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameEqualTo(String value) {
            addCriterion("source_class_type_name =", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameNotEqualTo(String value) {
            addCriterion("source_class_type_name <>", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameGreaterThan(String value) {
            addCriterion("source_class_type_name >", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_class_type_name >=", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameLessThan(String value) {
            addCriterion("source_class_type_name <", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameLessThanOrEqualTo(String value) {
            addCriterion("source_class_type_name <=", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameLike(String value) {
            addCriterion("source_class_type_name like", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameNotLike(String value) {
            addCriterion("source_class_type_name not like", value, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameIn(List<String> values) {
            addCriterion("source_class_type_name in", values, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameNotIn(List<String> values) {
            addCriterion("source_class_type_name not in", values, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameBetween(String value1, String value2) {
            addCriterion("source_class_type_name between", value1, value2, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassTypeNameNotBetween(String value1, String value2) {
            addCriterion("source_class_type_name not between", value1, value2, "sourceClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdIsNull() {
            addCriterion("target_class_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdIsNotNull() {
            addCriterion("target_class_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdEqualTo(Long value) {
            addCriterion("target_class_type_id =", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdNotEqualTo(Long value) {
            addCriterion("target_class_type_id <>", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdGreaterThan(Long value) {
            addCriterion("target_class_type_id >", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_class_type_id >=", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdLessThan(Long value) {
            addCriterion("target_class_type_id <", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("target_class_type_id <=", value, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdIn(List<Long> values) {
            addCriterion("target_class_type_id in", values, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdNotIn(List<Long> values) {
            addCriterion("target_class_type_id not in", values, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdBetween(Long value1, Long value2) {
            addCriterion("target_class_type_id between", value1, value2, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("target_class_type_id not between", value1, value2, "targetClassTypeId");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameIsNull() {
            addCriterion("target_class_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameIsNotNull() {
            addCriterion("target_class_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameEqualTo(String value) {
            addCriterion("target_class_type_name =", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameNotEqualTo(String value) {
            addCriterion("target_class_type_name <>", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameGreaterThan(String value) {
            addCriterion("target_class_type_name >", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("target_class_type_name >=", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameLessThan(String value) {
            addCriterion("target_class_type_name <", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameLessThanOrEqualTo(String value) {
            addCriterion("target_class_type_name <=", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameLike(String value) {
            addCriterion("target_class_type_name like", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameNotLike(String value) {
            addCriterion("target_class_type_name not like", value, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameIn(List<String> values) {
            addCriterion("target_class_type_name in", values, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameNotIn(List<String> values) {
            addCriterion("target_class_type_name not in", values, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameBetween(String value1, String value2) {
            addCriterion("target_class_type_name between", value1, value2, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andTargetClassTypeNameNotBetween(String value1, String value2) {
            addCriterion("target_class_type_name not between", value1, value2, "targetClassTypeName");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchIsNull() {
            addCriterion("source_class_batch is null");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchIsNotNull() {
            addCriterion("source_class_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchEqualTo(String value) {
            addCriterion("source_class_batch =", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchNotEqualTo(String value) {
            addCriterion("source_class_batch <>", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchGreaterThan(String value) {
            addCriterion("source_class_batch >", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchGreaterThanOrEqualTo(String value) {
            addCriterion("source_class_batch >=", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchLessThan(String value) {
            addCriterion("source_class_batch <", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchLessThanOrEqualTo(String value) {
            addCriterion("source_class_batch <=", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchLike(String value) {
            addCriterion("source_class_batch like", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchNotLike(String value) {
            addCriterion("source_class_batch not like", value, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchIn(List<String> values) {
            addCriterion("source_class_batch in", values, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchNotIn(List<String> values) {
            addCriterion("source_class_batch not in", values, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchBetween(String value1, String value2) {
            addCriterion("source_class_batch between", value1, value2, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andSourceClassBatchNotBetween(String value1, String value2) {
            addCriterion("source_class_batch not between", value1, value2, "sourceClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchIsNull() {
            addCriterion("target_class_batch is null");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchIsNotNull() {
            addCriterion("target_class_batch is not null");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchEqualTo(String value) {
            addCriterion("target_class_batch =", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchNotEqualTo(String value) {
            addCriterion("target_class_batch <>", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchGreaterThan(String value) {
            addCriterion("target_class_batch >", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchGreaterThanOrEqualTo(String value) {
            addCriterion("target_class_batch >=", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchLessThan(String value) {
            addCriterion("target_class_batch <", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchLessThanOrEqualTo(String value) {
            addCriterion("target_class_batch <=", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchLike(String value) {
            addCriterion("target_class_batch like", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchNotLike(String value) {
            addCriterion("target_class_batch not like", value, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchIn(List<String> values) {
            addCriterion("target_class_batch in", values, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchNotIn(List<String> values) {
            addCriterion("target_class_batch not in", values, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchBetween(String value1, String value2) {
            addCriterion("target_class_batch between", value1, value2, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andTargetClassBatchNotBetween(String value1, String value2) {
            addCriterion("target_class_batch not between", value1, value2, "targetClassBatch");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIsNull() {
            addCriterion("deduct_price is null");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIsNotNull() {
            addCriterion("deduct_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeductPriceEqualTo(BigDecimal value) {
            addCriterion("deduct_price =", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotEqualTo(BigDecimal value) {
            addCriterion("deduct_price <>", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceGreaterThan(BigDecimal value) {
            addCriterion("deduct_price >", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduct_price >=", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceLessThan(BigDecimal value) {
            addCriterion("deduct_price <", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduct_price <=", value, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceIn(List<BigDecimal> values) {
            addCriterion("deduct_price in", values, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotIn(List<BigDecimal> values) {
            addCriterion("deduct_price not in", values, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduct_price between", value1, value2, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andDeductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduct_price not between", value1, value2, "deductPrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceIsNull() {
            addCriterion("source_receive_price is null");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceIsNotNull() {
            addCriterion("source_receive_price is not null");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceEqualTo(BigDecimal value) {
            addCriterion("source_receive_price =", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceNotEqualTo(BigDecimal value) {
            addCriterion("source_receive_price <>", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceGreaterThan(BigDecimal value) {
            addCriterion("source_receive_price >", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("source_receive_price >=", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceLessThan(BigDecimal value) {
            addCriterion("source_receive_price <", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("source_receive_price <=", value, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceIn(List<BigDecimal> values) {
            addCriterion("source_receive_price in", values, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceNotIn(List<BigDecimal> values) {
            addCriterion("source_receive_price not in", values, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_receive_price between", value1, value2, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceReceivePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_receive_price not between", value1, value2, "sourceReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceIsNull() {
            addCriterion("target_receive_price is null");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceIsNotNull() {
            addCriterion("target_receive_price is not null");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceEqualTo(BigDecimal value) {
            addCriterion("target_receive_price =", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceNotEqualTo(BigDecimal value) {
            addCriterion("target_receive_price <>", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceGreaterThan(BigDecimal value) {
            addCriterion("target_receive_price >", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_receive_price >=", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceLessThan(BigDecimal value) {
            addCriterion("target_receive_price <", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_receive_price <=", value, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceIn(List<BigDecimal> values) {
            addCriterion("target_receive_price in", values, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceNotIn(List<BigDecimal> values) {
            addCriterion("target_receive_price not in", values, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_receive_price between", value1, value2, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andTargetReceivePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_receive_price not between", value1, value2, "targetReceivePrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceIsNull() {
            addCriterion("source_real_price is null");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceIsNotNull() {
            addCriterion("source_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceEqualTo(BigDecimal value) {
            addCriterion("source_real_price =", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("source_real_price <>", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceGreaterThan(BigDecimal value) {
            addCriterion("source_real_price >", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("source_real_price >=", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceLessThan(BigDecimal value) {
            addCriterion("source_real_price <", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("source_real_price <=", value, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceIn(List<BigDecimal> values) {
            addCriterion("source_real_price in", values, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("source_real_price not in", values, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_real_price between", value1, value2, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andSourceRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("source_real_price not between", value1, value2, "sourceRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceIsNull() {
            addCriterion("target_real_price is null");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceIsNotNull() {
            addCriterion("target_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceEqualTo(BigDecimal value) {
            addCriterion("target_real_price =", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("target_real_price <>", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceGreaterThan(BigDecimal value) {
            addCriterion("target_real_price >", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_real_price >=", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceLessThan(BigDecimal value) {
            addCriterion("target_real_price <", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_real_price <=", value, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceIn(List<BigDecimal> values) {
            addCriterion("target_real_price in", values, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("target_real_price not in", values, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_real_price between", value1, value2, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andTargetRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_real_price not between", value1, value2, "targetRealPrice");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusIsNull() {
            addCriterion("student_confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusIsNotNull() {
            addCriterion("student_confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusEqualTo(Boolean value) {
            addCriterion("student_confirm_status =", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusNotEqualTo(Boolean value) {
            addCriterion("student_confirm_status <>", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusGreaterThan(Boolean value) {
            addCriterion("student_confirm_status >", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("student_confirm_status >=", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusLessThan(Boolean value) {
            addCriterion("student_confirm_status <", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("student_confirm_status <=", value, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusIn(List<Boolean> values) {
            addCriterion("student_confirm_status in", values, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusNotIn(List<Boolean> values) {
            addCriterion("student_confirm_status not in", values, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("student_confirm_status between", value1, value2, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("student_confirm_status not between", value1, value2, "studentConfirmStatus");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeIsNull() {
            addCriterion("student_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeIsNotNull() {
            addCriterion("student_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeEqualTo(Date value) {
            addCriterion("student_confirm_time =", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeNotEqualTo(Date value) {
            addCriterion("student_confirm_time <>", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeGreaterThan(Date value) {
            addCriterion("student_confirm_time >", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_confirm_time >=", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeLessThan(Date value) {
            addCriterion("student_confirm_time <", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_confirm_time <=", value, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeIn(List<Date> values) {
            addCriterion("student_confirm_time in", values, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeNotIn(List<Date> values) {
            addCriterion("student_confirm_time not in", values, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("student_confirm_time between", value1, value2, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andStudentConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_confirm_time not between", value1, value2, "studentConfirmTime");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdIsNull() {
            addCriterion("apply_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdIsNotNull() {
            addCriterion("apply_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdEqualTo(Integer value) {
            addCriterion("apply_staff_id =", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdNotEqualTo(Integer value) {
            addCriterion("apply_staff_id <>", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdGreaterThan(Integer value) {
            addCriterion("apply_staff_id >", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_staff_id >=", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdLessThan(Integer value) {
            addCriterion("apply_staff_id <", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_staff_id <=", value, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdIn(List<Integer> values) {
            addCriterion("apply_staff_id in", values, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdNotIn(List<Integer> values) {
            addCriterion("apply_staff_id not in", values, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_staff_id between", value1, value2, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_staff_id not between", value1, value2, "applyStaffId");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameIsNull() {
            addCriterion("apply_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameIsNotNull() {
            addCriterion("apply_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameEqualTo(String value) {
            addCriterion("apply_staff_name =", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameNotEqualTo(String value) {
            addCriterion("apply_staff_name <>", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameGreaterThan(String value) {
            addCriterion("apply_staff_name >", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_staff_name >=", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameLessThan(String value) {
            addCriterion("apply_staff_name <", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameLessThanOrEqualTo(String value) {
            addCriterion("apply_staff_name <=", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameLike(String value) {
            addCriterion("apply_staff_name like", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameNotLike(String value) {
            addCriterion("apply_staff_name not like", value, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameIn(List<String> values) {
            addCriterion("apply_staff_name in", values, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameNotIn(List<String> values) {
            addCriterion("apply_staff_name not in", values, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameBetween(String value1, String value2) {
            addCriterion("apply_staff_name between", value1, value2, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyStaffNameNotBetween(String value1, String value2) {
            addCriterion("apply_staff_name not between", value1, value2, "applyStaffName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoIsNull() {
            addCriterion("trialbatch_no is null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoIsNotNull() {
            addCriterion("trialbatch_no is not null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoEqualTo(String value) {
            addCriterion("trialbatch_no =", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoNotEqualTo(String value) {
            addCriterion("trialbatch_no <>", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoGreaterThan(String value) {
            addCriterion("trialbatch_no >", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("trialbatch_no >=", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoLessThan(String value) {
            addCriterion("trialbatch_no <", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoLessThanOrEqualTo(String value) {
            addCriterion("trialbatch_no <=", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoLike(String value) {
            addCriterion("trialbatch_no like", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoNotLike(String value) {
            addCriterion("trialbatch_no not like", value, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoIn(List<String> values) {
            addCriterion("trialbatch_no in", values, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoNotIn(List<String> values) {
            addCriterion("trialbatch_no not in", values, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoBetween(String value1, String value2) {
            addCriterion("trialbatch_no between", value1, value2, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchNoNotBetween(String value1, String value2) {
            addCriterion("trialbatch_no not between", value1, value2, "trialbatchNo");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusIsNull() {
            addCriterion("trialbatch_status is null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusIsNotNull() {
            addCriterion("trialbatch_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusEqualTo(Boolean value) {
            addCriterion("trialbatch_status =", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusNotEqualTo(Boolean value) {
            addCriterion("trialbatch_status <>", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusGreaterThan(Boolean value) {
            addCriterion("trialbatch_status >", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trialbatch_status >=", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusLessThan(Boolean value) {
            addCriterion("trialbatch_status <", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("trialbatch_status <=", value, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusIn(List<Boolean> values) {
            addCriterion("trialbatch_status in", values, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusNotIn(List<Boolean> values) {
            addCriterion("trialbatch_status not in", values, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("trialbatch_status between", value1, value2, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trialbatch_status not between", value1, value2, "trialbatchStatus");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeIsNull() {
            addCriterion("trialbatch_time is null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeIsNotNull() {
            addCriterion("trialbatch_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeEqualTo(Date value) {
            addCriterion("trialbatch_time =", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeNotEqualTo(Date value) {
            addCriterion("trialbatch_time <>", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeGreaterThan(Date value) {
            addCriterion("trialbatch_time >", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trialbatch_time >=", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeLessThan(Date value) {
            addCriterion("trialbatch_time <", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("trialbatch_time <=", value, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeIn(List<Date> values) {
            addCriterion("trialbatch_time in", values, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeNotIn(List<Date> values) {
            addCriterion("trialbatch_time not in", values, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeBetween(Date value1, Date value2) {
            addCriterion("trialbatch_time between", value1, value2, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andTrialbatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("trialbatch_time not between", value1, value2, "trialbatchTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
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