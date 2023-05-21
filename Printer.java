package printdemo;

import printdemo.iface.IInkBox;
import printdemo.iface.IPaper;

/**
 *
 * 打印机类 —— 使用标准的墨盒和纸张进行打印
 */
public class Printer {
    private IInkBox inkbox = null;  //打印机中的墨盒,默认墨盒对象为空
    private IPaper paper = null;          //打印机中的纸张

    /**
     * 打印机的打印方法 —— 使用墨盒和纸张
     *
     * @param content 传递给打印机打印的字符串内容
     * 对于打印机来说，需要提供一个东西才能打印
     */
    public void print(String content){
        if(null == inkbox || null == paper){
            System.out.println(("墨盒和纸张出现错误，请安装正确后重试"));
            return;
        }
        //打印过程
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("以下文字是" + color + "颜色的。");
        System.out.println("使用纸张： " + type);
        System.out.println("打印内容： " + content);
    }

    public IInkBox getInkbox() {
        return inkbox;
    }

    /**
     *
     * @param inkbox 需要一个实现类
     */
    public void setInkbox(IInkBox inkbox) {
        this.inkbox = inkbox;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}
