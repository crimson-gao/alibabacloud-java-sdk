// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponseBody extends TeaModel {
    /**
     * <p>The information that indicates whether the data synchronization task is updated.</p>
     */
    @NameInMap("Data")
    public UpdateDISyncTaskResponseBodyData data;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponseBody self = new UpdateDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponseBody setData(UpdateDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateDISyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The error message returned if the data synchronization task fails to be updated. If the data synchronization task is successfully updated, the value null is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceGroup:[S_res_group_XXX] is invalid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The update status of the data synchronization task. Valid values:</p>
         * <ul>
         * <li>success</li>
         * <li>fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDISyncTaskResponseBodyData self = new UpdateDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
