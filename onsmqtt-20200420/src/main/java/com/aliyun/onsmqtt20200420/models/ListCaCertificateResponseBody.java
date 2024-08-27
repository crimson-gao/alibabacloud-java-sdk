// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListCaCertificateResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCaCertificateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCaCertificateResponseBody self = new ListCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCaCertificateResponseBody setData(ListCaCertificateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCaCertificateResponseBodyData getData() {
        return this.data;
    }

    public ListCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCaCertificateResponseBodyDataCaCertificateVOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIDuzCCAqdGVzdC5jbi1xaW5n******\n-----END CERTIFICATE-----</p>
         */
        @NameInMap("CaContent")
        public String caContent;

        /**
         * <strong>example:</strong>
         * <p>mqtt_ca</p>
         */
        @NameInMap("CaName")
        public String caName;

        /**
         * <strong>example:</strong>
         * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
         */
        @NameInMap("RegistrationCode")
        public String registrationCode;

        /**
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1654137303000</p>
         */
        @NameInMap("ValidBegin")
        public String validBegin;

        /**
         * <strong>example:</strong>
         * <p>1969497303000</p>
         */
        @NameInMap("ValidEnd")
        public String validEnd;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIID/DCCAu+Y5sRMpp9tnd+4s******\n-----END CERTIFICATE-----</p>
         */
        @NameInMap("VerificationContent")
        public String verificationContent;

        public static ListCaCertificateResponseBodyDataCaCertificateVOS build(java.util.Map<String, ?> map) throws Exception {
            ListCaCertificateResponseBodyDataCaCertificateVOS self = new ListCaCertificateResponseBodyDataCaCertificateVOS();
            return TeaModel.build(map, self);
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setCaContent(String caContent) {
            this.caContent = caContent;
            return this;
        }
        public String getCaContent() {
            return this.caContent;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setCaName(String caName) {
            this.caName = caName;
            return this;
        }
        public String getCaName() {
            return this.caName;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setRegistrationCode(String registrationCode) {
            this.registrationCode = registrationCode;
            return this;
        }
        public String getRegistrationCode() {
            return this.registrationCode;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setValidBegin(String validBegin) {
            this.validBegin = validBegin;
            return this;
        }
        public String getValidBegin() {
            return this.validBegin;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setValidEnd(String validEnd) {
            this.validEnd = validEnd;
            return this;
        }
        public String getValidEnd() {
            return this.validEnd;
        }

        public ListCaCertificateResponseBodyDataCaCertificateVOS setVerificationContent(String verificationContent) {
            this.verificationContent = verificationContent;
            return this;
        }
        public String getVerificationContent() {
            return this.verificationContent;
        }

    }

    public static class ListCaCertificateResponseBodyData extends TeaModel {
        @NameInMap("CaCertificateVOS")
        public java.util.List<ListCaCertificateResponseBodyDataCaCertificateVOS> caCertificateVOS;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListCaCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCaCertificateResponseBodyData self = new ListCaCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCaCertificateResponseBodyData setCaCertificateVOS(java.util.List<ListCaCertificateResponseBodyDataCaCertificateVOS> caCertificateVOS) {
            this.caCertificateVOS = caCertificateVOS;
            return this;
        }
        public java.util.List<ListCaCertificateResponseBodyDataCaCertificateVOS> getCaCertificateVOS() {
            return this.caCertificateVOS;
        }

        public ListCaCertificateResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListCaCertificateResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCaCertificateResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
