<head>
	<title>Notice [show]</title>
</head>
<body>
	<p>
		<b>Type:</b>
		${notice.type}
	</p>
	<p>
		<b>Date:</b>
		${notice.date}
	</p>
	<p>
		<b>Frequence:</b>
		${notice.frequence}
	</p>
	<p>
		<b>Ststus:</b>
		${notice.ststus}
	</p>

	<a href="${pageContext.request.contextPath}/notices/${notice.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/notices">Back</a>
</body>