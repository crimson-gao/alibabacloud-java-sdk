// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUsersShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserGroupId")
    public Long userGroupId;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("FaceImageUrl")
    public String faceImageUrl;

    @NameInMap("Address")
    public String address;

    @NameInMap("Age")
    public Integer age;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("PlateNo")
    public String plateNo;

    @NameInMap("PhoneNo")
    public String phoneNo;

    @NameInMap("Attachment")
    public String attachment;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("PersonList")
    public String personListShrink;

    @NameInMap("UserList")
    public String userListShrink;

    @NameInMap("MatchingRateThreshold")
    public String matchingRateThreshold;

    public static ListUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersShrinkRequest self = new ListUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListUsersShrinkRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public ListUsersShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ListUsersShrinkRequest setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public ListUsersShrinkRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public ListUsersShrinkRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public ListUsersShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListUsersShrinkRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public ListUsersShrinkRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public ListUsersShrinkRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public ListUsersShrinkRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public ListUsersShrinkRequest setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    public String getAttachment() {
        return this.attachment;
    }

    public ListUsersShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUsersShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersShrinkRequest setPersonListShrink(String personListShrink) {
        this.personListShrink = personListShrink;
        return this;
    }
    public String getPersonListShrink() {
        return this.personListShrink;
    }

    public ListUsersShrinkRequest setUserListShrink(String userListShrink) {
        this.userListShrink = userListShrink;
        return this;
    }
    public String getUserListShrink() {
        return this.userListShrink;
    }

    public ListUsersShrinkRequest setMatchingRateThreshold(String matchingRateThreshold) {
        this.matchingRateThreshold = matchingRateThreshold;
        return this;
    }
    public String getMatchingRateThreshold() {
        return this.matchingRateThreshold;
    }

}
