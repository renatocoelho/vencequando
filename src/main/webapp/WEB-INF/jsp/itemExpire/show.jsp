<head>
	<title>ItemExpire [show]</title>
</head>
<body>
	<p>
		<b>Id item expire:</b>
		${itemExpire.idItemExpire}
	</p>
	<p>
		<b>Description:</b>
		${itemExpire.description}
	</p>
	<p>
		<b>Value:</b>
		${itemExpire.value}
	</p>
	<p>
		<b>Start:</b>
		${itemExpire.start}
	</p>
	<p>
		<b>Expire:</b>
		${itemExpire.expire}
	</p>
	<p>
		<b>Last notice:</b>
		${itemExpire.lastNotice}
	</p>
	<p>
		<b>Origin:</b>
		${itemExpire.origin}
	</p>

	<a href="${pageContext.request.contextPath}/itemExpires/${itemExpire.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/itemExpires">Back</a>
</body>