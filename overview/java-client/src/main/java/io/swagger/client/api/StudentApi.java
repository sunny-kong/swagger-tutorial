/*
 * 演示API
 * 演示API，假设对一些学生的CRUD
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Student;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentApi {
    private ApiClient apiClient;

    public StudentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StudentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteStudent
     * @param id 学生ID，主键 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteStudentCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/student/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteStudentValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteStudent(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteStudentCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 学生删除
     * 
     * @param id 学生ID，主键 (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteStudent(Integer id) throws ApiException {
        deleteStudentWithHttpInfo(id);
    }

    /**
     * 学生删除
     * 
     * @param id 学生ID，主键 (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteStudentWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = deleteStudentValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * 学生删除 (asynchronously)
     * 
     * @param id 学生ID，主键 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteStudentAsync(Integer id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteStudentValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for findStudent
     * @param id 学生ID，主键 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findStudentCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/student/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findStudentValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findStudent(Async)");
        }
        

        com.squareup.okhttp.Call call = findStudentCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 学生详情
     * 根据学生ID查询学生
     * @param id 学生ID，主键 (required)
     * @return Student
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Student findStudent(Integer id) throws ApiException {
        ApiResponse<Student> resp = findStudentWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * 学生详情
     * 根据学生ID查询学生
     * @param id 学生ID，主键 (required)
     * @return ApiResponse&lt;Student&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Student> findStudentWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = findStudentValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Student>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 学生详情 (asynchronously)
     * 根据学生ID查询学生
     * @param id 学生ID，主键 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findStudentAsync(Integer id, final ApiCallback<Student> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findStudentValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Student>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listStudents
     * @param limit 列表显示条数限制，0-100 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listStudentsCall(Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/student";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listStudentsValidateBeforeCall(Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listStudentsCall(limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 获取学生列表
     * 
     * @param limit 列表显示条数限制，0-100 (optional)
     * @return List&lt;Student&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Student> listStudents(Integer limit) throws ApiException {
        ApiResponse<List<Student>> resp = listStudentsWithHttpInfo(limit);
        return resp.getData();
    }

    /**
     * 获取学生列表
     * 
     * @param limit 列表显示条数限制，0-100 (optional)
     * @return ApiResponse&lt;List&lt;Student&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Student>> listStudentsWithHttpInfo(Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = listStudentsValidateBeforeCall(limit, null, null);
        Type localVarReturnType = new TypeToken<List<Student>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 获取学生列表 (asynchronously)
     * 
     * @param limit 列表显示条数限制，0-100 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listStudentsAsync(Integer limit, final ApiCallback<List<Student>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listStudentsValidateBeforeCall(limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Student>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for saveStudent
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveStudentCall(String name, Integer age, String gender, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/student";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("name", name);
        if (age != null)
        localVarFormParams.put("age", age);
        if (gender != null)
        localVarFormParams.put("gender", gender);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveStudentValidateBeforeCall(String name, Integer age, String gender, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling saveStudent(Async)");
        }
        
        // verify the required parameter 'age' is set
        if (age == null) {
            throw new ApiException("Missing the required parameter 'age' when calling saveStudent(Async)");
        }
        
        // verify the required parameter 'gender' is set
        if (gender == null) {
            throw new ApiException("Missing the required parameter 'gender' when calling saveStudent(Async)");
        }
        

        com.squareup.okhttp.Call call = saveStudentCall(name, age, gender, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 新增学生
     * 
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer saveStudent(String name, Integer age, String gender) throws ApiException {
        ApiResponse<Integer> resp = saveStudentWithHttpInfo(name, age, gender);
        return resp.getData();
    }

    /**
     * 新增学生
     * 
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> saveStudentWithHttpInfo(String name, Integer age, String gender) throws ApiException {
        com.squareup.okhttp.Call call = saveStudentValidateBeforeCall(name, age, gender, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 新增学生 (asynchronously)
     * 
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveStudentAsync(String name, Integer age, String gender, final ApiCallback<Integer> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = saveStudentValidateBeforeCall(name, age, gender, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateStudent
     * @param id 学生ID，主键 (required)
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateStudentCall(Integer id, String name, Integer age, String gender, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/student/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("name", name);
        if (age != null)
        localVarFormParams.put("age", age);
        if (gender != null)
        localVarFormParams.put("gender", gender);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateStudentValidateBeforeCall(Integer id, String name, Integer age, String gender, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateStudent(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling updateStudent(Async)");
        }
        
        // verify the required parameter 'age' is set
        if (age == null) {
            throw new ApiException("Missing the required parameter 'age' when calling updateStudent(Async)");
        }
        
        // verify the required parameter 'gender' is set
        if (gender == null) {
            throw new ApiException("Missing the required parameter 'gender' when calling updateStudent(Async)");
        }
        

        com.squareup.okhttp.Call call = updateStudentCall(id, name, age, gender, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 更新学生
     * 
     * @param id 学生ID，主键 (required)
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateStudent(Integer id, String name, Integer age, String gender) throws ApiException {
        updateStudentWithHttpInfo(id, name, age, gender);
    }

    /**
     * 更新学生
     * 
     * @param id 学生ID，主键 (required)
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateStudentWithHttpInfo(Integer id, String name, Integer age, String gender) throws ApiException {
        com.squareup.okhttp.Call call = updateStudentValidateBeforeCall(id, name, age, gender, null, null);
        return apiClient.execute(call);
    }

    /**
     * 更新学生 (asynchronously)
     * 
     * @param id 学生ID，主键 (required)
     * @param name 学生姓名,最长不能超过20位 (required)
     * @param age 学生年龄，0-99岁之间 (required)
     * @param gender 性别 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateStudentAsync(Integer id, String name, Integer age, String gender, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateStudentValidateBeforeCall(id, name, age, gender, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
