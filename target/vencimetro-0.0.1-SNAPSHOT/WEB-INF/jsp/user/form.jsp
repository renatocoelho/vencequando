<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/users" method="post">
  
	<c:if test="${not empty user.id}">
		<input type="hidden" name="user.id" value="${user.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Id user:<br />
	
		<input type="text" name="user.idUser" value="${user.idUser}"/>
	</div>
	
	<div class="field">
		Name:<br />
	
		<input type="text" name="user.name" value="${user.name}"/>
	</div>
	
	<div class="field">
		Email:<br />
	
		<input type="text" name="user.email" value="${user.email}"/>
	</div>
	
	<div class="field">
		Password:<br />
	
		<input type="text" name="user.password" value="${user.password}"/>
	</div>
	
	<div class="field">
		Provider:<br />
	
		<input type="text" name="user.provider" value="${user.provider}"/>
	</div>
	
	<div class="field">
		Birth:<br />
	
		<input type="text" name="user.birth" value="${user.birth}"/>
	</div>
	
	<div class="field">
		Gender:<br />
	
		<input type="text" name="user.gender" value="${user.gender}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/users">Back</a>
