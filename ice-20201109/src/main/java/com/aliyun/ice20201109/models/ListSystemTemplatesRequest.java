// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSystemTemplatesRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleTemplate</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20 Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The template state. Valid values: Normal, Invisible, and All.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The subtype ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Subtype")
    public String subtype;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template type. Separate multiple types with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListSystemTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemTemplatesRequest self = new ListSystemTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSystemTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSystemTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSystemTemplatesRequest setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public ListSystemTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListSystemTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
