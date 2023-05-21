package printdemo;

import printdemo.iface.IInkBox;
import printdemo.impl.A4PaperImpl;
import printdemo.impl.B5PaperImpl;
import printdemo.impl.ColorInkBoxImpl;

/**
 * https://www.youtube.com/watch?v=i8xYWt88MJo&list=PLlglyqJETQQ2weNGbwHbrjAeWA6ybt8wQ&index=136
 * 1. 将墨盒和纸张定义成接口（规范）
 * 2. 使用墨盒和纸张实现打印机的总体功能
 * 3. 为打印机添加相应品牌的墨盒和纸张
 * 4. 实现打印机的打印功能
 */
public class PrintTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        //为打印机安装纸张和墨盒
        printer.setInkbox(new ColorInkBoxImpl());
        printer.setPaper(new A4PaperImpl());  //A4
        printer.setPaper(new B5PaperImpl());  //B5

        printer.print("测试内容");
    }
}
