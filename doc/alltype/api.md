
# all_type all_type模块 API
## 1.1 查询all_type详情

> **描述**：根据主键查询all_type详情。

> **url**：/admin/all_type_rest/get/{longId}
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | 主键，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | object   | all_type详情对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | longId              | Long          | 主键 |
| 2 | bytesBinary              | byte[]          | bytes_binary |
| 3 | bytesBlob              | byte[]          | bytes_blob |
| 4 | bytesMediumblob              | byte[]          | bytes_mediumblob |
| 5 | bytesVarbinary              | byte[]          | bytes_varbinary |
| 6 | bytesTinyblob              | byte[]          | bytes_tinyblob |
| 7 | bytesLongblob              | byte[]          | bytes_longblob |
| 8 | booleanBit              | Boolean          | boolean_bit |
| 9 | booleanBool              | Boolean          | boolean_bool |
| 10 | booleanBoolean              | Boolean          | boolean_boolean |
| 11 | stringEnum              | String          | string_enum |
| 12 | stringChar              | String          | string_char |
| 13 | stringLongtext              | String          | string_longtext |
| 14 | stringMediumtext              | String          | string_mediumtext |
| 15 | stringVarchar              | String          | string_varchar |
| 16 | stringSet              | String          | string_set |
| 17 | stringTinytext              | String          | string_tinytext |
| 18 | stringText              | String          | string_text |
| 19 | byteTinyint              | Byte          | byte_tinyint |
| 20 | shortSmallint              | Short          | short_smallint |
| 21 | integerInt              | Integer          | integer_int |
| 22 | integerMediumint              | Integer          | integer_mediumint |
| 23 | floatFloat              | Float          | float_float |
| 24 | doubleDouble              | Double          | double_double |
| 25 | doubleReal              | Double          | double_real |
| 26 | bigdecimalDecimal              | BigDecimal          | bigdecimal_decimal |
| 27 | bigdecimalNumeric              | BigDecimal          | bigdecimal_numeric |
| 28 | dateDate              | Date          | date_date |
| 29 | dateYear              | Date          | date_year |
| 30 | timeTime              | Time          | time_time |
| 31 | timestempDatetime              | Timestamp          | timestemp_datetime |
| 32 | timestempTimestemp              | Timestamp          | timestemp_timestemp |

## 1.2 保存all_type详情

> **描述**：保存all_type详情。

> **url**：/admin/all_type_rest/save
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| longId  | Long  | 主键 |
| 2| bytesBinary  | byte[]  | bytes_binary |
| 3| bytesBlob  | byte[]  | bytes_blob |
| 4| bytesMediumblob  | byte[]  | bytes_mediumblob |
| 5| bytesVarbinary  | byte[]  | bytes_varbinary |
| 6| bytesTinyblob  | byte[]  | bytes_tinyblob |
| 7| bytesLongblob  | byte[]  | bytes_longblob |
| 8| booleanBit  | Boolean  | boolean_bit |
| 9| booleanBool  | Boolean  | boolean_bool |
| 10| booleanBoolean  | Boolean  | boolean_boolean |
| 11| stringEnum  | String  | string_enum |
| 12| stringChar  | String  | string_char |
| 13| stringLongtext  | String  | string_longtext |
| 14| stringMediumtext  | String  | string_mediumtext |
| 15| stringVarchar  | String  | string_varchar |
| 16| stringSet  | String  | string_set |
| 17| stringTinytext  | String  | string_tinytext |
| 18| stringText  | String  | string_text |
| 19| byteTinyint  | Byte  | byte_tinyint |
| 20| shortSmallint  | Short  | short_smallint |
| 21| integerInt  | Integer  | integer_int |
| 22| integerMediumint  | Integer  | integer_mediumint |
| 23| floatFloat  | Float  | float_float |
| 24| doubleDouble  | Double  | double_double |
| 25| doubleReal  | Double  | double_real |
| 26| bigdecimalDecimal  | BigDecimal  | bigdecimal_decimal |
| 27| bigdecimalNumeric  | BigDecimal  | bigdecimal_numeric |
| 28| dateDate  | Date  | date_date |
| 29| dateYear  | Date  | date_year |
| 30| timeTime  | Time  | time_time |
| 31| timestempDatetime  | Timestamp  | timestemp_datetime |
| 32| timestempTimestemp  | Timestamp  | timestemp_timestemp |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.3 更新all_type详情

> **描述**：根据主键更新all_type的任意属性值，确保要更新的参数不能为null。

