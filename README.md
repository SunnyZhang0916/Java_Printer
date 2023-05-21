# Java_Printer

代码构造：
1. 将墨盒和纸张定义成接口（规范）
2. 使用墨盒和纸张实现打印机的总体功能
3. 为打印机添加相应品牌的墨盒和纸张
4. 实现打印机的打印功能

代码思路：
1. 先写墨盒和纸张的接口
public String getColor();
String getSize();

2. Printer Class
设置inkbox 和 paper对象为空
print方法里面是打印过程

3.PrintTest Class
第一次test之前的设置，所以是：
Printer printer = new Printer();
printer.print("测试内容");

得出墨盒和纸张目前都是空的。因此，需要安装纸张和墨盒

4. ColorInkBoxImpl 实现了墨盒类
public String getColor() {
        return "Red";
    }

5. A4PaperImpl 实现了纸张类
   public String getSize() {
        return "A4";
    }

6. PrintTest Class 增加了：为打印机安装纸张和墨盒
