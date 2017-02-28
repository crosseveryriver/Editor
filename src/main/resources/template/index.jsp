<html>
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <script type="text/javascript" src="../static/ckeditor/ckeditor.js"></script>
</head>
<body>
<form action="handleFormData.jsp" method="post">
    标题：<input type="text" name="title" /><br>
    正文：<br>
    <textarea cols="50" id="editor1" name="content" rows="10" class="ckeditor"></textarea>
    <input type="submit" value="Submit" />
</form>
</body>