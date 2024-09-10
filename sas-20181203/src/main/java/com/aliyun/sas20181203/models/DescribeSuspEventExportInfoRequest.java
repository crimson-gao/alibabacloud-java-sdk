// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventExportInfoRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ExportSuspEvents~~">ExportSuspEvents</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ExportId")
    public Integer exportId;

    public static DescribeSuspEventExportInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventExportInfoRequest self = new DescribeSuspEventExportInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventExportInfoRequest setExportId(Integer exportId) {
        this.exportId = exportId;
        return this;
    }
    public Integer getExportId() {
        return this.exportId;
    }

}
