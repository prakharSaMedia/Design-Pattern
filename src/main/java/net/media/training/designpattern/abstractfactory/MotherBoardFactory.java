package net.media.training.designpattern.abstractfactory;

public class MotherBoardFactory extends PartFactory {
    @Override
    public MotherBoard createPart() {
        return new MotherBoard();
    }
}
