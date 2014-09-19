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

<title>企业信息管理系统 - 通讯录管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="企业,信息,管理">
<meta http-equiv="description" content="企业信息管理系统 - 通讯录管理">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/styles.css">
<script language="javascript">
function validAddressAdd(theform) {
	var name = theform.name.value;
	var mobile = theform.mobile.value;
	var email = theform.email.value;
	if (name == "") {
	    alert("姓名不能为空！");
		return false;
	}
	if (mobile == "") {
	    alert("手机不能为空！");
		return false;
	}
	if (email == "") {
	    alert("Email不能为空！");
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
				<TD>当前位置：通讯录管理&gt;&gt;新增联系人</TD>
				<TD align="right"><a href="address.do?method=list&pageSize=<%=pageSize%>&pageNo=<%=pageNo%>">返回通讯录主页面</a></TD>
				<TD width="20"></TD>
			</TR>
		</TABLE>
		<form name="form1" action="address.do?method=insert" method="post"
			onsubmit="return validAddressAdd(this);">
		<input type="hidden" name="pageSize" value="<%=pageSize%>">
		<input type="hidden" name="pageNo" value="<%=pageNo%>">
		<TABLE border="0" width="100%">
			<TR>
				<TD>姓名</TD>
				<TD><input type="text" name="name" maxlength="50" value="">

				</TD>
			</TR>
			<TR>
				<TD>性别</TD>
				<TD><input type="text" name="sex" maxlength="10" value="">
				</TD>
			</TR>
			<TR>
				<TD>手机</TD>
				<TD><input type="text" name="mobile" maxlength="20" value="">
				</TD>
			</TR>
			<TR>
				<TD>Email</TD>
				<TD><input type="text" name="email" maxlength="50" value="">
				</TD>
			</TR>
			<TR>
				<TD>QQ号码</TD>
				<TD><input type="text" name="qq" maxlength="20" value="">
				</TD>
			</TR>
			<TR>
				<TD>工作单位</TD>
				<TD><input type="text" name="company" maxlength="100" value="">
				</TD>
			</TR>
			<TR>
				<TD>地址</TD>
				<TD><input type="text" name="address" maxlength="100" value="">
				</TD>
			</TR>
			<TR>
				<TD>邮编</TD>
				<TD><input type="text" name="postcode" maxlength="10" value="">
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
