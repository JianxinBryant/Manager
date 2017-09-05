package util;

public class Paging {

	private int count = 0; // 总记录数

	private int pageIndex = 1; // 当前页数

	private int pageNum = 5; // 每页显示条数

	private int pageCount = 1; // 总页数

	private int startNo = 1; // 起始记录数

	/**
	 * 总页数
	 * 
	 * @return
	 */
	public int pageCount() {
		return this.count / pageNum + 1;
	}

	/**
	 * 起始记录数
	 */
	public void startNo(int pageIndex) {
		if (this.pageIndex <= this.pageCount)
			this.startNo = (pageIndex - 1) * pageNum;
	}

	/**
	 * 当前页数
	 * @param pageIndex
	 */
	public void setPageIndex(int pageIndex) {
		if (this.pageCount <= pageIndex)
			this.pageIndex = this.pageCount;
		else if(pageIndex<=0)
			this.pageIndex = 1;
		else
			this.pageIndex = pageIndex;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

}
