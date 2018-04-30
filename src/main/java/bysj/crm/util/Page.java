package bysj.crm.util;

public class Page {
    private int pageSize;
    private int pageNumber;

    public int getOffset() {
        return (pageNumber-1)*pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
