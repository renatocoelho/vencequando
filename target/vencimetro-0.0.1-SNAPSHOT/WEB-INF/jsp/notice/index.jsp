<head>
	<title>Notice [index]</title>
</head>
<body>
	<h1>Listing Notices</h1>

	<table>
		<tr>
			<th>Id notice</th>
			<th>Type</th>
			<th>Data</th>
			<th>Frequency</th>
			<th>Status</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${noticeList}" var="notice">
			<tr>
				<td>${notice.idNotice}</td>
				<td>${notice.type}</td>
				<td>${notice.data}</td>
				<td>${notice.frequency}</td>
				<td>${notice.status}</td>
				<td><a href="${pageContext.request.contextPath}/notices/${notice.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/notices/${notice.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/notices/${notice.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/notices/new">New Notice</a> 
</body>