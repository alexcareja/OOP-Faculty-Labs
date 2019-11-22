package com.poo.labvisitor.task1.document;

public class ItalicTextSegment extends PlainTextSegment{

    public ItalicTextSegment(String content) {
        super(content);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
