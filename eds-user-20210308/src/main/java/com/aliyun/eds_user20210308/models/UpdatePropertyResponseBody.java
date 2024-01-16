// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UpdatePropertyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the modification.</p>
     */
    @NameInMap("UpdateResult")
    public UpdatePropertyResponseBodyUpdateResult updateResult;

    public static UpdatePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePropertyResponseBody self = new UpdatePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePropertyResponseBody setUpdateResult(UpdatePropertyResponseBodyUpdateResult updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public UpdatePropertyResponseBodyUpdateResult getUpdateResult() {
        return this.updateResult;
    }

    public static class UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the property.</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        public static UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues self = new UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues();
            return TeaModel.build(map, self);
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues extends TeaModel {
        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        /**
         * <p>The ID of the property value.</p>
         */
        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues build(java.util.Map<String, ?> map) throws Exception {
            UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues self = new UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues();
            return TeaModel.build(map, self);
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

    public static class UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel extends TeaModel {
        /**
         * <p>The property values that failed to be modified.</p>
         */
        @NameInMap("FailedPropertyValues")
        public java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues> failedPropertyValues;

        /**
         * <p>The property values that were modified.</p>
         */
        @NameInMap("SavePropertyValues")
        public java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues> savePropertyValues;

        public static UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel build(java.util.Map<String, ?> map) throws Exception {
            UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel self = new UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel();
            return TeaModel.build(map, self);
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel setFailedPropertyValues(java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues> failedPropertyValues) {
            this.failedPropertyValues = failedPropertyValues;
            return this;
        }
        public java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelFailedPropertyValues> getFailedPropertyValues() {
            return this.failedPropertyValues;
        }

        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel setSavePropertyValues(java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues> savePropertyValues) {
            this.savePropertyValues = savePropertyValues;
            return this;
        }
        public java.util.List<UpdatePropertyResponseBodyUpdateResultSavePropertyValueModelSavePropertyValues> getSavePropertyValues() {
            return this.savePropertyValues;
        }

    }

    public static class UpdatePropertyResponseBodyUpdateResult extends TeaModel {
        /**
         * <p>The ID of the property.</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The name of the property.</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The result of the property value modification.</p>
         */
        @NameInMap("SavePropertyValueModel")
        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel savePropertyValueModel;

        public static UpdatePropertyResponseBodyUpdateResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePropertyResponseBodyUpdateResult self = new UpdatePropertyResponseBodyUpdateResult();
            return TeaModel.build(map, self);
        }

        public UpdatePropertyResponseBodyUpdateResult setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public UpdatePropertyResponseBodyUpdateResult setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public UpdatePropertyResponseBodyUpdateResult setSavePropertyValueModel(UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel savePropertyValueModel) {
            this.savePropertyValueModel = savePropertyValueModel;
            return this;
        }
        public UpdatePropertyResponseBodyUpdateResultSavePropertyValueModel getSavePropertyValueModel() {
            return this.savePropertyValueModel;
        }

    }

}
