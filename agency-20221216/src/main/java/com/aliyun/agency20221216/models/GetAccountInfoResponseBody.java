// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    /**
     * <p>List of Account Information</p>
     */
    @NameInMap("AccountInfoList")
    public GetAccountInfoResponseBodyAccountInfoList accountInfoList;

    /**
     * <p>Result Code - Error Code. Value Range:</p>
     * <p>- 200 OK</p>
     * <p>- 1109 System Error</p>
     * <p>- 3029: Invalid UID</p>
     * <p>- 3062: UID and UserType are both empty.</p>
     * <p>- 3063: UserType value out of range.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination Information</p>
     */
    @NameInMap("PageInfo")
    public GetAccountInfoResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID, the unique request identifier generated by Alibaba Cloud.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponseBody self = new GetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponseBody setAccountInfoList(GetAccountInfoResponseBodyAccountInfoList accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public GetAccountInfoResponseBodyAccountInfoList getAccountInfoList() {
        return this.accountInfoList;
    }

    public GetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountInfoResponseBody setPageInfo(GetAccountInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetAccountInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountInfoResponseBodyAccountInfoListAccountInfo extends TeaModel {
        /**
         * <p>The name of Sub Account:</p>
         * <p>1.	Use the official name of Company, if Sub Account is an enterprise.</p>
         * <p>2.	Use the official name of Partner, if Sub Account is a T2 reseller.</p>
         */
        @NameInMap("AccountNickname")
        public String accountNickname;

        /**
         * <p>Alibaba Cloud Login name of Distribution Customer.</p>
         */
        @NameInMap("AliyunId")
        public String aliyunId;

        /**
         * <p>The time that Distribution Customer successfully associated with Distributor.</p>
         */
        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        /**
         * <p>Account CID of Distribution Customer.</p>
         */
        @NameInMap("Cid")
        public Long cid;

        @NameInMap("CustomerBd")
        public String customerBd;

        @NameInMap("DelayAmount")
        public String delayAmount;

        @NameInMap("DelayStatus")
        public String delayStatus;

        /**
         * <p>The E-mail of Distribution Customer.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Valid mobile number of Distribution Customer.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NewBuyStatus")
        public String newBuyStatus;

        /**
         * <p>Description of Distribution Customer.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Account Type:</p>
         * <p>- 1 Agency\"s End User</p>
         * <p>- 2 Reseller\"s End User</p>
         * <p>- 3 Enterprise</p>
         * <p>- 4 T2 Agency Partner</p>
         * <p>- 5 T2 Reseller Partner</p>
         * <p>- 6 T2 Agency+Reseller Partner</p>
         */
        @NameInMap("SubAccountType")
        public Integer subAccountType;

        /**
         * <p>Account UID of Distribution Customer.</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static GetAccountInfoResponseBodyAccountInfoListAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoListAccountInfo self = new GetAccountInfoResponseBodyAccountInfoListAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAssociationSuccessTime(String associationSuccessTime) {
            this.associationSuccessTime = associationSuccessTime;
            return this;
        }
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setCustomerBd(String customerBd) {
            this.customerBd = customerBd;
            return this;
        }
        public String getCustomerBd() {
            return this.customerBd;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setDelayAmount(String delayAmount) {
            this.delayAmount = delayAmount;
            return this;
        }
        public String getDelayAmount() {
            return this.delayAmount;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setDelayStatus(String delayStatus) {
            this.delayStatus = delayStatus;
            return this;
        }
        public String getDelayStatus() {
            return this.delayStatus;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setNewBuyStatus(String newBuyStatus) {
            this.newBuyStatus = newBuyStatus;
            return this;
        }
        public String getNewBuyStatus() {
            return this.newBuyStatus;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setSubAccountType(Integer subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public Integer getSubAccountType() {
            return this.subAccountType;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetAccountInfoResponseBodyAccountInfoList extends TeaModel {
        @NameInMap("AccountInfo")
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo;

        public static GetAccountInfoResponseBodyAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoList self = new GetAccountInfoResponseBodyAccountInfoList();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoList setAccountInfo(java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> getAccountInfo() {
            return this.accountInfo;
        }

    }

    public static class GetAccountInfoResponseBodyPageInfo extends TeaModel {
        /**
         * <p>Pagination, current page.</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Pagination, record number on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Pagination, page volume in total.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetAccountInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyPageInfo self = new GetAccountInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetAccountInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAccountInfoResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
