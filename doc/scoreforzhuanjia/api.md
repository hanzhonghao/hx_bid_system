
# score_for_zhuanjia score_for_zhuanjia模块 API
## 1.1 查询score_for_zhuanjia详情

> **描述**：根据id查询score_for_zhuanjia详情。

> **url**：/admin/score_for_zhuanjia_rest/get/{id}
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
| 4        | data          | object   | score_for_zhuanjia详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectId              | Long          | 参选公司 |
| 3 | categoryId              | Integer          | 打分表分类 |
| 4 | techRequire              | Integer          | 商务技术要求响应情况 |
| 5 | afterSale              | Integer          | 售后服务方案情况 |
| 6 | apply              | Integer          | 投标文件供应商业绩 |
| 7 | geneSitu              | Integer          | 制造厂商综合情况 |
| 8 | standard              | Integer          | 投标文件规范性 |
| 9 | date              | Date          | 打分日期 |
| 10 | signature              | String          | 打分人 |

## 1.2 保存score_for_zhuanjia详情

> **描述**：保存score_for_zhuanjia详情。

> **url**：/admin/score_for_zhuanjia_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectId  | Long  | 参选公司 |
| 3| categoryId  | Integer  | 打分表分类 |
| 4| techRequire  | Integer  | 商务技术要求响应情况 |
| 5| afterSale  | Integer  | 售后服务方案情况 |
| 6| apply  | Integer  | 投标文件供应商业绩 |
| 7| geneSitu  | Integer  | 制造厂商综合情况 |
| 8| standard  | Integer  | 投标文件规范性 |
| 9| date  | Date  | 打分日期 |
| 10| signature  | String  | 打分人 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新score_for_zhuanjia详情

> **描述**：根据id更新score_for_zhuanjia的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/score_for_zhuanjia_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectId  | Long  | 参选公司 |
| 3| categoryId  | Integer  | 打分表分类 |
| 4| techRequire  | Integer  | 商务技术要求响应情况 |
| 5| afterSale  | Integer  | 售后服务方案情况 |
| 6| apply  | Integer  | 投标文件供应商业绩 |
| 7| geneSitu  | Integer  | 制造厂商综合情况 |
| 8| standard  | Integer  | 投标文件规范性 |
| 9| date  | Date  | 打分日期 |
| 10| signature  | String  | 打分人 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条score_for_zhuanjia记录

> **描述**：根据id删除一条score_for_zhuanjia记录。

> **url**：/admin/score_for_zhuanjia_rest/delete/{id}
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


## 1.5 批量删除多条score_for_zhuanjia记录

> **描述**：根据多个id删除多条score_for_zhuanjia记录。

> **url**：/admin/score_for_zhuanjia_rest/batch_delete
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


## 1.6 分页查询score_for_zhuanjia

> **描述**：分页查询score_for_zhuanjia。

> **url**：/admin/score_for_zhuanjia_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|projectIdFirst|   Long   |参选公司|
                |5|categoryIdFirst|   Integer   |打分表分类|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | score_for_zhuanjia详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectId              | Long          | 参选公司 |
| 3 | categoryId              | Integer          | 打分表分类 |
| 4 | techRequire              | Integer          | 商务技术要求响应情况 |
| 5 | afterSale              | Integer          | 售后服务方案情况 |
| 6 | apply              | Integer          | 投标文件供应商业绩 |
| 7 | geneSitu              | Integer          | 制造厂商综合情况 |
| 8 | standard              | Integer          | 投标文件规范性 |
| 9 | date              | Date          | 打分日期 |
| 10 | signature              | String          | 打分人 |
