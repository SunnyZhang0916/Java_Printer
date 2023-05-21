package printdemo.impl;

import printdemo.iface.IPaper;

/**
 * 实现纸张接口
 */
public class A4PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}
