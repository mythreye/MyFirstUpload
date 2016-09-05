
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>
<div class="bg-content">
  <div id="content">
    <div class="container">
        <div class="card card-container">
             <form:form class="form-signin1" method="POST" name="NewUser" action="" commandName="NewUser">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" class="form-control" placeholder="Name" required  autofocus/>
                <input type="text" class="form-control" placeholder="UserId" required />
                <input type="password" class="form-control" placeholder="Password" required/>
                <input type="password" class="form-control" placeholder="Confirm Password" required/>
                <input type="text" class="form-control" placeholder="E-Mail" required/>
                <input type="text" class="form-control" placeholder="Phone No." required/>
                <form:button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" >Sign in</form:button>
            </form:form>
        </div><!-- /card-container -->
    </div><!-- /container -->
    </div>
</div>

<jsp:include page="footer.jsp"/>
