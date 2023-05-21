package printdemo.impl;

import printdemo.iface.IInkBox;

/**
 * 实现墨盒接口
 */
public class ColorInkBoxImpl implements IInkBox {

    @Override
    public String getColor() {
        return "Red";
    }
}
