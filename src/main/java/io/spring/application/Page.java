package io.spring.application;

import java.util.Objects;

public class Page {
    private static final int MAX_LIMIT = 100;

    private int offset = 0;
    private int limit = 20;

    public Page() {
    }

    public Page(int offset, int limit) {
        setOffset(offset);
        setLimit(limit);
    }

    private void setOffset(int offset) {
        if (offset > 0) {
            this.offset = offset;
        }
    }

    private void setLimit(int limit) {
        if (limit > MAX_LIMIT) {
            this.limit = MAX_LIMIT;
        } else if (limit > 0) {
            this.limit = limit;
        }
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return offset == page.offset &&
                limit == page.limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit);
    }

    @Override
    public String toString() {
        return "Page{" +
                "offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
