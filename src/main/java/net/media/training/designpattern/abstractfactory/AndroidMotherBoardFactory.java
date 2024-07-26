package net.media.training.designpattern.abstractfactory;

public class AndroidMotherBoardFactory extends MotherBoardFactory {
    @Override
    public MotherBoard createPart() {
        return new AndroidMotherBoard();
    }
}
