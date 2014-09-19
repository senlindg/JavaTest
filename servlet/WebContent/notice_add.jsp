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

<title>企业信息管理系统 - 公司公告</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="企业,信息,管理">
<meta http-equiv="description" content="企业信息管理系统 - 公司公告">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script language="javascript">
function validNoticeAdd(theform) {
	var title = theform.title.value;
	if (title == "") {
	    alert("公告标题不能为空！");
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
		String pageSize = (String)request.getAttribute("pageSize");
		String pageNo = (String)request.getAttribute("pageNo");
		%>
		<TABLE width="100%" class="position">
			<TR>
				<TD>当前位置：公司公告&gt;&gt;新增公告</TD>
				<TD align="right"><a href="notice.do?method=list&pageSize=<%=pageSize%>&pageNo=<%=pageNo%>">返回公司公告主页面</a></TD>
				<TD width="20"></TD>
			</TR>
		</TABLE>
		<form name="form1" action="notice.do?method=insert" method="post" onsubmit="return validNoticeAdd(this);">
		<input type="hidden" name="pageSize" value="<%=pageSize%>">
		<input type="hidden" name="pageNo" value="<%=pageNo%>">
		<TABLE border="0" width="100%">
			<TR>
				<TD>公告标题</TD>
				<TD><input type="text" name="title" maxlength="100" value="">
				</TD>
			</TR>
			<TR>
				<TD>公告内容</TD>
				<TD><textarea name="content" cols="60" rows="15"></textarea></TD>
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
