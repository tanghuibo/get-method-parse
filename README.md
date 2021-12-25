# get-method-parse

get 方法解析，参考 `mybatis-plus` 进行实现

## 使用

### getFiledName

通过 get 方法获取字段名称

```java
String filedName1 = GetMethodParseUtils.getFiledName(((SFunction<TestBean, String>)TestBean::getValue));
// filedName1 = "value"

String filedName2 = GetMethodParseUtils.getFiledName(((SFunction<TestBean, TestBean>)TestBean::getNext));
// filedName2 = "next"

String filedName3 = GetMethodParseUtils.getFiledName(((SFunction<TestBean, TestBean>)TestBean::getAliasList));
// filedName2 = "aliasList"
```