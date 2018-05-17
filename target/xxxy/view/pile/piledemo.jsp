<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <html>
    <head>
        <title>Title</title>
        <%@ include file="/resource/public/common.jspf" %>
    </head>
<body>
<div>
        <div class="row alert alert-info " style="background-color: #fafafa" >
            <display:table class="table table-condensed table-striped" id="pile" name="pile_list" pagesize="5"  export="true" requestURI="${pageContext.request.contextPath }/pile/list3.action">
                <display:column property="pileId" title="ID"></display:column>
                <display:column property="pileLongitude" title="经度"></display:column>
                <display:column property="pileLatitude" title="纬度"></display:column>
                <display:column property="pileAreaid" title="区域编号"></display:column>
                <display:column property="pileAddress" title="地址"></display:column>
            </display:table>
        </div>
<form>
    <input class="text" name="pileId">
        <button>sds</button>
        <table>
                <tr>
                    <td>${pile1.pileId }</td>
                    <td>${pile1.pileLatitude }</td>
                    <td>${pile1.pileLongitude}</td>
                </tr>
        </table>
    </form>

</div>

</body>
</html>
