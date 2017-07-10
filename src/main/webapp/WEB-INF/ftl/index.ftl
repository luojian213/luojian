<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /></head>
<title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
<H2>
	<a href="http://viralpatel.net"><img height="37" width="236" border="0px" src="http://viralpatel.net/blogs/wp-content/themes/vp/images/logo.png" align="left"/></a>
	FreeMarker Spring MVC Hello World
</H2>
</div>

<div id="content">
    
  <fieldset>
  	<legend>Add User</legend>
  <form name="user" action="register.html" method="post">
  	姓名: <input type="text" name="userName" />	<br/>
  	年龄: <input type="text" name="age" />	<br/>
  	<input type="submit" value="保存" />
  </form>
  </fieldset>
  <br/>
  <table class="datatable">
  	<tr>
  		<th>User Name</th>  <th>Age</th>
  	</tr>
    <#list model["userList"] as user>
  	<tr>
  		<td>${user.userName}</td> <td>${user.age}</td>
  	</tr>
    </#list>
  </table>

</div>  
</body>
</html>  