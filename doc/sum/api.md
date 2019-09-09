
# sum sum模块 API
## 1.1 查询sum详情

> **描述**：根据id查询sum详情。

> **url**：/admin/sum_rest/get/{id}
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
| 4        | data          | object   | sum详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | basePoint              | Integer          | 基准价 |
| 3 | companyName              | String          | 参选公司 |
| 4 | finalPoint              | Integer          | 最终价 |
| 5 | inputTime              | Date          | 时间 |
| 6 | paiming              | Integer          | 排名 |
| 7 | sumPingJia              | Integer          | 综合评价得分 |
| 8 | sumPoint              | Integer          | 综合得分 |
| 9 | toubiaoPoint              | Integer          | 投标报价 |
| 10 | zhuanjia              | String          | 专家 |

## 1.2 保存sum详情

> **描述**：保存sum详情。

> **url**：/admin/sum_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| basePoint  | Integer  | 基准价 |
| 3| companyName  | String  | 参选公司 |
| 4| finalPoint  | Integer  | 最终价 |
| 5| inputTime  | Date  | 时间 |
| 6| paiming  | Integer  | 排名 |
| 7| sumPingJia  | Integer  | 综合评价得分 |
| 8| sumPoint  | Integer  | 综合得分 |
| 9| toubiaoPoint  | Integer  | 投标报价 |
| 10| zhuanjia  | String  | 专家 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新sum详情

> **描述**：根据id更新sum的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/sum_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | id |
| 2| basePoint  | Integer  | 基准价 |
| 3| companyName  | String  | 参选公司 |
| 4| finalPoint  | Integer  | 最终价 |
| 5| inputTime  | Date  | 时间 |
| 6| paiming  | Integer  | 排名 |
| 7| sumPingJia  | Integer  | 综合评价得分 |
| 8| sumPoint  | Integer  | 综合得分 |
| 9| toubiaoPoint  | Integer  | 投标报价 |
| 10| zhuanjia  | String  | 专家 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条sum记录

> **描述**：根据id删除一条sum记录。

> **url**：/admin/sum_rest/delete/{id}
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


## 1.5 批量删除多条sum记录

> **描述**：根据多个id删除多条sum记录。

> **url**：/admin/sum_rest/batch_delete
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


## 1.6 分页查询sum

> **描述**：分页查询sum。

> **url**：/admin/sum_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|inputTimeFirst|   Date   |时间|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | sum详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | id |
| 2 | basePoint              | Integer          | 基准价 |
| 3 | companyName              | String          | 参选公司 |
| 4 | finalPoint              | Integer          | 最终价 |
| 5 | inputTime              | Date          | 时间 |
| 6 | paiming              | Integer          | 排名 |
| 7 | sumPingJia              | Integer          | 综合评价得分 |
| 8 | sumPoint              | Integer          | 综合得分 |
| 9 | toubiaoPoint              | Integer          | 投标报价 |
| 10 | zhuanjia              | String          | 专家 |
