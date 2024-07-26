package net.media.training.designpattern.abstractfactory;

public class AndroidScreenFactory extends ScreenFactory {
    @Override
    public Screen createPart() {
        return new AndroidScreen();
    }
}
