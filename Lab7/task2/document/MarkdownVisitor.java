package com.poo.labvisitor.task1.document;

public class MarkdownVisitor implements Visitor{
    private StringBuilder document;

    public MarkdownVisitor(){
        document = new StringBuilder();
    }

    public StringBuilder getDocument(){
        return this.document;
    }

    public void visit(PlainTextSegment text){
        document.append(text.getContent());
    }

    public void visit(ItalicTextSegment text){
        document.append("_");
        document.append(text.getContent());
        document.append("_");
    }

    public void visit(BoldTextSegment text){
        document.append("__");
        document.append(text.getContent());
        document.append("__");
    }

    public void visit(UrlSegment text){
        document.append("[");
        document.append(text.getDescription());
        document.append("]");
        document.append("(");
        document.append(text.getContent());
        document.append(")");
    }

}
