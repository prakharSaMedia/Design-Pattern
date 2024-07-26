package net.media.training.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements Node {
    private final String name;
    // private final List<File> files;
    // private final List<Directory> directories;
    private final List<Node> nodes;
    private Node parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<Node> files, List<Node> directories) {
        this.name = name;
        this.nodes = files;
        this.nodes.addAll(directories);

        for (Node directory : directories) {
            directory.setParent(this);
        }

        for (Node file : files) {
            file.setParent(this);
        }
    }

    public int getSize() {
        int sum = 0;
        for (Node node : nodes) {
            sum += node.getSize();
        }
        return sum;
    }

    public void setParent(Node directory) {
        this.parent = directory;
    }

    public void delete(Node node) {
        while (nodes.size() > 0) {
            Node file = directoryToDelete.getFiles().get(0);
            file.getParent().removeEntry(file);
        }

        while (directoryToDelete.getDirectories().size() > 0) {
            Directory directory = directoryToDelete.getDirectories().get(0);
            delete(directory);
        }

        directoryToDelete.getParent().removeEntry(directoryToDelete);
    }

    public void delete() {
        delete(this);
    }

    public void removeEntry(Node node) {
        nodes.remove(node);
    }

    public void add(Node node) {
        nodes.add(node);
    }

    private boolean fileExists(String name, Directory directoryToSearch) {
        for (File file : directoryToSearch.getFiles()) {
            if (file.getName().equals(name)) {
                return true;
            }
        }

        for (Directory directory : directoryToSearch.getDirectories()) {
            if (fileExists(name, directory))
                return true;
        }

        return false;
    }

    public boolean fileExists(String name) {
        return fileExists(name, this);
    }

    
    private boolean directoryExists(String name, Directory directoryToSearch) {
        if (directoryToSearch.getName().equals(name))
        return true;
        
        for (Directory directory : directoryToSearch.getDirectories()) {
            if (directory.getName().equals(name)) {
                return true;
            }
        }
        
        for (Directory directory : directories) {
            if (directory.fileExists(name)) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean directoryExists(String name) {
        return directoryExists(name, this);
    }

    public List<Node> getFiles() {
        List<Node>temp = new ArrayList<>();
        for (Node node : nodes) {
            if (node instanceof File) {
                temp.add(node);
            }
        }
        return temp;
    }

    public List<Node> getDirectories() {
        List<Node>temp = new ArrayList<>();
        for (Node node : nodes) {
            if (node instanceof Directory) {
                temp.add(node);
            }
        }
        return temp;
    }

    public Node getParent() {
        return parent;
    }
}
