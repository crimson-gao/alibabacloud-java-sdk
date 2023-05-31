// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckStandardResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the check items.</p>
     */
    @NameInMap("Standards")
    public java.util.List<ListCheckStandardResponseBodyStandards> standards;

    public static ListCheckStandardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckStandardResponseBody self = new ListCheckStandardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckStandardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCheckStandardResponseBody setStandards(java.util.List<ListCheckStandardResponseBodyStandards> standards) {
        this.standards = standards;
        return this;
    }
    public java.util.List<ListCheckStandardResponseBodyStandards> getStandards() {
        return this.standards;
    }

    public static class ListCheckStandardResponseBodyStandardsRequirements extends TeaModel {
        /**
         * <p>The ID of the search condition.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of check items queried by using the search condition.</p>
         */
        @NameInMap("RiskCheckCount")
        public Long riskCheckCount;

        /**
         * <p>The display name of the search condition.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        public static ListCheckStandardResponseBodyStandardsRequirements build(java.util.Map<String, ?> map) throws Exception {
            ListCheckStandardResponseBodyStandardsRequirements self = new ListCheckStandardResponseBodyStandardsRequirements();
            return TeaModel.build(map, self);
        }

        public ListCheckStandardResponseBodyStandardsRequirements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckStandardResponseBodyStandardsRequirements setRiskCheckCount(Long riskCheckCount) {
            this.riskCheckCount = riskCheckCount;
            return this;
        }
        public Long getRiskCheckCount() {
            return this.riskCheckCount;
        }

        public ListCheckStandardResponseBodyStandardsRequirements setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

    public static class ListCheckStandardResponseBodyStandards extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>An array that consists of search conditions.</p>
         */
        @NameInMap("Requirements")
        public java.util.List<ListCheckStandardResponseBodyStandardsRequirements> requirements;

        /**
         * <p>The display name of the check item.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the check item.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCheckStandardResponseBodyStandards build(java.util.Map<String, ?> map) throws Exception {
            ListCheckStandardResponseBodyStandards self = new ListCheckStandardResponseBodyStandards();
            return TeaModel.build(map, self);
        }

        public ListCheckStandardResponseBodyStandards setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckStandardResponseBodyStandards setRequirements(java.util.List<ListCheckStandardResponseBodyStandardsRequirements> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<ListCheckStandardResponseBodyStandardsRequirements> getRequirements() {
            return this.requirements;
        }

        public ListCheckStandardResponseBodyStandards setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckStandardResponseBodyStandards setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
