// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockConfigListResponseBody extends TeaModel {
    /**
     * <p>The configurations of web tamper proofing.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of directories that have web tamper proofing enabled on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeWebLockConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockConfigListResponseBody self = new DescribeWebLockConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockConfigListResponseBody setConfigList(java.util.List<DescribeWebLockConfigListResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeWebLockConfigListResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeWebLockConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebLockConfigListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeWebLockConfigListResponseBodyConfigList extends TeaModel {
        /**
         * <p>The prevention mode. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Interception Mode</li>
         * <li><strong>audit</strong>: Alert Mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>audit</p>
         */
        @NameInMap("DefenceMode")
        public String defenceMode;

        /**
         * <p>The directory that has web tamper proofing enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>/www/tmp/</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The directory that has web tamper proofing disabled.</p>
         * <blockquote>
         * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/tomcat</p>
         */
        @NameInMap("ExclusiveDir")
        public String exclusiveDir;

        /**
         * <p>The file that has web tamper proofing disabled.</p>
         * <blockquote>
         * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/tomcat/localhost.log</p>
         */
        @NameInMap("ExclusiveFile")
        public String exclusiveFile;

        /**
         * <p>The type of the file that has web tamper proofing disabled.</p>
         * <blockquote>
         * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>*.jpg</p>
         */
        @NameInMap("ExclusiveFileType")
        public String exclusiveFileType;

        /**
         * <p>The configuration ID of the protected directory.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The file that has web tamper proofing enabled.</p>
         * <blockquote>
         * <p>If the value of <strong>Mode</strong> is <strong>whitelist</strong>, this parameter is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/home/admin/tomcat/aaa.log</p>
         */
        @NameInMap("InclusiveFile")
        public String inclusiveFile;

        /**
         * <p>The type of the file that has web tamper proofing enabled.</p>
         * <blockquote>
         * <p>If the value of <strong>Mode</strong> is <strong>whitelist</strong>, this parameter is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>jpg</p>
         */
        @NameInMap("InclusiveFileType")
        public String inclusiveFileType;

        /**
         * <p>The local path to the backup files of the protected directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/backup</p>
         */
        @NameInMap("LocalBackupDir")
        public String localBackupDir;

        /**
         * <p>The protection mode of web tamper proofing. Valid values:</p>
         * <ul>
         * <li><strong>whitelist</strong>: In this mode, web tamper proofing is enabled for the specified directories and file types.</li>
         * <li><strong>blacklist</strong>: In this mode, web tamper proofing is enabled for the unspecified subdirectories, file types, and files in the protected directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blacklist</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The UUID of the server that has web tamper proofing enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f8****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWebLockConfigListResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebLockConfigListResponseBodyConfigList self = new DescribeWebLockConfigListResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDefenceMode(String defenceMode) {
            this.defenceMode = defenceMode;
            return this;
        }
        public String getDefenceMode() {
            return this.defenceMode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveDir(String exclusiveDir) {
            this.exclusiveDir = exclusiveDir;
            return this;
        }
        public String getExclusiveDir() {
            return this.exclusiveDir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFile(String exclusiveFile) {
            this.exclusiveFile = exclusiveFile;
            return this;
        }
        public String getExclusiveFile() {
            return this.exclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setExclusiveFileType(String exclusiveFileType) {
            this.exclusiveFileType = exclusiveFileType;
            return this;
        }
        public String getExclusiveFileType() {
            return this.exclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFile(String inclusiveFile) {
            this.inclusiveFile = inclusiveFile;
            return this;
        }
        public String getInclusiveFile() {
            return this.inclusiveFile;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setInclusiveFileType(String inclusiveFileType) {
            this.inclusiveFileType = inclusiveFileType;
            return this;
        }
        public String getInclusiveFileType() {
            return this.inclusiveFileType;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setLocalBackupDir(String localBackupDir) {
            this.localBackupDir = localBackupDir;
            return this;
        }
        public String getLocalBackupDir() {
            return this.localBackupDir;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebLockConfigListResponseBodyConfigList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
