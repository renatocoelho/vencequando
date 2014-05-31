<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/listas" method="post">
  
	<c:if test="${not empty lista.id}">
		<input type="hidden" name="lista.id" value="${lista.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Id lista:<br />
	
		<input type="text" name="lista.idLista" value="${lista.idLista}"/>
	</div>
	
	<div class="field">
		Nome:<br />
	
		<input type="text" name="lista.nome" value="${lista.nome}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/listas">Back</a>
