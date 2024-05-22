##### 说明

1. 配置了  mybatis 中的条件查询 choose & when
2. 执行测试用例的findCustomerByNameOrJob时候，中文的 like 部分查询报错

```cmd
   Illegal mix of collations (latin1_swedish_ci,IMPLICIT) and (utf8mb4_general_ci,COERCIBLE) for operation 'like'
```

这里是因为数据库的编码和查询的编码不一致导致的，需要将数据库的编码改为 utf8。

```sql
ALTER TABLE customer CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;
```
