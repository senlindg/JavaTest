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

<title>企业信息管理系统 - 日程安排</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="企业,信息,管理">
<meta http-equiv="description" content="企业信息管理系统 - 日程安排">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script language="javascript">
function validScheduleAdd(theform) {
	var year = theform.year.value;
	var month = theform.month.value;
	var day = theform.day.value;
	var plan = theform.plan.value;
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
	if (plan == "") {
	    alert("安排内容不能为空！");
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
				<TD>当前位置：日程安排&gt;&gt;新增日程安排</TD>
				<TD align="right"><a
					href="schedule.do?method=list&pageSize=<%=pageSize%>&pageNo=<%=pageNo%>">返回日程安排主页面</a></TD>
				<TD width="20"></TD>
			</TR>
		</TABLE>
		<form name="form1" action="schedule.do?method=insert"
			method="post" onsubmit="return validScheduleAdd(this);"><input
			type="hidden" name="pageSize" value="<%=pageSize%>"> <input
			type="hidden" name="pageNo" value="<%=pageNo%>">
		<TABLE border="0" width="100%">
			<TR>
				<TD>年份</TD>
				<TD><input type="text" name="year" maxlength="4" value="">
				</TD>
			</TR>
			<TR>
				<TD>月份</TD>
				<TD><input type="text" name="month" maxlength="2" value="">
				</TD>
			</TR>
			<TR>
				<TD>日期</TD>
				<TD><input type="text" name="day" maxlength="2" value="">
				</TD>
			</TR>
			<TR>
				<TD>安排内容</TD>
				<TD><textarea name="plan" cols="60" rows="15"></textarea></TD>
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
