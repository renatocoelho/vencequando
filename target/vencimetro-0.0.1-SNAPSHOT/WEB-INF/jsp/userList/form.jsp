<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/userLists" method="post">
  
	<c:if test="${not empty userList.id}">
		<input type="hidden" name="userList.id" value="${userList.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Id user:<br />
	
		<input type="text" name="userList.idUser" value="${userList.idUser}"/>
	</div>
	
	<div class="field">
		Id list:<br />
	
		<input type="text" name="userList.idList" value="${userList.idList}"/>
	</div>
	
  <div class="actions">
	  <button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/userLists">Back</a>
