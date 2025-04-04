// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAccessModeResponseBody extends TeaModel {
    @NameInMap("DomainModeList")
    public java.util.List<DescribeDomainAccessModeResponseBodyDomainModeList> domainModeList;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAccessModeResponseBody self = new DescribeDomainAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAccessModeResponseBody setDomainModeList(java.util.List<DescribeDomainAccessModeResponseBodyDomainModeList> domainModeList) {
        this.domainModeList = domainModeList;
        return this;
    }
    public java.util.List<DescribeDomainAccessModeResponseBodyDomainModeList> getDomainModeList() {
        return this.domainModeList;
    }

    public DescribeDomainAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainAccessModeResponseBodyDomainModeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccessMode")
        public Integer accessMode;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        public static DescribeDomainAccessModeResponseBodyDomainModeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAccessModeResponseBodyDomainModeList self = new DescribeDomainAccessModeResponseBodyDomainModeList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAccessModeResponseBodyDomainModeList setAccessMode(Integer accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Integer getAccessMode() {
            return this.accessMode;
        }

        public DescribeDomainAccessModeResponseBodyDomainModeList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
