package com.demo.ejb.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pager implements Serializable
{
	// 页面大小
		protected Integer[] pageSizeList = { 10, 25, 50, 100, 200, 300, 500 };

		// 一页显示的记录数
		protected Integer pageSize = 25;

		// 当前页码
		protected Integer pageNo = 1;

		// 记录总数
		protected Integer rowCount = 0;

		// 总页数
		protected Integer pageCount = 1;

		// 起始行数
		protected Integer startIndex = 1;

		// 结束行数
		protected Integer endIndex = 1;

		protected Integer firstPageNo = 1;
		protected Integer prePageNo = 1;
		protected Integer nextPageNo = 1;
		protected Integer lastPageNo = 1;

		// 结果集存放List
		protected List<?> resultList;
		
		public Pager(Integer pageSize, Integer pageNo, Integer rowCount, List<?> resultList) {
			this.pageSize = pageSize;
			this.pageNo = pageNo;
			this.rowCount = rowCount;
			this.resultList = resultList;
			
			if (rowCount % pageSize == 0) {
				this.pageCount = rowCount / pageSize;
			} else {
				this.pageCount = rowCount / pageSize + 1;
			}
			this.startIndex = pageSize * (pageNo - 1);
			this.endIndex = this.startIndex + resultList.size();
			
			this.lastPageNo = this.pageCount;
			if (this.pageNo > 1) this.prePageNo = this.pageNo -1;
			if (this.pageNo == this.lastPageNo){
				this.nextPageNo = this.lastPageNo;
			} else {
				this.nextPageNo = this.pageNo + 1;
			}
		}
		
		public Object[] getPageSizeIndexs() {
			List<String> result = new ArrayList<String>(pageSizeList.length);
			for (Integer i = 0; i < pageSizeList.length; i++) {
				result.add(String.valueOf(pageSizeList[i]));
			}
			Object[] indexs = (result.toArray());
			return indexs;
		}
		
		public Object[] getPageNoIndexs() {
			List<String> result = new ArrayList<String>(pageCount);
			for (Integer i = 0; i < pageCount; i++) {
				result.add(String.valueOf(i + 1));
			}
			Object[] indexs = (result.toArray());
			return indexs;
		}

		public Integer getEndIndex() {
			return endIndex;
		}

		public void setEndIndex(Integer endIndex) {
			this.endIndex = endIndex;
		}

		public Integer getPageCount() {
			return pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public Integer getPageNo() {
			return pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer[] getPageSizeList() {
			return pageSizeList;
		}

		public void setPageSizeList(Integer[] pageSizeList) {
			this.pageSizeList = pageSizeList;
		}

		public List<?> getResultList() {
			return resultList;
		}

		public void setResultList(List<?> resultList) {
			this.resultList = resultList;
		}

		public Integer getRowCount() {
			return rowCount;
		}

		public void setRowCount(Integer rowCount) {
			this.rowCount = rowCount;
		}

		public Integer getStartIndex() {
			return startIndex;
		}

		public void setStartIndex(Integer startIndex) {
			this.startIndex = startIndex;
		}

		public Integer getFirstPageNo() {
			return firstPageNo;
		}

		public void setFirstPageNo(Integer firstPageNo) {
			this.firstPageNo = firstPageNo;
		}

		public Integer getLastPageNo() {
			return lastPageNo;
		}

		public void setLastPageNo(Integer lastPageNo) {
			this.lastPageNo = lastPageNo;
		}

		public Integer getNextPageNo() {
			return nextPageNo;
		}

		public void setNextPageNo(Integer nextPageNo) {
			this.nextPageNo = nextPageNo;
		}

		public Integer getPrePageNo() {
			return prePageNo;
		}

		public void setPrePageNo(Integer prePageNo) {
			this.prePageNo = prePageNo;
		}

		
}
