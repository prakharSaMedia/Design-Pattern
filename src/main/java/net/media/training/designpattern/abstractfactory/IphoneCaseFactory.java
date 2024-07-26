package net.media.training.designpattern.abstractfactory;

public class IphoneCaseFactory extends CaseFactory{
    @Override
    public Case createPart() {
        return new IphoneCase();
    }
}
