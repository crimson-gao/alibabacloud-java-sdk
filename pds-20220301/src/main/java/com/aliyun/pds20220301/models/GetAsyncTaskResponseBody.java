// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    /**
     * <p>The custom category of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>album</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The total amount of work that is done in the asynchronous task, such as the number of files that are packaged for package download on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("consumed_process")
    public Long consumedProcess;

    /**
     * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("created_at")
    public String createdAt;

    /**
     * <p><warning>This parameter is no longer used. We recommend that you use error_code instead.</warning></p>
     * <p>The error code returned if the asynchronous task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("err_code")
    public Long errCode;

    /**
     * <p>The error code returned if the asynchronous task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The error message returned if the asynchronous task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request has been failed due to some unknown error. Please try again later.</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    @NameInMap("failed_process")
    public Long failedProcess;

    /**
     * <p>The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("finished_at")
    public String finishedAt;

    /**
     * <p><warning>This parameter is no longer used. We recommend that you use error_message instead.</warning></p>
     * <p>The error message returned if the asynchronous task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request has been failed due to some unknown error. Please try again later.</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("skipped_process")
    public Long skippedProcess;

    /**
     * <p>The time when the task was started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-20T06:51:27.292Z</p>
     */
    @NameInMap("started_at")
    public String startedAt;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li>Failed</li>
     * <li>Running</li>
     * <li>PartialSucceed</li>
     * <li>Succeed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p><warning>This parameter is no longer used. We recommend that you use state instead.</warning></p>
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li>Failed</li>
     * <li>Running</li>
     * <li>PartialSucceed</li>
     * <li>Succeed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total amount of work to be done in the asynchronous task, such as the number of files to be packaged for package download on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("total_process")
    public Long totalProcess;

    /**
     * <p>The extracted files.</p>
     */
    @NameInMap("uncompress_file_list")
    public java.util.List<UncompressedFileInfo> uncompressFileList;

    /**
     * <p>The download URL of the data generated by the asynchronous task, such as the download URL of the packaged files generated by the task of package download on the server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("url")
    public String url;

    public static GetAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponseBody self = new GetAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public GetAsyncTaskResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetAsyncTaskResponseBody setConsumedProcess(Long consumedProcess) {
        this.consumedProcess = consumedProcess;
        return this;
    }
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    public GetAsyncTaskResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public GetAsyncTaskResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetAsyncTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAsyncTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAsyncTaskResponseBody setFailedProcess(Long failedProcess) {
        this.failedProcess = failedProcess;
        return this;
    }
    public Long getFailedProcess() {
        return this.failedProcess;
    }

    public GetAsyncTaskResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public GetAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsyncTaskResponseBody setSkippedProcess(Long skippedProcess) {
        this.skippedProcess = skippedProcess;
        return this;
    }
    public Long getSkippedProcess() {
        return this.skippedProcess;
    }

    public GetAsyncTaskResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public GetAsyncTaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetAsyncTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAsyncTaskResponseBody setTotalProcess(Long totalProcess) {
        this.totalProcess = totalProcess;
        return this;
    }
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    public GetAsyncTaskResponseBody setUncompressFileList(java.util.List<UncompressedFileInfo> uncompressFileList) {
        this.uncompressFileList = uncompressFileList;
        return this;
    }
    public java.util.List<UncompressedFileInfo> getUncompressFileList() {
        return this.uncompressFileList;
    }

    public GetAsyncTaskResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
