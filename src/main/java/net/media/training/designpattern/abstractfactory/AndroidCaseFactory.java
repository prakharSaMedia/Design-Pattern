package net.media.training.designpattern.abstractfactory;

public class AndroidCaseFactory extends CaseFactory{
    @Override
    public Case createPart() {
        return new AndroidCase();
    }
}
