## 利用shardingsphere框架进行分表（分模块）

### 1. 框架理论
![img.png](img.png)
![img_1.png](img_1.png)
### 2、调用接口
POST http://localhost:8080/order/add
Content-Type: application/json

{
"orderNo": "1001",
"userId": 1,
"amount": "1.01"
}

