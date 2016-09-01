<%--
  Created by IntelliJ IDEA.
  User: lxl
  Date: 2014-12-09
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Separate references for <jsp:include> param passing--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="left">
    <div id="user-media" class="media user-media">
        <div class="user-media-toggleHover">
            <span class="fa fa-user"></span>
        </div>
        <div class="user-wrapper bg-dark">
            <a class="user-link" href="">
                <img class="media-object img-thumbnail user-img" alt="User Picture" src="/resources/website/img/metis-tile.png">
                <%--<span class="label label-danger user-label">16</span>--%>
            </a>

            <div class="media-body">
                <h5 class="media-heading">用户名</h5>
                <ul class="list-unstyled user-info">
                    <li><a href="">欢迎您: ${sessionScope.user.userName}  !</a> </li>
                    <li></li>

                    <%--<br>--%>
                    <%--<small>--%>
                    <%--<i class="fa fa-calendar"></i>&nbsp;16 Mar 16:32</small>--%>
                    <%--</li>--%>
                </ul>
            </div>
        </div>
    </div>

    <!-- #menu -->
    <ul id="menu" class="">
        <c:forEach items="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.authorities}" var="roleInfo">
            <c:if test="${roleInfo eq 'ROLE_ADMIN'}">
                <li>
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span class="link-title">业务员</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul>
                        <li>
                            <a href="/user">
                                <i class="fa fa-angle-left"></i>&nbsp; 业务员列表</a>
                        </li>
                        <li>
                            <a href="/user/create">
                                <i class="fa fa-angle-left"></i>&nbsp; 添加业务员</a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fa fa-angle-left"></i>&nbsp; 导入业务员信息</a>
                        </li>
                    </ul>
                </li>
            </c:if>

            <c:if test="${roleInfo eq 'ROLE_ADMIN'}">
                <li <%--<c:if test="${param.activeMenu eq 'loan'}">class="active" </c:if>--%>>
                    <a href="javascript:;">
                        <i class="fa fa-tasks"></i>
                        <span class="link-title">运单</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul>
                        <li>
                            <a href="/wayBill">
                                <i class="fa fa-angle-left"></i>&nbsp; 运单列表</a>
                        </li>
                        <li>
                            <a href="/wayBill/create">
                                <i class="fa fa-angle-right"></i>&nbsp; 运单添加</a>
                        </li>
                        <li>
                            <a href="/wayBill/import">
                                <i class="fa fa-angle-left"></i>&nbsp; 运单导入</a>
                        </li>
                    </ul>
                </li>
            </c:if>
            <c:if test="${roleInfo eq 'ROLE_ADMIN'}">
            <li>
                <a href="javascript:;">
                    <i class="fa fa-tasks"></i>
                    <span class="link-title">中转费配置</span>
                    <span class="fa arrow"></span>
                </a>
                <ul>
                    <li>
                        <a href="/handlingCost">
                            <i class="fa fa-angle-left"></i>&nbsp; 中转费列表</a>
                    </li>
                    <li>
                        <a href="/handlingCost/create">
                            <i class="fa fa-angle-left"></i>&nbsp; 中转费添加</a>
                    </li>
                    <li>
                        <a href="/handlingCost/import">
                            <i class="fa fa-angle-right"></i>&nbsp; 中转费导入</a>
                    </li>
                </ul>
            </li>
            </c:if>
            <c:if test="${roleInfo eq 'ROLE_ADMIN'}">
            <li>
                <a href="/wayBill/statistics">
                    <i class="fa fa-table"></i>
                    <span class="link-title">&nbsp;运单统计</span>
                </a>
            </li>
            </c:if>
            <c:if test="${roleInfo eq 'ROLE_ADMIN'}">
                <li>
                    <a href="/wayBill/export">
                        <i class="fa fa-table"></i>
                        <span class="link-title">&nbsp;数据导出</span>
                    </a>
                </li>
            </c:if>
            <c:if test="${roleInfo eq 'ROLE_USER'}">
                <li>
                    <a href="/wayBill">
                        <i class="fa fa-table"></i>
                        <span class="link-title">&nbsp;我的运单</span>
                    </a>
                </li>
            </c:if>
            <c:if test="${roleInfo eq 'ROLE_USER'}">
                <li>
                    <a href="/user/my">
                        <i class="fa fa-table"></i>
                        <span class="link-title">&nbsp;我的信息</span>
                    </a>
                </li>
            </c:if>
        </c:forEach>
    </ul>
    <!-- /#menu -->
</div>
<!-- /#left -->

