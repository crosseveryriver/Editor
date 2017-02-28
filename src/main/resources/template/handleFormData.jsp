        <html>
        <head>
        <meta charset="utf-8">
        <title>handle</title>
        </head>
        <body>
        <h1>发布内容</h1>
        <ul>
        <li>
                <b>标题:</b>
                <%= request.getParameter("title")%>
        </li>
        <li><b>正文:</b>
                <%= request.getParameter("content")%>
        </li>
        </ul>
        </body>
