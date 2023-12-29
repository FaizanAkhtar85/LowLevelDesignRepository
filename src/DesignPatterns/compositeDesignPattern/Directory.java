package DesignPatterns.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystems.add(fileSystemObj);
    }
    @Override
    public void ls() {
        System.out.println("Directory name: "+directoryName);
        for(FileSystem fileSystemObject: fileSystems){
            fileSystemObject.ls();
        }
    }
}
