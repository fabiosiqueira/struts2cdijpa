<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:iterator value="lista" >
            <s:property /> 
        </s:iterator>
    </body>
</html>
