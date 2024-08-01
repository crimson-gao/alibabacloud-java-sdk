// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKernelReleaseNotesResponseBody extends TeaModel {
    /**
     * <p>The list of the version release notes.</p>
     */
    @NameInMap("ReleaseNotes")
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F01D4DDA-CB72-4083-B399-AF4642294FE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKernelReleaseNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKernelReleaseNotesResponseBody self = new DescribeKernelReleaseNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKernelReleaseNotesResponseBody setReleaseNotes(DescribeKernelReleaseNotesResponseBodyReleaseNotes releaseNotes) {
        this.releaseNotes = releaseNotes;
        return this;
    }
    public DescribeKernelReleaseNotesResponseBodyReleaseNotes getReleaseNotes() {
        return this.releaseNotes;
    }

    public DescribeKernelReleaseNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote extends TeaModel {
        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodb_20180619_0.4.9</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The release notes.</p>
         * 
         * <strong>example:</strong>
         * <p>test release note.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        public static DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote self = new DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote();
            return TeaModel.build(map, self);
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

    }

    public static class DescribeKernelReleaseNotesResponseBodyReleaseNotes extends TeaModel {
        @NameInMap("ReleaseNote")
        public java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> releaseNote;

        public static DescribeKernelReleaseNotesResponseBodyReleaseNotes build(java.util.Map<String, ?> map) throws Exception {
            DescribeKernelReleaseNotesResponseBodyReleaseNotes self = new DescribeKernelReleaseNotesResponseBodyReleaseNotes();
            return TeaModel.build(map, self);
        }

        public DescribeKernelReleaseNotesResponseBodyReleaseNotes setReleaseNote(java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public java.util.List<DescribeKernelReleaseNotesResponseBodyReleaseNotesReleaseNote> getReleaseNote() {
            return this.releaseNote;
        }

    }

}
