<head>
	<title>Lista [index]</title>
</head>
<body>
	<h1>Listing Listas</h1>

	<table>
		<tr>
			<th>Id lista</th>
			<th>Nome</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${listaList}" var="lista">
			<tr>
				<td>${lista.idLista}</td>
				<td>${lista.nome}</td>
				<td><a href="${pageContext.request.contextPath}/listas/${lista.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/listas/${lista.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/listas/${lista.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/listas/new">New Lista</a> 
</body>