package net.media.training.designpattern.abstractfactory;

public class CaseFactory extends PartFactory {
    @Override
    public Case createPart() {
        return new Case();
    }
}
