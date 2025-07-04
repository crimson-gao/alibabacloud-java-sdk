// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ff51bfe-e73d-11ea-827d-506b4b3f3cf6</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrgName")
    public String orgName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("URLList")
    public java.util.List<DetectRibFractureRequestURLList> URLList;

    public static DetectRibFractureRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureRequest self = new DetectRibFractureRequest();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DetectRibFractureRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DetectRibFractureRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public DetectRibFractureRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DetectRibFractureRequest setURLList(java.util.List<DetectRibFractureRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectRibFractureRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectRibFractureRequestURLList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URL")
        public String URL;

        public static DetectRibFractureRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureRequestURLList self = new DetectRibFractureRequestURLList();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}
