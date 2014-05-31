<head>
	<title>User [index]</title>
</head>
<body>
	<h1>Lista de usu&aacute;rios</h1>

	<table>
		<tr>
			<th>C&ocirc;digo</th>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Fornecedor</th>
			<th>Anivers&aacute;rio</th>
			<th>G&ecirc;nero</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.idUser}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.provider}</td>
				<td>${user.birth}</td>
				<td>${user.gender}</td>
				<td><a href="${pageContext.request.contextPath}/users/${user.id}">Visualizar</a></td>
				<td><a href="${pageContext.request.contextPath}/users/${user.id}/edit">Editar</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/users/${user.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">Apagar</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/users/new">Criar um novo usu&aacute;rio </a> 
	<br />
	<a href="${pageContext.request.contextPath}/menu.jsp">Voltar ao menu </a>
	
</body>