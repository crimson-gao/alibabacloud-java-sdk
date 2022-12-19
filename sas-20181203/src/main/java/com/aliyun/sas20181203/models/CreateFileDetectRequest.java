// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectRequest extends TeaModel {
    // The identifier of the file. Only MD5 hash values are supported.
    @NameInMap("HashKey")
    public String hashKey;

    // The key of the file that is stored in the Object Storage Service (OSS) bucket. You can call the [CreateFileDetectUploadUrl](~~CreateFileDetectUploadUrl~~) operation to query the keys of files.
    @NameInMap("OssKey")
    public String ossKey;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the file. Valid values:
    // 
    // *   **0**: unknown files
    // *   **1**: binary files
    // *   **2**: webshell files
    // *   **4**: script files
    // 
    // >  If you do not know the type of the file, set this parameter to 0.
    @NameInMap("Type")
    public Integer type;

    public static CreateFileDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectRequest self = new CreateFileDetectRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public CreateFileDetectRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CreateFileDetectRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateFileDetectRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
