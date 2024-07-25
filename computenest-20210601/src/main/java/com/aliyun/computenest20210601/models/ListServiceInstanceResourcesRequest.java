// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesRequest extends TeaModel {
    /**
     * <p>End time of resource usage. 
     * <notice>Note: Only supports querying service instances on private deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-01T12:00:00</p>
     */
    @NameInMap("ExpireTimeEnd")
    public String expireTimeEnd;

    /**
     * <p>Start time of resource usage. 
     * <notice>Note: Only supports querying service instances on private deployments.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("ExpireTimeStart")
    public String expireTimeStart;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method of the read-only instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go</li>
     * <li><strong>Prepaid</strong>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: China (Hangzhou).</li>
     * <li>ap-southeast-1: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of a resource.</p>
     */
    @NameInMap("ResourceARN")
    public java.util.List<String> resourceARN;

    /**
     * <p>The ID of the service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d8a0cc2a1ee04dce****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>Service Instance resource type，include AliyunResource and ContainerResource.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunResource</p>
     */
    @NameInMap("ServiceInstanceResourceType")
    public String serviceInstanceResourceType;

    /**
     * <p>The tag key and value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServiceInstanceResourcesRequestTag> tag;

    public static ListServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesRequest self = new ListServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesRequest setExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
        return this;
    }
    public String getExpireTimeEnd() {
        return this.expireTimeEnd;
    }

    public ListServiceInstanceResourcesRequest setExpireTimeStart(String expireTimeStart) {
        this.expireTimeStart = expireTimeStart;
        return this;
    }
    public String getExpireTimeStart() {
        return this.expireTimeStart;
    }

    public ListServiceInstanceResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceResourcesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ListServiceInstanceResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstanceResourcesRequest setResourceARN(java.util.List<String> resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }
    public java.util.List<String> getResourceARN() {
        return this.resourceARN;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceResourceType(String serviceInstanceResourceType) {
        this.serviceInstanceResourceType = serviceInstanceResourceType;
        return this;
    }
    public String getServiceInstanceResourceType() {
        return this.serviceInstanceResourceType;
    }

    public ListServiceInstanceResourcesRequest setTag(java.util.List<ListServiceInstanceResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstanceResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServiceInstanceResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesRequestTag self = new ListServiceInstanceResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstanceResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
