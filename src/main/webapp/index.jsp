<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Start Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-lg-6">
                    <form action="index_execute.action" method="POST">
                        <div class="form-group">
                            <label for="nome">Nome</label>
                            <input type="text" class="form-control" id="nome" placeholder="Nome" name="nome">
                        </div>
                        <button type="submit" class="btn btn-default">Enviar</button>
                    </form>
                </div>

                <div class="col-md-12 col-lg-6">
                    <table class="table">
                        <s:iterator value="lista">
                            <tr>
                                <td><s:property value="id"/></td>
                                <td><s:property value="nome"/></td>
                                <td><a href="index_apagar.action?id=<s:property value="id" />">Apagar</a></td>
                            </tr>
                        </s:iterator>
                    </table>
                </div>
            </div>
        </div>


    </body>
</html>
