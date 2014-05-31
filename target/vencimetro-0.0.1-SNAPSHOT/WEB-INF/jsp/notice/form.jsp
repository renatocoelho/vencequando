<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/notices" method="post">
  
	<c:if test="${not empty notice.id}">
		<input type="hidden" name="notice.id" value="${notice.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Id notice:<br />
	
		<input type="text" name="notice.idNotice" value="${notice.idNotice}"/>
	</div>
	
	<div class="field">
		Type:<br />
	
		<input type="text" name="notice.type" value="${notice.type}"/>
	</div>
	
	<div class="field">
		Data:<br />
	
		<input type="text" name="notice.data" value="${notice.data}"/>
	</div>
	
	<div class="field">
		Frequency:<br />
	
		<input type="text" name="notice.frequency" value="${notice.frequency}"/>
	</div>
	
	<div class="field">
		Status:<br />
	
		<input type="text" name="notice.status" value="${notice.status}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/notices">Back</a>
