// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigRequest extends TeaModel {
    /**
     * <p>The list of check items that you want to add to the policy.</p>
     * <blockquote>
     * <p> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("AddedCheck")
    public java.util.List<ChangeCheckConfigRequestAddedCheck> addedCheck;

    /**
     * <p>The requirement IDs that you want to specify for the check policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the requirement ID. If the ConfigStandardIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRequirementIds")
    public ChangeCheckConfigRequestConfigRequirementIds configRequirementIds;

    /**
     * <p>The standard IDs that you want to specify for the check policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the standard ID.</p>
     * </blockquote>
     */
    @NameInMap("ConfigStandardIds")
    public ChangeCheckConfigRequestConfigStandardIds configStandardIds;

    /**
     * <p>The configuration of the check item. Valid values:</p>
     * <ul>
     * <li><strong>all</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Configure")
    public String configure;

    /**
     * <p>The days in a week on which a check is performed.</p>
     */
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    /**
     * <p>Specifies whether to check the new check items in the selected requirement item. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    /**
     * <p>Specifies whether to enable the automatic periodical check feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end time of the check. The value specifies a point in time in a day. The time period that is specified by the start time and end time must be one of the following time periods:</p>
     * <ul>
     * <li><strong>00:00 to 06:00:</strong> If you set the StartTime parameter to 0, you must set the EndTime parameter to 6.</li>
     * <li><strong>06:00 to 12:00</strong>: If you set the StartTime parameter to 6, you must set the EndTime parameter to 12.</li>
     * <li><strong>12:00 to 18:00</strong>: If you set the StartTime parameter to 12, you must set the EndTime parameter to 18.</li>
     * <li><strong>18:00 to 24:00:</strong> If you set the StartTime parameter to 18, you must set the EndTime parameter to 24.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The region ID of the bastion host to query.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of the check items that you want to remove from the policy.</p>
     * <blockquote>
     * <p> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("RemovedCheck")
    public java.util.List<ChangeCheckConfigRequestRemovedCheck> removedCheck;

    /**
     * <p>An array that consists of the information about the check item.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The start time of the check. The value specifies a point in time in a day.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("SystemConfig")
    public Boolean systemConfig;

    /**
     * <p>The service provider (SP) of the cloud asset.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ChangeCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigRequest self = new ChangeCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigRequest setAddedCheck(java.util.List<ChangeCheckConfigRequestAddedCheck> addedCheck) {
        this.addedCheck = addedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigRequestAddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    public ChangeCheckConfigRequest setConfigRequirementIds(ChangeCheckConfigRequestConfigRequirementIds configRequirementIds) {
        this.configRequirementIds = configRequirementIds;
        return this;
    }
    public ChangeCheckConfigRequestConfigRequirementIds getConfigRequirementIds() {
        return this.configRequirementIds;
    }

    public ChangeCheckConfigRequest setConfigStandardIds(ChangeCheckConfigRequestConfigStandardIds configStandardIds) {
        this.configStandardIds = configStandardIds;
        return this;
    }
    public ChangeCheckConfigRequestConfigStandardIds getConfigStandardIds() {
        return this.configStandardIds;
    }

    public ChangeCheckConfigRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public ChangeCheckConfigRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigRequest setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public ChangeCheckConfigRequest setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public ChangeCheckConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigRequest setRemovedCheck(java.util.List<ChangeCheckConfigRequestRemovedCheck> removedCheck) {
        this.removedCheck = removedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigRequestRemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    public ChangeCheckConfigRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ChangeCheckConfigRequest setSystemConfig(Boolean systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }
    public Boolean getSystemConfig() {
        return this.systemConfig;
    }

    public ChangeCheckConfigRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static class ChangeCheckConfigRequestAddedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigRequestAddedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestAddedCheck self = new ChangeCheckConfigRequestAddedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestAddedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigRequestAddedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class ChangeCheckConfigRequestConfigRequirementIds extends TeaModel {
        /**
         * <p>The requirement IDs that you want to add to the policy.</p>
         */
        @NameInMap("AddIds")
        public java.util.List<Long> addIds;

        /**
         * <p>The requirement IDs that you want to remove from the policy.</p>
         */
        @NameInMap("RemoveIds")
        public java.util.List<Long> removeIds;

        public static ChangeCheckConfigRequestConfigRequirementIds build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestConfigRequirementIds self = new ChangeCheckConfigRequestConfigRequirementIds();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestConfigRequirementIds setAddIds(java.util.List<Long> addIds) {
            this.addIds = addIds;
            return this;
        }
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        public ChangeCheckConfigRequestConfigRequirementIds setRemoveIds(java.util.List<Long> removeIds) {
            this.removeIds = removeIds;
            return this;
        }
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

    }

    public static class ChangeCheckConfigRequestConfigStandardIds extends TeaModel {
        /**
         * <p>The standard IDs that you want to add to the policy.</p>
         */
        @NameInMap("AddIds")
        public java.util.List<Long> addIds;

        /**
         * <p>The standard IDs that you want to remove from the policy.</p>
         */
        @NameInMap("RemoveIds")
        public java.util.List<Long> removeIds;

        public static ChangeCheckConfigRequestConfigStandardIds build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestConfigStandardIds self = new ChangeCheckConfigRequestConfigStandardIds();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestConfigStandardIds setAddIds(java.util.List<Long> addIds) {
            this.addIds = addIds;
            return this;
        }
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        public ChangeCheckConfigRequestConfigStandardIds setRemoveIds(java.util.List<Long> removeIds) {
            this.removeIds = removeIds;
            return this;
        }
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

    }

    public static class ChangeCheckConfigRequestRemovedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigRequestRemovedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestRemovedCheck self = new ChangeCheckConfigRequestRemovedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestRemovedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigRequestRemovedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

}
