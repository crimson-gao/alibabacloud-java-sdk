// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvicesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("AdviceId")
    public Long adviceId;

    /**
     * <strong>example:</strong>
     * <p>EcsHighCpuUtilization</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("ExcludeAdviceId")
    public Long excludeAdviceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeAdvicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvicesRequest self = new DescribeAdvicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvicesRequest setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
        return this;
    }
    public Long getAdviceId() {
        return this.adviceId;
    }

    public DescribeAdvicesRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public DescribeAdvicesRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public DescribeAdvicesRequest setExcludeAdviceId(Long excludeAdviceId) {
        this.excludeAdviceId = excludeAdviceId;
        return this;
    }
    public Long getExcludeAdviceId() {
        return this.excludeAdviceId;
    }

    public DescribeAdvicesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAdvicesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeAdvicesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
