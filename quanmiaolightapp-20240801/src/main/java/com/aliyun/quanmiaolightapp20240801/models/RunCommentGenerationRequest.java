// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationRequest extends TeaModel {
    @NameInMap("allowEmoji")
    public Boolean allowEmoji;

    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("length")
    @Deprecated
    public String length;

    @NameInMap("lengthRange")
    public java.util.Map<String, ?> lengthRange;

    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("numComments")
    public String numComments;

    @NameInMap("sentiment")
    public java.util.Map<String, ?> sentiment;

    @NameInMap("sourceMaterial")
    public String sourceMaterial;

    @NameInMap("style")
    @Deprecated
    public String style;

    @NameInMap("type")
    public java.util.Map<String, ?> type;

    public static RunCommentGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationRequest self = new RunCommentGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationRequest setAllowEmoji(Boolean allowEmoji) {
        this.allowEmoji = allowEmoji;
        return this;
    }
    public Boolean getAllowEmoji() {
        return this.allowEmoji;
    }

    public RunCommentGenerationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RunCommentGenerationRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public RunCommentGenerationRequest setLengthRange(java.util.Map<String, ?> lengthRange) {
        this.lengthRange = lengthRange;
        return this;
    }
    public java.util.Map<String, ?> getLengthRange() {
        return this.lengthRange;
    }

    public RunCommentGenerationRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunCommentGenerationRequest setNumComments(String numComments) {
        this.numComments = numComments;
        return this;
    }
    public String getNumComments() {
        return this.numComments;
    }

    public RunCommentGenerationRequest setSentiment(java.util.Map<String, ?> sentiment) {
        this.sentiment = sentiment;
        return this;
    }
    public java.util.Map<String, ?> getSentiment() {
        return this.sentiment;
    }

    public RunCommentGenerationRequest setSourceMaterial(String sourceMaterial) {
        this.sourceMaterial = sourceMaterial;
        return this;
    }
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    public RunCommentGenerationRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public RunCommentGenerationRequest setType(java.util.Map<String, ?> type) {
        this.type = type;
        return this;
    }
    public java.util.Map<String, ?> getType() {
        return this.type;
    }

}
