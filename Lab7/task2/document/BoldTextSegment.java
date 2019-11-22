package com.poo.labvisitor.task1.document;

public class BoldTextSegment extends PlainTextSegment {

    public BoldTextSegment(String content) {
        super(content);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