> **url**：/admin/all_type_rest/update/{longId}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1| longId  | Long  | 主键 |
| 2| bytesBinary  | byte[]  | bytes_binary |
| 3| bytesBlob  | byte[]  | bytes_blob |
| 4| bytesMediumblob  | byte[]  | bytes_mediumblob |
| 5| bytesVarbinary  | byte[]  | bytes_varbinary |
| 6| bytesTinyblob  | byte[]  | bytes_tinyblob |
| 7| bytesLongblob  | byte[]  | bytes_longblob |
| 8| booleanBit  | Boolean  | boolean_bit |
| 9| booleanBool  | Boolean  | boolean_bool |
| 10| booleanBoolean  | Boolean  | boolean_boolean |
| 11| stringEnum  | String  | string_enum |
| 12| stringChar  | String  | string_char |
| 13| stringLongtext  | String  | string_longtext |
| 14| stringMediumtext  | String  | string_mediumtext |
| 15| stringVarchar  | String  | string_varchar |
| 16| stringSet  | String  | string_set |
| 17| stringTinytext  | String  | string_tinytext |
| 18| stringText  | String  | string_text |
| 19| byteTinyint  | Byte  | byte_tinyint |
| 20| shortSmallint  | Short  | short_smallint |
| 21| integerInt  | Integer  | integer_int |
| 22| integerMediumint  | Integer  | integer_mediumint |
| 23| floatFloat  | Float  | float_float |
| 24| doubleDouble  | Double  | double_double |
| 25| doubleReal  | Double  | double_real |
| 26| bigdecimalDecimal  | BigDecimal  | bigdecimal_decimal |
| 27| bigdecimalNumeric  | BigDecimal  | bigdecimal_numeric |
| 28| dateDate  | Date  | date_date |
| 29| dateYear  | Date  | date_year |
| 30| timeTime  | Time  | time_time |
| 31| timestempDatetime  | Timestamp  | timestemp_datetime |
| 32| timestempTimestemp  | Timestamp  | timestemp_timestemp |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |

## 1.4 删除一条all_type记录

> **描述**：根据主键删除一条all_type记录。

> **url**：/admin/all_type_rest/delete/{longId}
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | id       | Long     | 主键，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.5 批量删除多条all_type记录

> **描述**：根据多个主键删除多条all_type记录。

> **url**：/admin/all_type_rest/batch_delete
>
> **method**：POST

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    | ids[]       | Long     | 主键，必填 |
| 2    | ids[]       | Long     | 主键，必填 |
| ...    | ids[]       | Long     | 主键，必填 |
| n    | ids[]       | Long     | 主键，必填 |

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |


## 1.6 分页查询all_type

> **描述**：分页查询all_type。

> **url**：/admin/all_type_rest/page
>
> **method**：GET

> **输入**

| 序号 | 字段名称 | 字段类型 | 字段描述     |
| ---- | -------- | -------- | ------------ |
| 1    |page      |int       |第几页 [1,n)   |
| 2    |limit      |int       |每页多少条 [0,100)   |
| 3    |safeOrderBy      |int       | 排序 例如 数据库字段名称 desc或asc   |
                |4|longIdFirst|   Long   |主键|

> **输出**

| 序号     | 字段名称      | 字段类型 | 字段描述                |
| -------- | ------------- | -------- | ----------------------- |
| 1        | flag          | boolean  | 接口调用，成功/失败标识 |
| 2        | code          | int      | 错误码，成功时=0        |
| 3        | desc          | string   | 结果描述                |
| 4        | data          | array   | all_type详情数组对象            |
|          |               |          |                         |
| 字段解释 |               |          |                         |
| 1 | longId              | Long          | 主键 |
| 2 | bytesBinary              | byte[]          | bytes_binary |
| 3 | bytesBlob              | byte[]          | bytes_blob |
| 4 | bytesMediumblob              | byte[]          | bytes_mediumblob |
| 5 | bytesVarbinary              | byte[]          | bytes_varbinary |
| 6 | bytesTinyblob              | byte[]          | bytes_tinyblob |
| 7 | bytesLongblob              | byte[]          | bytes_longblob |
| 8 | booleanBit              | Boolean          | boolean_bit |
| 9 | booleanBool              | Boolean          | boolean_bool |
| 10 | booleanBoolean              | Boolean          | boolean_boolean |
| 11 | stringEnum              | String          | string_enum |
| 12 | stringChar              | String          | string_char |
| 13 | stringLongtext              | String          | string_longtext |
| 14 | stringMediumtext              | String          | string_mediumtext |
| 15 | stringVarchar              | String          | string_varchar |
| 16 | stringSet              | String          | string_set |
| 17 | stringTinytext              | String          | string_tinytext |
| 18 | stringText              | String          | string_text |
| 19 | byteTinyint              | Byte          | byte_tinyint |
| 20 | shortSmallint              | Short          | short_smallint |
| 21 | integerInt              | Integer          | integer_int |
| 22 | integerMediumint              | Integer          | integer_mediumint |
| 23 | floatFloat              | Float          | float_float |
| 24 | doubleDouble              | Double          | double_double |
| 25 | doubleReal              | Double          | double_real |
| 26 | bigdecimalDecimal              | BigDecimal          | bigdecimal_decimal |
| 27 | bigdecimalNumeric              | BigDecimal          | bigdecimal_numeric |
| 28 | dateDate              | Date          | date_date |
| 29 | dateYear              | Date          | date_year |
| 30 | timeTime              | Time          | time_time |
| 31 | timestempDatetime              | Timestamp          | timestemp_datetime |
| 32 | timestempTimestemp              | Timestamp          | timestemp_timestemp |
