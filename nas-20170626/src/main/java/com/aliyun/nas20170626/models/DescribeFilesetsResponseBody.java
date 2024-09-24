// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsResponseBody extends TeaModel {
    /**
     * <p>The fileset information.</p>
     */
    @NameInMap("Entries")
    public DescribeFilesetsResponseBodyEntries entries;

    /**
     * <p>The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFilesetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesetsResponseBody self = new DescribeFilesetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilesetsResponseBody setEntries(DescribeFilesetsResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public DescribeFilesetsResponseBodyEntries getEntries() {
        return this.entries;
    }

    public DescribeFilesetsResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFilesetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFilesetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFilesetsResponseBodyEntriesEntrie extends TeaModel {
        /**
         * <p>The time when the fileset was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Specifies whether to enable deletion protection to allow you to release the fileset by using the console or by calling the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can protect filesets only against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The fileset description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The fileset path.</p>
         * 
         * <strong>example:</strong>
         * <p>pathtoroot/fset</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The fileset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The fileset status. Valid values:</p>
         * <ul>
         * <li>CREATING: The fileset is being created.</li>
         * <li>CREATED: The fileset has been created and is running properly.</li>
         * <li>RELEASING: The fileset is being released.</li>
         * <li>RELEASED: The fileset has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the fileset was last updated.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeFilesetsResponseBodyEntriesEntrie build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsResponseBodyEntriesEntrie self = new DescribeFilesetsResponseBodyEntriesEntrie();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeFilesetsResponseBodyEntries extends TeaModel {
        @NameInMap("Entrie")
        public java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> entrie;

        public static DescribeFilesetsResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsResponseBodyEntries self = new DescribeFilesetsResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsResponseBodyEntries setEntrie(java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> entrie) {
            this.entrie = entrie;
            return this;
        }
        public java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> getEntrie() {
            return this.entrie;
        }

    }

}
