
# project project模块 API
## 1.1 查询project详情

> **描述**：根据id查询project详情。

> **url**：/admin/project_rest/get/{id}
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
| 4        | data          | object   | project详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectName              | String          | 参选公司 |
| 3 | type              | String          | 型号 |
| 4 | origin              | String          | 产地及品牌 |
| 5 | price              | BigDecimal          | 报价 |
| 6 | fprice              | BigDecimal          | 最终报价 |
| 7 | comment              | String          | 备注 |
| 8 | date              | Date          | 时间 |
| 9 | location              | String          | 地点 |
| 10 | recoder              | String          | 记录人 |
| 11 | reviewer              | String          | 复核人 |
| 12 | responer              | String          | 经办人 |
| 13 | bargain              | String          | 内容 |
| 14 | xiangmu              | String          | 项目名称 |

## 1.2 保存project详情

> **描述**：保存project详情。

> **url**：/admin/project_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectName  | String  | 参选公司 |
| 3| type  | String  | 型号 |
| 4| origin  | String  | 产地及品牌 |
| 5| price  | BigDecimal  | 报价 |
| 6| fprice  | BigDecimal  | 最终报价 |
| 7| comment  | String  | 备注 |
| 8| date  | Date  | 时间 |
| 9| location  | String  | 地点 |
| 10| recoder  | String  | 记录人 |
| 11| reviewer  | String  | 复核人 |
| 12| responer  | String  | 经办人 |
| 13| bargain  | String  | 内容 |
| 14| xiangmu  | String  | 项目名称 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新project详情

> **描述**：根据id更新project的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/project_rest/update/{id}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| id  | Long  | 编号 |
| 2| projectName  | String  | 参选公司 |
| 3| type  | String  | 型号 |
| 4| origin  | String  | 产地及品牌 |
| 5| price  | BigDecimal  | 报价 |
| 6| fprice  | BigDecimal  | 最终报价 |
| 7| comment  | String  | 备注 |
| 8| date  | Date  | 时间 |
| 9| location  | String  | 地点 |
| 10| recoder  | String  | 记录人 |
| 11| reviewer  | String  | 复核人 |
| 12| responer  | String  | 经办人 |
| 13| bargain  | String  | 内容 |
| 14| xiangmu  | String  | 项目名称 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条project记录

> **描述**：根据id删除一条project记录。

> **url**：/admin/project_rest/delete/{id}
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


## 1.5 批量删除多条project记录

> **描述**：根据多个id删除多条project记录。

> **url**：/admin/project_rest/batch_delete
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


## 1.6 分页查询project

> **描述**：分页查询project。

> **url**：/admin/project_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|projectNameFirst|   String   |参选公司|
                |5|dateFirst|   Date   |时间|
                |6|dateSecond|   Date   |时间|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | project详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | id              | Long          | 编号 |
| 2 | projectName              | String          | 参选公司 |
| 3 | type              | String          | 型号 |
| 4 | origin              | String          | 产地及品牌 |
| 5 | price              | BigDecimal          | 报价 |
| 6 | fprice              | BigDecimal          | 最终报价 |
| 7 | comment              | String          | 备注 |
| 8 | date              | Date          | 时间 |
| 9 | location              | String          | 地点 |
| 10 | recoder              | String          | 记录人 |
| 11 | reviewer              | String          | 复核人 |
| 12 | responer              | String          | 经办人 |
| 13 | bargain              | String          | 内容 |
| 14 | xiangmu              | String          | 项目名称 |
