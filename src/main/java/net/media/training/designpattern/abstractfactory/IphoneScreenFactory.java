package net.media.training.designpattern.abstractfactory;

public class IphoneScreenFactory extends ScreenFactory{
    @Override
    public Screen createPart() {
        return new IphoneScreen();
    }
}
