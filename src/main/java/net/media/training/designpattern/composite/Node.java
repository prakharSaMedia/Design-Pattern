package net.media.training.designpattern.composite;

public interface Node {
    public String getName();
    public int getSize();
    public Node getParent();
    public void setParent(Directory parent);
}
