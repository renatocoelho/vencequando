<head>
	<title>ItemExpire [index]</title>
</head>
<body>
	<h1>Listing ItemExpires</h1>

	<table>
		<tr>
			<th>Id item expire</th>
			<th>Description</th>
			<th>Value</th>
			<th>Start</th>
			<th>Expire</th>
			<th>Last notice</th>
			<th>Origin</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${itemExpireList}" var="itemExpire">
			<tr>
				<td>${itemExpire.idItemExpire}</td>
				<td>${itemExpire.description}</td>
				<td>${itemExpire.value}</td>
				<td>${itemExpire.start}</td>
				<td>${itemExpire.expire}</td>
				<td>${itemExpire.lastNotice}</td>
				<td>${itemExpire.origin}</td>
				<td><a href="${pageContext.request.contextPath}/itemExpires/${itemExpire.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/itemExpires/${itemExpire.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/itemExpires/${itemExpire.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/itemExpires/new">New ItemExpire</a> 
</body>