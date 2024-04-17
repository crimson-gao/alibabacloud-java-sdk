// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectRequest extends TeaModel {
    @NameInMap("Decompress")
    public Boolean decompress;

    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    @NameInMap("DecompressMaxLayer")
    public Integer decompressMaxLayer;

    /**
     * <p>The URL that is used to download the file. You can specify this parameter to trigger file detection without the need to upload the file in advance.</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The identifier of the file. Only MD5 hash values are supported.</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The key of the file that is stored in the Object Storage Service (OSS) bucket. If you specify the DownloadUrl parameter, you can leave this parameter empty. You can call the [CreateFileDetectUploadUrl](~~CreateFileDetectUploadUrl~~) operation to query the keys of files.</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the file. Valid values:</p>
     * <br>
     * <p>*   **0**: unknown files</p>
     * <p>*   **1**: binary files</p>
     * <p>*   **2**: webshell files</p>
     * <p>*   **4**: script files</p>
     * <br>
     * <p>>  If you do not know the type of the file, set this parameter to 0.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateFileDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectRequest self = new CreateFileDetectRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectRequest setDecompress(Boolean decompress) {
        this.decompress = decompress;
        return this;
    }
    public Boolean getDecompress() {
        return this.decompress;
    }

    public CreateFileDetectRequest setDecompressMaxFileCount(Integer decompressMaxFileCount) {
        this.decompressMaxFileCount = decompressMaxFileCount;
        return this;
    }
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    public CreateFileDetectRequest setDecompressMaxLayer(Integer decompressMaxLayer) {
        this.decompressMaxLayer = decompressMaxLayer;
        return this;
    }
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    public CreateFileDetectRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
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
