<%--
  Created by IntelliJ IDEA.
  User: ORVR
  Date: 2019/4/26
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>员工列表</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>
    <script src="${APP_PATH}/webjars/jquery/3.1.1/jquery.min.js"></script>

    <script src="${APP_PATH}/webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${APP_PATH}/webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
    <%--  标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--  按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn-primary">新增</button>
            <button class="btn-danger">删除</button>
        </div>
    </div>
    <%--  列表--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>#</th>
                    <th>empName</th>
                    <th>gender</th>
                    <th>eamil</th>
                    <th>deptName</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${page.list}" var="allemp">
                    <tr>
                        <th>${allemp.empId}</th>
                        <th>${allemp.empName}</th>
                        <th>${allemp.gender}</th>
                        <th>${allemp.email}</th>
                        <th>${allemp.tnlDept.depyName}</th>
                        <th>
                            <button class="btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑</button>
                            <button class="btn-danger btn-sm">
                                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                                删除</button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <%--  分页--%>
    <div class="row">
        <div class="col-md-6">
            当前${page.pageNum}页，总${page.pages}页，总共${page.total}条记录
        </div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${APP_PATH}/allemp?pn=1">首页</a></li>
                    <c:if test="${page.hasPreviousPage}">
                    <li>
                        <a href="${APP_PATH}/allemp?pn=${page.pageNum-1}"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    </c:if>
                    <c:forEach items="${page.navigatepageNums}" var="pageNum">
                        <c:if test="${page_Num == page.pageNum }">
                            <li class="active"><a href="#">${pageNum}</a></li>
                        </c:if>
                        <c:if test="${page_Num != page.pageNum }">
                            <li><a href="${APP_PATH }/allemp?pn=${pageNum}">${pageNum}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${page.hasNextPage}">
                    <li>
                        <a href="${APP_PATH }/allemp?pn=${page.pageNum+1}"
                        aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                    </c:if>
                    <li><a href="${APP_PATH}/allemp?pn=${page.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>


</div>
</body>
</html>
