<head>
	<title>Notice [show]</title>
</head>
<body>
	<p>
		<b>Id notice:</b>
		${notice.idNotice}
	</p>
	<p>
		<b>Type:</b>
		${notice.type}
	</p>
	<p>
		<b>Data:</b>
		${notice.data}
	</p>
	<p>
		<b>Frequency:</b>
		${notice.frequency}
	</p>
	<p>
		<b>Status:</b>
		${notice.status}
	</p>

	<a href="${pageContext.request.contextPath}/notices/${notice.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/notices">Back</a>
</body>