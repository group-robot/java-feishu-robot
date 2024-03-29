package io.github.group.robot.feishu.core.model.interactive;

import io.github.group.robot.feishu.core.model.IMessage;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 卡片标题-内容
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2021/12/16
 */
@Getter
@Setter
public class CardTitle implements IMessage {
    /**
     * create {@link  CardTitle}
     *
     * @return {@link  CardTitle}
     */
    public static CardTitle build() {
        return new CardTitle();
    }

    public CardTitle() {
        this(new HashMap<>());
    }

    public CardTitle(Map<String, String> i18n) {
        this.i18n = i18n;
    }

    /**
     * 内容，与i18n互斥
     */
    private String content;

    /**
     * set content
     *
     * @param content content
     * @return this
     */
    public CardTitle content(String content) {
        this.content = content;
        return this;
    }

    /**
     * i18n
     */
    private Map<String, String> i18n;

    /**
     * 新增 i18n
     *
     * @param key   key
     * @param value value
     * @return this
     */
    public CardTitle addI18n(String key, String value) {
        i18n.put(key, value);
        return this;
    }

    @Override
    public Map<String, Object> toMessage() {
        Map<String, Object> message = new HashMap<>(2);
        message.put("tag", "plain_text");
        if (i18n.isEmpty()) {
            message.put("content", this.content);
        } else {
            message.put("i18n", this.i18n);
        }
        return message;
    }
}
