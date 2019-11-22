package com.poo.labvisitor.task1.document;

public interface Visitor {
    void visit(PlainTextSegment text);
    void visit(ItalicTextSegment text);
    void visit(BoldTextSegment text);
    void visit(UrlSegment text);
}
