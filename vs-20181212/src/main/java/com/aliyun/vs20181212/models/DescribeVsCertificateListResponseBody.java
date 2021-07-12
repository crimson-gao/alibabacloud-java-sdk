// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateListModel")
    public DescribeVsCertificateListResponseBodyCertificateListModel certificateListModel;

    public static DescribeVsCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateListResponseBody self = new DescribeVsCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsCertificateListResponseBody setCertificateListModel(DescribeVsCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeVsCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public static class DescribeVsCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("Common")
        public String common;

        public static DescribeVsCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsCertificateListResponseBodyCertificateListModelCertList self = new DescribeVsCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModelCertList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

    }

    public static class DescribeVsCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CertList")
        public java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> certList;

        public static DescribeVsCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsCertificateListResponseBodyCertificateListModel self = new DescribeVsCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeVsCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeVsCertificateListResponseBodyCertificateListModel setCertList(java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> certList) {
            this.certList = certList;
            return this;
        }
        public java.util.List<DescribeVsCertificateListResponseBodyCertificateListModelCertList> getCertList() {
            return this.certList;
        }

    }

}
