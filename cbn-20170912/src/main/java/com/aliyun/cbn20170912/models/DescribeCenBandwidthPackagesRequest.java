// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The filter configurations.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter;

    /**
     * <p>Specifies whether to include renewal data. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The logical operator between the filter conditions. Valid values:</p>
     * <br>
     * <p>*   **false** (default): **AND** Bandwidth plans that meet all filter conditions are returned.</p>
     * <p>*   **true**: **OR** Bandwidth plans that meet one of the filter conditions are returned.</p>
     */
    @NameInMap("IsOrKey")
    public Boolean isOrKey;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about the tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> tag;

    public static DescribeCenBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesRequest self = new DescribeCenBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesRequest setFilter(java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeCenBandwidthPackagesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeCenBandwidthPackagesRequest setIsOrKey(Boolean isOrKey) {
        this.isOrKey = isOrKey;
        return this;
    }
    public Boolean getIsOrKey() {
        return this.isOrKey;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenBandwidthPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenBandwidthPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenBandwidthPackagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenBandwidthPackagesRequest setTag(java.util.List<DescribeCenBandwidthPackagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCenBandwidthPackagesRequestFilter extends TeaModel {
        /**
         * <p>The filter conditions. You can use filter conditions to filter the bandwidth plans that you want to query. The following filter conditions are supported:</p>
         * <br>
         * <p>*   **CenId**: CEN instance ID</p>
         * <br>
         * <p>*   **Status**: bandwidth plan status. Valid values:</p>
         * <br>
         * <p>    *   **Idle**: not associated with a CEN instance.</p>
         * <p>    *   **InUse**: associated with a CEN instance.</p>
         * <br>
         * <p>*   **CenBandwidthPackageId**: bandwidth plan ID</p>
         * <br>
         * <p>*   **Name**: bandwidth plan name You can specify one or more filter conditions. The maximum value of **N** is **5**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specify a filter value based on the **Key** parameter. You can specify multiple filter values for each **Key**. The logical operator between filter values is **OR**. If one filter value is matched, the filter condition is matched.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeCenBandwidthPackagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestFilter self = new DescribeCenBandwidthPackagesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeCenBandwidthPackagesRequestTag extends TeaModel {
        /**
         * <p>The tag keys.</p>
         * <br>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <br>
         * <p>The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>The tag value of each tag key must be unique. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCenBandwidthPackagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestTag self = new DescribeCenBandwidthPackagesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
