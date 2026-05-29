package org.loboevolution.ProjectTests;

import org.loboevolution.html.renderstate.RenderState;
import org.loboevolution.html.style.HtmlInsets;
import org.loboevolution.info.BackgroundInfo;
import org.loboevolution.info.BorderInfo;
import org.loboevolution.info.WordInfo;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class MockRenderState implements RenderState {
    @Override
    public int getAlignXPercent() {
        return 0;
    }

    @Override
    public int getAlignYPercent() {
        return 0;
    }

    @Override
    public String getAlignItems() {
        return "";
    }

    @Override
    public String getAlignContent() {
        return "";
    }

    @Override
    public Color getBackgroundColor() {
        return null;
    }

    @Override
    public BackgroundInfo getBackgroundInfo() {
        return null;
    }

    @Override
    public BackgroundInfo getBackgroundImageInfo(int width, int height) {
        return null;
    }

    @Override
    public int getBlankWidth() {
        return 0;
    }

    @Override
    public BorderInfo getBorderInfo() {
        return null;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int getCount(String counter, int nesting) {
        return 0;
    }

    @Override
    public int getDisplay() {
        return 0;
    }

    @Override
    public int getFloat() {
        return 0;
    }

    @Override
    public String getFlexDirection() {
        return "";
    }

    @Override
    public String getFlexWrap() {
        return "";
    }

    @Override
    public String getFlexFlow() {
        return "";
    }

    @Override
    public String getJustifyContent() {
        return "";
    }

    @Override
    public Font getFont() {
        Map<TextAttribute, Object> attrs = new HashMap<>();
        attrs.put(TextAttribute.FAMILY, "Serif");
        attrs.put(TextAttribute.SIZE, 16f);
        attrs.put(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER);
        return new Font(attrs);
    }

    @Override
    public int getFontBase() {
        return 0;
    }

    @Override
    public FontMetrics getFontMetrics() {
        return null;
    }

    @Override
    public HtmlInsets getMarginInsets() {
        return null;
    }

    @Override
    public int getOverflowX() {
        return 0;
    }

    @Override
    public int getOverflowY() {
        return 0;
    }

    @Override
    public Color getOverlayColor() {
        return null;
    }

    @Override
    public HtmlInsets getPaddingInsets() {
        return null;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public RenderState getPreviousRenderState() {
        return null;
    }

    @Override
    public Color getTextBackgroundColor() {
        return null;
    }

    @Override
    public int getTextDecorationMask() {
        return 0;
    }

    @Override
    public int getTextIndent(int availWidth) {
        return 0;
    }

    @Override
    public String getTextIndentText() {
        return "";
    }

    @Override
    public int getTextTransform() {
        return 0;
    }

    @Override
    public int getVisibility() {
        return 0;
    }

    @Override
    public int getWhiteSpace() {
        return 0;
    }

    @Override
    public WordInfo getWordInfo(String word) {
        return null;
    }

    @Override
    public int incrementCount(String counter, int nesting) {
        return 0;
    }

    @Override
    public void invalidate() {

    }

    @Override
    public boolean isHighlight() {
        return false;
    }

    @Override
    public void resetCount(String counter, int nesting, int value) {

    }

    @Override
    public void setHighlight(boolean highlight) {

    }

    @Override
    public int getClear() {
        return 0;
    }

    @Override
    public String getBoxSizing() {
        return "";
    }

    @Override
    public String getLeft() {
        return "";
    }

    @Override
    public String getTop() {
        return "";
    }

    @Override
    public String getRight() {
        return "";
    }

    @Override
    public String getBottom() {
        return "";
    }

    @Override
    public String getVerticalAlign() {
        return "";
    }

    @Override
    public Cursor getCursor() {
        return null;
    }

    @Override
    public void setCursor(Cursor cursor) {

    }

    @Override
    public int getDefaultDisplay() {
        return 0;
    }
}
