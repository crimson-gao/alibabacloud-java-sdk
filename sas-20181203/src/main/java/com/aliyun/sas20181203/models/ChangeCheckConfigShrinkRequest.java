// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigShrinkRequest extends TeaModel {
    /**
     * <p>The list of check items that you want to add to the policy.</p>
     * <blockquote>
     * <p> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("AddedCheck")
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck;

    /**
     * <p>The requirement IDs that you want to specify for the check policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the requirement ID. If the ConfigStandardIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRequirementIds")
    public String configRequirementIdsShrink;

    /**
     * <p>The standard IDs that you want to specify for the check policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the standard ID.</p>
     * </blockquote>
     */
    @NameInMap("ConfigStandardIds")
    public String configStandardIdsShrink;

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
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck;

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

    public static ChangeCheckConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigShrinkRequest self = new ChangeCheckConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigShrinkRequest setAddedCheck(java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck) {
        this.addedCheck = addedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    public ChangeCheckConfigShrinkRequest setConfigRequirementIdsShrink(String configRequirementIdsShrink) {
        this.configRequirementIdsShrink = configRequirementIdsShrink;
        return this;
    }
    public String getConfigRequirementIdsShrink() {
        return this.configRequirementIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setConfigStandardIdsShrink(String configStandardIdsShrink) {
        this.configStandardIdsShrink = configStandardIdsShrink;
        return this;
    }
    public String getConfigStandardIdsShrink() {
        return this.configStandardIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public ChangeCheckConfigShrinkRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigShrinkRequest setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public ChangeCheckConfigShrinkRequest setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public ChangeCheckConfigShrinkRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigShrinkRequest setRemovedCheck(java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck) {
        this.removedCheck = removedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    public ChangeCheckConfigShrinkRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigShrinkRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ChangeCheckConfigShrinkRequest setSystemConfig(Boolean systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }
    public Boolean getSystemConfig() {
        return this.systemConfig;
    }

    public ChangeCheckConfigShrinkRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static class ChangeCheckConfigShrinkRequestAddedCheck extends TeaModel {
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

        public static ChangeCheckConfigShrinkRequestAddedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestAddedCheck self = new ChangeCheckConfigShrinkRequestAddedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class ChangeCheckConfigShrinkRequestRemovedCheck extends TeaModel {
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

        public static ChangeCheckConfigShrinkRequestRemovedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestRemovedCheck self = new ChangeCheckConfigShrinkRequestRemovedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

}
