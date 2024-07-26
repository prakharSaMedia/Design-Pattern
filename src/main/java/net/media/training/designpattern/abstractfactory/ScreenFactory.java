package net.media.training.designpattern.abstractfactory;

public class ScreenFactory extends PartFactory {
    @Override
    public Screen createPart() {
        return new Screen();
    }
}
