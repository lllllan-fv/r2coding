# 多表查询



## 非等值连接的例子

![image-20220113163957908](README.assets/image-20220113163957908.png)

```mysql
SELECT e.last_name, e.salary, j.grade_level
FROM   employees e, job_grades j
WHERE  e.salary BETWEEN j.lowest_sal AND j.highest_sal;
```

