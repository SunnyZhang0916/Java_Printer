package printdemo.impl;

import printdemo.iface.IPaper;

public class B5PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "B5";
    }
}
