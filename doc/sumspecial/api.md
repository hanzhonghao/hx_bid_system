
# sum_special sum_special模块 API
## 1.1 查询sum_special详情

> **描述**：根据id查询sum_special详情。

> **url**：/admin/sum_special_rest/get/{id}
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | id，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | object   | sum_special详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | basePoint              | Integer          | base_point |
| 3 | companyName              | String          | company_name |
| 4 | finalPoint              | Integer          | final_point |
| 5 | inputTime              | Date          | input_time |
| 6 | paiming              | Integer          | paiming |
| 7 | sumPingJia              | Integer          | sum_ping_jia |
| 8 | sumPoint              | Integer          | sum_point |
| 9 | toubiaoPoint              | Integer          | toubiao_point |
| 10 | zhuanjia              | String          | zhuanjia |

## 1.2 保存sum_special详情

> **描述**：保存sum_special详情。

> **url**：/admin/sum_special_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| basePoint  | Integer  | base_point |
| 3| companyName  | String  | company_name |
| 4| finalPoint  | Integer  | final_point |
| 5| inputTime  | Date  | input_time |
| 6| paiming  | Integer  | paiming |
| 7| sumPingJia  | Integer  | sum_ping_jia |
| 8| sumPoint  | Integer  | sum_point |
| 9| toubiaoPoint  | Integer  | toubiao_point |
| 10| zhuanjia  | String  | zhuanjia |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新sum_special详情

> **描述**：根据id更新sum_special的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/sum_special_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| basePoint  | Integer  | base_point |
| 3| companyName  | String  | company_name |
| 4| finalPoint  | Integer  | final_point |
| 5| inputTime  | Date  | input_time |
| 6| paiming  | Integer  | paiming |
| 7| sumPingJia  | Integer  | sum_ping_jia |
| 8| sumPoint  | Integer  | sum_point |
| 9| toubiaoPoint  | Integer  | toubiao_point |
| 10| zhuanjia  | String  | zhuanjia |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条sum_special记录

> **描述**：根据id删除一条sum_special记录。

> **url**：/admin/sum_special_rest/delete/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | id，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.5 批量删除多条sum_special记录

> **描述**：根据多个id删除多条sum_special记录。

> **url**：/admin/sum_special_rest/batch_delete
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | ids[]       | Long     | id，必填 |
| 2    | ids[]       | Long     | id，必填 |
| ...    | ids[]       | Long     | id，必填 |
| n    | ids[]       | Long     | id，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.6 分页查询sum_special

> **描述**：分页查询sum_special。

> **url**：/admin/sum_special_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|idFirst|   Long   |id|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | sum_special详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | basePoint              | Integer          | base_point |
| 3 | companyName              | String          | company_name |
| 4 | finalPoint              | Integer          | final_point |
| 5 | inputTime              | Date          | input_time |
| 6 | paiming              | Integer          | paiming |
| 7 | sumPingJia              | Integer          | sum_ping_jia |
| 8 | sumPoint              | Integer          | sum_point |
| 9 | toubiaoPoint              | Integer          | toubiao_point |
| 10 | zhuanjia              | String          | zhuanjia |
