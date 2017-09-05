package util;

public class Paging {

	private int count = 0; // �ܼ�¼��

	private int pageIndex = 1; // ��ǰҳ��

	private int pageNum = 5; // ÿҳ��ʾ����

	private int pageCount = 1; // ��ҳ��

	private int startNo = 1; // ��ʼ��¼��

	/**
	 * ��ҳ��
	 * 
	 * @return
	 */
	public int pageCount() {
		return this.count / pageNum + 1;
	}

	/**
	 * ��ʼ��¼��
	 */
	public void startNo(int pageIndex) {
		if (this.pageIndex <= this.pageCount)
			this.startNo = (pageIndex - 1) * pageNum;
	}

	/**
	 * ��ǰҳ��
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
