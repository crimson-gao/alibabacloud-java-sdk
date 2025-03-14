// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSprintRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-12-02</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asd345xxxxx9q9845xxxxx34</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("staffIds")
    public java.util.List<String> staffIds;

    /**
     * <strong>example:</strong>
     * <p>2021-12-01</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static CreateSprintRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSprintRequest self = new CreateSprintRequest();
        return TeaModel.build(map, self);
    }

    public CreateSprintRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateSprintRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSprintRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public CreateSprintRequest setStaffIds(java.util.List<String> staffIds) {
        this.staffIds = staffIds;
        return this;
    }
    public java.util.List<String> getStaffIds() {
        return this.staffIds;
    }

    public CreateSprintRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
