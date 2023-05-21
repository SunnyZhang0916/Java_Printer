package printdemo.iface;

/**
 * 1. 将墨盒和纸张定义成接口（规范）
 * 纸张接口 —— 定义获得纸张尺寸的标准方法
 *
 */
public interface IPaper {
    /**
     * 获得纸张的尺寸
     * @return
     */
    String getSize();  //是否Public都不重要

}
