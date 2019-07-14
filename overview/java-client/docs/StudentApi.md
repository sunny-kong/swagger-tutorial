# StudentApi

All URIs are relative to *http://127.0.0.1:8888*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteStudent**](StudentApi.md#deleteStudent) | **DELETE** /student/{id} | 学生删除
[**findStudent**](StudentApi.md#findStudent) | **GET** /student/{id} | 学生详情
[**listStudents**](StudentApi.md#listStudents) | **GET** /student | 获取学生列表
[**saveStudent**](StudentApi.md#saveStudent) | **POST** /student | 新增学生
[**updateStudent**](StudentApi.md#updateStudent) | **PUT** /student/{id} | 更新学生


<a name="deleteStudent"></a>
# **deleteStudent**
> deleteStudent(id)

学生删除

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StudentApi;


StudentApi apiInstance = new StudentApi();
Integer id = 56; // Integer | 学生ID，主键
try {
    apiInstance.deleteStudent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#deleteStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 学生ID，主键 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="findStudent"></a>
# **findStudent**
> Student findStudent(id)

学生详情

根据学生ID查询学生

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StudentApi;


StudentApi apiInstance = new StudentApi();
Integer id = 56; // Integer | 学生ID，主键
try {
    Student result = apiInstance.findStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#findStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 学生ID，主键 |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listStudents"></a>
# **listStudents**
> List&lt;Student&gt; listStudents(limit)

获取学生列表

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StudentApi;


StudentApi apiInstance = new StudentApi();
Integer limit = 56; // Integer | 列表显示条数限制，0-100
try {
    List<Student> result = apiInstance.listStudents(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#listStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| 列表显示条数限制，0-100 | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="saveStudent"></a>
# **saveStudent**
> Integer saveStudent(name, age, gender)

新增学生

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StudentApi;


StudentApi apiInstance = new StudentApi();
String name = "name_example"; // String | 学生姓名,最长不能超过20位
Integer age = 56; // Integer | 学生年龄，0-99岁之间
String gender = "gender_example"; // String | 性别
try {
    Integer result = apiInstance.saveStudent(name, age, gender);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#saveStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| 学生姓名,最长不能超过20位 |
 **age** | **Integer**| 学生年龄，0-99岁之间 |
 **gender** | **String**| 性别 | [enum: male, female]

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateStudent"></a>
# **updateStudent**
> updateStudent(id, name, age, gender)

更新学生

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StudentApi;


StudentApi apiInstance = new StudentApi();
Integer id = 56; // Integer | 学生ID，主键
String name = "name_example"; // String | 学生姓名,最长不能超过20位
Integer age = 56; // Integer | 学生年龄，0-99岁之间
String gender = "gender_example"; // String | 性别
try {
    apiInstance.updateStudent(id, name, age, gender);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#updateStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 学生ID，主键 |
 **name** | **String**| 学生姓名,最长不能超过20位 |
 **age** | **Integer**| 学生年龄，0-99岁之间 |
 **gender** | **String**| 性别 | [enum: male, female]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

