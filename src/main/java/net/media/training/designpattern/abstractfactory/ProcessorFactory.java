package net.media.training.designpattern.abstractfactory;

public class ProcessorFactory extends PartFactory{
    @Override
    public Part createPart() {
        return new Processor();
    }
}
