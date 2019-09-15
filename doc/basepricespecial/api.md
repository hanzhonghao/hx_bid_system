
# base_price_special base_price_special模块 API
## 1.1 查询base_price_special详情

> **描述**：根据id查询base_price_special详情。

> **url**：/admin/base_price_special_rest/get/{id}
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
| 4        | data          | object   | base_price_special详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectId              | Long          | 参选公司 |
| 3 | ebasePoint              | Integer          | 设备基准价(万元) |
| 4 | efinalPoint              | Integer          | 设备最终价(万元) |
| 5 | inputTime              | Date          | 录入时间 |
| 6 | sbasePoint              | Integer          | 试剂基准价(万元) |
| 7 | sfinalPoint              | Integer          | 实际最终价(万元) |

## 1.2 保存base_price_special详情

> **描述**：保存base_price_special详情。

> **url**：/admin/base_price_special_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectId  | Long  | 参选公司 |
| 3| ebasePoint  | Integer  | 设备基准价(万元) |
| 4| efinalPoint  | Integer  | 设备最终价(万元) |
| 5| inputTime  | Date  | 录入时间 |
| 6| sbasePoint  | Integer  | 试剂基准价(万元) |
| 7| sfinalPoint  | Integer  | 实际最终价(万元) |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新base_price_special详情

> **描述**：根据id更新base_price_special的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/base_price_special_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectId  | Long  | 参选公司 |
| 3| ebasePoint  | Integer  | 设备基准价(万元) |
| 4| efinalPoint  | Integer  | 设备最终价(万元) |
| 5| inputTime  | Date  | 录入时间 |
| 6| sbasePoint  | Integer  | 试剂基准价(万元) |
| 7| sfinalPoint  | Integer  | 实际最终价(万元) |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条base_price_special记录

> **描述**：根据id删除一条base_price_special记录。

> **url**：/admin/base_price_special_rest/delete/{id}
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


## 1.5 批量删除多条base_price_special记录

> **描述**：根据多个id删除多条base_price_special记录。

> **url**：/admin/base_price_special_rest/batch_delete
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


## 1.6 分页查询base_price_special

> **描述**：分页查询base_price_special。

> **url**：/admin/base_price_special_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|projectIdFirst|   Long   |参选公司|
                |5|inputTimeFirst|   Date   |录入时间|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | base_price_special详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectId              | Long          | 参选公司 |
| 3 | ebasePoint              | Integer          | 设备基准价(万元) |
| 4 | efinalPoint              | Integer          | 设备最终价(万元) |
| 5 | inputTime              | Date          | 录入时间 |
| 6 | sbasePoint              | Integer          | 试剂基准价(万元) |
| 7 | sfinalPoint              | Integer          | 实际最终价(万元) |
