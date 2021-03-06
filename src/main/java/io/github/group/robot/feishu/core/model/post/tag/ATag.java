package io.github.group.robot.feishu.core.model.post.tag;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * a标签
 *
 * @author bing_huang
 * @date 2021/12/16
 */
@Setter
@Getter
@Builder
public class ATag extends PostTag {
    /**
     * 文本内容
     */
    private String text;
    /**
     * 默认的链接地址
     */
    private String href;

    @Override
    public String tag() {
        return "a";
    }

    @Override
    public Map<String, Object> toMessage() {
        Map<String, Object> aMap = new HashMap<>(3);
        aMap.put("tag", tag());
        aMap.put("text", this.text);
        aMap.put("href", this.href);
        return aMap;
    }
}
