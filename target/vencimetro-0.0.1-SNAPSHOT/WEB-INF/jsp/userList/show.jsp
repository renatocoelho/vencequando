<head>
	<title>UserList [show]</title>
</head>
<body>
	<p>
		<b>Id user:</b>
		${userList.idUser}
	</p>
	<p>
		<b>Id list:</b>
		${userList.idList}
	</p>

	<a href="${pageContext.request.contextPath}/userLists/${userList.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/userLists">Back</a>
</body>