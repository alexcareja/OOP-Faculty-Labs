package com.poo.labvisitor.task1;

import com.poo.labvisitor.task1.document.DocuWikiVisitor;
import com.poo.labvisitor.task1.document.MarkdownVisitor;
import com.poo.labvisitor.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DocuWikiVisitor visitor = new DocuWikiVisitor();
        for(TextSegment segm : textSegments){
            segm.accept(visitor);
        }
        return visitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        MarkdownVisitor visitor = new MarkdownVisitor();
        for(TextSegment segm : textSegments){
            segm.accept(visitor);
        }
        return visitor.getDocument();
    }
}
