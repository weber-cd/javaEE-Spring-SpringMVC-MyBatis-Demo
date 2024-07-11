要实现文件上传功能，就需要提供一个文件上传的表单，而该表单必须满足以下3个条件。

* form表单的method属性设置为post。
* form表单的enctype属性设置为multipart/form-data。
* 提供<input type="file" name="filename" />的文件上传输入框。

```javascript
<form action="uploadUrl" method="post" enctype="multipart/form-data">
    <input type="file" name="filename" multiple="multiple" />
    <input type="submit" value="文件上传" />
</form>
```

当客户端form表单的enctype属性为multipart/form-data时，浏览器就会采用二进制流的方式来处理表单数据，服务器端就会对文件上传的请求进行解析处理。
