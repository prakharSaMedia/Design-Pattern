package net.media.training.designpattern.abstractfactory;

public class AndroidProcessorFactory extends ProcessorFactory {
    @Override
    public Part createPart() {
        return new AndroidProcessor();
    }
}
