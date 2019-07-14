# 演示API


<a name="overview"></a>
## Overview
演示API，假设对一些学生的CRUD


### Version information
*Version* : 0.0.1


### Contact information
*Contact* : 孔祥娟


### URI scheme
*Host* : 127.0.0.1:8888  
*BasePath* : /  
*Schemes* : HTTP


### Tags

* student : 学生相关接口


### Consumes

* `application/x-www-form-urlencoded`


### Produces

* `application/json`




<a name="paths"></a>
## Paths

<a name="savestudent"></a>
### 新增学生
```
POST /student
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**FormData**|**age**  <br>*required*|学生年龄，0-99岁之间|integer (int32)|
|**FormData**|**gender**  <br>*required*|性别|enum (male, female)|
|**FormData**|**name**  <br>*required*|学生姓名,最长不能超过20位|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|插入成功|integer (int32)|


#### Tags

* student


#### Example HTTP request

##### Request path
```
/student
```


##### Request formData
```json
"string"
```


#### Example HTTP response

##### Response 200
```json
0
```


<a name="liststudents"></a>
### 获取学生列表
```
GET /student
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**limit**  <br>*optional*|列表显示条数限制，0-100|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|返回学生列表|< [Student](#student) > array|


#### Tags

* student


#### Example HTTP request

##### Request path
```
/student
```


#### Example HTTP response

##### Response 200
```json
[ {
  "id" : 10,
  "name" : "张三",
  "age" : 20,
  "gender" : "male"
} ]
```


<a name="findstudent"></a>
### 学生详情
```
GET /student/{id}
```


#### Description
根据学生ID查询学生


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|学生ID，主键|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|查询出的学生|[Student](#student)|
|**400**|参数错误,错误的原因|string|


#### Tags

* student


#### Example HTTP request

##### Request path
```
/student/0
```


#### Example HTTP response

##### Response 200
```json
{
  "id" : 10,
  "name" : "张三",
  "age" : 20,
  "gender" : "male"
}
```


##### Response 400
```json
"ID不存在"
```


<a name="updatestudent"></a>
### 更新学生
```
PUT /student/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|学生ID，主键|integer (int32)|
|**FormData**|**age**  <br>*required*|学生年龄，0-99岁之间|integer (int32)|
|**FormData**|**gender**  <br>*required*|性别|enum (male, female)|
|**FormData**|**name**  <br>*required*|学生姓名,最长不能超过20位|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|更新成功|No Content|
|**400**|参数错误,错误的原因|string|


#### Tags

* student


#### Example HTTP request

##### Request path
```
/student/0
```


##### Request formData
```json
"string"
```


#### Example HTTP response

##### Response 400
```json
"ID不存在"
```


<a name="deletestudent"></a>
### 学生删除
```
DELETE /student/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|学生ID，主键|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|删除成功|No Content|
|**400**|参数错误,错误的原因|string|


#### Tags

* student


#### Example HTTP request

##### Request path
```
/student/0
```


#### Example HTTP response

##### Response 400
```json
"ID不存在"
```




<a name="definitions"></a>
## Definitions

<a name="student"></a>
### Student

|Name|Description|Schema|
|---|---|---|
|**age**  <br>*optional*|学生年龄，0-99岁之间  <br>**Minimum value** : `0`  <br>**Maximum value** : `99`  <br>**Example** : `20`|integer (int32)|
|**gender**  <br>*optional*|性别  <br>**Example** : `"male"`|enum (male, female)|
|**id**  <br>*optional*|学生ID，主键  <br>**Example** : `10`|integer (int32)|
|**name**  <br>*optional*|学生姓名,最长不能超过20位  <br>**Maximal length** : `20`  <br>**Example** : `"张三"`|string|





