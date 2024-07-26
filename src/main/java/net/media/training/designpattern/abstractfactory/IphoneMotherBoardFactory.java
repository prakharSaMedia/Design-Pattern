package net.media.training.designpattern.abstractfactory;

public class IphoneMotherBoardFactory extends MotherBoardFactory {
    @Override
    public IphoneMotherBoard createPart() {
        return new IphoneMotherBoard();
    }
}
