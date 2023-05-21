package printdemo.iface;

/**
 * 1. 将墨盒和纸张定义成接口（规范）
 * 墨盒接口 —— 定义一个通用方法 —— 获得墨盒的颜色
 *
 */
public interface IInkBox {
    /**
     * 获得墨盒的颜色
     * @return
     */
    public String getColor();

}
