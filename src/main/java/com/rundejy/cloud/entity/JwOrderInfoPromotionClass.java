package com.rundejy.cloud.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JwOrderInfoPromotionClass {
    private Integer id;

    private Integer studentId;

    private String studentName;

    private Long sourceOrderId;

    private Long targetOrderId;

    private Integer sourceProductId;

    private String sourceProductName;

    private Integer targetProductId;

    private String targetProductName;

    private Long sourceSubjectId;

    private String sourceSubjectName;

    private Long targetSubjectId;

    private String targetSubjectName;

    private Long courseId;

    private String courseName;

    private Integer courseNum;

    private Long targetClassId;

    private String targetClassName;

    private Integer oldCourseId;

    private String oldCourseName;

    private Integer oldCourseNum;

    private Long sourceClassId;

    private String sourceClassName;

    private Long enrollId;

    private String enrollName;

    private Long classTeacherId;

    private String classTeacherName;

    private Long campusId;

    private String campusName;

    private Long campusIdCurrent;

    private String campusNameCurrent;

    private Long couponId;

    private String couponName;

    private String examineStaus;

    private Integer supplementaryPayment;

    private String applyReason;

    private Long sourceClassTypeId;

    private String sourceClassTypeName;

    private Long targetClassTypeId;

    private String targetClassTypeName;

    private String sourceClassBatch;

    private String targetClassBatch;

    private BigDecimal deductPrice;

    private BigDecimal sourceReceivePrice;

    private BigDecimal targetReceivePrice;

    private BigDecimal sourceRealPrice;

    private BigDecimal targetRealPrice;

    private Boolean studentConfirmStatus;

    private Date studentConfirmTime;

    private Integer applyStaffId;

    private String applyStaffName;

    private Date applyTime;

    private String trialbatchNo;

    private Boolean trialbatchStatus;

    private Date trialbatchTime;

    private Date finishTime;

    private String createUser;

    private Date createAt;

    private String updateUser;

    private Date updateAt;

    private String trialbatchJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Long getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(Long sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
    }

    public Long getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(Long targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    public Integer getSourceProductId() {
        return sourceProductId;
    }

    public void setSourceProductId(Integer sourceProductId) {
        this.sourceProductId = sourceProductId;
    }

    public String getSourceProductName() {
        return sourceProductName;
    }

    public void setSourceProductName(String sourceProductName) {
        this.sourceProductName = sourceProductName == null ? null : sourceProductName.trim();
    }

    public Integer getTargetProductId() {
        return targetProductId;
    }

    public void setTargetProductId(Integer targetProductId) {
        this.targetProductId = targetProductId;
    }

    public String getTargetProductName() {
        return targetProductName;
    }

    public void setTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName == null ? null : targetProductName.trim();
    }

    public Long getSourceSubjectId() {
        return sourceSubjectId;
    }

    public void setSourceSubjectId(Long sourceSubjectId) {
        this.sourceSubjectId = sourceSubjectId;
    }

    public String getSourceSubjectName() {
        return sourceSubjectName;
    }

    public void setSourceSubjectName(String sourceSubjectName) {
        this.sourceSubjectName = sourceSubjectName == null ? null : sourceSubjectName.trim();
    }

    public Long getTargetSubjectId() {
        return targetSubjectId;
    }

    public void setTargetSubjectId(Long targetSubjectId) {
        this.targetSubjectId = targetSubjectId;
    }

    public String getTargetSubjectName() {
        return targetSubjectName;
    }

    public void setTargetSubjectName(String targetSubjectName) {
        this.targetSubjectName = targetSubjectName == null ? null : targetSubjectName.trim();
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public Long getTargetClassId() {
        return targetClassId;
    }

    public void setTargetClassId(Long targetClassId) {
        this.targetClassId = targetClassId;
    }

    public String getTargetClassName() {
        return targetClassName;
    }

    public void setTargetClassName(String targetClassName) {
        this.targetClassName = targetClassName == null ? null : targetClassName.trim();
    }

    public Integer getOldCourseId() {
        return oldCourseId;
    }

    public void setOldCourseId(Integer oldCourseId) {
        this.oldCourseId = oldCourseId;
    }

    public String getOldCourseName() {
        return oldCourseName;
    }

    public void setOldCourseName(String oldCourseName) {
        this.oldCourseName = oldCourseName == null ? null : oldCourseName.trim();
    }

    public Integer getOldCourseNum() {
        return oldCourseNum;
    }

    public void setOldCourseNum(Integer oldCourseNum) {
        this.oldCourseNum = oldCourseNum;
    }

    public Long getSourceClassId() {
        return sourceClassId;
    }

    public void setSourceClassId(Long sourceClassId) {
        this.sourceClassId = sourceClassId;
    }

    public String getSourceClassName() {
        return sourceClassName;
    }

    public void setSourceClassName(String sourceClassName) {
        this.sourceClassName = sourceClassName == null ? null : sourceClassName.trim();
    }

    public Long getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Long enrollId) {
        this.enrollId = enrollId;
    }

    public String getEnrollName() {
        return enrollName;
    }

    public void setEnrollName(String enrollName) {
        this.enrollName = enrollName == null ? null : enrollName.trim();
    }

    public Long getClassTeacherId() {
        return classTeacherId;
    }

    public void setClassTeacherId(Long classTeacherId) {
        this.classTeacherId = classTeacherId;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName == null ? null : classTeacherName.trim();
    }

    public Long getCampusId() {
        return campusId;
    }

    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName == null ? null : campusName.trim();
    }

    public Long getCampusIdCurrent() {
        return campusIdCurrent;
    }

    public void setCampusIdCurrent(Long campusIdCurrent) {
        this.campusIdCurrent = campusIdCurrent;
    }

    public String getCampusNameCurrent() {
        return campusNameCurrent;
    }

    public void setCampusNameCurrent(String campusNameCurrent) {
        this.campusNameCurrent = campusNameCurrent == null ? null : campusNameCurrent.trim();
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getExamineStaus() {
        return examineStaus;
    }

    public void setExamineStaus(String examineStaus) {
        this.examineStaus = examineStaus == null ? null : examineStaus.trim();
    }

    public Integer getSupplementaryPayment() {
        return supplementaryPayment;
    }

    public void setSupplementaryPayment(Integer supplementaryPayment) {
        this.supplementaryPayment = supplementaryPayment;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public Long getSourceClassTypeId() {
        return sourceClassTypeId;
    }

    public void setSourceClassTypeId(Long sourceClassTypeId) {
        this.sourceClassTypeId = sourceClassTypeId;
    }

    public String getSourceClassTypeName() {
        return sourceClassTypeName;
    }

    public void setSourceClassTypeName(String sourceClassTypeName) {
        this.sourceClassTypeName = sourceClassTypeName == null ? null : sourceClassTypeName.trim();
    }

    public Long getTargetClassTypeId() {
        return targetClassTypeId;
    }

    public void setTargetClassTypeId(Long targetClassTypeId) {
        this.targetClassTypeId = targetClassTypeId;
    }

    public String getTargetClassTypeName() {
        return targetClassTypeName;
    }

    public void setTargetClassTypeName(String targetClassTypeName) {
        this.targetClassTypeName = targetClassTypeName == null ? null : targetClassTypeName.trim();
    }

    public String getSourceClassBatch() {
        return sourceClassBatch;
    }

    public void setSourceClassBatch(String sourceClassBatch) {
        this.sourceClassBatch = sourceClassBatch == null ? null : sourceClassBatch.trim();
    }

    public String getTargetClassBatch() {
        return targetClassBatch;
    }

    public void setTargetClassBatch(String targetClassBatch) {
        this.targetClassBatch = targetClassBatch == null ? null : targetClassBatch.trim();
    }

    public BigDecimal getDeductPrice() {
        return deductPrice;
    }

    public void setDeductPrice(BigDecimal deductPrice) {
        this.deductPrice = deductPrice;
    }

    public BigDecimal getSourceReceivePrice() {
        return sourceReceivePrice;
    }

    public void setSourceReceivePrice(BigDecimal sourceReceivePrice) {
        this.sourceReceivePrice = sourceReceivePrice;
    }

    public BigDecimal getTargetReceivePrice() {
        return targetReceivePrice;
    }

    public void setTargetReceivePrice(BigDecimal targetReceivePrice) {
        this.targetReceivePrice = targetReceivePrice;
    }

    public BigDecimal getSourceRealPrice() {
        return sourceRealPrice;
    }

    public void setSourceRealPrice(BigDecimal sourceRealPrice) {
        this.sourceRealPrice = sourceRealPrice;
    }

    public BigDecimal getTargetRealPrice() {
        return targetRealPrice;
    }

    public void setTargetRealPrice(BigDecimal targetRealPrice) {
        this.targetRealPrice = targetRealPrice;
    }

    public Boolean getStudentConfirmStatus() {
        return studentConfirmStatus;
    }

    public void setStudentConfirmStatus(Boolean studentConfirmStatus) {
        this.studentConfirmStatus = studentConfirmStatus;
    }

    public Date getStudentConfirmTime() {
        return studentConfirmTime;
    }

    public void setStudentConfirmTime(Date studentConfirmTime) {
        this.studentConfirmTime = studentConfirmTime;
    }

    public Integer getApplyStaffId() {
        return applyStaffId;
    }

    public void setApplyStaffId(Integer applyStaffId) {
        this.applyStaffId = applyStaffId;
    }

    public String getApplyStaffName() {
        return applyStaffName;
    }

    public void setApplyStaffName(String applyStaffName) {
        this.applyStaffName = applyStaffName == null ? null : applyStaffName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getTrialbatchNo() {
        return trialbatchNo;
    }

    public void setTrialbatchNo(String trialbatchNo) {
        this.trialbatchNo = trialbatchNo == null ? null : trialbatchNo.trim();
    }

    public Boolean getTrialbatchStatus() {
        return trialbatchStatus;
    }

    public void setTrialbatchStatus(Boolean trialbatchStatus) {
        this.trialbatchStatus = trialbatchStatus;
    }

    public Date getTrialbatchTime() {
        return trialbatchTime;
    }

    public void setTrialbatchTime(Date trialbatchTime) {
        this.trialbatchTime = trialbatchTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getTrialbatchJson() {
        return trialbatchJson;
    }

    public void setTrialbatchJson(String trialbatchJson) {
        this.trialbatchJson = trialbatchJson == null ? null : trialbatchJson.trim();
    }
}