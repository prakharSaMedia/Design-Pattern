package net.media.training.designpattern.abstractfactory;

public class IphoneProcessorFactory extends ProcessorFactory{
    @Override
    public Part createPart() {
        return new IphoneProcessor();
    }
}
