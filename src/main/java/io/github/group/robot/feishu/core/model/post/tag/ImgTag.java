package io.github.group.robot.feishu.core.model.post.tag;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * img Tag
 *
 * @author bing_huang
 * @date 2021/12/16
 */
@Getter
@Setter
@Builder
public class ImgTag extends PostTag {
    /**
     * 图片的唯一标识
     */
    private String imageKey;
    /**
     * 图片的高
     */
    private Integer height;
    /**
     * 图片的宽
     */
    private Integer width;


    @Override
    public String tag() {
        return "img";
    }

    @Override
    public Map<String, Object> toMessage() {
        Map<String, Object> imgMap = new HashMap<>(4);
        imgMap.put("tag", tag());
        imgMap.put("image_key", this.imageKey);
        imgMap.put("width", this.width == null ? 300 : this.width);
        imgMap.put("height", this.height == null ? 300 : this.height);
        return imgMap;
    }
}
