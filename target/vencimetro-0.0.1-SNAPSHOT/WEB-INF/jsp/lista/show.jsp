<head>
	<title>Lista [show]</title>
</head>
<body>
	<p>
		<b>Id lista:</b>
		${lista.idLista}
	</p>
	<p>
		<b>Nome:</b>
		${lista.nome}
	</p>

	<a href="${pageContext.request.contextPath}/listas/${lista.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/listas">Back</a>
</body>