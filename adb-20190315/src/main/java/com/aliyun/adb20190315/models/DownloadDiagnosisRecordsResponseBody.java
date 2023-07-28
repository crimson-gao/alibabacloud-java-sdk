// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DownloadDiagnosisRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the download task.</p>
     */
    @NameInMap("DownloadId")
    public Integer downloadId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadDiagnosisRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDiagnosisRecordsResponseBody self = new DownloadDiagnosisRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDiagnosisRecordsResponseBody setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
        return this;
    }
    public Integer getDownloadId() {
        return this.downloadId;
    }

    public DownloadDiagnosisRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
