// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The details of the scheduled task on cloud computers.</p>
     */
    @NameInMap("DesktopTimers")
    public java.util.List<ModifyDesktopTimerRequestDesktopTimers> desktopTimers;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to use the `DesktopTimers`** parameter. Set the value to `true`**.</p>
     */
    @NameInMap("UseDesktopTimers")
    public Boolean useDesktopTimers;

    public static ModifyDesktopTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopTimerRequest self = new ModifyDesktopTimerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopTimerRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopTimerRequest setDesktopTimers(java.util.List<ModifyDesktopTimerRequestDesktopTimers> desktopTimers) {
        this.desktopTimers = desktopTimers;
        return this;
    }
    public java.util.List<ModifyDesktopTimerRequestDesktopTimers> getDesktopTimers() {
        return this.desktopTimers;
    }

    public ModifyDesktopTimerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDesktopTimerRequest setUseDesktopTimers(Boolean useDesktopTimers) {
        this.useDesktopTimers = useDesktopTimers;
        return this;
    }
    public Boolean getUseDesktopTimers() {
        return this.useDesktopTimers;
    }

    public static class ModifyDesktopTimerRequestDesktopTimers extends TeaModel {
        /**
         * <p>Specifies whether to allow end users to configure the scheduled task.</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The cron expression of the schedule.</p>
         * <br>
         * <p>> The time must be in UTC. For example, for 24:00 (UTC+8), you must set the value to 0 0 16 ? \* 1,2,3,4,5,6,7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the scheduled task.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: forcibly executes the scheduled task regardless of the status and connection of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false: does not forcibly execute the scheduled task.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The interval at which the scheduled task is executed. Unit: minutes.</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The operations that scheduled tasks support. This parameter is valid only when TimerType is set to NoConnect.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Hibernate: hibernates the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Shutdown: stops the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The reset type of the cloud computers.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RESET_TYPE_SYSTE: resets the system disk.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RESET_TYPE_BOTH: resets data and user disks.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   NoOperationDisconnect: Disconnects the cloud computers without performing operations on the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   LogoutShutdown: Stops the cloud computers when end users log out Alibaba Cloud Workspace clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoConnect: Disconnects the cloud computers when end users perform one of the actions that is specified by the OperationType parameter.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerBoot: Starts the cloud computers on schedule.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerReset: Resets the cloud computers on schedule.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   LoginAutoConnect: automatically connects to the cloud computers when end users log on to Alibaba Cloud Workspace clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoOperationShutdown: Stops the cloud computers without performing operations on the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerShutdown: Stops the cloud computers on schedule.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NoOperationReboot: Restarts the cloud computers without performing operations on the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   TimerReboot: Restarts the cloud computers on schedule.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static ModifyDesktopTimerRequestDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopTimerRequestDesktopTimers self = new ModifyDesktopTimerRequestDesktopTimers();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopTimerRequestDesktopTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public ModifyDesktopTimerRequestDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ModifyDesktopTimerRequestDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public ModifyDesktopTimerRequestDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyDesktopTimerRequestDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ModifyDesktopTimerRequestDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public ModifyDesktopTimerRequestDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

}
