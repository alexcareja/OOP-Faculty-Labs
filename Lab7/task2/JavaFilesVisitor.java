package com.poo.labvisitor.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles;

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    // TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor
    // add to javaFiles all the Java related files: the ones with .java and .class extensions

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        if(fileName.endsWith(".java") || fileName.endsWith(".class")){
            System.out.println("Name: " + fileName);
            System.out.println("Size: " + attrs.size() + "B");
            System.out.println("Creation Time: " + attrs.creationTime() + "\n");
        }
        return FileVisitResult.CONTINUE;
    }

    public void printFiles(){
        for(Path file : this.javaFiles){

        }
    }

    public static void main(String[] args) {

        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        try{
            Files.walkFileTree(startingDir, filesVisitor);
        }
        catch (IOException e) {

        }
        // TODO
        // use Files.walkFileTree
        // obtain the list of files and print some info about them (e.g. size and path)
    }
}
