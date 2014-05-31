<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/itemExpires" method="post">
  
	<c:if test="${not empty itemExpire.id}">
		<input type="hidden" name="itemExpire.id" value="${itemExpire.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Description:<br />
	
		<input type="text" name="itemExpire.description" value="${itemExpire.description}"/>
	</div>
	
	<div class="field">
		Value:<br />
	
		<input type="text" name="itemExpire.value" value="${itemExpire.value}"/>
	</div>
	
	<div class="field">
		Start:<br />
	
		<input type="text" name="itemExpire.start" value="${itemExpire.start}"/>
	</div>
	
	<div class="field">
		Expire:<br />
	
		<input type="text" name="itemExpire.expire" value="${itemExpire.expire}"/>
	</div>
	
	<div class="field">
		Last notice:<br />
	
		<input type="text" name="itemExpire.lastNotice" value="${itemExpire.lastNotice}"/>
	</div>
	
	<div class="field">
		Origin:<br />
	
		<input type="text" name="itemExpire.origin" value="${itemExpire.origin}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/itemExpires">Back</a>
