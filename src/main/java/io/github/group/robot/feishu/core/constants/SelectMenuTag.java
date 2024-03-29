package io.github.group.robot.feishu.core.constants;

/**
 * selectMenu 元素标签
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2021/12/16
 */
public enum SelectMenuTag {
    /**
     * 选项模式
     */
    SELECT_STATIC("select_static"),
    /**
     * 选人模式
     */
    SELECT_PERSON("select_person"),
    ;

    private final String value;

    SelectMenuTag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
