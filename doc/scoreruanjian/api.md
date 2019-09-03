
# score_ruanjian score_ruanjian模块 API
## 1.1 查询score_ruanjian详情

> **描述**：根据id查询score_ruanjian详情。

> **url**：/admin/score_ruanjian_rest/get/{id}
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
| 4        | data          | object   | score_ruanjian详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | afterSale              | Integer          | after_sale |
| 3 | apply              | Integer          | apply |
| 4 | companyName              | String          | company_name |
| 5 | geneSitu              | Integer          | gene_situ |
| 6 | standard              | Integer          | standard |
| 7 | techRequire              | Integer          | tech_require |
| 8 | signature              | String          | signature |

## 1.2 保存score_ruanjian详情

> **描述**：保存score_ruanjian详情。

> **url**：/admin/score_ruanjian_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| afterSale  | Integer  | after_sale |
| 3| apply  | Integer  | apply |
| 4| companyName  | String  | company_name |
| 5| geneSitu  | Integer  | gene_situ |
| 6| standard  | Integer  | standard |
| 7| techRequire  | Integer  | tech_require |
| 8| signature  | String  | signature |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新score_ruanjian详情

> **描述**：根据id更新score_ruanjian的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/score_ruanjian_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| afterSale  | Integer  | after_sale |
| 3| apply  | Integer  | apply |
| 4| companyName  | String  | company_name |
| 5| geneSitu  | Integer  | gene_situ |
| 6| standard  | Integer  | standard |
| 7| techRequire  | Integer  | tech_require |
| 8| signature  | String  | signature |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条score_ruanjian记录

> **描述**：根据id删除一条score_ruanjian记录。

> **url**：/admin/score_ruanjian_rest/delete/{id}
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


## 1.5 批量删除多条score_ruanjian记录

> **描述**：根据多个id删除多条score_ruanjian记录。

> **url**：/admin/score_ruanjian_rest/batch_delete
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


## 1.6 分页查询score_ruanjian

> **描述**：分页查询score_ruanjian。

> **url**：/admin/score_ruanjian_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|idFirst|   Long   |id|
                |5|companyNameFirst|   String   |company_name|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | score_ruanjian详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | afterSale              | Integer          | after_sale |
| 3 | apply              | Integer          | apply |
| 4 | companyName              | String          | company_name |
| 5 | geneSitu              | Integer          | gene_situ |
| 6 | standard              | Integer          | standard |
| 7 | techRequire              | Integer          | tech_require |
| 8 | signature              | String          | signature |
