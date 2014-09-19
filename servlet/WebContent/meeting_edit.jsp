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

<title>企业信息管理系统 - 工作会议</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="企业,信息,管理">
<meta http-equiv="description" content="企业信息管理系统 - 工作会议">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script language="javascript">
function validMeetingEdit(theform) {
	var starttime = theform.starttime.value;
	var address = theform.address.value;
	var title = theform.title.value;
	if (starttime == "") {
	    alert("会议开始时间不能为空！");
		return false;
	}
	if (address == "") {
	    alert("会议地点不能为空！");
		return false;
	}
	if (title == "") {
	    alert("会议标题不能为空！");
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
				<TD>当前位置：工作会议&gt;&gt;修改会议</TD>
				<TD align="right"><a href="meeting.do?method=list&pageSize=<%=pageSize%>&pageNo=<%=pageNo%>">返回工作会议主页面</a></TD>
				<TD width="20"></TD>
			</TR>
		</TABLE>
		<form name="form1" action="meeting.do?method=update" method="post" onsubmit="return validMeetingEdit(this);">
		<input type="hidden" name="id" value="<%=request.getAttribute("id") %>">
		<input type="hidden" name="pageSize" value="<%=pageSize%>">
		<input type="hidden" name="pageNo" value="<%=pageNo%>">



		<TABLE border="0" width="100%">
			<TR>
				<TD>会议填写人</TD>
				<TD><input type="text" name="sender" maxlength="4"
					value="<%=request.getAttribute("sender") %>" readonly="readonly"></TD>
			</TR>
			<TR>
				<TD>会议开始时间</TD>
				<TD><input type="text" name="starttime" maxlength="100"
					value="<%=request.getAttribute("starttime") %>"></TD>
			</TR>
			<TR>
				<TD>会议结束时间</TD>
				<TD><input type="text" name="endtime" maxlength="100"
					value="<%=request.getAttribute("endtime") %>"></TD>
			</TR>
			<TR>
				<TD>会议地点</TD>
				<TD><input type="text" name="address" maxlength="100"
					value="<%=request.getAttribute("address") %>"></TD>
			</TR>
			<TR>
				<TD>会议标题</TD>
				<TD><input type="text" name="title" maxlength="100"
					value="<%=request.getAttribute("title") %>"></TD>
			</TR>
			<TR>
				<TD>会议内容</TD>
				<TD><textarea name="content" cols="60" rows="15"><%=request.getAttribute("content") %></textarea>
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
