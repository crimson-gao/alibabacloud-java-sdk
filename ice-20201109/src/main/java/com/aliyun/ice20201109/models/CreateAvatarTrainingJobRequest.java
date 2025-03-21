// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateAvatarTrainingJobRequest extends TeaModel {
    /**
     * <ul>
     * <li>The description of the digital human.</li>
     * <li>The description can be up to 1,000 characters in length.</li>
     * </ul>
     */
    @NameInMap("AvatarDescription")
    public String avatarDescription;

    /**
     * <ul>
     * <li>The name of the digital human.</li>
     * <li>The name can be up to seven characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvatarName")
    public String avatarName;

    /**
     * <p>The type of the digital human.</p>
     * 
     * <strong>example:</strong>
     * <p>2DAvatar</p>
     */
    @NameInMap("AvatarType")
    public String avatarType;

    /**
     * <ul>
     * <li>The media asset ID of the portrait image.</li>
     * <li>The value must be 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Portrait")
    public String portrait;

    /**
     * <ul>
     * <li>The thumbnail URL.</li>
     * <li>After the digital human is trained, the thumbnail is uploaded to this URL.</li>
     * <li>The URL must be a valid public Object Storage Service (OSS) URL.</li>
     * <li>The URL can be up to 512 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
     */
    @NameInMap("Thumbnail")
    public String thumbnail;

    /**
     * <ul>
     * <li><p>Specifies whether the training video supports alpha channels.</p>
     * <p>**</p>
     * <p><strong>Note</strong>: Make sure that the current settings are consistent with those of the submitted training video. Otherwise, the digital human may malfunction.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Transparent")
    public Boolean transparent;

    /**
     * <ul>
     * <li>The ID of the video used for training.</li>
     * <li>The value must be 32 characters in length.</li>
     * <li>Supported formats: MP4, MOV, and WebM.</li>
     * <li>The duration of the video must be 5 to 15 minutes.</li>
     * <li>The resolution of the video must be 1920×1080 or 1080×1920.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
     */
    @NameInMap("Video")
    public String video;

    public static CreateAvatarTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTrainingJobRequest self = new CreateAvatarTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTrainingJobRequest setAvatarDescription(String avatarDescription) {
        this.avatarDescription = avatarDescription;
        return this;
    }
    public String getAvatarDescription() {
        return this.avatarDescription;
    }

    public CreateAvatarTrainingJobRequest setAvatarName(String avatarName) {
        this.avatarName = avatarName;
        return this;
    }
    public String getAvatarName() {
        return this.avatarName;
    }

    public CreateAvatarTrainingJobRequest setAvatarType(String avatarType) {
        this.avatarType = avatarType;
        return this;
    }
    public String getAvatarType() {
        return this.avatarType;
    }

    public CreateAvatarTrainingJobRequest setPortrait(String portrait) {
        this.portrait = portrait;
        return this;
    }
    public String getPortrait() {
        return this.portrait;
    }

    public CreateAvatarTrainingJobRequest setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public CreateAvatarTrainingJobRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

    public CreateAvatarTrainingJobRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
