<head>
	<title>UserList [index]</title>
</head>
<body>
	<h1>Listing UserLists</h1>

	<table>
		<tr>
			<th>Id user</th>
			<th>Id list</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${userListList}" var="userList">
			<tr>
				<td>${userList.idUser}</td>
				<td>${userList.idList}</td>
				<td><a href="${pageContext.request.contextPath}/userLists/${userList.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/userLists/${userList.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/userLists/${userList.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/userLists/new">New UserList</a> 
</body>