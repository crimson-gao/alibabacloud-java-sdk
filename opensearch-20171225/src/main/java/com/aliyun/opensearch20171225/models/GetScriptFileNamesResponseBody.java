// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetScriptFileNamesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The files of the script.</p>
     */
    @NameInMap("result")
    public java.util.List<GetScriptFileNamesResponseBodyResult> result;

    public static GetScriptFileNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptFileNamesResponseBody self = new GetScriptFileNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptFileNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScriptFileNamesResponseBody setResult(java.util.List<GetScriptFileNamesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetScriptFileNamesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetScriptFileNamesResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the script file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-02 20:21:14</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The name of the script file.</p>
         * 
         * <strong>example:</strong>
         * <p>my_cava_script.cava</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The time when the script file was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-02 21:21:14</p>
         */
        @NameInMap("modifyTime")
        public String modifyTime;

        /**
         * <p>The path name of the script file.</p>
         * 
         * <strong>example:</strong>
         * <p>src</p>
         */
        @NameInMap("pathName")
        public String pathName;

        public static GetScriptFileNamesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetScriptFileNamesResponseBodyResult self = new GetScriptFileNamesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetScriptFileNamesResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetScriptFileNamesResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetScriptFileNamesResponseBodyResult setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetScriptFileNamesResponseBodyResult setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

}
