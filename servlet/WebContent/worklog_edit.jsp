<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>企业信息管理系统 - 工作记录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="企业,信息,管理">
<meta http-equiv="description" content="企业信息管理系统 - 工作记录">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script language="javascript">
function validWorklogEdit(theform) {
	var year = theform.year.value;
	var month = theform.month.value;
	var day = theform.day.value;
	var title = theform.title.value;
	if (year == "") {
	    alert("年份不能为空！");
		return false;
	}
	if (month == "") {
	    alert("月份不能为空！");
		return false;
	}
	if (day == "") {
	    alert("日期不能为空！");
		return false;
	}
	if (title == "") {
	    alert("记录标题不能为空！");
		return false;
	}
	return true;
}
</script>
</head>
<body>
<div align="center">

<table height="100%" width="100%" border="0" cellspacing="0"
	cellpadding="0">
	<tr>
		<td colspan="2" height="108">
		<table height="108" background="images/banner.jpg" border="0"
			cellspacing="0" cellpadding="0" width="100%">
			<tr>
				<td></td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td width="160" bgcolor="#EEEEEE" valign="top" height="100%"><%@ include
			file="inc/menu.jsp"%></td>
		<td align="left" valign="top">
		<%
			String pageSize = (String) request.getAttribute("pageSize");
			String pageNo = (String) request.getAttribute("pageNo");
		%>
		<TABLE width="100%" class="position">
			<TR>
				<TD>当前位置：工作记录&gt;&gt;修改工作记录</TD>
				<TD align="right"><a
					href="worklog.do?method=list&pageSize=<%=pageSize%>&pageNo=<%=pageNo%>">返回工作记录主页面</a></TD>
				<TD width="20"></TD>
			</TR>
		</TABLE>
		<form name="form1" action="worklog.do?method=update"
			method="post" onsubmit="return validWorklogEdit(this);"><input
			type="hidden" name="id" value="<%=request.getAttribute("id") %>">
		<input type="hidden" name="pageSize" value="<%=pageSize%>"> <input
			type="hidden" name="pageNo" value="<%=pageNo%>">



		<TABLE border="0" width="100%">
			<TR>
				<TD>年份</TD>
				<TD><input type="text" name="year" maxlength="4"
					value="<%=request.getAttribute("year") %>"></TD>
			</TR>
			<TR>
				<TD>月份</TD>
				<TD><input type="text" name="month" maxlength="2"
					value="<%=request.getAttribute("month") %>"></TD>
			</TR>
			<TR>
				<TD>日期</TD>
				<TD><input type="text" name="day" maxlength="2"
					value="<%=request.getAttribute("day") %>"></TD>
			</TR>
			<TR>
				<TD>记录标题</TD>
				<TD><input type="text" name="title" maxlength="100"
					value="<%=request.getAttribute("title") %>"></TD>
			</TR>
			<TR>
				<TD>记录内容</TD>
				<TD><textarea name="description" cols="60" rows="15"><%=request.getAttribute("description")%></textarea>
				</TD>
			</TR>
			<TR>
				<TD colspan="2"><input type="submit" value="提交"></TD>
			</TR>
		</TABLE>
		</form>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><%@ include file="inc/foot.jsp"%>
		</td>
	</tr>
</table>
</div>
</body>
</html>
