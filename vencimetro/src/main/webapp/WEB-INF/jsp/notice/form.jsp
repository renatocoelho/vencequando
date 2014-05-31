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
		Type:<br />
	
		<input type="text" name="notice.type" value="${notice.type}"/>
	</div>
	
	<div class="field">
		Date:<br />
	
		<input type="text" name="notice.date" value="${notice.date}"/>
	</div>
	
	<div class="field">
		Frequence:<br />
	
		<input type="text" name="notice.frequence" value="${notice.frequence}"/>
	</div>
	
	<div class="field">
		Ststus:<br />
	
		<input type="text" name="notice.ststus" value="${notice.ststus}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/notices">Back</a>
